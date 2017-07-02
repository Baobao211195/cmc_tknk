/**
 * Controller of model TBS_BIEUTHUE
 */

'use strict';

App.controller('dienBienSoLieuChiTieuTKController_chart', dienBienSoLieuChiTieuTKController_chart);
dienBienSoLieuChiTieuTKController_chart.$inject = ['$scope', 'dienBienSoLieuChiTieuTKService', 'pagerService', '$uibModal', '$PopupMessage', '$rootScope', 'contextPath'];

function dienBienSoLieuChiTieuTKController_chart($scope, dienBienSoLieuChiTieuTKService, pagerService, $uibModal, $PopupMessage, $rootScope, contextPath) {		
	console.log('start dienBienSoLieuChiTieuTKController');
		var self = this;
		self.lstTrangThai = [];
		self.lstManager = [];
		self.lstDataKy = [];
		self.lstDataThang = [];
		self.soLieuChiTieuTK = '';
        self.cuaKhaunnVnaccsEntity = {
        		mo_ta: '',
        		ma_hang: '',
        		ma_tk: '',        		        	
        		isChecked: false        		
        };        
        self.selectedList = []; //Danh sach row da chon        
        self.checkAll = false;                      
        
        //Them moi row su dung popup start
        self.feedBack = feedBack;                
        self.showPopup = showPopup;
        self.showReport = showReport;
        self.showReportChart = showReportChart;
        self.animationsEnabled = true;         
        self.search = search;
        
        self.totalItems = 0;
        self.currentPage = 1;
        self.maxSize = 5;
        self.pageSize = 10;
        self.nhx = 'X';
        self.loai_bc = '1';
        self.linkAPI = '';//contextPath+'/pbtk/API_dienbiensolieuchitieuTK_ky?nhx=X&trangThai=SB&radioBox=KY';
//        search(self.currentPage, self.pageSize);
//        $scope.sharedData = myService.getData();
        $scope.showChart2 = false;
        GetNewPage();
        GetSoLieuChiTieuTK01();
        
        function GetSoLieuChiTieuTK01() {
        	console.log('Controller GetSoLieuChiTieuTK01@trangThai:'+$scope.trangThai.ma+'|self.nhx:'+self.nhx);
        	/*self.paramTest = dienBienSoLieuChiTieuTKService.GetSoLieuChiTieuTK01($scope.trangThai.ma, self.nhx);
        	console.log(self.paramTest.data_ky.data[0].ky);*/
        	dienBienSoLieuChiTieuTKService.GetSoLieuChiTieuTK01($scope.trangThai.ma, self.nhx)
    		.then(function(respone){        			
    			self.soLieuChiTieuTK = respone;    			
    			self.lstDataKy = respone.data_ky.data;
    			self.lstDataThang = respone.data_thang.data;  
    			self.test2324 = $scope.trangThai.ma;
    			console.log(self.soLieuChiTieuTK.chi_tieu+"|"+self.lstDataKy.length+"|"+self.lstDataThang.length);
    			},
    			function(errResponse){
    				console.error(errResponse);
    			}
    		); 
        }
        
        function GetNewPage() {
        	self.lstTrangThai = [{
    	                	    "ma": "SB",
    	                	    "ten": "Sơ bộ"
    	                	  },
    	                	  {
    	                	    "ma": "DC",
    	                	    "ten": "Điều chỉnh"
    	                	  },
    	                	  {
    	                	    "ma": "CT",
    	                	    "ten": "Chính thức"
    	                	  },
    	                	  {
      	                	    "ma": "UC",
      	                	    "ten": "Ước"
      	                	  }];
        	$scope.trangThai = self.lstTrangThai[0];
        	$scope.radioBox = 'KY';
        	$rootScope.$emit('PhanHoiQuyTrinhXLDL', self.loai_bc);
        }                                           
        
        $rootScope.$on('childEmit', function(event, data) {
            console.log(data);
            self.nhx = data;   
//            GetSoLieuChiTieuTK01();
          });
        
        $rootScope.$on('childTrangThai', function(event, data) {
            console.log('childTrangThai:'+data);
          });
        
        $scope.clickDongButton = function() {
            console.log('clickDongButton@$scope.trangThai:'+$scope.trangThai.ma);
            window.location.href = contextPath;
        };
        
        $scope.showChart = function() {        	
        	self.linkAPI = contextPath+'/pbtk/API_dienbiensolieuchitieuTK_ky?nhx='+self.nhx+'&trangThai='+$scope.trangThai.ma
        	+'&radioBox='+$scope.radioBox;
        	 $scope.showChart2 = true;
            console.log('showChart@$rootScope.name'+$rootScope.name);            
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
        	
        	thayDoiBoSungToKhaiHeThongService.searchCuaKhauNN(param)
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
        
        //Them moi truc tiep row tren grid end

//        function reset() {
//        	self.cuaKhaunnVnaccsEntity = {
//            		maCang: '',
//            		tenTP: '',
//            		maNuoc: '',
//            		tenNuoc: '',        	
//            		loaiCang: '',
//            		isChecked: false,
//            		addOrUpdate: ''
//            };
//            //$scope.myForm.$setPristine(); //reset Form
//        }
        
        //Them moi row su dung popup
        $scope.addRow = function() {
        	reset(); //Lam moi entity
        	self.cuaKhaunnVnaccsEntity.addOrUpdate = 'add';
    		self.showPopup(self.lstCuaKhauNN, self.cuaKhaunnVnaccsEntity);
    	};
    	
    	function feedBack(){
    		console.log('Id to be edited');            
            self.showPopup(self.lstManager);
    	}
    	
    	function showReportChart(){            
            self.showReport(self.lstManager);
    	}
    	
    	function showPopup(grid){
    		var modalInstance = $uibModal.open({
    			animation: self.animationsEnabled,
    			templateUrl: 'phanHoiQuyTrinhXLDL',
    			controller: 'dienBienSoLieuChiTieuTKModalCtrl',
    			controllerAs: 'self',
    			resolve: {
    				grid : function() {
						return grid;
					}
    			}
    		});
    		
    		modalInstance.result.then(function (data) {    				
    		    }, function () {
    		    });
    	}    	
    	
    	function showReport(grid){
    		var modalInstance = $uibModal.open({
    			animation: self.animationsEnabled,
    			ariaLabelledBy: 'modal-title',
    			ariaDescribedBy: 'modal-body',
    			templateUrl: 'pageReportChart',
    			controller: 'dienBienSoLieuChiTieuTKModalCtrl',
    			controllerAs: 'self',
    			windowClass: 'app-modal-window',
    			resolve: {
    				grid : function() {
						return grid;
					}
    			}
    		});
    		
    		modalInstance.result.then(function (data) {    				
    		    }, function () {    		     
    		    });
    	} 

}

angular.module('myApp').controller('dienBienSoLieuChiTieuTKModalCtrl', dienBienSoLieuChiTieuTKModalCtrl);
dienBienSoLieuChiTieuTKModalCtrl.$inject = ['$uibModalInstance', 'grid', 'dienBienSoLieuChiTieuTKService', '$PopupMessage']
function dienBienSoLieuChiTieuTKModalCtrl($uibModalInstance, grid, dienBienSoLieuChiTieuTKService, $PopupMessage) {
	var self = this;
	self.lstManager = angular.copy(grid);	
	self.message = '';

	self.cancel = function () {
	    $uibModalInstance.dismiss('cancel');
	};	  
	
}
