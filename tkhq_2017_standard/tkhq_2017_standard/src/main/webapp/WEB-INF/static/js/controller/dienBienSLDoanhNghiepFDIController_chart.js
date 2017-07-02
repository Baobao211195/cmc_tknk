/**
 * Controller of model TBS_BIEUTHUE
 */

'use strict';

angular.module('myApp').controller('dienBienSLDoanhNghiepFDIController_chart', dienBienSLDoanhNghiepFDIController_chart);
dienBienSLDoanhNghiepFDIController_chart.$inject = ['$scope', 'dienBienSLDoanhNghiepFDIService', 'pagerService', '$uibModal', '$PopupMessage', '$rootScope', 'contextPath'];

function dienBienSLDoanhNghiepFDIController_chart($scope, dienBienSLDoanhNghiepFDIService, 
		pagerService, $uibModal, $PopupMessage, $rootScope, contextPath) {		
	console.log('start dienBienSLDoanhNghiepFDIController_chart');
		var self = this;
		self.lstTrangThai = [];
		self.lstManager = [];		
		self.soLieuChiTieuTK = [];               
		self.lstCucHQ = [];
		self.lstChiCucHQ = [];
        self.feedBack = feedBack;                
        self.showPopup = showPopup;
        self.animationsEnabled = true;
        self.nhx = 'X';
        self.linkAPI_LuongTK = '';//contextPath+'/pbtk/API_dienBienSLDoanhNghiepFDI_ky?nhx=X&trangThai=SB&radioBox=KY&maCucHQ=29&loaiTK=luongTK';
        self.linkAPI_DongiaTK = '';//contextPath+'/pbtk/API_dienBienSLDoanhNghiepFDI_ky?nhx=X&trangThai=SB&radioBox=KY&maCucHQ=29&loaiTK=dongiaTK';
        self.linkAPI_TrigiaTK = '';//contextPath+'/pbtk/API_dienBienSLDoanhNghiepFDI_ky?nhx=X&trangThai=SB&radioBox=KY&maCucHQ=29&loaiTK=trigiaTK';
        self.loai_bc = '10';
        $scope.showChart2 = false;
        $scope.lstMatHang = [];
        self.CucHQSelect = CucHQSelect;
        GetCucHQ();
        GetNewPage();
//        GetSoLieuChiTieuTK01();
        
        function GetCucHQ() {
        	dienBienSLDoanhNghiepFDIService.GetCucHQ()
            	.then(
        			function (deferred) {
        				self.lstCucHQ = deferred;
        				$scope.CucHQ = self.lstCucHQ[0];
        				self.CucHQSelect($scope.CucHQ);
                    },
                    function (errResponse) {
                        console.error('Error while fetching data');
                    }
                );        	
        }  
        
        function CucHQSelect(Item) {
        	console.log("CucHQSelect@Item:"+Item);
        	if(Item.ma != '00'){
        	dienBienSLDoanhNghiepFDIService.GetChiCucHQByCuc(Item.ma)
            	.then(
        			function (deferred) {
        				self.lstChiCucHQ = deferred;
        				self.lstChiCucHQ = [{"ma": "","ten": "---chọn---"}].concat(self.lstChiCucHQ);
        				$scope.ChiCucHQ = self.lstChiCucHQ[0];
                    },
                    function (errResponse) {
                        console.error('Error while fetching data');
                    }
                );  
        	} else{
        		self.lstChiCucHQ = [{"ma": "","ten": "---chọn---"}];
        		$scope.ChiCucHQ = self.lstChiCucHQ[0];
        	}
        }
        
        function GetSoLieuChiTieuTK10() {
        	console.log('Controller GetSoLieuChiTieuTK10@trangThai:'+$scope.trangThai.ma+'|self.nhx:'+self.nhx+
        			'|ChiCucHQ:'+$scope.ChiCucHQ.ma+'|CucHQ:'+$scope.CucHQ.ma);        	
        	dienBienSLDoanhNghiepFDIService.GetSoLieuChiTieuTK10($scope.trangThai.ma, 
        			self.nhx, $scope.CucHQ.ma, $scope.ChiCucHQ.ma)
    		.then(function(respone){        			
    			self.soLieuChiTieuTK = respone;    			    			
    			console.log('Controller GetSoLieuChiTieuTK10@length respone:'+self.soLieuChiTieuTK[0].data_thang.data.length);
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
    	                	  }];
        	$scope.trangThai = self.lstTrangThai[0];
        	$scope.radioBox = 'KY';
        	$rootScope.$emit('PhanHoiQuyTrinhXLDL', self.loai_bc);
        	var nhx1 = "";
			if ( self.nhx != undefined &&  self.nhx != null)
				nhx1 =  self.nhx;
			dienBienSLDoanhNghiepFDIService.getMathang(nhx1).then(function(deferred) {
				$scope.lstMatHang = deferred;
//				$scope.lstMatHang = [{"ma": "","ten": "---chọn---"}].concat($scope.lstMatHang);
				$scope.cmbMatHang = $scope.lstMatHang[0]; 
				
			}, function(errResponse) {
				console.error('Error while fetching data');
			});
        }                                           
        
        $rootScope.$on('childEmit', function(event, data) {
            console.log(data);
            self.nhx = data;
          });
        
//        $scope.getBaoCao = function() {            
//        	GetSoLieuChiTieuTK10();
//        };        
        $scope.showChart = function() {      
        	var mathang="";
        	if ($scope.cmbMatHang != undefined && $scope.cmbMatHang != null)
				if ($scope.cmbMatHang.ma != undefined && $scope.cmbMatHang.ma != null)
					mathang = $scope.cmbMatHang.ma;
        	self.linkAPI_LuongTK = contextPath+'/pbtk/API_dienBienSLDoanhNghiepFDI_ky?nhx='
        		+self.nhx+'&trangThai='+$scope.trangThai.ma+'&radioBox='+$scope.radioBox+'&maCucHQ='+$scope.CucHQ.ma+'&maChicucHQ='+$scope.ChiCucHQ.ma+'&loaiTK=luongTK'+'&mathang='+mathang;
            self.linkAPI_DongiaTK = contextPath+'/pbtk/API_dienBienSLDoanhNghiepFDI_ky?nhx='
            	+self.nhx+'&trangThai='+$scope.trangThai.ma+'&radioBox='+$scope.radioBox+'&maCucHQ='+$scope.CucHQ.ma+'&maChicucHQ='+$scope.ChiCucHQ.ma+'&loaiTK=dongiaTK'+'&mathang='+mathang;
            self.linkAPI_TrigiaTK = contextPath+'/pbtk/API_dienBienSLDoanhNghiepFDI_ky?nhx='
            	+self.nhx+'&trangThai='+$scope.trangThai.ma+'&radioBox='+$scope.radioBox+'&maCucHQ='+$scope.CucHQ.ma+'&maChicucHQ='+$scope.ChiCucHQ.ma+'&loaiTK=trigiaTK'+'&mathang='+mathang;
            $scope.showChart2 = true;        	
            console.log('showChart@self.linkAPI_LuongTK:'+self.linkAPI_LuongTK+'||'+self.linkAPI_DongiaTK+'||'+self.linkAPI_TrigiaTK);            
        };
        
        $scope.clickDongButton = function() {
            console.log('clickDongButton@$scope.trangThai:'+$scope.trangThai.ma);
            window.location.href = contextPath;
        };
    	
    	function feedBack(){
    		console.log('Id to be edited');            
            self.showPopup(self.soLieuChiTieuTK);
    	}    	
    	
    	function showPopup(grid){
    		var modalInstance = $uibModal.open({
    			animation: self.animationsEnabled,
    			ariaLabelledBy: 'modal-title',
    			ariaDescribedBy: 'modal-body',
    			templateUrl: 'phanHoiQuyTrinhXLDL',
    			controller: 'dienBienSLDoanhNghiepFDIModalCtrl',
    			controllerAs: 'self',
    			resolve: {
    				grid : function() {
						return grid;
					}
    			}
    		});
    		
    		modalInstance.result.then(function (data) {
//				if(data == 'success'){
//					self.currentPage = 1;
//					search(self.currentPage, self.pageSize);
//				}else{
//					console.log('Có lỗi xảy ra');
//				}
		    }, function () {
		    	});
    	} 
}

angular.module('myApp').controller('dienBienSLDoanhNghiepFDIModalCtrl', dienBienSLDoanhNghiepFDIModalCtrl);
dienBienSLDoanhNghiepFDIModalCtrl.$inject = ['$uibModalInstance', 'grid', 'dienBienSLDoanhNghiepFDIService']
function dienBienSLDoanhNghiepFDIModalCtrl($uibModalInstance, grid, dienBienSLDoanhNghiepFDIService) {
	var self = this;
//	self.soLieuChiTieuTK = angular.copy(grid);
	self.cancel = function () {
	    $uibModalInstance.dismiss('cancel');
	};	  
	
}
