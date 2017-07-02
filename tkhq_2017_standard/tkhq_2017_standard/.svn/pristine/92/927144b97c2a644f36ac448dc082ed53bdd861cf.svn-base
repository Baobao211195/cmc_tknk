/**
* Controller of delete lock user list.
*/
'use strict';
var myApp = angular.module('myApp');

myApp.controller('danhsachcongviecController', ['$scope',
												'$PopupMessage',
												'danhsachcongviecService',
												function($scope,
														$PopupMessage,
														danhsachcongviecService){

	$scope.listCongviec = [];

	
	
	init();
	

	function init() {
		getListCongviec();
	}

	function getListCongviec(){
		danhsachcongviecService.getListCongviec()
			.then(
				function(deferred) {
					$scope.listCongviec = deferred;
					console.log("Display data successfully");
				},
				function (errResponse) {
					console.error('Error while fetching data');
				}
			);
	}

}]);