App.factory('HTCBBTTGXNKHQService', [ '$http', '$q', 'contextPath', function($http, $q, contextPath) {

	var RootApi = contextPath+"/bcpt";
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
        getData: function (maCucHQ, maChicucHQ, trangthai, nhx) {
			var deferred = $q.defer();
			var api = RootApi + "/SoLieuTheoChiTieuThongKe12?maCucHQ=" + maCucHQ + "&maChicucHQ=" + maChicucHQ + "&trangthai=" + trangthai + "&nhx=" + nhx;
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
        		url: contextPath + '/BCHTCBTGTXNK/doExport',
        		data: JSON.stringify(param),
        		responseType: 'arraybuffer'
        	})
        	.then(
    			function (response) {
        		var fileName = "Cảnh báo bất thường của diễn biến trị giá xuất nhập khẩu của 34 Cục HQ, chi cục HQ_" 
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