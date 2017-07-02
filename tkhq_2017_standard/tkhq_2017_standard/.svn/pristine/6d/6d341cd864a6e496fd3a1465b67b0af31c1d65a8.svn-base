/**
 * 
 */

'use strict';

angular.module('myApp').controller('QLLDTPhoBienController', QLLDTPhoBienController).constant('isIE', _isIE);
QLLDTPhoBienController.$inject = ['$rootScope', '$scope', '$filter', 'QLLDTPhoBienService', '$uibModal', '$PopupMessage',
      'hoanThanhRaXoatSanPhamTKDauRaService', 'contextPath', 'isIE'];

function QLLDTPhoBienController($rootScope, $scope, $filter, QLLDTPhoBienService, $uibModal, $PopupMessage,
		hoanThanhRaXoatSanPhamTKDauRaService, contextPath, isIE) {
	var self = this;
	self.animationsEnabled = true;
	
	//$scope.lstBieu = [];
//	$scope.lstKy = [
//        {ma: "1", ten: "1"},
//        {ma: "2", ten: "2"}
//    ];
//	$scope.lstThang = [];
//	$scope.lstNam = [];
	
	$scope.lstProcessInfo = [];
	$scope.nhx = 'X';
	self.lydo = '';
	
//	self.tenBieuSelected = null;
//	self.kySelected = null;
//	self.thangSelected = null;
//	self.namSelected = null;
//	self.TTSelected = null;
	
	$scope.rbApproval = {value: '0'};
	$scope.rbChecked = {value: '0'};
	
//	$scope.showLoaiKy = true;
//	$scope.showTT = true;
	$scope.btnDisable = false;
	
	function initComponent(){
//		self.tenBieuSelected = null;
//		self.kySelected = null;
//		self.thangSelected = null;
//		self.namSelected = null;
//		self.TTSelected = null;
		
//		$scope.showLoaiKy = true;
//		$scope.showTT = true;
		$scope.btnDisable = false;
		$scope.rbApproval = {value: '0'};
		self.lydo = '';
		$scope.rbChecked = {value: '0'};
		
		search();
		
//		hoanThanhRaXoatSanPhamTKDauRaService.GetListThongTin($scope.nhx)
//			.then(
//				function (deferred) {
//					$scope.lstBieu = deferred[0];
//                },
//                function (errResponse) {
//                    console.error(errResponse);
//                }
//			);
//		
//		for(var i = 1; i <= 12; i++){
//			$scope.lstThang.push(
//				{ ma: i, ten: i}
//			);
//		}
//		
//		for(var i = 1990; i <= 2030; i++){
//			$scope.lstNam.push(
//				{ ma: i, ten: i}
//			);
//		}
	}
	
	$scope.changeTab = function(index){
		console.log("Tab selected: " + index);
		if(index == 0){
			$scope.nhx = 'X';
			initComponent();
		}
		else if(index == 1){
			$scope.nhx = 'N';
			initComponent();
		}
		else{
			console.error("No tab index found!");
		}
	};
	
//	$scope.changeBC = function(){
//		if(self.tenBieuSelected == 0){
//			$scope.btnDisable = true;
//		}
//		else{
//			$scope.btnDisable = false;
//		}
//		
//		var item;
//		
//		hoanThanhRaXoatSanPhamTKDauRaService.GetDanhMucBaoCaoByMaBC($scope.nhx, self.tenBieuSelected)
//			.then(
//				function (deferred) {
//					item = deferred;
//					if(item.loaiBc == 0){
//						$scope.showTT = false;
//					}
//					else{
//						$scope.showTT = true;
//					}
//					
//					if(item.ky == 0){
//						$scope.showLoaiKy = false;
//					}
//					else{
//						$scope.showLoaiKy = true;
//					}
//                },
//                function (errResponse) {
//                    console.error(errResponse);
//                }
//			);
//	};
	
	function search(){
    	var param = {};
//    	param["loaiBC"] = self.tenBieuSelected == null ? '' : self.tenBieuSelected;
//    	param["trangthai"] = self.TTSelected == null ? '' : self.TTSelected;
//    	param["nhx"] = $scope.nhx;
//    	
//    	if(self.kySelected != null && self.thangSelected != null && self.namSelected != null
//			&& $scope.showLoaiKy == true){
//    		param["ky"] = self.kySelected;
//    		param["thang"] = self.thangSelected;
//    		param["nam"] = self.namSelected;
//    	}
//    	else if($scope.showLoaiKy == false && self.thangSelected != null && self.namSelected != null){
//    		param["ky"] = '';
//    		param["thang"] = self.thangSelected;
//    		param["nam"] = self.namSelected;
//    	}
//    	else{
//    		angular.element('#messageErrorArea').text('Chọn sai kỳ tháng năm');
//    		return;
//    	}
    	param["nhx"] = $scope.nhx;
    	
    	$rootScope.showLoading = true;
    	
    	QLLDTPhoBienService.getProcessInfo(param)
    		.then(function(response){
    				$scope.lstProcessInfo = response;
    				for(var i = 0; i < $scope.lstProcessInfo.length; i++){
    					angular.extend($scope.lstProcessInfo[i], {id: i+1}); 
    				}
    				
    				$rootScope.showLoading = false;
    			},
    			function(errResponse){
    				console.error(errResponse);
    				if(errResponse == 404){
    					$scope.lstProcessInfo = [];
    				}
    				$rootScope.showLoading = false;
    			}
    		);
	}
	
	$scope.viewBaoCao = function(){
		if($scope.rbChecked.value == 0 || typeof $scope.rbChecked.value == 'undefined' || $scope.rbChecked.value == null){
			var modalInstance = $PopupMessage.Warning('Chưa chọn bản ghi nào');
			
//			modalInstance.result.then(function (data) {
//				if(data == 'close'){
//					console.log("Đóng modal");
//				}
//				else{
//					console.log("Lỗi khi đóng modal");
//				}
//		    });
			return;
		}
		
		var param = {};
		for(var i = 0; i < $scope.lstProcessInfo.length; i++){
			if($scope.lstProcessInfo[i].id == $scope.rbChecked.value){
				param["path"] = $scope.lstProcessInfo[i].pathBC;
				param["maHQ"] = $scope.lstProcessInfo[i].maHQ;
				param["ky"] = $scope.lstProcessInfo[i].ky;
				param["thang"] = $scope.lstProcessInfo[i].thang;
				param["nam"] = $scope.lstProcessInfo[i].nam;
				if($scope.lstProcessInfo[i].trangThai == 'Sơ bộ'){
					param["loaiBC"] = 'SB';
				}
				else if($scope.lstProcessInfo[i].trangThai == 'Điều chỉnh'){
					param["loaiBC"] = 'DC';
				}
				else if($scope.lstProcessInfo[i].trangThai == 'Chính thức'){
					param["loaiBC"] = 'CT';
				}
				param["tenBC"] = $scope.lstProcessInfo[i].tenDanhMucBaoCao;
				
				break;
			}
		}
		
		var api = contextPath + '/pbtk/' + param["path"] + '?maHQ=' + param["maHQ"] + '&ky=' + param["ky"] + '&thang='
			+ param["thang"] + '&nam=' + param["nam"] + '&loai_BC=' + param["loaiBC"];
		
		var UrlIE = "";
		var title = param["tenBC"];

		if (!isIE) {
			UrlIE = "&type=PDFINLINE"
		}
		
		var modalInstance = $uibModal.open({
			animation : self.animationsEnabled,
			ariaLabelledBy : 'modal-title',
			ariaDescribedBy : 'modal-body',
			controller : ModalInstanceCtrl,
			templateUrl : 'pageReport',
			windowClass : 'app-modal-window',
			resolve : {
				Title : function() {
					return title;
				},

				Url : function() {
					return api;
				},
				UrlIE : function() {
					return UrlIE;
				}
			}
		});
		
		modalInstance.result.then(function (data) {
	    	},
	    	function(reject) {
	    	}
	    );
	};
	
	$scope.doApproval = function(){
		var param = {};
		if($scope.rbChecked.value == 0 || typeof $scope.rbChecked.value == 'undefined' || $scope.rbChecked.value == null){
			var modalInstance = $PopupMessage.Warning('Chưa chọn bản ghi nào');
			
//			modalInstance.result.then(function (data) {
//				if(data == 'close'){
//					console.log("Đóng modal");
//				}
//				else{
//					console.log("Lỗi khi đóng modal");
//				}
//		    });
			return;
		}
		
		for(var i = 0; i < $scope.lstProcessInfo.length; i++){
			if($scope.lstProcessInfo[i].id == $scope.rbChecked.value){
				param["approval"] = $scope.rbApproval.value;
				param["maBC"] = $scope.lstProcessInfo[i].maDanhMucBaoCao;
				param["ky"] = $scope.lstProcessInfo[i].ky == null ? '' : $scope.lstProcessInfo[i].ky;
				param["thang"] = $scope.lstProcessInfo[i].thang;
				param["nam"] = $scope.lstProcessInfo[i].nam;
				param["nhx"] = $scope.nhx;
				if($scope.lstProcessInfo[i].trangThai == 'Sơ bộ'){
					param["trangthai"] = 'SB';
				}
				else if($scope.lstProcessInfo[i].trangThai == 'Điều chỉnh'){
					param["trangthai"] = 'DC';
				}
				else if($scope.lstProcessInfo[i].trangThai == 'Chính thức'){
					param["trangthai"] = 'CT';
				}
				param["lydoPD"] = self.lydo == null ? '' : self.lydo;
				
				break;
			}
		}
		
		$rootScope.showLoading = true;
		
		QLLDTPhoBienService.doApproval(param)
			.then(function(response){
					$rootScope.showLoading = false;
					
					var modalInstance = $PopupMessage.Success('Phê duyệt thành công');
					
					modalInstance.result.then(function (data) {
						if(data == 'close'){
							search();
							$scope.rbApproval = {value: '0'};
							self.lydo = '';
							$scope.rbChecked = {value: '0'};
						}
						else{
							console.log("error while close modal");
						}
				    });
				},
				function(errResponse){
					console.error(errResponse);
					var modalInstance = $PopupMessage.Error('Không thể phê duyệt báo cáo');
					
					modalInstance.result.then(function (data) {
						if(data == 'close'){
							console.log("close modal");
						}
						else{
							console.log("error while close modal");
						}
				    });
				
					$rootScope.showLoading = false;
				}
			);
	};
}

var ModalInstanceCtrl = function($scope, $uibModalInstance, Title, Url, UrlIE) {
	$scope.title = Title;
	console.log($scope.title);
	$scope.UrlPDF = Url + "&type=PDFATTACH";
	$scope.UrlExcel = Url + "&type=EXCEL";
	$scope.Url = Url + UrlIE;

	$scope.cancel = function() {
		$uibModalInstance.dismiss('cancel');
	};
};