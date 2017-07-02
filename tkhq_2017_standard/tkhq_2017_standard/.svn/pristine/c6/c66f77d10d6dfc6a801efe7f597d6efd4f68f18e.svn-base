/**
 * 
 */

'use strict';

App.factory('LichCBTTTKService', ['$http', '$q', 'contextPath', LichCBTTTKService]);
function LichCBTTTKService($http, $q, contextPath){
	
	var factory = {
			getLstLoaiBC: getLstLoaiBC,
			getLstNSD: getLstNSD,
			getScheduleInfo: getScheduleInfo,
			create: create,
			update: update,
			doExport: doExport
	};
	
	return factory;
	
	function getScheduleInfo(param){
		var deferred = $q.defer();
        $http.get(contextPath + '/LichCBTTTK/getScheduleInfo?namCB=' + param["namCB"] + '&loaiLichCB=' + param["loaiLichCB"])
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
	
	function getLstLoaiBC(loaiKyBC){
		var deferred = $q.defer();
        $http.get(contextPath + '/LichCBTTTK/getLstLoaiBC?loaiKyBC=' + loaiKyBC)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi lấy thông tin loại báo cáo');
                deferred.reject(errResponse);
            }
        );
        
        return deferred.promise;
	}
	
	function getLstNSD(){
		var deferred = $q.defer();
        $http.get(contextPath + '/LichCBTTTK/getLstNSD')
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi lấy thông tin user');
                deferred.reject(errResponse);
            }
        );
        
        return deferred.promise;
	}
	
	function create(param){
		var deferred = $q.defer();
        $http.post(contextPath + '/LichCBTTTK/create', param)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Không thể tạo mới thông tin');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
	}
	
	function update(param){
		var deferred = $q.defer();
        $http({
    		headers: {'Content-Type': 'application/json;charset=utf-8'},
    		method: 'POST',
    		url: contextPath + '/LichCBTTTK/updInfo',
    		data: JSON.stringify(param)
    	})
        .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Không thể cập nhật thông tin');
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
    		url: contextPath + '/LichCBTTTK/doExport',
    		data: JSON.stringify(param),
    		responseType: 'arraybuffer'
    	})
    	.then(
            function (response) {
    		var fileName = "Lịch công bố thông tin thống kê_" + (new Date()).getTime() + ".xls";
    		
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