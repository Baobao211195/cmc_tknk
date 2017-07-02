App.factory('ThayDoiDoTHQTNVService', [ '$http', '$q', 'contextPath',
		'$httpParamSerializerJQLike', ThayDoiDoTHQTNVService ]);
function ThayDoiDoTHQTNVService($http, $q, contextPath,
		$httpParamSerializerJQLike) {

	var REST_SERVICE_URI = contextPath + '/tbs_mahs_dkgh/';
	var ROOT_API = contextPath+'/bcpt';

	var semaphore = false;

	var factory = {
		GetCucHQ : GetCucHQ,
		GetChiCucHQByCuc : GetChiCucHQByCuc,
		TaiDuLieu : TaiDuLieu,
		doExport: doExport
	};

	return factory;

	function GetCucHQ() {
		var deferred = $q.defer();
		$http.get(ROOT_API + '/GetCustom').then(function(response) {
			deferred.resolve(response.data);
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi get cục HQ');
			deferred.reject(errResponse);
		});

		return deferred.promise;
	}

	function GetChiCucHQByCuc(maCuc) {
		var deferred = $q.defer();
		$http.get(ROOT_API + '/GetSubCustom?maCucHQ=' + maCuc).then(
				function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Có lỗi xảy ra trong khi get chi cục HQ');
					deferred.reject(errResponse);
				});
		return deferred.promise;
	}

	function TaiDuLieu(maCucHQ, maChicucHQ, nhx, loai_ky, tu_ngay, den_ngay,
			ky, thang, nam) {
		var deferred = $q.defer();
		var api = ROOT_API + '/XemThayDoi/BuocNVTHKE?maCucHQ=' + maCucHQ
				+ '&maChicucHQ=' + maChicucHQ + '&nhx=' + nhx + '&loai_ky='
				+ loai_ky + '&tu_ngay=' + tu_ngay + '&den_ngay=' + den_ngay
				+ '&ky=' + ky + '&thang=' + thang + '&nam=' + nam;
		$http.get(api).then(function(response) {
			deferred.resolve(response.data);
		}, function(errResponse) {
			console.error('Lỗi TaiDuLieu');
			deferred.reject(errResponse);
		});
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
    		url: contextPath + '/bcThayDoiDoTHQTNV/doExport',
    		data: JSON.stringify(param),
    		responseType: 'arraybuffer'
    	})
    	.then(
            function (response) {
            	var fileName = "Thay đổi do thực hiện các quy trình, nghiệp vụ, bước nghiệp vụ thống kê_"
            		+ (new Date()).getTime() + ".xls";
        		
        	    var blob = new Blob([response.data], {
        	        type: 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
        	    });
        	    saveAs(blob, fileName);
            },
            function(errResponse){
            	console.error("Can't download file with error: " + errResponse.data);
            }
        );
	}
}