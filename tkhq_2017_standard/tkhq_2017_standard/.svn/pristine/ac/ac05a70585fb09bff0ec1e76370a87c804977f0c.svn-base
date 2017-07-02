/**
 * Service of model TBS_TINHTP
 * 
 */

'use strict';

App.factory('TBS_TinhTPService', ['$http', '$q', 'contextPath', TBS_TinhTPService]);
function TBS_TinhTPService($http, $q, contextPath){

    var REST_SERVICE_URI = contextPath + '/tbs_tinhtp/';

    var factory = {
        crtTinhTP: crtTinhTP,
        updTinhTP: updTinhTP,
        delTinhTP: delTinhTP,
        searchTinhTP: searchTinhTP
    };

    return factory;

    function crtTinhTP(tinhTPEntity) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI, tinhTPEntity)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    function updTinhTP(tinhTPEntity, id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI + id, tinhTPEntity)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    function delTinhTP(selectedList) {
    	console.log("Json: " + JSON.stringify(selectedList));
        var deferred = $q.defer();
        $http.delete(REST_SERVICE_URI, {params: {lstTinhTP: JSON.stringify(selectedList)}})
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    
    function searchTinhTP(formData){
    	var deferred = $q.defer();
    	$http({
    		headers: {'Content-Type': 'application/json;charset=utf-8'},
    		method: 'POST',
    		url: REST_SERVICE_URI + 'search',
    		data: formData
    	}).then(function(response) {
			console.log('Return data & status: ' + response.data + " " + response.status);
			deferred.resolve(response.data);
			},
			function(errorResponse) {
				console.error('Return data & status: ' + errorResponse.data + " " + errorResponse.status);
				deferred.reject(errorResponse.status);
			}
    	);
    	return deferred.promise;
    }
}