/**
 * 
 */

'use strict';

App.factory('QLUserSDSPTKService', ['$http', '$q', 'contextPath', QLUserSDSPTKService]);
function QLUserSDSPTKService($http, $q, contextPath){

    var REST_SERVICE_URI = contextPath + '/qluser_sdtk/';

    var factory = {
		crtUserInfo: crtUserInfo,
		updUserInfo: updUserInfo,
		delUserInfo: delUserInfo,
		search: search,
		getListUser: getListUser,
		doExport: doExport
    };

    return factory;
    
    function getListUser(){
    	var deferred = $q.defer();
    	$http.get(REST_SERVICE_URI + 'getLstUser')
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

    function crtUserInfo(entity) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI, entity)
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

    function updUserInfo(entity, id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI + id, entity)
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

    function delUserInfo(selectedList) {
    	console.log("Json: " + JSON.stringify(selectedList));
        var deferred = $q.defer();
        $http.delete(REST_SERVICE_URI, {params: {lstUserSDTK: JSON.stringify(selectedList)}})
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
    
    function search(formData){
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
    
    function doExport(param){
    	$http({
    		headers: {
    			'Content-Type': 'application/json;charset=utf-8',
    			'Accept': 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
    		},
    		method: 'POST',
    		url: contextPath + '/qluser_sdtk/doExport',
    		data: JSON.stringify(param),
    		responseType: 'arraybuffer'
    	})
    	.then(
            function (response) {
    		var fileName = "Quản lý tổ chức, cá nhân sử dụng sản phẩm thống kê_" + (new Date()).getTime() + ".xls";
    		
    	    var blob = new Blob([response.data], {
    	        type: 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
    	    });
    	    saveAs(blob, fileName);
		},
		function(errResponse){
			console.log("Can't download file with error: " + errResponse.data);
		});
    }
}