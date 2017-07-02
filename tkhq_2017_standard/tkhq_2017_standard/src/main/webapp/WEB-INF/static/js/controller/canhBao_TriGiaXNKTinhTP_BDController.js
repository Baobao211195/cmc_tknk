/**
 * 
 */

'use strict';

angular.module('myApp').controller('CanhBao_TriGiaXNKTinhTP_BDController', CanhBao_TriGiaXNKTinhTP_BDController);
CanhBao_TriGiaXNKTinhTP_BDController.$inject = ['$rootScope','$scope', 'CanhBao_TriGiaXNKTinhTPService', '$uibModal', '$PopupMessage',
                                                'contextPath'];

function CanhBao_TriGiaXNKTinhTP_BDController($rootScope, $scope, CanhBao_TriGiaXNKTinhTPService, $uibModal, $PopupMessage, contextPath) {
	var self = this;
	self.loai_bc = '11';
	
	$scope.lstTinhTP = [];
	
	self.tinhTPSelected = null;
	self.TTSelected = null;
	
	$scope.loaiHinh = 'X';
	
	$scope.rbLoaiKy = {value: 'ky'};
	
	$scope.showData = false;
	$scope.showButton = false;
	
	function initComponent(){
		//Reset value
		self.tinhTPSelected = null;
		self.TTSelected = null;
		$scope.showData = false;
		$scope.rbLoaiKy = {value: 'ky'};
		$rootScope.$emit('PhanHoiQuyTrinhXLDL', self.loai_bc);
		
		CanhBao_TriGiaXNKTinhTPService.getLstTinhTP()
			.then(
				function (deferred) {
					$scope.lstTinhTP = deferred;
                },
                function (errResponse) {
                    console.error(errResponse);
                }
			);
	}
	
	$scope.changeTab = function(index){
		console.log("Tab selected: " + index);
		if(index == 0){
			$scope.loaiHinh = 'X';
			initComponent();
		}
		else if(index == 1){
			$scope.loaiHinh = 'N';
			initComponent();
		}
		else if(index == 2){
			$scope.loaiHinh = 'NX';
			initComponent();
		}
		else{
			console.error("No tab index found!");
		}
	};
	
	$scope.searchChart = function(){
		if(!checkInput()){
			return;
		}
		
    	var param = {};
    	param["trangthai"] = self.TTSelected == null ? '' : self.TTSelected;
    	param["nhx"] = $scope.loaiHinh;
    	param["tinh"] = self.tinhTPSelected == null ? '' : self.tinhTPSelected;
    	param["loaiKy"] = $scope.rbLoaiKy.value;
    	
    	var api = contextPath + "/bcpt/CanhBaoTGXNKTTP/doChart?trangthai=" + param["trangthai"] + "&nhx=" + param["nhx"]
    		+ "&tinh=" + param["tinh"] + "&loaiKy=" + param["loaiKy"];
    	$scope.srcBieuDo = api;
    	
    	var iframe;
		iframe = document.getElementById('frReportXNK');
		iframe.src = iframe.src;
    	
    	$scope.showData = true;
	};
	
	function checkInput(){
		if(self.TTSelected == null || typeof self.TTSelected == 'undefined' || self.TTSelected == ''){
			angular.element(document.querySelector('#messageErrorArea')).text('Trường Trạng thái là bắt buộc.');
			$scope.showError == true;
			
			return false;
		}
		
		angular.element(document.querySelector('#messageErrorArea')).text('');
		$scope.showError == false;
		return true;
	}
	
	$scope.showFeedback = function(){
//		var modalInstance = $uibModal.open({
//			animation: true,
//			ariaLabelledBy: 'modal-title',
//			ariaDescribedBy: 'modal-body',
//			size: 'lg',
//			templateUrl: '',
//			controller: 'feedbackQTXLDLModalCtrl',
//			controllerAs: 'self',
//			resolve: {
//			}
//		});
//		
//		modalInstance.result.then(function (data) {
//				
//		    }, function () {
//		    	
//		    });
	};
}

angular.module('myApp').controller('feedbackQTXLDLModalCtrl', feedbackQTXLDLModalCtrl);
feedbackQTXLDLModalCtrl.$inject = ['$scope', '$uibModalInstance', 'CanhBao_TriGiaXNKTinhTPService', '$PopupMessage']
function feedbackQTXLDLModalCtrl($scope, $uibModalInstance, CanhBao_TriGiaXNKTinhTPService, $PopupMessage) {
	var self = this;
	self.content = '';
	self.manager = null;
	self.lstManager = [];
	self.lstFeedbackInfo = [];

	self.cancel = function () {
	    $uibModalInstance.dismiss('cancel');
	};
	
	self.doFeedbackInfo = function(){
		var param = {};
		param["content"] = self.content;
		param["manager"] = self.manager;
		
		CanhBao_TriGiaXNKTinhTPService.doFeedbackInfo(param)
			.then(function(response){
				console.log("Respone received: " +  response);
			},
			function(errResponse){
				console.error(errResponse);
			}
		);
	};
}