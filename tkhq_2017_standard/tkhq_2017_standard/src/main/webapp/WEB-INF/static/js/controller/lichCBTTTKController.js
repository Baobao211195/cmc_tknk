/**
 * 
 */

'use strict';

angular.module('myApp').controller('LichCBTTTKController', LichCBTTTKController);
LichCBTTTKController.$inject = ['$rootScope', '$scope', '$filter', 'LichCBTTTKService', '$uibModal', '$PopupMessage'];

function LichCBTTTKController($rootScope, $scope, $filter, LichCBTTTKService, $uibModal, $PopupMessage) {
	var self = this;
	
	$scope.lstLoaiBC = [];
	$scope.lstLoaiKyBC = [
      {id: "KY", name: "Kỳ"},
      {id: "THANG", name: "Tháng"},
      {id: "QUY", name: "Quý"},
      {id: "NAM", name: "Năm"}];
	$scope.lstQuy = [
      {id: "1", name: "1"},
      {id: "2", name: "2"},
      {id: "3", name: "3"},
      {id: "4", name: "4"}];
	$scope.lstNSD = [];
	$scope.lstScheduleInfo = [];
	$scope.lstThang = [];
	$scope.loaiLichCB = 'CT';
	
	self.namCB = '';
	self.coquanCB = '';
	self.hinhthucCB = '';
	self.formatFile = '';
	self.niengiamTK = '';
	self.loaiBCCB = '';
	self.lichCBTTId = 0;
	self.slSobo = '';
	self.sl6TDN = '';
	self.slChinhthuc = '';
	
	self.loaiBCSelected = null;
	self.loaiKyBCSelected = 'KY';
	self.NSDSelected = null;
	
	$scope.showDataTable = false;
	$scope.errorNamCB = false;
	
	//Date picker
	$scope.popup1 = {
		opened: false
	};
    $scope.popup2 = {
		opened: false
    };
    $scope.popup3 = {
		opened: false
	};
    
    $scope.open1 = function() {
        $scope.popup1.opened = true;
    };
    
    $scope.open2 = function() {
        $scope.popup2.opened = true;
    };
    
    $scope.open3 = function() {
        $scope.popup3.opened = true;
    };
    
    $scope.DayOptions = {
    	datepickerMode: 'day',
	    formatYear: 'yy',
	    startingDay: 1,
	    'show-weeks' : false
    };
	
	function initComponent(){
		//Reset value
		resetAll();
		
		LichCBTTTKService.getLstNSD()
		.then(
			function (deferred) {
				$scope.lstNSD = deferred;
            },
            function (errResponse) {
                console.error(errResponse);
            }
		);
	}
	
	function resetAll(){
		$scope.lstScheduleInfo = [];
		$scope.showDataTable = false;
		$scope.errorNamCB = false;
		var currentDate = new Date();
		self.namCB = currentDate.getFullYear();
		
		self.coquanCB = '';
		self.hinhthucCB = '';
		self.formatFile = '';
		self.niengiamTK = '';
		self.loaiBCCB = '';
		self.lichCBTTId = 0;
		self.slSobo = '';
		self.sl6TDN = '';
		self.slChinhthuc = '';
		
		self.loaiBCSelected = null;
		self.loaiKyBCSelected = 'KY';
		self.NSDSelected = null;
	}
	
	$scope.changeTab = function(index){
		console.log("Tab selected: " + index);
		if(index == 0){
			$scope.loaiLichCB = 'CT';
			initComponent();
			$scope.showTabCT = true;
			$scope.showTabNB = false;
			
			$scope.lstThang = [];
			for(var i = 1; i <= 12; i++){
				$scope.lstThang.push(
					{ id: i, name: i}
				);
			}
			$scope.changeLoaiKy();
			$scope.search();
		}
		else if(index == 1){
			$scope.loaiLichCB = 'NB';
			initComponent();
			$scope.showTabCT = false;
			$scope.showTabNB = true;
			$scope.search();
		}
		else{
			console.error("No tab index found!");
		}
	};
	
	$scope.changeLoaiKy = function(){
		if(self.loaiKyBCSelected == 'KY'){
			$scope.showKy = true;
			$scope.showThang = true;
			$scope.showQuy = false;
			$scope.showNam = false;
		}
		else if(self.loaiKyBCSelected == 'THANG'){
			$scope.showKy = false;
			$scope.showThang = true;
			$scope.showQuy = false;
			$scope.showNam = false;
		}
		else if(self.loaiKyBCSelected == 'QUY'){
			$scope.showKy = false;
			$scope.showThang = false;
			$scope.showQuy = true;
			$scope.showNam = false;
		}
		else if(self.loaiKyBCSelected == 'NAM'){
			$scope.showKy = false;
			$scope.showThang = false;
			$scope.showQuy = false;
			$scope.showNam = true;
		}
		
		LichCBTTTKService.getLstLoaiBC(self.loaiKyBCSelected)
		.then(
			function (deferred) {
				$scope.lstLoaiBC = deferred;
            },
            function (errResponse) {
                console.error(errResponse);
            }
		);
	};
	
	$scope.search = function(){
    	var param = {};
    	param["namCB"] = self.namCB;
    	param["loaiLichCB"] = $scope.loaiLichCB;
    	$scope.errorNamCB = false;
    	
    	if(!/^\d{4}/.test(self.namCB)){
    		$scope.errorNamCB = true;
    		return;
    	}
    	
    	$rootScope.showLoading = true;
    	
    	LichCBTTTKService.getScheduleInfo(param)
    		.then(function(response){
    				$scope.lstScheduleInfo = response;
    				$scope.showDataTable = true;
    				$rootScope.showLoading = false;
    			},
    			function(errResponse){
    				console.error(errResponse);
    				if(errResponse == 404){
    					$scope.lstScheduleInfo = [];
    				}
    				$scope.showDataTable = true;
    				$rootScope.showLoading = false;
    			}
    		);
	};
	
	$scope.editRow = function(id){
		var isGettedData = false;
		for(var i = 0; i < $scope.lstScheduleInfo.length; i++){
			var dataMonth = $scope.lstScheduleInfo[i].dataMonth;
			for(var j = 0; j < dataMonth.length; j++){
				if(dataMonth[j].lichCBTTId == id){
					self.namCB = dataMonth[j].namCB;
					self.coquanCB = dataMonth[j].coquanCB;
					self.hinhthucCB = dataMonth[j].hinhthucCB;
					self.formatFile = dataMonth[j].formatFileDL;
					self.niengiamTK = dataMonth[j].niengiamTK;
					self.loaiBCCB = dataMonth[j].loaiBCCB;
					self.loaiBCSelected = dataMonth[j].maLoaiBC;
					self.slSobo = dataMonth[j].solieuSB;
					self.sl6TDN = dataMonth[j].solieu6TDN;
					self.slChinhthuc = dataMonth[j].solieuCT;
					self.NSDSelected = dataMonth[j].userId;
					self.lichCBTTId = id;
					
					isGettedData = true;
					break;
				}
			}
			
			if(isGettedData){
				break;
			}
		}
	}
	
	$scope.doInsUpd = function(){
		var param = {};
		var isValidated = false;
		
		if(self.lichCBTTId == 0){
			isValidated = checkInput();
			if(!isValidated){
				return;
			}
			param = setParam();
			
			LichCBTTTKService.create(param)
				.then(function(response){
					var modalInstance = $PopupMessage.Success('Thêm mới thành công');
					
					modalInstance.result.then(function (data) {
						if(data == 'close'){
							resetAll();
							$scope.search();
						}
						else{
							console.log("Lỗi khi đóng modal");
						}
				    });
				},
				function(errResponse){
					console.error(errResponse);
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
		else{
			isValidated = checkInput();
			if(!isValidated){
				return;
			}
			param = setParam();
			param["lichCBTTId"] = self.lichCBTTId;
			
			LichCBTTTKService.update(param)
				.then(function(response){
					var modalInstance = $PopupMessage.Success('Cập nhật thành công');
					
					modalInstance.result.then(function (data) {
						if(data == 'close'){
							resetAll();
							$scope.search();
						}
						else{
							console.log("Lỗi khi đóng modal");
						}
				    });
				},
				function(errResponse){
					console.error(errResponse);
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
	
	function checkInput(){
		if($scope.loaiLichCB == 'CT'){
			if(self.loaiKyBCSelected == 'KY'){
				if(typeof self.kySelected == 'undefined' || self.kySelected == null){
					var modalInstance = $PopupMessage.Error('Chưa chọn kỳ báo cáo.');
					return false;
				}
				if(typeof self.thangSelected == 'undefined' || self.thangSelected == null){
					var modalInstance = $PopupMessage.Error('Chưa chọn tháng báo cáo.');
					return false;
				}
			}
			else if(self.loaiKyBCSelected == 'THANG'){
				if(typeof self.thangSelected == 'undefined' || self.thangSelected == null){
					var modalInstance = $PopupMessage.Error('Chưa chọn tháng báo cáo.');
					return false;
				}
			}
			else if(self.loaiKyBCSelected == 'QUY'){
				if(typeof self.quySelected == 'undefined' || self.quySelected == null){
					var modalInstance = $PopupMessage.Error('Chưa chọn quý báo cáo.');
					return false;
				}
			}
		}
		if(self.loaiBCSelected == null){
			var modalInstance = $PopupMessage.Error('Chưa chọn loại báo cáo');
			return false;
		}
		
		if(typeof self.slSobo == 'undefined' || typeof self.sl6TDN == 'undefined' || typeof self.slChinhthuc == 'undefined'){
			var modalInstance = $PopupMessage.Error('Sai định dạng ngày.');
			return false;
		}
		
		if(self.slSobo == null || self.slSobo == ''){
			var modalInstance = $PopupMessage.Error('Chưa nhập số liệu sơ bộ');
			return false;
		}
		if(self.sl6TDN == null || self.sl6TDN == ''){
			var modalInstance = $PopupMessage.Error('Chưa nhập số liệu điều chỉnh 6 tháng đầu năm');
			return false;
		}
		if(self.slChinhthuc == null || self.slChinhthuc == ''){
			var modalInstance = $PopupMessage.Error('Chưa nhập số liệu chính thức');
			return false;
		}
		
		var slSobo = new Date(self.slSobo);
		var sl6TDN = new Date(self.sl6TDN);
		var slChinhthuc = new Date(self.slChinhthuc);
		
		if(slSobo > sl6TDN){
			var modalInstance = $PopupMessage.Error('Số liệu sơ bộ phải nhỏ hơn số liệu điều chỉnh');
			return false;
		}
		
		if(sl6TDN > slChinhthuc){
			var modalInstance = $PopupMessage.Error('Số liệu điều chỉnh phải nhỏ hơn số liệu chính thức');
			return false;
		}
		
		if(self.NSDSelected == null){
			var modalInstance = $PopupMessage.Error('Chưa chọn người phụ trách');
			return false;
		}
		
		return true;
	}
	
	function setParam(){
		var param = {};
		
		param["loaiLichCB"] = $scope.loaiLichCB;
		param["namCB"] = self.namCB;
		param["coquanCB"] = self.coquanCB == null ? '' : self.coquanCB;
		param["hinhthucCB"] = self.hinhthucCB == null ? '' : self.hinhthucCB;
		param["formatFile"] = self.formatFile == null ? '' : self.formatFile;
		param["niengiamTK"] = self.niengiamTK == null ? '' : self.niengiamTK;
		param["loaiBCCB"] = self.loaiBCCB == null ? '' : self.loaiBCCB;
		if($scope.loaiLichCB == 'CT'){
			param["loaiKyBC"] = self.loaiKyBCSelected == null ? '' : self.loaiKyBCSelected;
			if(self.loaiKyBCSelected == 'KY'){
				param["ky"] = self.kySelected == null ? '' : self.kySelected;
				param["thang"] = self.thangSelected == null ? '' : self.thangSelected;
				param["quy"] = 0;
			}
			else if(self.loaiKyBCSelected == 'THANG'){
				param["ky"] = 0;
				param["thang"] = self.thangSelected == null ? '' : self.thangSelected;
				param["quy"] = 0;
			}
			else if(self.loaiKyBCSelected == 'QUY'){
				param["ky"] = 0;
				param["thang"] = 0;
				param["quy"] = self.quySelected == null ? '' : self.quySelected;
			}
			else if(self.loaiKyBCSelected == 'NAM'){
				param["ky"] = 0;
				param["thang"] = 0;
				param["quy"] = 0;
			}
		}
		else{
			param["loaiBCNB"] = self.loaiBCNB == null ? '' : self.loaiBCNB;
		}
		param["maLoaiBC"] = self.loaiBCSelected;
		param["solieuSB"] = $filter('date')(self.slSobo, "dd/MM/yyyy");
		param["solieu6TDN"] = $filter('date')(self.sl6TDN, "dd/MM/yyyy");
		param["solieuCT"] = $filter('date')(self.slChinhthuc, "dd/MM/yyyy");
		param["userId"] = self.NSDSelected;
		
		return param;
	}
	
	$scope.doExport = function() {
		var param = {};
		param["namCB"] = self.namCB;
    	param["loaiLichCB"] = $scope.loaiLichCB;
    	$scope.errorNamCB = false;
    	
    	if(!/^\d{4}/.test(self.namCB)){
    		$scope.errorNamCB = true;
    		return;
    	}

		LichCBTTTKService.doExport(param);
	};
	
	$scope.doPrint = function(){
		$scope.doExport();
	};
}