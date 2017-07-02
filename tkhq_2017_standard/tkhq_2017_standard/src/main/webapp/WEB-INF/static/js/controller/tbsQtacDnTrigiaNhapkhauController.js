/**
 * Created by cmcsoft on 6/2/2017.
 */
'use strict';
var myApp = angular.module('myApp');

myApp.controller('tbsQtacDnTrigiaNhapkhauController', ['$scope',
                                                        '$PopupMessage',
                                                        'pagerService',
                                                        '$uibModal',
                                                        '$location',
                                                        'contextPath',
                                                        'tbsDmQtacService',
                                                        'tbsQtacDnTrigiaNhapkhauService',
                                                        function($scope,
                                                                 $PopupMessage,
                                                                 pagerService,
                                                                 $uibModal,
                                                                 $location,
                                                                 contextPath,
                                                                 tbsDmQtacService,
                                                                 tbsQtacDnTrigiaNhapkhauService){

        $scope.listData = [];

        $scope.totalItems = 0;
        $scope.currentPage = 1;
        $scope.maxSize = 5;
        $scope.pageSize = 10;
        
        $scope.isDisplay = true;
        var isSearch = false;

        var idDelete = "";
        
        $scope.dto = {
            id              : "",
            masodn          : "",
            trigianhapkhau  : 0.0,
            tenDn			: "",
            moTa			: "",
        }

        init();

        $scope.doSearch = function(currentPage, pageSize){
        	$scope.isCollapsed = false;
        	isSearch = true;
        	if(!tbsDmQtacService.validateEmpty($scope.dto.masodn) && tbsDmQtacService.validateMa($scope.dto.masodn)){
        		$PopupMessage.Error("Mã số doanh nghiệp không lớn hơn 20 ký tự");
        		return;
        	}
        	
        	if($scope.dto.trigianhapkhau !== null && !tbsDmQtacService.validateEmpty($scope.dto.trigianhapkhau)){
        		if(tbsDmQtacService.validateTriGia($scope.dto.trigianhapkhau)){
        			$PopupMessage.Error("Trị giá nhập khẩu không lớn hơn 14 ký tự");
        			return;
        		}
        		if(tbsDmQtacService.validateDecimal($scope.dto.trigianhapkhau)){
        			$PopupMessage.Error("Phần thập phân không lớn hơn 2 ký tự");
        			return;
        		}
        	}
        	
        	search(currentPage, pageSize);
        	isSearch = false;
        }

        $scope.pageChanged = function(currentPage){
            search(currentPage, $scope.pageSize);
        }
        
        $scope.doAdd = function () {
            if($scope.dto.id !== ""){
                reloadForm();
                $PopupMessage.Error("Không thể thực hiện được thao tác này.");
                return;
            }
            
            if(!checkMaSoDm($scope.dto.masodn, $scope.dto.trigianhapkhau)){
            	return;
            }
            addData($scope.dto);
        }

        $scope.doUpdate = function () {
            if($scope.dto.id === ""){
                $PopupMessage.Error("Không thể thực hiện được thao tác này.");
                return;
            }
            
            if(!checkMaSoDm($scope.dto.masodn, $scope.dto.trigianhapkhau)){
            	return;
            }

            upDateData($scope.dto);
        }

        $scope.doEditRow = function(id) {
        	
        	$scope.isCollapsed = false;
            // check exist.
            copyData ($scope.listData ,id);
        }

        $scope.doDelete = function (id) {
            idDelete = id;
            $PopupMessage.Confirm('Ban có chắc muốn xóa bản ghi', deleteData, null);
        }
        $scope.doUpload = function() {
        	var file = $scope.myFile
			doUpload(file)
		};
        
        function checkMaSoDm(maSoDm, triGiaNk){
        	if(tbsDmQtacService.validateEmpty(maSoDm)){
        		$PopupMessage.Error("Hãy nhập mã số doanh nghiệp!.");
        		return false;
        	}
        	if(tbsDmQtacService.validateMa(maSoDm)){
        		$PopupMessage.Error("Mã số doanh nghiệp không lớn hơn 20 ký tự");
        		return false;
        	}
        	
        	if(tbsDmQtacService.validateEmpty(triGiaNk)){
        		$PopupMessage.Error("Hãy nhập trị giá xuất khẩu.");
        		return false;
        	}
        	if(tbsDmQtacService.validateTriGia(triGiaNk)){
        		$PopupMessage.Error("Trị giá xuất khẩu không lớn hơn 14 ký tự");
        		return false;
        	}
        	
        	if(tbsDmQtacService.validateDecimal(triGiaNk)){
    			$PopupMessage.Error("Phần thập phân không lớn hơn 2 ký tự");
    			return false;
    		}
        	return true;
        }
        
        function getDataById(id) {
            tbsQtacDnTrigiaNhapkhauService.GetTbsQtacDnTrigiaNhapkhauById(id)
                .then(
                    function (deferred) {
                        if(deferred !== null){
                            copyData ($scope.listData ,id);
                        }else {
                            $PopupMessage.Error("Dữ liệu đã bị xóa bởi một người sử dụng khác!");
                        }
                    },
                    function (errResponse) {
                        $PopupMessage.Error("Có lỗi trong quá trình xử lý thông tin!");
                    }

                );
        }

        function deleteData() {
            tbsQtacDnTrigiaNhapkhauService.DoDeleteTbsQtacDnTrigiaNhapkhau(idDelete)
                .then(
                    function (deferred) {
                        if(deferred === 1){
                            $PopupMessage.Success("Xóa bỏ thông tin thành công!");
                            reloadForm();
                            $scope.currentPage =  1;
                            search($scope.currentPage, $scope.pageSize);
                        } else {
                            $PopupMessage.Error("Có lỗi trong quá trình xóa bỏ thông tin.!");
                        }
                    },
                    function (errResponse) {
                        $PopupMessage.Error("Có lỗi trong quá trình xóa bỏ thông tin.!");
                    }
                );
        }

        function addData(data) {
            tbsQtacDnTrigiaNhapkhauService.DoAddTbsQtacDnTrigiaNhapkhau(data)
                .then(
                    function (deferred) {
                        if(deferred === 1){
                            $PopupMessage.Success("Thêm mới thông tin thành công!");
                            reloadForm();
                            $scope.currentPage =  1;
                            search($scope.currentPage, $scope.pageSize);
                        }else {
                            $PopupMessage.Error("Có lỗi trong quá trình thêm mới thông tin.!");
                        }
                    },
                    function (errResponse) {
                        $PopupMessage.Error("Có lỗi trong quá trình thêm mới thông tin.!");
                        console.error("Có lỗi trong quá trình thêm mới thông tin.!");
                    }
                );
        }

        function upDateData(data) {
            tbsQtacDnTrigiaNhapkhauService.DoUpdateTbsQtacDnTrigiaNhapkhau(data)
                .then(
                    function (deferred) {
                        if(deferred === 1){
                            $PopupMessage.Success("Cập nhật thông tin thành công!");
                            $scope.currentPage =  1;
                            search($scope.currentPage, $scope.pageSize);
                        }else {
                            $PopupMessage.Error("Có lỗi trong quá trình cập nhật thông tin.!");
                        }
                    },
                    function (errResponse) {
                        $PopupMessage.Error("Có lỗi trong quá trình cập nhật thông tin.!");
                        console.error("Có lỗi trong quá trình cập nhật thông tin.!");
                    }
                );
        }

        function search(currentPage, pageSize) {
            var formData = thietLapData($scope.dto.masodn, $scope.dto.trigianhapkhau,$scope.dto.tenDn, $scope.dto.moTa, currentPage, pageSize);
            tbsQtacDnTrigiaNhapkhauService.SearchTbsQtacDnTrigiaNhapkhau(formData)
                .then(
                    function (deferred) {
                    	if (deferred.content.length > 0){
                    		$scope.isDisplay = true;
                            $scope.listData = deferred.content;
                            $scope.totalItems = deferred.totalItems;
                            $scope.pageSize = deferred.pageSize;
                            $scope.currentPage = deferred.currentPage;
                        } else {
                        	$scope.isDisplay = false;
                            $PopupMessage.Error("Không có kết quả tìm kiếm!");
                        }
                    },
                    function (errResponse) {
                        $PopupMessage.Error("Không có kết quả tìm kiếm!");
                    }

                );
        }
        
        function doUpload(file) {
        	tbsQtacDnTrigiaNhapkhauService.DoUploadFile(file)
	        	.then(
	    				function(deferred) {
	    					if(deferred == 1){
	    						$PopupMessage.Success("Tải tệp tin thành công.!");
	    						init();
	    					} else {
	    						$PopupMessage.Error("Tải tệp tin không thành công.!");
	    					}
	    				},
	    				function (errResponse) {
	    					console.error('Error while fetching data');
	    				}
	    			 );
			
		}

        function thietLapData(masodn, trigianhapkhau, tenDn, moTa, currentPage, pageSize) {

        	var formData = {};
       	 
            if(typeof currentPage === 'undefined' || currentPage ===''){
            	formData.currentPage = 1;
            }else {
            	formData.currentPage = currentPage;
            }
            if(typeof pageSize == 'undefined'){
            	 formData.pageSize = 10;
            }else {
            	  formData.pageSize = pageSize;
            }
            
            if (isSearch) {
            	formData.masodn 		= masodn;
                formData.trigianhapkhau = trigianhapkhau;
                formData.tenDn			= tenDn;
			    formData.moTa           = moTa;
			} else {
				isSearch = false;
				formData.masodn 		= "";
	            formData.trigianhapkhau = 0.0;
	            formData.tenDn			= "";
			    formData.moTa           = "";
			}

            return formData;
        }

        function reloadForm() {
            $scope.dto = {
                id             :"",
                masodn         : "",
                trigianhapkhau : 0.0,
                tenDn		   : "",
		    	moTa           : ""
            }
        }
        

        function copyData (listData ,idCopy){
            for (var i = 0; i < listData.length; i++){
                if(listData[i].id === idCopy){
                    $scope.dto = angular.copy(listData[i]);
                    break;
                }
            }
        }

        function init() {
        	search($scope.currentPage,$scope.pageSize);
        }
        
        function init() {
        	$scope.nameFile = "Chưa chọn tệp tin";
        	search($scope.currentPage,$scope.pageSize);
        }
        
        $scope.handleFile = function(elem) {
    		var x = elem.files[0].webkitRelativePath || elem.files[0].name
    				|| elem.value.slice(elem.value.lastIndexOf("\\") + 1);
    		if (x.length > 200) {
    			$scope.nameFile = "Chưa chọn tệp tin";
    			$PopupMessage.Error("Tên tệp tin quá dài.");
    			return;
    		} else if (x.length > 40) {
    			var ex = getExtensionFile(x);
    			$scope.nameFile = x.substring(0, 10) + "..." + ex;
    		}else {
    			$scope.nameFile = x;
    		}

    	}
        
        function getExtensionFile(fileName){
    		var index =  fileName.lastIndexOf(".");
    		return fileName.substring(index);
    	}
}]);


