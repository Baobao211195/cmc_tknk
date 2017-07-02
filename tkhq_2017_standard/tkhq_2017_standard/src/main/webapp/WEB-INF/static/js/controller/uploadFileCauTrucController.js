
/**
* Controller of upload file phi cau truc.
*/
'use strict';
var myApp = angular.module('myApp');

myApp.controller('displayFileCauTrucController', ['$scope',
													'$PopupMessage',
													'$uibModal',
													'$location',
													'$parse',
													'contextPath',
													'displayFileCauTrucService',
													function($scope,
															$PopupMessage,
															$uibModal,
															$location,
															$parse,
															contextPath,
															displayFileCauTrucService){

	$scope.listFilePhiCauTrucs = [];
	$scope.typeNhapXuat = "";
	$scope.isDeleteId = "";
	$scope.showReport= false;
	

	$scope.chuDe = "1";
	$scope.restDto = {
		"fileSize" : "",
		"fileName" : ""
	};
	
	$scope.numPerPage = 10;
	$scope.currentPage = 1;
	$scope.maxSize = 5;
	$scope.totalPage = [];

	init();

	$scope.selectTile = function(chuDe) {
		getListFilePhiCauTruc(chuDe, $scope.typeNhapXuat);

	}
	
	function getTotalPage(total) {
		if (total % $scope.numPerPage > 0) {
			$scope.totalPage = Math.floor(total / $scope.numPerPage) + 1;
		} else {
			$scope.totalPage = Math.floor(total / $scope.numPerPage);
		}
		if (total == 0) {
			$scope.totalPage = 1;
		}
	}
	$scope.pageChanged = function(currentPage) {
		$scope.currentPage = currentPage;
		var begin = ((currentPage - 1) * $scope.numPerPage), end = begin
				+ $scope.numPerPage;
		$scope.phantrang = $scope.listFilePhiCauTrucs.slice(begin, end);
	};
	
	function thietLapChuDe (chuDe){
		var chuDeTmp = "";
		
		if (chuDe === "1"){
			chuDeTmp = "Dầu thô";
		}else if (chuDe === "2"){
			chuDeTmp = "Chuyển phát nhanh";
		}else {
			chuDeTmp = "Phương tiện xuất nhập cảnh";
		}
		return chuDeTmp;
	}

	$scope.doOpenUploadFile = function() {
		var typeNhapXuat = $scope.typeNhapXuat;
		showPopup(typeNhapXuat, $scope.chuDe)
	}
	
	function showPopup(typeNhapXuat, chuDe){
		var title = "";
		if (typeNhapXuat === 'X') {
			title = "Tải file dữ liệu xuất khẩu đầu vào có cấu trúc";
		}else {
			title = "Tải file dữ liệu nhập khẩu đầu vào có cấu trúc";
		}
		
		var modalInstance = $uibModal.open({
			animation: self.animationsEnabled,
			ariaLabelledBy: 'modal-title',
			ariaDescribedBy: 'modal-body',
			templateUrl: 'uploadFileCauTruc',
			controller: 'uploadFileCauTrucController',
			backdrop: 'static',
			resolve: {
				title : function() {
					return title;
				},
				typeNhapXuat : function (){
					return typeNhapXuat;
				},
				chuDe : function () {
					return chuDe;
                }
			}
		});
		modalInstance.result.then(function (data) {
		    $scope.chuDe= data.chuDe;
		    if($scope.chuDe !== null){
		        getListFilePhiCauTruc($scope.chuDe, $scope.typeNhapXuat);
		    }
		}, function () {
		    //$log.info('modal-component dismissed at: ' + new Date());
		});
	}

	$scope.doDownloadFile = function (fileId) {
		$scope.srcReport = contextPath + "/downLoadFileCauTruc/?" + "fileId="+ fileId;
	}

	$scope.doDeleteFile = function (fileId) {
		$scope.isDeleteId = fileId;
		$PopupMessage.Confirm('Bạn chắc có muốn xóa bản ghi?', deleteFilePhiCauTruc, null);
		
	}

	$scope.doClose = function () {
		window.history.back();
	}
	
	function deleteFilePhiCauTruc() {
		displayFileCauTrucService.DoDeleteFile($scope.isDeleteId)
			.then(
				function(deferred) {
					if (deferred == 1) {
						$PopupMessage.Success("Tệp tin đã được xóa!");
					}else if (deferred == 2){
						$PopupMessage.Error("Tệp tin đã bị xóa!");
					} else {
						$PopupMessage.Error("Có lỗi trong quá trình xóa dữ liệu");
					}
					getListFilePhiCauTruc($scope.chuDe, $scope.typeNhapXuat);
				},
				function (errResponse) {
					console.log('Error while fetching data');
				}
			);
	}

	function init() {
		var path = $location.absUrl().indexOf("uploadFileCauTrucXuatKhau");
		if(path != -1){
			$scope.typeNhapXuat = "X";
		}else {
			$scope.typeNhapXuat = "N";
		}
		getListFilePhiCauTruc($scope.chuDe, $scope.typeNhapXuat);
	}

	function getListFilePhiCauTruc(chuDe, typeNhapXuat)	{
		displayFileCauTrucService.GetListFilePhiCauTruc(chuDe, typeNhapXuat)
			.then(
				function(deferred) {
					$scope.listFilePhiCauTrucs = deferred;
					
					var begin = (($scope.currentPage - 1) * $scope.numPerPage), 
					end = begin + $scope.numPerPage;
					$scope.phantrang = $scope.listFilePhiCauTrucs.slice(begin, end);
					getTotalPage($scope.listFilePhiCauTrucs.length);
					
					console.log("Display data successfully");
				},
				function (errResponse) {
					console.error('Error while fetching data');
				}
			);
	}

}]);


myApp.controller('uploadFileCauTrucController', ['$scope',
													'$PopupMessage',
													'$uibModal',
													'$uibModalInstance',
													'title',
													'typeNhapXuat',
													'chuDe',
													'contextPath',
													'displayFileCauTrucService',
													 function($scope,
													 		 $PopupMessage,
													 		 $uibModal,
													 		 $uibModalInstance,
													 		 title,
													 		 typeNhapXuat,
													 		 chuDe,
													 		 contextPath,
													 		 displayFileCauTrucService){

	var MAX_SIZE_FILE_UPLOAD = 5242880 * 2;
	$scope.disbleBtn = false;
	var file = "";
	
	$scope.chuDe = "";

	init()
	
	$scope.doUploadFile = function() {
		file = $scope.myFile;

		if(!validateChuDeFile($scope.chuDe)){
			$PopupMessage.Error("Hãy lựa chọn chủ đề.");
			return;
		}
		if(file === undefined){
			$PopupMessage.Error("Hãy lựa chọn file!");
			return;
		}
		 
		if(!validateTypeFile(file)){
			 $PopupMessage.Error("Hãy lựa chọn file excel!");
			 return;
		}
		 
		if (!validateMaxSizeFile(file)){
			 $PopupMessage.Error("Kích thước tệp tin tối đa là 10MB.");
			 return;
		}

		if(!validateMoTaFile($scope.moTa)){
			$PopupMessage.Error("Chưa nhập nội dung mô tả.!");
			return;
		}
		
		if($scope.moTa.length > 200){
			$PopupMessage.Error("Mô tả quá dài.");
			return;
		}

		var fileObject = thietLapFileObject();
		var mota = $scope.moTa;

		displayFileCauTrucService.DoUploadFile(file, fileObject, mota)
		 	.then(
				function(deferred) {
					
					if(deferred === 1){
						 $PopupMessage.Success("Tải tệp tin thành công.!");
						 console.log("Display data successfully");
						 
					} else if (deferred === 2){
						$PopupMessage.Error("Tệp tin không đúng cấu trúc.");
					} else {
						$PopupMessage.Error("Tải tệp tin không thành công.!");
						
					}
					init()
				},
				function (errResponse) {
					$PopupMessage.Error("Có lỗi trong quá trình xử lý thông tin.");
				}
			 );
	}
	
	$scope.doClose = function () {
        var object = {
            chuDe 	: $scope.chuDe
        };
        $uibModalInstance.close(object);
	}

	$scope.setChuDe = function(){
		
		if ($scope.chuDe === "2"){
			$scope.disbleBtn = true;
		}else {
			$scope.disbleBtn = false;
		}
	}
	
	$scope.openNhapMoi = function (chuDe){
		 window.location.href =  contextPath + "/thaoTacFileCauTruc/"+ chuDe +"/" + $scope.typeNhapXuat;
	}
	
	function thietLapChuDe (chuDe){
		var chuDeTmp = "";
		
		if (chuDe === "1"){
			chuDeTmp = "Dầu thô";
		}else if (chuDe === "2"){
			chuDeTmp = "Chuyển phát nhanh";
		}else {
			chuDeTmp = "Phương tiện xuất nhập cảnh";
		}
		return chuDeTmp;
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
	
	function thietLapFileObject (){
		var fileObj = {};
		fileObj.fileTitle = $scope.chuDe;
		fileObj.typeNhapXuat = $scope.typeNhapXuat;

		return fileObj;
	}

	function init(){
		$scope.title = title;
		$scope.typeNhapXuat = typeNhapXuat;
		$scope.chuDe = chuDe;
		if ($scope.chuDe === ""){
			$scope.disbleBtn = true;
		}
		$scope.nameFile = "Chưa chọn tệp tin";
		$scope.moTa = "";
		$('#file').val('');
	}
	function validateTypeFile (file) {
		var validExts = [".xls", ".xlsx"];
	    var index =  file.name.lastIndexOf(".");
	    var ext = file.name.substring(index);
	    if(validExts.indexOf(ext) == -1){
	    	return false;
	    }else {
	    	return true;
	    }
	}
	
	function validateMaxSizeFile(file){
		if (file !== null){
			if(file.size > MAX_SIZE_FILE_UPLOAD){
				return false;
			} else if (file.size == 0){
				return false;
			}else{
				return true;
			}
		} else {
			return false;
		}
	}
	
	function validateChuDeFile(chuDe){
		if($scope.chuDe == ""){
			$('#chuDe').focus();
			return false;
		}else{
			return true
		}
	}
	
	function validateMoTaFile(moTa){
		if ($scope.moTa == "") {
			$('#moTa').focus();
			return false;
		}else {
			return true;
		}
	}

}]);

myApp.directive('fileModel', ['$parse', function ($parse) {
   return {
      restrict: 'A',
      link: function(scope, element, attrs) {
         var model = $parse(attrs.fileModel);
         var modelSetter = model.assign;
         
         element.bind('change', function(){
            scope.$apply(function(){
               modelSetter(scope, element[0].files[0]);
            });
         });
      }
   };
}]);