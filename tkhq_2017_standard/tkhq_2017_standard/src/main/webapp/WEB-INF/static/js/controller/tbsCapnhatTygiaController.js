/**
 * Controller of model 
 */

'use strict';

angular.module('myApp').controller('TbsCapnhatTygiaController', TbsCapnhatTygiaController);
TbsCapnhatTygiaController.$inject = ['$rootScope', '$scope', 'TbsCapnhatTygiaService', 'pagerService', '$uibModal', '$PopupMessage',
         '$filter'];

function TbsCapnhatTygiaController($rootScope, $scope, TbsCapnhatTygiaService, pagerService, $uibModal, $PopupMessage, $filter) {
		console.log('TbsCapnhatTygiaController START@');
		var self = this;
		//define variable
		self.listTygia = [];
        self.tygiaEntity = {
        		tygiaId: 0,
        		maNt: '',        		
        		tygiaVnd: 0,
        		tygiaUsd: 0,        		
        		ngay: '',
        		isChecked: false,
        		addOrUpdate: ''
        };
        self.ngay = '';
        self.selectedList = []; //Danh sach row da chon        
        self.checkAll = false;
        
        //method handle action in form
        self.remove = remove;	//Xoa ban ghi da chon        
        self.editRow = editRow;	//Cap nhat ban ghi da chon
        self.showPopup = showPopup;	//Hien thi popup cho them moi va cap nhat du lieu
        self.search = search;	//Tim kiem tren form
        
        //option of popup
        self.animationsEnabled = true;
        
        //Date picker
    	$scope.popup1 = {
    		opened: false
    	};
    	$scope.open1 = function() {
            $scope.popup1.opened = true;
        };
        
        $scope.dateOptions = {
    	    formatYear: 'yy',
    	    startingDay: 1,
    	    'show-weeks' : false
        };
        
        //pagination
        self.pager = {};
        //self.setPage = setPage;
        //variable of paging
        self.totalItems = 0;
        self.currentPage = 1;
        self.maxSize = 5;
        self.pageSize = 10;            
        
        //get all data after initialize property of controller        
        search(self.currentPage, self.pageSize);
        
        $scope.pageChanged = function() {
            console.log('Page changed to: ' + self.currentPage);
            search(self.currentPage, self.pageSize);
        };

        function delTygia(chooseList) {
        	TbsCapnhatTygiaService.delTygia(chooseList)
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
        
        function search(currentPage, pageSize){
        	if(!checkInput()){
    			return;
    		}
        	
        	var param = {};
    		param["maNt"] = $scope.maNt == null ? '' : $scope.maNt;
    		param["ngay"] = self.ngay == null ? '' : $filter('date')(self.ngay, "ddMMyyyy");
        	param["currentPage"] = currentPage;
        	param["pageSize"] = pageSize;
        	
        	$rootScope.showLoading = true;
        	
        	TbsCapnhatTygiaService.searchTygia(param)
        		.then(function(respone){
        			self.listTygia = respone.content;
        			self.totalItems = parseInt(respone.totalItems);
        			self.pageSize = parseInt(respone.pageSize);
        			self.currentPage = parseInt(respone.currentPage);
        			
        			$rootScope.showLoading = false;
        			},
        			function(errResponse){
        				console.error(errResponse);
        				$rootScope.showLoading = false;
        				self.listTygia = [];
        			}
        		);
        	console.log('search@self.listTygia: ' + self.listTygia);
        }
        
        function checkInput(){
    		if(typeof self.ngay == 'undefined')
    		{
				//angular.element(document.querySelector('#messageErrorArea')).text('Sai định dạng ngày.');
    			$PopupMessage.Warning('Sai định dạng ngày.');
				return false;
    		}
    		
    		return true;
    	}
        
        $scope.toggleAll = function(){
        	for(var i = 0; i < self.listTygia.length; i++){
        		self.listTygia[i].isChecked = self.checkAll;
        	}
        };

        function remove() {

        	self.selectedList = [];
        	var selectedId = "";
        	for(var i = 0; i < self.listTygia.length; i++){
        		if(self.listTygia[i].isChecked == true){
        			selectedId = self.listTygia[i].tygiaId;
        			self.selectedList.push(selectedId);
        		}
        	}
            console.log('Id to be deleted: ', self.selectedList);
            if(self.selectedList.length == 0){
            	//angular.element(document.querySelector('.messageErrorArea')).text("Chưa chọn bản ghi nào để xóa");
            	$PopupMessage.Warning('Chưa chọn bản ghi nào để xóa!');
            	return;
            }

            $PopupMessage.Confirm('Bạn có chắc muốn xóa bản ghi?', DeleteData , null);
        }
        
        function DeleteData()
        {
        	delTygia(self.selectedList);
        }

        //Them moi truc tiep row tren grid end

        function reset() {
        	self.tygiaEntity = {
        			tygiaId: 0,
            		maNt: '',        		
            		tygiaVnd: 0,
            		tygiaUsd: 0,        		
            		ngay: '',
            		isChecked: false,
            		addOrUpdate: ''
            };           
        }
        
        $scope.addRow = function() {
        	reset(); //Lam moi entity
        	self.tygiaEntity.addOrUpdate = 'add';
    		self.showPopup(self.listTygia, self.tygiaEntity);
    	};
    	
    	function editRow(id){
    		console.log('Id to be edited', id);
            for (var i = 0; i < self.listTygia.length; i++) {
                if (self.listTygia[i].tygiaId === id) {
                    self.tygiaEntity = angular.copy(self.listTygia[i]);
                    self.tygiaEntity.ngay = new Date(self.tygiaEntity.ngay);
                    break;
                }
            }
            self.tygiaEntity.addOrUpdate = 'update';
            self.showPopup(self.listTygia, self.tygiaEntity);
    	}   	
    	
    	function showPopup(grid, row){
    		var modalInstance = $uibModal.open({
    			animation: self.animationsEnabled,
    			ariaLabelledBy: 'modal-title',
    			ariaDescribedBy: 'modal-body',
    			templateUrl: 'tygiaEdit',
    			controller: 'tygiaModalCtrl',
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
    					search(1, self.pageSize);
    				}else{
    					console.log('Có lỗi xảy ra');
    				}
    		    }, function () {
    		      //$log.info('modal-component dismissed at: ' + new Date());
    		    });
    	}

}

angular.module('myApp').controller('tygiaModalCtrl', tygiaModalCtrl);
tygiaModalCtrl.$inject = ['$scope', '$uibModalInstance', 'grid', 'row', 'TbsCapnhatTygiaService', '$PopupMessage']
function tygiaModalCtrl($scope, $uibModalInstance, grid, row, TbsCapnhatTygiaService, $PopupMessage) {
	var self = this;
	self.listTygia = angular.copy(grid);
	self.entity = angular.copy(row);
	self.message = '';
	  
	self.saveData = saveData;
	
	//Date picker
	$scope.popup1 = {
		opened: false
	};
	$scope.open1 = function() {
        $scope.popup1.opened = true;
    };
    
    $scope.dateOptions = {
	    formatYear: 'yy',
	    startingDay: 1,
	    'show-weeks' : false
    };

	self.cancel = function () {
	    $uibModalInstance.dismiss('cancel');
	};
	  
	function saveData() {
		if (self.entity.addOrUpdate == 'add') {
			console.log('Saving New Row', self.entity);
			crtTygia(self.entity);
        } else {
        	console.log('Updated row with id ', self.entity.tygiaId);
        	updTygia(self.entity, self.entity.tygiaId);
        }
  	}
	
	function crtTygia(entity) {
		TbsCapnhatTygiaService.crtTygia(entity)
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
            		console.error(errResponse);
            		self.message = 'error';
            		var modalInstance = $PopupMessage.Error('Không thể thêm mới xin hãy thử lại');
					
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
	
	function updTygia(entity, id) {
		TbsCapnhatTygiaService.updTygia(entity, id)
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
                    console.error(errResponse);
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
