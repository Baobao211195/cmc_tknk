/**
* Controller of HoanThanhPheDuyetDauRa
*/
var myApp = angular.module('myApp');

myApp.controller('hoanThanhRaXoatSanPhamThongKeDauRaController', 
				['$scope',
				'$PopupMessage',
				'$rootScope',
				'hoanThanhRaXoatSanPhamTKDauRaService',
				function($scope,
						$PopupMessage,
						$rootScope,
						hoanThanhRaXoatSanPhamTKDauRaService){
	
	$scope.listData 			= [];
	$scope.listDanhMucBaoCao 	= [];  // danh mục báo cáo.
	$scope.listCongChucQuanLy 	= [];  // công chức quản lý.
	$scope.listThongTinXuLy 	= [];  // Thông tin xử lý.
	
	$scope.typeNhapXuat = 'X';
	$scope.isCheck      = false;
	$scope.opened       = false;
	$scope.isDisplay    = false;
	$scope.isDisplayKy        = false;
	$scope.isDisplayTrangThai = false;
	
	
	$scope.baoCao = {
			"maDanhMucBaoCao" 	: "",
			"tenDanhMucBaoCao" 	: ""	
		}

	var baoCaoDto = {};

	init();
	
	$rootScope.$on('childEmit', function(event, data) {
		$scope.typeNhapXuat = data;
		reloadForm();
		getListThongTinXuLy(data);
    });

	$scope.insertThongTin = function(){
		if($scope.baoCao.maDanhMucBaoCao === "" || $scope.baoCao.maDanhMucBaoCao === undefined){
			$PopupMessage.Error("Hãy chọn tên biểu");
			return ;
		}
		
		if(!$scope.isDisplayTrangThai && ($scope.trangThai === "" || $scope.trangThai === undefined)){
			$PopupMessage.Error("Hãy chọn trạng thái");
			return ;
		}
		
		if($scope.tenCongChucQuanLy === "" || $scope.tenCongChucQuanLy === undefined){
			$PopupMessage.Error("Hãy chọn tên công chức quản lý");
			return ;
		}
		
		if(!$scope.isDisplayKy && ($scope.ky === "" || $scope.ky === undefined)){
			$PopupMessage.Error("Hãy chọn kỳ.");
			return ;
		}
		
		if($scope.thang === "" || $scope.thang === undefined){
			$PopupMessage.Error("Hãy chọn thángg.");
			return ;
		}
		
		if(validateYear($scope.year)){
			return;
		}
		
		InsertThongTinRaXoat();		
	}
	
	function validateYear(year){
		if(year === ""){
			$PopupMessage.Error("Hãy chọn năm");
			return true;
		}
		
		if(year === undefined){
			$PopupMessage.Error("Năm không hợp lệ");
			return true;
		}
		
		if(year.getFullYear() > new Date().getFullYear()){
			$PopupMessage.Error("Năm được chọn lớn hơn năm hiện tại.");
			return true;
		}
		
		return false;
	}
	
	
	$scope.selectDanhMucBaoCao = function (maBc){
		checkMaBacaoTheoKy($scope.typeNhapXuat, maBc);
		
	}

	$scope.popup3 = {
		opened: false
    };

	$scope.open3 = function() {
    	console.log("Open date picker");
        $scope.popup3.opened = true;
    };
    
    $scope.yearOptions = {            	    
	    formatYear: 'yyyy',   
	    startingDay: 1,
	    minMode: 'year'
    };      
    
    $scope.dateOptions = {	    
		format: 'dd/MM/yyyy',
	    startingDay: 1,
	    'show-weeks' : false
    };
	
	function init(){
		getListThongTinXuLy($scope.typeNhapXuat);
	}
	
	function checkMaBacaoTheoKy (typeNhapXuat, maBc){
		hoanThanhRaXoatSanPhamTKDauRaService.GetDanhMucBaoCaoByMaBC(typeNhapXuat, maBc)
			.then(
				function(deferred) {
					baoCaoDto  = angular.copy(deferred);
					console.log(baoCaoDto);
					if (baoCaoDto.ky === 0 || baoCaoDto.quy === 1){
						$scope.isDisplayKy = true;
					} else {
						$scope.isDisplayKy = false;
					}
					if (baoCaoDto.loaiBc === 0){
						$scope.isDisplayTrangThai = true;
					}else {
						$scope.isDisplayTrangThai = false;
					}
				},
				function (errResponse) {
					console.error('Error while fetching data');
				}
			);
	}
	

	function getListThongTinXuLy (typeNhapXuat) {
		hoanThanhRaXoatSanPhamTKDauRaService.GetListThongTin(typeNhapXuat)
			.then(
				function(deferred) {
					$scope.listData = deferred;
					settingDisplayData($scope.listData);
				},
				function (errResponse) {
					$scope.isDisplay = false;
					console.error('Error while fetching data');
				}
			);	
	}

	function InsertThongTinRaXoat() {
		var thongTinEntity = thietLapThongTin();
		hoanThanhRaXoatSanPhamTKDauRaService.InsertThongTinRaXoat(thongTinEntity)
			.then(
				function(deferred){
					if(deferred === 1){
						getListThongTinXuLy($scope.typeNhapXuat);
						reloadForm();
						$PopupMessage.Success("Hoàn thành rà soát tên biểu!");
						console.log("Creating data successfully!");
					} else if (deferred === 0){
						$PopupMessage.Error("Không thể hoàn thành rà soát!");
						console.error('Error while creating data!');
					} else if (deferred === 2){
						$PopupMessage.Error("Hãy chọn thay đổi dữ liệu");
					}else if (deferred === 3){
						$PopupMessage.Error("Chưa nhập lý do thay đổi");
					}
				},
				function(errResponse){
					console.error('Error while creating data!');
				}
			);

	}

	function settingDisplayData(listData) {
		$scope.listDanhMucBaoCao  = listData[0];
		$scope.listCongChucQuanLy = listData[1];
		if(listData[2].length > 0){
			$scope.isDisplay = true;
			$scope.listThongTinXuLy   = listData[2];
			displayThongTinXuLy($scope.listThongTinXuLy);
		}else {
			$scope.isDisplay = false;
		}
		
		
	}

	function thietLapThongTin(argument) {
		var thongTinEntity = {};
		thongTinEntity.maDanhMucBaoCao   = $scope.baoCao.maDanhMucBaoCao;
		thongTinEntity.ky 				 = $scope.ky;
		thongTinEntity.thang			 = $scope.thang;
		thongTinEntity.nam 				 = $scope.year.getFullYear();
		thongTinEntity.typeNhapXuat		 = $scope.typeNhapXuat;
		thongTinEntity.trangThai 		 = $scope.trangThai;
		thongTinEntity.pheDuyet 		 = thietLapPheDuyet($scope.isCheck);
		// ngày phê duyệt là sysDate;
		thongTinEntity.nguoiPheDuyet	 = "user login";
		thongTinEntity.thayDoiDuLieu	 = thietLapThayDoiDuLieu($scope.isCheck);
		thongTinEntity.tenCongChucQuanLy = thietLapCongChuc($scope.tenCongChucQuanLy);
		thongTinEntity.lyDoThayDoiDL 		 = thietLapLyDo($scope.lyDo);
		return thongTinEntity;
	}

	function reloadForm() {
		$scope.baoCao.maDanhMucBaoCao = "";
		$scope.ky = "";
		$scope.thang = "";
		$scope.year = "";
		$scope.trangThai = "";
		$scope.isCheck = false;
		$scope.lyDo = "";
		$scope.tenCongChucQuanLy = "";
	}

	function thietLapThayDoiDuLieu(isCheck) {
		return isCheck ? 1 : 0;
	}

	function thietLapLyDo(lyDo){
		return (lyDo == null) ? "" : lyDo;
	}

	function thietLapCongChuc(tenCongChucQuanLy) {
		return (tenCongChucQuanLy == null) ? "" : tenCongChucQuanLy;
	}

	function thietLapPheDuyet (isCheck) {
		return isCheck ? 3 : 2; // 2: chờ phê duyệt // 3 : dữ liệu thay đổi. 		
	}

	function displayThongTinXuLy(listThongTinXuLy) {
		var listThongTinTemp = [];
		for(var i = 0; i < listThongTinXuLy.length; i++){
			if(listThongTinXuLy[i].pheDuyet == 2){
				listThongTinXuLy[i].pheDuyet = "Chờ phê duyệt";
				continue;
			}
			if(listThongTinXuLy[i].pheDuyet == 3) {
				listThongTinXuLy[i].pheDuyet = "Dữ liệu thay đổi";
				continue;
			}
			if(listThongTinXuLy[i].pheDuyet == 1) {
				listThongTinXuLy[i].pheDuyet = "Phê duyệt.";
				continue;
			}
			if(listThongTinXuLy[i].pheDuyet == 0) {
				listThongTinXuLy[i].pheDuyet = "Không phê duyệt.";
				continue;
			}
		}
	}
	
	function checkThayDoiDuLieu(){
		return $scope.isCheck && ($scope.lyDo !== "" || $scope.lyDo !== null);
	}
	
}]);