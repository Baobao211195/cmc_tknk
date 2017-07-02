App.factory('HTCBBTGTMHSITCService', [ '$http', '$q', 'contextPath', function($http, $q, contextPath) {

	return {
		getCucHQ: function () {
			var deferred = $q.defer();
			$http.get(contextPath+"/bcpt/GetCustom")
            .then(
                function (response) {
                    deferred.resolve(response.data);
                },
                function(errResponse){
                    console.error('Có lỗi xảy ra');
                    deferred.reject(errResponse);
                }
            );
                
            return deferred.promise;
        },
        getChiCucHQByCuc: function (maCuc) {
			var deferred = $q.defer();
			$http.get(contextPath+'/bcpt/GetSubCustom?maCucHQ='+ maCuc)
            .then(
                function (response) {
                    deferred.resolve(response.data);
                },
                function(errResponse){
                    console.error('Có lỗi xảy ra');
                    deferred.reject(errResponse);
                }
            );
                
            return deferred.promise;
        },
        getPhan: function () {
			var deferred = $q.defer();
			 $http.get(contextPath+"/bcpt/GetPhan")
            .then(
                function (response) {
                    deferred.resolve(response.data);
                },
                function(errResponse){
                    console.error('Có lỗi xảy ra');
                    deferred.reject(errResponse);
                }
            );
                
            return deferred.promise;
        },
        getData: function (maCucHQ, maChicucHQ,trangthai,nhx, phan) {
			var deferred = $q.defer();
			var api = contextPath+"/bcpt/SoLieuTheoChiTieuThongKe06?maCucHQ=" 
        		+ maCucHQ + "&maChicucHQ=" + maChicucHQ + "&trangthai=" + trangthai + "&nhx=" + nhx + "&phan=" + phan;
            $http.get(api)
            .then(
                function (response) {
                    deferred.resolve(response.data);
                },
                function(errResponse){
                    console.error('Có lỗi xảy ra');
                    deferred.reject(errResponse);
                }
            );
                
            return deferred.promise;
        },
        
        doExport: function(param){
    		$http({
        		headers: {
        			'Content-Type': 'application/json;charset=utf-8',
        			'Accept': 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
        		},
        		method: 'POST',
        		url: contextPath + '/BCHTCBBTGTMHSITC/doExport',
        		data: JSON.stringify(param),
        		responseType: 'arraybuffer'
        	})
        	.then(
    			function (response) {
        		var fileName = "Cảnh báo bất thường của diễn biến và xu thế trị giá mặt hàng theo phân tổ SITC_" 
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
	}
} ]);