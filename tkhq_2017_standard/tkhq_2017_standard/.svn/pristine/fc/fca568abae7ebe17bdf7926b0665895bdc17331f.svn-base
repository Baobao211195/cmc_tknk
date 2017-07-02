/**
* Controller of delete lock user list.
*/
'use strict';
var myApp = angular.module('myApp');

myApp.controller('deleteLockUsersController', ['$scope',
												'$PopupMessage',
												'deleteLockUsersService',
												function($scope,
														$PopupMessage,
														deleteLockUsersService){

	$scope.listLockUsers = [];
	$scope.user = {
		"userName" : ""	
	};
	$scope.selectedRow = null;
	
	
	init();
	
	$scope.setClickedRow = function (name){
		$scope.selectedRow = name;
	}

	$scope.doDelete = function () {
		if ($scope.selectedRow === null){
			$PopupMessage.Error("Hãy chọn người sử dụng muốn xóa.");
		}
		$PopupMessage.Confirm('Ban co chac chan muon xoa ban ghi', deleteLockUsers, null);
		
	}

	function deleteLockUsers() {
		deleteLockUsersService.DoDeleteLockUsers($scope.selectedRow)
			.then(
				function(deferred) {
					if (deferred == 2) {
						$PopupMessage.Success("User đã được xóa bởi một người sử dụng khác!");
					}else if (deferred == 1){
						$PopupMessage.Error("User đã bị xóa!");
					} else {
						$PopupMessage.Error("Có lỗi trong quá trình xóa dữ liệu");
					}
					getListlockUser();
				},
				function (errResponse) {
					console.log('Error while fetching data');
				}
			);
	}

	function init() {
		getListlockUser();
	}

	function getListlockUser(){
		deleteLockUsersService.GetListLockUsers()
			.then(
				function(deferred) {
					$scope.listLockUsers = deferred;
					console.log("Display data successfully");
				},
				function (errResponse) {
					console.error('Error while fetching data');
				}
			);
	}

}]);