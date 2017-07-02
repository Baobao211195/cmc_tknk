/**
 * Controller of model TBS_BIEUTHUE
 */

'use strict';

angular.module('myApp').controller('Tbs_CuaKhauNNController', Tbs_CuaKhauNNController);
Tbs_CuaKhauNNController.$inject = ['$scope', 'Tbs_CuaKhauNNService', 'pagerService', '$uibModal', '$PopupMessage'];

function Tbs_CuaKhauNNController($scope, Tbs_CuaKhauNNService, pagerService, $uibModal, $PopupMessage) {		
	console.log('start Tbs_CuaKhauNNController');
		var self = this;
		self.lstCuaKhauNN = [];		
        self.cuaKhaunnVnaccsEntity = {
        		maCang: '',
        		tenTP: '',
        		maNuoc: '',
        		tenNuoc: '',        	
        		loaiCang: '',
        		isChecked: false,
        		addOrUpdate: ''
        };        
        self.selectedList = []; //Danh sach row da chon        
        self.checkAll = false;                      
        
        //Them moi row su dung popup start
        self.editRow = editRow;                
        self.showPopup = showPopup;
        self.remove = remove;
        self.animationsEnabled = true;        
        self.search = search;
        
        self.totalItems = 0;
        self.currentPage = 1;
        self.maxSize = 5;
        self.pageSize = 10;
        search(self.currentPage, self.pageSize);
        
//        function paginationLstCuaKhauNN(){
//        	console.log('paginationLstCuaKhauNN@self.lstCuaKhauNN.length:',self.lstCuaKhauNN.length);
//        	$scope.totalItems = self.lstCuaKhauNN.length;
//            $scope.itemsPerPage = 10
//            $scope.currentPage = 1;
//            $scope.maxSize = 5;
//            $scope.bigTotalItems = 175000000;
//            $scope.bigCurrentPage = 1;
//            
//           $scope.pageCount = function () {
//             return Math.ceil(self.lstCuaKhauNN.length / $scope.itemsPerPage);
//           };
//
//           $scope.$watch('currentPage + itemsPerPage', function() {
//             var begin = (($scope.currentPage - 1) * $scope.itemsPerPage),
//                 end = begin + $scope.itemsPerPage;
//
//             $scope.lstCuaKhauNNs = self.lstCuaKhauNN.slice(begin, end);
//           });
//        }
        
        $scope.pageChanged = function() {
            console.log('Page changed to: ' + self.currentPage);
            search(self.currentPage, self.pageSize);
        };
        
        function delCuaKhauNN(chooseList) {
        	console.log('start delCuaKhauNN');
        	Tbs_CuaKhauNNService.delCuaKhauNN(chooseList)
                .then(
            		function (response){
                		self.checkAll = false;
                		search(1, self.pageSize);
                	},
                    function (errResponse) {
                        console.error(errResponse);
                    }
                );
        }
        
        $scope.toggleAll = function(){
        	for(var i = 0; i < self.lstCuaKhauNN.length; i++){
        		self.lstCuaKhauNN[i].isChecked = self.checkAll;
        	}
        };

        function remove() {
        	self.selectedList = [];        	
        	var selectedId = "";        	
        	for(var i = 0; i < self.lstCuaKhauNN.length; i++){
        		console.log('isChecked:',self.lstCuaKhauNN[i].isChecked);
        		if(self.lstCuaKhauNN[i].isChecked == true){
        			selectedId = self.lstCuaKhauNN[i].maCang;        			
        			self.selectedList.push(selectedId);
        		}
        	}
            console.log('Id to be deleted: ', self.selectedList);
            if(self.selectedList.length == 0){
            	//angular.element(document.querySelector('.messageErrorArea')).text("Chưa chọn bản ghi nào để xóa");
            	$PopupMessage.Warning('Chưa chọn bản ghi nào để xóa!');
            	return;
            }
            $PopupMessage.Confirm('Bạn có chắc muốn xóa bản ghi?',DeleteObject,null);
            //$PopupMessage.Confirm('Ban co chac chan muon xoa ban ghi',delBieuThue(self.selectedList),null);
            
//            delCuaKhauNN(self.selectedList);
        }
        
        function DeleteObject()
        {
        	//alert('Delete thanh cong ');
        	delCuaKhauNN(self.selectedList);
        };
        
        function search(currentPage, pageSize){
        	
        	var param = {};
        	param["maCang"] = $scope.maCang;
        	param["loaiCang"] = $scope.loaiCang;
        	param["tenNuoc"] = $scope.tenNuoc;
        	param["tenTP"] = $scope.tenTP;
        	param["maNuoc"] = $scope.maNuoc;
        	param["currentPage"] = currentPage;
        	param["pageSize"] = pageSize;
        	
        	console.log('search@param:',param);        	
        	
        	Tbs_CuaKhauNNService.searchCuaKhauNN(param)
        		.then(function(respone){        			
        			self.lstCuaKhauNN = respone.lstCuaKhauNN;
        			self.totalItems = respone.totalCount;
        			self.pageSize = parseInt(respone.pageSize);
        			self.currentPage = parseInt(respone.currentPage);
        			},
        			function(errResponse){
        				console.error(errResponse);
        			}
        		);        	
        }

        function reset() {
        	self.cuaKhaunnVnaccsEntity = {
            		maCang: '',
            		tenTP: '',
            		maNuoc: '',
            		tenNuoc: '',        	
            		loaiCang: '',
            		isChecked: false,
            		addOrUpdate: ''
            };
            //$scope.myForm.$setPristine(); //reset Form
        }
        
        $scope.addRow = function() {
        	reset(); //Lam moi entity
        	self.cuaKhaunnVnaccsEntity.addOrUpdate = 'add';
    		self.showPopup(self.lstCuaKhauNN, self.cuaKhaunnVnaccsEntity);
    	};
    	
    	function editRow(maCang){
    		console.log('Id to be edited', maCang);
            for (var i = 0; i < self.lstCuaKhauNN.length; i++) {
                if (self.lstCuaKhauNN[i].maCang === maCang) {
                    self.cuaKhaunnVnaccsEntity = angular.copy(self.lstCuaKhauNN[i]);
                    break;
                }
            }
            self.cuaKhaunnVnaccsEntity.addOrUpdate = 'update';
            self.showPopup(self.lstCuaKhauNN, self.cuaKhaunnVnaccsEntity);
    	}    	
    	
    	function showPopup(grid, row){
    		var modalInstance = $uibModal.open({
    			animation: self.animationsEnabled,
    			ariaLabelledBy: 'modal-title',
    			ariaDescribedBy: 'modal-body',
    			templateUrl: 'cuaKhaunnVnaccsEdit',
    			controller: 'cuaKhaunnVnaccsModalCtrl',
    			controllerAs: 'self',
    			resolve: {
    				grid : function() {
						return grid;
					},
					row : function() {						
						return row;
					}
    			}
    		});
    		
    		modalInstance.result.then(function (data) {
    				if(data == 'success'){
    					self.currentPage = 1;
    					search(self.currentPage, self.pageSize);
    				}else{
    					console.log('lỗi close popup');
    				}
    		    }, function () {
    		      //$log.info('modal-component dismissed at: ' + new Date());
    		    });
    	}    	

}

angular.module('myApp').controller('cuaKhaunnVnaccsModalCtrl', cuaKhaunnVnaccsModalCtrl);
cuaKhaunnVnaccsModalCtrl.$inject = ['$uibModalInstance', 'grid', 'row', 'Tbs_CuaKhauNNService', '$PopupMessage']
function cuaKhaunnVnaccsModalCtrl($uibModalInstance, grid, row, Tbs_CuaKhauNNService, $PopupMessage) {
	var self = this;
	self.lstCuaKhauNN = angular.copy(grid);
	self.entity = angular.copy(row);
	console.log('start save data!');
	console.log(self.entity.addOrUpdate);
	self.message = '';
	  
	self.saveData = saveData;

	self.cancel = function () {
	    $uibModalInstance.dismiss('cancel');
	};
	  
	function saveData() {
		if (self.entity.addOrUpdate == 'add') {
			console.log('Saving New Row', self.entity);
			crtCuaKhauNN(self.entity);
        } else {
        	console.log('Updated row with maCang ', self.entity.maCang);
        	updCuaKhauNN(self.entity, self.entity.maCang);
        }
  	}
	
	function crtCuaKhauNN(entity) {
		Tbs_CuaKhauNNService.crtCuaKhauNN(entity)
            .then(
        		function (response){
            		self.message = 'Create success';
            		var modalInstance = $PopupMessage.Success('Thêm mới thành công');
        			
        			modalInstance.result.then(function (data) {
        				if(data == 'close'){
        					$uibModalInstance.close("success");
        				}
        				else{
        					$uibModalInstance.close("error");
        				}
        		    });
            	},
                function (errResponse) {
                    console.error('Error while creating data');
                    self.message = 'error';
            		var modalInstance;
            		if(errResponse.status == 409){
            			modalInstance = $PopupMessage.Error('Mã cảng đã tồn tại không thể thêm mới');
            		}
            		else{
            			modalInstance = $PopupMessage.Error('Không thể thêm mới xin hãy thử lại');
            		}
					
					modalInstance.result.then(function (data) {
						if(data == 'close'){
							console.log("Đóng modal");
						}
						else{
							console.log("Lỗi khi đóng modal");
						}
				    });
                }
            );
    }
	
	function updCuaKhauNN(entity, maCang) {
		Tbs_CuaKhauNNService.updCuaKhauNN(entity, maCang)
            .then(            
        		function (ressponse){
            		self.message = 'Update success';
            		var modalInstance = $PopupMessage.Success('Cập nhật thành công');
        			
        			modalInstance.result.then(function (data) {
        				if(data == 'close'){
        					$uibModalInstance.close("success");
        				}
        				else{
        					$uibModalInstance.close("error");
        				}
        		    });
            	},
                function (errResponse) {
                    console.error('Error while updating data');
                    self.message = 'error';
                    var modalInstance = $PopupMessage.Error('Không thể cập nhật xin hãy thử lại');
					
					modalInstance.result.then(function (data) {
						if(data == 'close'){
							console.log("Đóng modal");
						}
						else{
							console.log("Lỗi khi đóng modal");
						}
				    });
                }
            );
    }
	
}
