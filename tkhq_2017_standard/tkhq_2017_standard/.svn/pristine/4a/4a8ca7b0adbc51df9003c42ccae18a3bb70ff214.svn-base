/**
 * 
 */

'use strict';

App.factory('CanhBao_SoTKTTGService', ['$http', '$q', 'contextPath', CanhBao_SoTKTTGService]);
function CanhBao_SoTKTTGService($http, $q, contextPath){
	var REST_SERVICE_URI = contextPath+"/bcpt/";
	var REST_SERVICE_URI2 = REST_SERVICE_URI + "SoLieuTheoChiTieuThongKe14";
	
	var factory = {
			getLstCucHQ: getLstCucHQ,
	        getLstChiCucHQ: getLstChiCucHQ,
	        getTTCanhBaoSoTKTTG: getTTCanhBaoSoTKTTG,
	        doExport: doExport,
	        doPrint: doPrint
	};
	
	return factory;
	
	function getTTCanhBaoSoTKTTG(param){
		var deferred = $q.defer();
        $http.get(REST_SERVICE_URI2 + '?maCucHQ=' + param['maCucHQ'] + '&maChicucHQ=' + param['maChiCucHQ'] 
        	+ '&nhx=' + param['nhx'] + '&loai_ngay=' + param['loai_ngay'] + '&thoi_gian=' + param['thoi_gian']
        	+ '&tu_thoigian=' + param['tu_thoigian'] + '&den_thoigian=' + param['den_thoigian']
        	+ '&tu_nam=' + param['tu_nam'] + '&den_nam=' + param['den_nam'])
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
	
	function getLstCucHQ(){
		var deferred = $q.defer();
        $http.get(REST_SERVICE_URI + 'GetCustom')
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi lấy thông tin cục');
                deferred.reject(errResponse);
            }
        );
        
        return deferred.promise;
	}
	
	function getLstChiCucHQ(maCucHQ){
		var deferred = $q.defer();
        $http.get(REST_SERVICE_URI + 'GetSubCustom?maCucHQ=' + maCucHQ)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi lấy thông tin chi cục');
                deferred.reject(errResponse);
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
    		url: contextPath + '/bcpt/CanhBaoSoTKTTG/doExport',
    		data: JSON.stringify(param),
    		responseType: 'arraybuffer'
    	})
    	.then(
			function (response) {
    		var fileName = "Cảnh báo bất thường của diễn biến số tờ khai, trị giá theo ngày, tuần, tháng, quý, năm_" 
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