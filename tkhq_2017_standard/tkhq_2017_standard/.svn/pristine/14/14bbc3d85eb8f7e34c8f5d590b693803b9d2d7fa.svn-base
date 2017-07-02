angular.module('myApp').controller('ThayDoiDoNVHQController',
		ThayDoiDoNVHQController);
ThayDoiDoNVHQController.$inject = [ '$scope','contextPath', 'ThayDoiDoNVHQService',
		'pagerService', '$uibModal', '$PopupMessage', '$timeout', '$rootScope' ];

function ThayDoiDoNVHQController($scope,contextPath, ThayDoiDoNVHQService, pagerService,
		$uibModal, $PopupMessage, $timeout, $rootScope) {
	console.log('start ThayDoiDoNVHQController');
	var self = this;
	

	self.animationsEnabled = true;

	self.lstCuaKhauNN = [];
	self.lstCucHQ = [];
	self.lstChiCucHQ = [];
	self.lstNghiepVu = [];
	self.lstKxTongThe = [];
	self.lstKxBoSungTK = [];
	self.lstKxHuyXoa = [];
	self.showReport = false;
	self.srcReport = "";
	self.ROOT_API = contextPath;
	$scope.showReport1 = false;
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

	self.lstMapNghiepVuTenBang = [ {
		MaNV : '00',
		TenBang : 'tbTongThe'
	}, {
		MaNV : '01',
		TenBang : 'tbBSToKhai'
	},// bổ sung tờ khai
	{
		MaNV : '02',
		TenBang : 'tbViewHuyXoa'
	},// Tờ khai hủy, xóa
	{
		MaNV : '02H01',
		TenBang : 'tbViewHuyXoa'
	},// -- Hết hiệu lực của tờ khai
	{
		MaNV : '02H02',
		TenBang : 'tbViewHuyXoa'
	},// -- Quá 15 ngày kể từ ngày đăng ký không có hàng đến cửa khẩu nhập
	{
		MaNV : '02H03',
		TenBang : 'tbViewHuyXoa'
	},// -- Quá 15 ngày kể từ ngày đăng ký hàng xuất khẩu chưa chịu sử giám
	// sát của Cơ quan Hải quan
	{
		MaNV : '02H04',
		TenBang : 'tbViewHuyXoa'
	},// -- Khai nhiều lần cho một lô hàng
	{
		MaNV : '02H05',
		TenBang : 'tbViewHuyXoa'
	},// -- Mã dự phòng
	{
		MaNV : '02H06',
		TenBang : 'tbViewHuyXoa'
	},// -- Hủy do Quá thời hạn 15 ngày kể từ ngày đăng ký tờ khai, hàng hóa
	// được miễn kiểm tra thực tế nhưng không có hàng nhập khẩu đến cửa khẩu
	// nhập hoặc hàng nhập khẩu chưa đưa vào khu vực giám sát hải quan tại
	// cửa khẩu
	{
		MaNV : '02H07',
		TenBang : 'tbViewHuyXoa'
	},// -- Hủy do Quá thời hạn 15 ngày kể từ ngày đăng ký tờ khai mà người
	// khai hải quan không xuất trình hồ sơ hải quan trong trường hợp phải
	// xuất trình hồ sơ hải quan để cơ quan hải quan kiểm tra
	{
		MaNV : '02H08',
		TenBang : 'tbViewHuyXoa'
	},// -- Hủy do Quá thời hạn 15 ngày kể từ ngày đăng ký tờ khai mà người
	// khai hải quan chưa xuất trình hàng hóa xuất khẩu, nhập khẩu phải kiểm
	// tra thực tế để cơ quan hải quan kiểm tra
	{
		MaNV : '02H09',
		TenBang : 'tbViewHuyXoa'
	},// -- Hủy do Tờ khai hải quan đã được đăng ký nhưng chưa được thông quan
	// do Hệ thống xử lý dữ liệu điện tử hải quan có sự cố
	{
		MaNV : '02H10',
		TenBang : 'tbViewHuyXoa'
	},// -- Hủy do Khai nhiều tờ khai cho cùng một lô hàng xuất khẩu, nhập
	// khẩu (khai trùng thông tin tờ khai
	{
		MaNV : '02H11',
		TenBang : 'tbViewHuyXoa'
	},// -- Hủy do Tờ khai hàng hóa xuất khẩu đã có hàng hóa đưa vào khu vực
	// giám sát hải quan nhưng thực tế không xuất khẩu
	{
		MaNV : '02H12',
		TenBang : 'tbViewHuyXoa'
	},// -- Hủy do Tờ khai hàng hóa nhập khẩu đã được đăng ký nhưng thực tế
	// hàng hóa không nhập khẩu hoặc hàng hóa chưa đưa qua khu vực giám sát
	{
		MaNV : '02H13',
		TenBang : 'tbViewHuyXoa'
	},// -- Hủy do Khai sai các chỉ tiêu thông tin không được khai bổ sung quy
	// định tại thời điểm 3, phụ lục II TT138 (Tr451)
	{
		MaNV : '03',
		TenBang : 'tbViewSDBS'
	},// Tờ khai sửa đổi, bổ sung sau thông quan có thay đổi về thuế
	{
		MaNV : '04',
		TenBang : 'tbViewSDBS'
	},// Tờ khai sửa đổi, bổ sung sau thông quan không có thay đổi về thuế
	{
		MaNV : '05',
		TenBang : 'tbViewSDBS'
	},// Tờ khai sửa đổi, bổ sung sau thông quan có thay đổi về trị giá hải
	// quan
	{
		MaNV : '06',
		TenBang : 'tbViewSDBS'
	},// Tờ khai sửa đổi, bổ sung do kiểm tra sau thông quan
	{
		MaNV : '07',
		TenBang : 'tbViewSDBS'
	} // Tờ khai sửa đổi bổ sung do phân tích, phân loại
	];
	self.lstKy = [ 1, 2 ];
	self.lstThang = [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ];
	self.lstNam = [];

	GetCucHQ();
	GetlstNghiepVuHQ();
	$timeout(function Init() {
		clearlstData();
		self.hideTableTongThe = false;
		self.hideTableBSToKhai = true;
		self.hideTableHuyXoa = true;
		self.hideTableSDBS = true;
		initNam();
		$scope.cmbLoaiKy = self.lstLoaiKy[0];
		self.hideKy = true;
		self.hideThang = true;
		self.hideNam = true;
		$scope.txtTuNgay = new Date();
		$scope.txtDenNgay = new Date();
		self.loaiBang = 'tbTongThe';
		$scope.cmbKy = self.lstKy[0];
		$scope.cmbThang = self.lstThang[0];
		$scope.cmbNam = self.lstNam[0];
	}, 200);

	$scope.popup1 = {
			opened : false
		};

		$scope.open1 = function() {
			$scope.popup1.opened = true;
		};
		$scope.popup2 = {
				opened : false
			};

			$scope.open2 = function() {
				$scope.popup2.opened = true;
			};
		$scope.dateOptions = {
				format : 'dd/MM/yyyy',
				'show-weeks' : false
			};
	function initNam() {
		var year = (new Date()).getFullYear();
		for (var i = year; i >= (year -1); i--) {
			self.lstNam.push(i);
		}
	}

	self.NghiepVuSelect = function(maNV) {
		clearlstData();
		disableAllTableView();
		for (var i = 0; i < self.lstMapNghiepVuTenBang.length; i++) {
			if (self.lstMapNghiepVuTenBang[i].MaNV == maNV) {
				self.loaiBang = self.lstMapNghiepVuTenBang[i].TenBang;
				break;
			}

		}
		switch (self.loaiBang) {
		case 'tbTongThe':
			self.hideTableTongThe = false;
			break;
		case 'tbViewHuyXoa':
			self.hideTableHuyXoa = false;
			break;
		case 'tbViewSDBS':
			self.hideTableSDBS = false;
			break;
		case 'tbBSToKhai':
			self.hideTableBSToKhai = false;
			break;

		}

	}
	function disableAllTableView() {
		self.hideTableTongThe = true;
		self.hideTableBSToKhai = true;
		self.hideTableHuyXoa = true;
		self.hideTableSDBS = true;

	}
	function clearlstData() {
		self.lstKxTongThe = null;
		self.lstKxBoSungTK = null;
		self.lstKxHuyXoa = null;
		self.lstSuaDoiBoSung = null;
	}
	self.CucHQSelect = function(Item) {
		$rootScope.showLoading = true;
		ThayDoiDoNVHQService.GetChiCucHQByCuc(Item.ma).then(function(deferred) {
			self.lstChiCucHQ = deferred;
			self.lstChiCucHQ = [{"ma": "","ten": "---chọn---"}].concat(self.lstChiCucHQ);
			$scope.ChiCucHQ = self.lstChiCucHQ[0];
			$rootScope.showLoading = false;
		}, function(errResponse) {
			console.error('Error while fetching data');
			$rootScope.showLoading = false;
		});
	}
	function GetCucHQ() {
		$rootScope.showLoading = true;
		ThayDoiDoNVHQService.GetCucHQ().then(function(deferred) {
			self.lstCucHQ = deferred;
			$scope.CucHQ = self.lstCucHQ[0];
			self.CucHQSelect($scope.CucHQ);
			$rootScope.showLoading = false;
		}, function(errResponse) {
			console.error('Error while fetching data');
			$rootScope.showLoading = false;
		});
//		$timeout(function() {
//			ThayDoiDoNVHQService.GetChiCucHQByCuc($scope.CucHQ.ma).then(
//					function(deferred) {
//						self.lstChiCucHQ = deferred;
//						$scope.ChiCucHQ = self.lstChiCucHQ[0];
//					}, function(errResponse) {
//						console.error('Error while fetching data');
//					})
//		}, 200);
	}
	function GetlstNghiepVuHQ() {
		$rootScope.showLoading = true;
		ThayDoiDoNVHQService.GetlstNghiepVuHQ().then(function(deferred) {
			self.lstNghiepVu = deferred;
			$scope.NghiepVu = self.lstNghiepVu[0];
			$rootScope.showLoading = false;
		}, function(errResponse) {
			console.error('Error while fetching data');
			$rootScope.showLoading = false;
		});
	}
	self.cmbLoaiKySelect = function (maLoaiKy) {

		self.hideKy = false;
		self.hideThang = false;
		self.hideNam = false;
		self.hideTuNgay = false;
		self.hideDenNgay = false;
		if (maLoaiKy == 'NG') // Từ ngày… Đến ngày
		{
			self.hideKy = true;
			self.hideThang = true;
			self.hideNam = true;
		} else if (maLoaiKy == 'KY') // Kỳ
		{
			self.hideTuNgay = true;
			self.hideDenNgay = true;
		} else// Tháng
		{
			self.hideTuNgay = true;
			self.hideDenNgay = true;
			self.hideKy = true;
		}
	}

	self.TaiDuLieu = function() {
		clearlstData();
		$rootScope.showLoading = true;
		var maCucHQ = "";
		var maChicucHQ = "";
		var nhx = "";
		var loai_ky = "";
		var tu_ngay = "";
		var den_ngay = "";
		var ky = "";
		var thang = "";
		var nam = "";
		if ($scope.CucHQ != undefined && $scope.CucHQ != null)
			if ($scope.CucHQ.ma != undefined && $scope.CucHQ.ma != null)
				maCucHQ = $scope.CucHQ.ma;
		if ($scope.ChiCucHQ != undefined && $scope.ChiCucHQ != null)
			if ($scope.ChiCucHQ.ma != undefined && $scope.ChiCucHQ.ma != null)
				maChicucHQ = $scope.ChiCucHQ.ma;
		if (self.nhx != undefined && self.nhx != null)
			nhx = self.nhx;
		if ($scope.cmbLoaiKy != undefined && $scope.cmbLoaiKy != null)
			if ($scope.cmbLoaiKy.MaLoaiKy != undefined
					&& $scope.cmbLoaiKy.MaLoaiKy != null)
				loai_ky = $scope.cmbLoaiKy.MaLoaiKy;
		if ($scope.txtTuNgay != undefined && $scope.txtTuNgay != null)
			tu_ngay = getDateString($scope.txtTuNgay);
		if ($scope.txtDenNgay != undefined && $scope.txtDenNgay != null)
			den_ngay = getDateString($scope.txtDenNgay);
		if ($scope.cmbKy != undefined && $scope.cmbKy != null)
			ky = $scope.cmbKy;
		if ($scope.cmbThang != undefined && $scope.cmbThang != null)
			thang = $scope.cmbThang;
		if ($scope.cmbNam != undefined && $scope.cmbNam != null)
			nam = $scope.cmbNam;

		if (self.loaiBang == 'tbTongThe') {// tổng thể

			ThayDoiDoNVHQService.GetDLTongThe(maCucHQ, maChicucHQ, nhx,
					loai_ky, tu_ngay, den_ngay, ky, thang, nam).then(
					function(deferred) {
						self.lstKxTongThe = deferred;
						$rootScope.showLoading = false;
						$scope.showReport1 = true;
					}, function(errResponse) {
						console.error('Error while fetching data');
						$rootScope.showLoading = false;
					});
		} else if (self.loaiBang == 'tbBSToKhai') {// tờ khai bổ sung
			ThayDoiDoNVHQService.GetDLBoSungTK($scope.CucHQ.ma,
					$scope.ChiCucHQ.ma, self.nhx, $scope.NghiepVu.manv,
					loai_ky, tu_ngay, den_ngay, ky, thang, nam).then(
					function(deferred) {
						self.lstKxBoSungTK = deferred;
						$rootScope.showLoading = false;
						$scope.showReport1 = true;
					}, function(errResponse) {
						console.error('Error while fetching data');
						$rootScope.showLoading = false;
					});
		} else if (self.loaiBang == 'tbViewHuyXoa') {// tờ khai huỷ xoá

			ThayDoiDoNVHQService.GetDLHuyXoa($scope.CucHQ.ma,
					$scope.ChiCucHQ.ma, self.nhx, $scope.NghiepVu.manv,
					loai_ky, tu_ngay, den_ngay, ky, thang, nam).then(
					function(deferred) {
						self.lstKxHuyXoa = deferred;
						$rootScope.showLoading = false;
						$scope.showReport1 = true;
					}, function(errResponse) {
						console.error('Error while fetching data');
						$rootScope.showLoading = false;
					});
		} else { // sửa đổi bổ sung

			ThayDoiDoNVHQService.GetDLSuaDoiBoSung($scope.CucHQ.ma,
					$scope.ChiCucHQ.ma, self.nhx, $scope.NghiepVu.manv,
					loai_ky, tu_ngay, den_ngay, ky, thang, nam).then(
					function(deferred) {
						self.lstSuaDoiBoSung = deferred;
						$rootScope.showLoading = false;
						$scope.showReport1 = true;
					}, function(errResponse) {
						console.error('Error while fetching data');
						$rootScope.showLoading = false;
					});
		}

	}

	self.tabSelected1 = function () {
		self.nhx = "X";
		clearlstData();
		console.log(self.nhx);
	}
	self.tabSelected2 = function () {
		self.nhx = "N";
		clearlstData();
		console.log(self.nhx);
	}

	self.hideReport = function() {
		self.srcReport = "";
		self.showReport = false;
	}
	self.KetXuat = function() {
		var maCucHQ = "";
		var maChicucHQ = "";
		var nhx = "";
		var loai_ky = "";
		var tu_ngay = "";
		var den_ngay = "";
		var ky = "";
		var thang = "";
		var nam = "";
		var loaiBC = "EXCEL";
		var maNghiepVu = "";
		if ($scope.CucHQ != undefined && $scope.CucHQ != null)
			if ($scope.CucHQ.ma != undefined && $scope.CucHQ.ma != null)
				maCucHQ = $scope.CucHQ.ma;
		if ($scope.ChiCucHQ != undefined && $scope.ChiCucHQ != null)
			if ($scope.ChiCucHQ.ma != undefined && $scope.ChiCucHQ.ma != null)
				maChicucHQ = $scope.ChiCucHQ.ma;
		if (self.nhx != undefined && self.nhx != null)
			nhx = self.nhx;
		if ($scope.cmbLoaiKy != undefined && $scope.cmbLoaiKy != null)
			if ($scope.cmbLoaiKy.MaLoaiKy != undefined
					&& $scope.cmbLoaiKy.MaLoaiKy != null)
				loai_ky = $scope.cmbLoaiKy.MaLoaiKy;
		if ($scope.txtTuNgay != undefined && $scope.txtTuNgay != null)
			tu_ngay = getDateString($scope.txtTuNgay);
		if ($scope.txtDenNgay != undefined && $scope.txtDenNgay != null)
			den_ngay = getDateString($scope.txtDenNgay);
		if ($scope.cmbKy != undefined && $scope.cmbKy != null)
			ky = $scope.cmbKy;
		if ($scope.cmbThang != undefined && $scope.cmbThang != null)
			thang = $scope.cmbThang;
		if ($scope.cmbNam != undefined && $scope.cmbNam != null)
			nam = $scope.cmbNam;
		if ($scope.NghiepVu != undefined && $scope.NghiepVu != null)
			maNghiepvu = $scope.NghiepVu.manv;

		var _srcReport = self.ROOT_API + '/bcThayDoiDoNVHQ';
		if (self.loaiBang == 'tbTongThe')// tổng thể
		{
			if (self.lstKxTongThe == undefined || self.lstKxTongThe == null
					|| self.lstKxTongThe.Count < 1)
				return;
			_srcReport = _srcReport + '/TongThe';
		} else if (self.loaiBang == 'tbBSToKhai')//'tbViewHuyXoa')// tờ khai bổ sung
		{
			if (self.lstKxBoSungTK == undefined || self.lstKxBoSungTK == null
					|| self.lstKxBoSungTK.Count < 1)
				return;
			_srcReport = _srcReport + '/BSToKhai';
		} else if (self.loaiBang == 'tbViewHuyXoa') {// tờ khai huỷ xoá

			if (self.lstKxHuyXoa == undefined || self.lstKxHuyXoa == null
					|| self.lstKxHuyXoa.Count < 1)
				return;
			_srcReport = _srcReport + '/HuyXoa';
		} else { // sửa đổi bổ sung

			if (self.lstSuaDoiBoSung == undefined
					|| self.lstSuaDoiBoSung == null
					|| self.lstSuaDoiBoSung.Count < 1)
				return;
			_srcReport = _srcReport + '/SDBS';
		}
		_srcReport = _srcReport + '?maCucHQ=' + maCucHQ + '&maChicucHQ='
				+ maChicucHQ + '&nhx=' + nhx + '&maNghiepvu=' + maNghiepVu + '&loai_ky=' + loai_ky
				+ '&tu_ngay=' + tu_ngay + '&den_ngay=' + den_ngay + '&ky=' + ky
				+ '&thang=' + thang + '&nam=' + nam + '&loaiBC=' + loaiBC;
		self.srcReport = _srcReport;
		console.log(self.srcReport);
	}
	/* format Date on Grid */
	$scope.formatDateToString = function(date) {
		return formatDateToString(date);
	};
	self.In = function () {
		var maCucHQ = "";
		var maChicucHQ = "";
		var nhx = "";
		var loai_ky = "";
		var tu_ngay = "";
		var den_ngay = "";
		var ky = "";
		var thang = "";
		var nam = "";
		var loaiBC = "PDF";
		var maNghiepvu = "";
		if ($scope.CucHQ != undefined && $scope.CucHQ != null)
			if ($scope.CucHQ.ma != undefined && $scope.CucHQ.ma != null)
				maCucHQ = $scope.CucHQ.ma;
		if ($scope.ChiCucHQ != undefined && $scope.ChiCucHQ != null)
			if ($scope.ChiCucHQ.ma != undefined && $scope.ChiCucHQ.ma != null)
				maChicucHQ = $scope.ChiCucHQ.ma;
		if (self.nhx != undefined && self.nhx != null)
			nhx = self.nhx;
		if ($scope.cmbLoaiKy != undefined && $scope.cmbLoaiKy != null)
			if ($scope.cmbLoaiKy.MaLoaiKy != undefined
					&& $scope.cmbLoaiKy.MaLoaiKy != null)
				loai_ky = $scope.cmbLoaiKy.MaLoaiKy;
		if ($scope.txtTuNgay != undefined && $scope.txtTuNgay != null)
			tu_ngay = getDateString($scope.txtTuNgay);
		if ($scope.txtDenNgay != undefined && $scope.txtDenNgay != null)
			den_ngay = getDateString($scope.txtDenNgay);
		if ($scope.cmbKy != undefined && $scope.cmbKy != null)
			ky = $scope.cmbKy;
		if ($scope.cmbThang != undefined && $scope.cmbThang != null)
			thang = $scope.cmbThang;
		if ($scope.cmbNam != undefined && $scope.cmbNam != null)
			nam = $scope.cmbNam;
		if ($scope.NghiepVu != undefined && $scope.NghiepVu != null)
			maNghiepvu = $scope.NghiepVu.manv;

		var _srcReport = self.ROOT_API + '/bcThayDoiDoNVHQ';
		if (self.loaiBang == 'tbTongThe') { // tổng thể

			if (self.lstKxTongThe == undefined || self.lstKxTongThe == null
					|| self.lstKxTongThe.Count < 1)
				return;
			_srcReport = _srcReport + '/TongThe';
		} else if (self.loaiBang == 'tbBSToKhai') {// bổ sung tờ khai

			if (self.lstKxBoSungTK == undefined || self.lstKxBoSungTK == null
					|| self.lstKxBoSungTK.Count < 1)
				return;
			_srcReport = _srcReport + '/BSToKhai';
		} else if (self.loaiBang == 'tbViewHuyXoa') {// tờ khai huỷ xoá

			if (self.lstKxHuyXoa == undefined || self.lstKxHuyXoa == null
					|| self.lstKxHuyXoa.Count < 1)
				return;
			_srcReport = _srcReport + '/HuyXoa';
		} else { // sửa đổi bổ sung

			if (self.lstSuaDoiBoSung == undefined
					|| self.lstSuaDoiBoSung == null
					|| self.lstSuaDoiBoSung.Count < 1)
				return;
			_srcReport = _srcReport + '/SDBS';
		}
		_srcReport = _srcReport + '?maCucHQ=' + maCucHQ + '&maChicucHQ='
				+ maChicucHQ + '&nhx=' + nhx + '&maNghiepvu=' + maNghiepvu
				+ '&loai_ky=' + loai_ky + '&tu_ngay=' + tu_ngay + '&den_ngay='
				+ den_ngay + '&ky=' + ky + '&thang=' + thang + '&nam=' + nam
				+ '&loaiBC=' + loaiBC;
		self.srcReport = _srcReport;
		console.log(self.srcReport);
		self.showReport = true;
	}
	self.Close = function() {
		
	}

}
