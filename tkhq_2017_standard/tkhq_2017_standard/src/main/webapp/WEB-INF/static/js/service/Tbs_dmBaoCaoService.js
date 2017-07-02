/**
 * 
 */
App.factory('Tbs_dmBaoCaoService', [ '$http', '$q', 'contextPath',
		'$httpParamSerializerJQLike', Tbs_dmBaoCaoService ]);
function Tbs_dmBaoCaoService($http, $q, contextPath, $httpParamSerializerJQLike) {
	var REST_SERVICE_URI_TINH = contextPath+"/bcpt/";
	var REST_SERVICE_URI = contextPath + '/tbs_dmbaocao';
	var REST_SERVICE_URI_MATHKENK = contextPath + '/tbs_mathkenhomNk/';
	var REST_SERVICE_URI_MATHKEXK = contextPath + '/tbs_mathkenhomXk/';
	var REST_SERVICE_URI_LHXNK = contextPath + '/tbs_lhxnk/';
	var REST_SERVICE_URI_CUCHQ = contextPath + '/tbs_hqkttxnk_getcuc';
	var REST_SERVICE_URI_CHICUCHQ = contextPath + '/tbs_hqkttxnk_getchicucbycuc?maCuc=';

	// console.log(REST_SERVICE_URI);
	var factory = {
		GetDmBcByType : GetDmBcByType,
		getLstTinhTP : getLstTinhTP,
		getLstMATHKE : getLstMATHKE,
		GetCucHQ : GetCucHQ,
		GetChiCucHQByCuc : GetChiCucHQByCuc,
		GetLHXNK:GetLHXNK
	};

	return factory;
	function GetLHXNK() {
		var deferred = $q.defer();
		$http.get(REST_SERVICE_URI_LHXNK).then(function(response) {
			deferred.resolve(response.data);
			console.log(response.data);
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi lấy thông tin');
			deferred.reject(errResponse);
		});

		return deferred.promise;
	}
	function GetCucHQ() {
		var deferred = $q.defer();
		$http.get(REST_SERVICE_URI_CUCHQ).then(function(response) {
			deferred.resolve(response.data);
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi lấy thông tin');
			deferred.reject(errResponse);
		});

		return deferred.promise;
	}
	function GetChiCucHQByCuc(maCuc) {
		var deferred = $q.defer();
		console.log('GetChiCucHQByCuc@maCuc:' + maCuc);
		$http.get(REST_SERVICE_URI_CHICUCHQ + maCuc).then(function(response) {
			deferred.resolve(response.data);
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi lấy thông tin');
			deferred.reject(errResponse);
		});
		return deferred.promise;
	}
	function getLstMATHKE(nhx) {
		var URL_MATHKE="";
		if(nhx=="N"){
			URL_MATHKE=REST_SERVICE_URI_MATHKENK;
		}else{
			URL_MATHKE=REST_SERVICE_URI_MATHKEXK;
		}
			
		var deferred = $q.defer();
		$http.get(URL_MATHKE).then(function(response) {
			deferred.resolve(response.data);
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi lấy thông tỉnh/TP');
			deferred.reject(errResponse);
		});

		return deferred.promise;
	}
	function getLstTinhTP() {
		var deferred = $q.defer();
		$http.get(REST_SERVICE_URI_TINH + 'GetProvince').then(
				function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Có lỗi xảy ra trong khi lấy thông tỉnh/TP');
					deferred.reject(errResponse);
				});

		return deferred.promise;
	}
	function GetDmBcByType(ma_loaibc) {
		var deferred = $q.defer();
		$http.get(REST_SERVICE_URI + '?ma_loaibc=' + ma_loaibc).then(
				function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Có lỗi xảy ra trong khi lấy thông tin');
					deferred.reject(errResponse);
				});
		return deferred.promise;
	}

}