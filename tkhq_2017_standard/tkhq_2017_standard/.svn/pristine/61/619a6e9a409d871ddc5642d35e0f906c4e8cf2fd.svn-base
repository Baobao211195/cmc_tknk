/**
 * Service of  lock users.
 */

'use strict';
App.factory('danhsachcongviecService',['$http','$q', 'contextPath', danhsachcongviecService]);

function danhsachcongviecService($http, $q, contextPath) {	
	
	var factory = {
			getListCongviec  : getListCongviec
	};
	
	return factory;

	function getListCongviec() {
		var deferred = $q.defer();
		
		$http.get(contextPath + "/listCongviec")
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
}