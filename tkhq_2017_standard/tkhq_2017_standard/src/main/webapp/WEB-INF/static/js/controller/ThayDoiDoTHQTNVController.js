App.controller('ThayDoiDoTHQTNVController', ThayDoiDoTHQTNVController);
ThayDoiDoTHQTNVController.$inject = [ '$scope', 'ThayDoiDoTHQTNVService',
		'pagerService', '$uibModal', '$PopupMessage', '$timeout', '$rootScope', 'contextPath', '$filter'];

function ThayDoiDoTHQTNVController($scope, ThayDoiDoTHQTNVService,
		pagerService, $uibModal, $PopupMessage, $timeout, $rootScope, contextPath, $filter) {
	console.log('start ThayDoiDoTHQTNVController');
	var self = this;
	
	self.lstCuaKhauNN = [];
	self.lstCucHQ = [];
	self.lstChiCucHQ = [];
	self.lstNghiepVu = [];
	self.lstResult = [];

	self.nhx = 'X';
	self.loaiBang = '';
	self.lstLoaiKy = [ {
		MaLoaiKy : 'NG',
		TenLoaiKy : 'Từ ngày… Đến ngày'
	}, {
		MaLoaiKy : 'KY',
		TenLoaiKy : 'Kỳ'
	}, {
		MaLoaiKy : 'TH',
		TenLoaiKy : 'Tháng'
	} ];
	self.lstKy = [ 1, 2 ];
	self.lstThang = [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ];
	self.lstNam = [];

	self.TaiDuLieu = TaiDuLieu;
	self.KetXuat = KetXuat;
	self.animationsEnabled = true;
	self.CucHQSelect = CucHQSelect;
	self.cmbLoaiKySelect = cmbLoaiKySelect;
	self.In = In;
	self.tabSelected1 = tabSelected1;
	self.tabSelected2 = tabSelected2;
	
//	self.txtTuNgay = '';
//	self.txtDenNgay = '';
	
	$scope.showDataTable = false;
	
	//Date picker
	$scope.popup1 = {
		opened: false
	};
    $scope.popup2 = {
		opened: false
    };
    $scope.open1 = function() {
        $scope.popup1.opened = true;
    };
    
    $scope.open2 = function() {
        $scope.popup2.opened = true;
    };
    
    $scope.DayOptions = {
    	datepickerMode: 'day',
	    formatYear: 'yy',
	    startingDay: 1,
	    'show-weeks' : false
    };

	GetCucHQ();
	$timeout(function Init() {
		clearlstData();
		$scope.cmbLoaiKy = self.lstLoaiKy[0];
		initNam();
		self.hideKy = true;
		self.hideThang = true;
		self.hideNam = true;
		self.hideCol = true;
		self.txtTuNgay = new Date();
		self.txtDenNgay = new Date();
		self.loaiBang = 'tbTongThe';
		$scope.cmbKy = self.lstKy[0];
		$scope.cmbThang = self.lstThang[0];
		$scope.cmbNam = self.lstNam[0];
	}, 200);

	function clearlstData() {
		self.lstResult = null;
	}
	function initNam(){
		for(var i = (new Date()).getFullYear(); i >= 2012; i-- ){
			self.lstNam.push(i);
		}
	}
	function CucHQSelect(Item) {
		if(Item.ma != '00'){
		ThayDoiDoTHQTNVService.GetChiCucHQByCuc(Item.ma).then(
				function(deferred) {
					self.lstChiCucHQ = deferred;
					self.lstChiCucHQ = [{"ma": "","ten": "---chọn---"}].concat(self.lstChiCucHQ);
					$scope.ChiCucHQ = self.lstChiCucHQ[0];
				}, function(errResponse) {
					console.error('Error while fetching data');
				});
		} else{
			self.lstChiCucHQ = [{"ma": "","ten": "---chọn---"}];
    		$scope.ChiCucHQ = self.lstChiCucHQ[0];
		}
	}
	function GetCucHQ() {
		ThayDoiDoTHQTNVService.GetCucHQ().then(function(deferred) {
			self.lstCucHQ = deferred;
			$scope.CucHQ = self.lstCucHQ[0];
			self.CucHQSelect($scope.CucHQ);
		}, function(errResponse) {
			console.error('Error while fetching data');
		});
//		$timeout(function() {
//			ThayDoiDoTHQTNVService.GetChiCucHQByCuc($scope.CucHQ.ma).then(
//					function(deferred) {
//						self.lstChiCucHQ = deferred;
//						$scope.ChiCucHQ = self.lstChiCucHQ[0];
//					}, function(errResponse) {
//						console.error('Error while fetching data');
//					})
//		}, 200);
	}
	function cmbLoaiKySelect(maLoaiKy) {

		self.hideKy = false;
		self.hideThang = false;
		self.hideNam = false;
		self.hideNgay = false;
		self.hideCol = true;
		if (maLoaiKy == 'NG') // Từ ngày… Đến ngày
		{
			self.hideKy = true;
			self.hideThang = true;
			self.hideNam = true;
		} else if (maLoaiKy == 'KY') // Kỳ
		{
			self.hideNgay = true;
		} else// Tháng
		{
			self.hideNgay = true;
			self.hideKy = true;
			self.hideCol = false;
		}
	}
	function tabSelected1() {
		self.nhx = "X";
		clearlstData();
		console.log(self.nhx);
	}
	function tabSelected2() {
		self.nhx = "N";
		clearlstData();
		console.log(self.nhx);
	}

	function TaiDuLieu() {
		clearlstData();
		var tuNgay, denNgay, ky, thang, nam;
		if($scope.cmbLoaiKy.MaLoaiKy == 'NG'){
			tuNgay = $filter('date')(self.txtTuNgay, "dd/MM/yyyy");
			denNgay = $filter('date')(self.txtDenNgay, "dd/MM/yyyy");
			ky = '';
			thang = '';
			nam = '';
		}
		else if($scope.cmbLoaiKy.MaLoaiKy == 'KY'){
			tuNgay = '';
			denNgay = '';
			ky = $scope.cmbKy;
			thang = $scope.cmbThang;
			nam = $scope.cmbNam;
		}
		else if($scope.cmbLoaiKy.MaLoaiKy == 'TH'){
			tuNgay = '';
			denNgay = '';
			ky = '';
			thang = $scope.cmbThang;
			nam = $scope.cmbNam;
		}
		
		var maChiCucHQ;
		if(typeof $scope.ChiCucHQ == 'undefined' || $scope.ChiCucHQ == null){
			maChiCucHQ = '';
		}
		else{
			maChiCucHQ = $scope.ChiCucHQ.ma;
		}
		
		$rootScope.showLoading = true;
		
		ThayDoiDoTHQTNVService.TaiDuLieu($scope.CucHQ.ma, maChiCucHQ,
			self.nhx, $scope.cmbLoaiKy.MaLoaiKy, tuNgay,
			denNgay, ky, thang,nam).then(
				function(deferred) {
					self.lstResult = deferred;
					$scope.showDataTable = true;
					$rootScope.showLoading = false;
				}, function(errResponse) {
					console.error('Error while fetching data');
					self.lstResult = [];
					$scope.showDataTable = true;
					$rootScope.showLoading = false;
				});
	}
	
	function KetXuat() {
		var param = {};
    	param["maCucHQ"] = $scope.CucHQ.ma;
    	param["maChiCucHQ"] = $scope.ChiCucHQ.ma;
    	param["nhx"] = self.nhx;
    	param["loai_ky"] = $scope.cmbLoaiKy.MaLoaiKy;
    	if($scope.cmbLoaiKy.MaLoaiKy == 'NG'){
			param["tu_ngay"] = $filter('date')(self.txtTuNgay, "dd/MM/yyyy");
			param["den_ngay"] = $filter('date')(self.txtDenNgay, "dd/MM/yyyy");
			param["ky"] = '';
			param["thang"] = '';
			param["nam"] = '';
		}
		else if($scope.cmbLoaiKy.MaLoaiKy == 'KY'){
			param["tu_ngay"] = '';
			param["den_ngay"] = '';
			param["ky"] = $scope.cmbKy;
			param["thang"] = $scope.cmbThang;
			param["nam"] = $scope.cmbNam;
		}
		else if($scope.cmbLoaiKy.MaLoaiKy == 'TH'){
			param["tu_ngay"] = '';
			param["den_ngay"] = '';
			param["ky"] = '';
			param["thang"] = $scope.cmbThang;
			param["nam"] = $scope.cmbNam;
		}
		
    	ThayDoiDoTHQTNVService.doExport(param);
	}
	
	function In() {
	}
};
