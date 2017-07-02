/**
 * 
 */

'use strict';

App.factory('QLLDTPhoBienService', ['$http', '$q', 'contextPath', QLLDTPhoBienService]);
function QLLDTPhoBienService($http, $q, contextPath){
	
	var factory = {
			getLstBieuBC: getLstBieuBC,
			getProcessInfo: getProcessInfo,
			doApproval: doApproval
	};
	
	return factory;
	
	function getProcessInfo(param){
		var deferred = $q.defer();
        $http.post(contextPath + '/QLLDTPB/getProcessInfo', param)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi lấy thông tin xử lý');
                deferred.reject(errResponse);
            }
        );
        
        return deferred.promise;
	}
	
	function getLstBieuBC(nhx){
		var deferred = $q.defer();
        $http.get(contextPath + '/QLLDTPB/getLstBieuBC?nhx=' + nhx)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi lấy thông tin biểu');
                deferred.reject(errResponse);
            }
        );
        
        return deferred.promise;
	}
	
	function doApproval(param){
		var deferred = $q.defer();
        $http.post(contextPath + '/QLLDTPB/doApproval', param)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Không thể phê duyệt báo cáo');
                deferred.reject(errResponse);
            }
        );
        
        return deferred.promise;
	}
}