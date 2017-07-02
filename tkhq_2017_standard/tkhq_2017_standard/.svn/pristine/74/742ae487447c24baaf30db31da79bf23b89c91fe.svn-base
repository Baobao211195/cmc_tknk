/**
 * Controller of QuanLyNhatKyHeThong.
 */

'use strict';

var myApp = angular.module('myApp');

myApp.controller('quanLyNhatKyHTController', 
  				['$scope',
  				 '$uibModal',
  				 '$PopupMessage',
  				 'contextPath',
  				 'quanLyNhatKyHTService',
  				  function ($scope,
  				  			$uibModal,
  				  			$PopupMessage,
  				  			contextPath,
  				  			quanLyNhatKyHTService) {
  	var DANG_HOAT_DONG = 1;
  	var NGUNG_HOAT_DONG = 0;
  	
  	$scope.tuNgay = "";
  	$scope.denNgay = "";
  	$scope.tenDangNhap = "";
  	 
  	$scope.donVi = {
  		"ma" : "",
  		"ten": ""
  	 };
  	
  	$scope.numPerPage = 10;
	$scope.currentPage = 1;
	$scope.maxSize = 5;
	$scope.totalPage = [];
  	
  	$scope.showReport = false;
  	 

  	$scope.listNhatKyHT = [];
  	$scope.listDonVi = [];
  
  	init();
  	
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

  	$scope.doSearch = function () {
  		var tmpTuNgay = "";
  		var tmpDenNgay = "";
  		
  		if ($scope.tuNgay === null || $scope.tuNgay === undefined){
  			tmpTuNgay = "";
  		}
  		if ($scope.denNgay === null || $scope.denNgay === undefined){
  			tmpDenNgay = "";
  		}
  		
  		if ($scope.tuNgay !== ""){
  			tmpTuNgay = formatDateToString($scope.tuNgay);
  		}
  		if ($scope.denNgay !== ""){
  			tmpDenNgay = formatDateToString($scope.denNgay);
  		}
  		search(tmpTuNgay, tmpDenNgay, $scope.tenDangNhap, $scope.donVi.ma);
  	}

	$scope.doExport = function (typeKetXuat) {
		ExportThôngTinNhatKyHT (typeKetXuat, $scope.tuNgay, $scope.denNgay, $scope.tenDangNhap, $scope.donVi.ma);
	}
	
	function formatDateToString(dateCondition) {
		var date = new Date(dateCondition);
		return date.getDate() + "/" + (date.getMonth()+ 1) + "/" + date.getFullYear();
	}

	function init() {
		GetCucHQ();
		$scope.tuNgay = "";
	  	$scope.denNgay = "";
		$scope.showReport = false;
	}
	
	function getTotalPage(total) {
		if (total % $scope.numPerPage > 0) {
			$scope.totalPage = Math.floor(total / $scope.numPerPage) + 1;
		} else {
			$scope.totalPage = Math.floor(total / $scope.numPerPage);
		}
		if (total == 0) {
			$scope.totalPage = 1;
		}
	}
	$scope.pageChanged = function(currentPage) {
		var begin = ((currentPage - 1) * $scope.numPerPage), end = begin
				+ $scope.numPerPage;
		$scope.phantrang = $scope.listNhatKyHT.slice(begin, end);
	};
	
	function GetCucHQ() {
		quanLyNhatKyHTService.GetCucHQ()
			.then(
				function(deferred) {
					$scope.listDonVi = deferred;
				},
				function(errResponse) {
					console.error('Error while fetching data');
				}
			);
	}
	
	function search(tuNgay, denNgay, tenDangNhap, maDonVi) {

		quanLyNhatKyHTService.GetListNhatKyHeThong(tuNgay, denNgay, tenDangNhap, maDonVi)
  			.then(
  				function(deferred) {
  					$scope.listNhatKyHT = deferred;
  					if ($scope.listNhatKyHT.length <= 0){
  						$PopupMessage.Error("Không tìm thấy kết quả");
  						return;
  					}
  					displayThôngTinNhatKy($scope.listNhatKyHT);
  					

  					var begin = (($scope.currentPage - 1) * $scope.numPerPage), 
					end = begin + $scope.numPerPage;
					$scope.phantrang = $scope.listNhatKyHT.slice(begin, end);
					getTotalPage($scope.listNhatKyHT.length);
  				},
  				function (errResponse) {
  					console.error('Error while fetching data');
  				}
  			);
  	}
	$scope.hideReport = function () {
		$scope.srcReport = "";	
		$scope.showReport = false;

	}
	
	function ExportThôngTinNhatKyHT (typeKetXuat, tuNgay, denNgay, tenDangNhap, maDonVi) {
		$scope.srcReport =  contextPath + "/exportNhatKyHT?"  + "typeKetXuat="+ typeKetXuat + "&tuNgay="+ tuNgay +
		"&denNgay=" + denNgay + "&tenDangNhap=" + tenDangNhap + "&maDonVi=" + maDonVi;
		if(typeKetXuat === 1){
			var modalInstance = $uibModal.open({
				animation : self.animationsEnabled,
				ariaLabelledBy : 'modal-title',
				ariaDescribedBy : 'modal-body',
				controller : 'ModalInstanceCtrl',
				templateUrl : 'ReportQuanLyNhatKyHT',
				windowClass : 'app-modal-window',
				resolve : {
					Url : function() {
						return $scope.srcReport;
					}
				}
			});
			
		}
	}

	function displayThôngTinNhatKy (listData) {
		for (var i = 0; i < listData.length; i++) {
			if(listData[i].trangThai === DANG_HOAT_DONG) {
				listData[i].trangThai = "Đăng nhập";
				continue;
			} 
  			if (listData[i].trangThai === NGUNG_HOAT_DONG) {
  				listData[i].trangThai = "Đăng xuất";
  				continue;
  			} 
  		}
  	}
}]);

myApp.controller('ModalInstanceCtrl', 
			['$scope',
			 '$uibModal',
			 '$PopupMessage',
			 '$modalInstance',
			 'Url',
			  function ($scope,
			  			$uibModal,
			  			$PopupMessage,
			  			$modalInstance,
			  			Url) {
				
	$scope.Url = Url;
	$scope.UrlPDF=Url+"&type=PDFATTACH";
	$scope.cancel = function() {
		$modalInstance.dismiss('cancel');
	};
}]);
