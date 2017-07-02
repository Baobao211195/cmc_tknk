/**
 * 
 */

'use strict';

App.factory('CanhBao_TriGiaXNKTinhTPService', ['$http', '$q', 'contextPath', CanhBao_TriGiaXNKTinhTPService]);
function CanhBao_TriGiaXNKTinhTPService($http, $q, contextPath){
	var REST_SERVICE_URI = contextPath+ "/bcpt/";
	var REST_SERVICE_URI2 = REST_SERVICE_URI + "SoLieuTheoChiTieuThongKe11";
	
	var factory = {
	        getLstTinhTP: getLstTinhTP,
	        getTTCanhBaoTGXNKTTP: getTTCanhBaoTGXNKTTP,
	        doExport: doExport,
	        doPrint: doPrint
	};
	
	return factory;
	
	function getTTCanhBaoTGXNKTTP(param){
		var deferred = $q.defer();
        $http.get(REST_SERVICE_URI2 + '?trangthai=' + param['trangthai'] + '&nhx=' + param['nhx']
        	+ '&tinh=' + param['tinh'])
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi lấy thông tin diễn biến');
                deferred.reject(errResponse);
            }
        );
        
        return deferred.promise;
	}
	
	function getLstTinhTP(){
		var deferred = $q.defer();
        $http.get(REST_SERVICE_URI + 'GetProvince')
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi lấy thông tỉnh/TP');
                deferred.reject(errResponse);
            }
        );
        
        return deferred.promise;
	}
	
	function doExport(param){
		console.log(param);
		
		$http({
    		headers: {
    			'Content-Type': 'application/json;charset=utf-8',
    			'Accept': 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
    		},
    		method: 'POST',
    		url: contextPath + '/bcpt/CanhBaoTGXNKTTP/doExport',
    		data: JSON.stringify(param),
    		responseType: 'arraybuffer'
    	})
    	.then(
			function (response) {
    		var fileName = "Diễn biến về trị giá xuất nhập khẩu của Tỉnh//TP_" 
    			+ (new Date()).getTime() + ".xls";
    		
    	    var blob = new Blob([response.data], {
    	        type: 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
    	    });
    	    saveAs(blob, fileName);
		},
		function(errResponse){
			console.log("Can't download file with error: " + errResponse);
		});
	}
	
	function doPrint(){
		
	}
	
}