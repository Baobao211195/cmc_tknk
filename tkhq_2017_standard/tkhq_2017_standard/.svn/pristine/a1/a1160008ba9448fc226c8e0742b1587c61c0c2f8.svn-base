/**
 * Service of  lock users.
 */

'use strict';
App.factory('deleteLockUsersService',['$http','$q', 'contextPath', deleteLockUsersService]);

function deleteLockUsersService($http, $q, contextPath) {	
	
	var factory = {
		GetListLockUsers  : GetListLockUsers,
		DoDeleteLockUsers : DoDeleteLockUsers
	};
	
	return factory;

	function GetListLockUsers() {
		var deferred = $q.defer();
		
		$http.get(contextPath + "/listLockUsers")
			.then(
				function(response) {
					deferred.resolve(response.data)
				},
				function (errResponse) {
					deferred.reject(errResponse);
					console.log("Có lỗi xảy ra trong khi lấy thông tin");
				}
			);
		return deferred.promise;
	}

	function DoDeleteLockUsers(userName) {
		var deferred = $q.defer();
		$http.get(contextPath + "/deleteLockUsers?" + "userName="+ userName)
			.then(
				function(response)   {
					deferred.resolve(response.data)
				},
				function (errResponse) {
					deferred.reject(errResponse);
					console.log("Có lỗi xảy ra trong khi dowload thông tin");
				} 
			);
		return deferred.promise;
	}
}