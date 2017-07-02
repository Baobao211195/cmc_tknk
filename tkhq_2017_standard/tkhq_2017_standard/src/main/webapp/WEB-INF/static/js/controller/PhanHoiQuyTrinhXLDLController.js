App.controller('PhanHoiQuyTrinhXLDLController', [
		'$scope',
		'PhanHoiQuyTrinhXLDLService',
		'pagerService',
		'$uibModal',
		'$PopupMessage',
		'$timeout',
		'$rootScope',
		'$window',
		function($scope, PhanHoiQuyTrinhXLDLService, pagerService, $uibModal,
				$PopupMessage, $timeout, $rootScope, $window) {
			
			$scope.lstManager = [];
			$scope.loai_bc = "";			

			$scope.btnChuyen_Click = function() {
				if(validate()){
				console.log("LoaiBC: " + $scope.loai_bc//+'|$scope.manager.username:'+$scope.manager.username
						+'|$scope.noiDung:'+$scope.noiDung);
				var param = {};	
				var noiDung = $scope.noiDung;				
	        	param["loai_bc"] = $scope.loai_bc;
//	        	param["user_id"] = $scope.manager.username;
	        	param["noidung"] = noiDung;
				PhanHoiQuyTrinhXLDLService.PhanHoiSoLieuTheoChiTieuThongKe(param).then(
						function(deferred) {
							var tesst = deferred;
							console.log("#############################tesst.error_code:"+tesst.error_code+"|tesst.error_mes:"+tesst.error_mes);
							if(tesst.error_code != -1 && tesst.error_code != undefined){
								var modalInstance = $PopupMessage.Success('Đã gửi phản hồi');							
								modalInstance.result.then(function (data) {
									if(data == 'close'){
										GetPhanHoiSoLieuTheoChiTieuThongKe();
										$('#myModal').modal('hide');
										$scope.noiDung = '';
//										$scope.manager = $scope.lstManager[0];
									}
							    });
							} else{
								var modalInstance = $PopupMessage.Error('Có lỗi xảy ra');							
								modalInstance.result.then(function (data) {
									if(data == 'close'){
									}
									else{
									}
							    });
							}
						}, function(errResponse) {
							console.error('Error while fetching data');
							var modalInstance = $PopupMessage.Error('Có lỗi xảy ra');							
							modalInstance.result.then(function (data) {
								if(data == 'close'){
								}
								else{
								}
						    });
						});
				}
			};

			function loadDefualtForm() {
				$scope.noiDung = '';
//					"phan hoi bc"+ $scope.loai_bc;
			}
//			function GetManager() {
//				PhanHoiQuyTrinhXLDLService.GetManager().then(
//						function(deferred) {
//							$scope.lstManager = deferred;
//							$scope.lstManager = [{"username": "---chọn---","fullname": "","ma_hq": ""}].concat($scope.lstManager);
//							$scope.manager = $scope.lstManager[0];
//						}, function(errResponse) {
//							console.error('Error while fetching data');
//						});
//			}
			function GetPhanHoiSoLieuTheoChiTieuThongKe() {
				PhanHoiQuyTrinhXLDLService.GetPhanHoiSoLieuTheoChiTieuThongKe($scope.loai_bc)
						.then(function(deferred) {
							$scope.lstTTPhanHoi = deferred;
						}, function(errResponse) {
							console.error('Error while fetching data');
						});
			}
			$rootScope.$on('PhanHoiQuyTrinhXLDL', function(event, data) {
				console.log(data);
				$scope.loai_bc = data;
			});
			
			function validate(){
				var noiDung = $window.document.getElementById('noiDung');
//                var manager = $window.document.getElementById('manager');
		        if($scope.noiDung.trim() == '' || $scope.noiDung == null)
		        {
		        	$PopupMessage.Error("Nội dung không được bỏ trống!");
		        	noiDung.focus();
		            return false; 
		        }
//		        if($scope.manager == $scope.lstManager[0] || $scope.manager == null)
//		        {
//		        	$PopupMessage.Error("Chọn 'Công chức quản lý'");
//		        	manager.focus();
//		            return false; 
//		        }
	    	    return true;
	    	}			

			(function init() {
				$timeout(function() {
//					GetManager();
					GetPhanHoiSoLieuTheoChiTieuThongKe();
					loadDefualtForm();
					console.log('System controller with timeout fired');
				}, 500);
			})();
		} ]);