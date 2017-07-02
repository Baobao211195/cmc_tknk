'use strict';

App.factory('Phancong_Service', [ '$http', '$q', 'contextPath',
		'$httpParamSerializerJQLike', Phancong_Service ]);
function Phancong_Service($http, $q, contextPath, $httpParamSerializerJQLike) {

	var REST_SERVICE_URI = contextPath+"/getAllPhancong/";
	var REST_URI_GET_ALL_CONGVIEC = contextPath + '/getAllCongviec';
	var REST_URI_GET_ALL_SEARCH = contextPath + '/phancong/search';
	
	var REST_URI_DELETE_CV = contextPath + 'deleteCongViec';
	
	
	var factory = {
		GetPhanCong 		: GetPhanCong,
		GetCongViec 		: GetCongViec,
		GetPhanCongByMaCv	: GetPhanCongByMaCv,
		DeleteCongViec 		: DeleteCongViec,
		GetUserFullName 	: GetUserFullName,
		InsertCongViec		: InsertCongViec,
		UpdateCongViec 		: UpdateCongViec,
		DeleteListCongViec	: DeleteListCongViec,
		GetListUser			: GetListUser,
		GetPhanCongByStt	: GetPhanCongByStt,
		GetUserOfTongCuc	: GetUserOfTongCuc,
		ExportData			: ExportData,
		
	}; 
	
	return factory;

	function GetPhanCong() {
		var deferred = $q.defer();
		$http.get(REST_SERVICE_URI).then(function(response) {
			deferred.resolve(response.data);
		}, function(errResponse) {
			deferred.reject(errResponse);
		});
		return deferred.promise;
	}
	function GetCongViec() {
		var deferred = $q.defer();
		$http.get(REST_URI_GET_ALL_CONGVIEC).then(function(response) {
			deferred.resolve(response.data);
		}, function(errResponse) {
			deferred.reject(errResponse);
		});
		return deferred.promise;
	}

	function GetPhanCongByMaCv(maCv,type) {
		var deferred = $q.defer();
		$http.get(REST_URI_GET_ALL_SEARCH + "?maCv=" + maCv + "&type=" +type)
			.then(
				function(response){
					deferred.resolve(response.data);
				}, function(errResponse) {
					deferred.reject(errResponse);
				}
			);
		return deferred.promise;
	}

	function GetUserFullName (userId){
		var deferred = $q.defer();
		$http.get(contextPath + "/getUserFullName?" + "userId" + userId)
			.then(
				function(response) {
					deferred.resolve(response.data);
				},
				function(errResponse) {
					deferred.reject(errResponse);
				}
			);
		return deferred.promise;
	}
	
	function GetListUser (){
		var deferred = $q.defer();
		$http.get(contextPath + "/tbd_sys_user/")
			.then(
				function(response) {
					deferred.resolve(response.data);
				},
				function(errResponse) {
					deferred.reject(errResponse);
				}
			);
		return deferred.promise;
	}
	
	function GetPhanCongByStt (stt, typeNhapXuat){
		var deferred = $q.defer();
		$http.get(contextPath + "/phancong/getPhanCongByStt?stt=" + stt + "&typeNhapXuat=" + typeNhapXuat)
		.then(
			function(response) {
				deferred.resolve(response.data);
			},
			function(errResponse) {
				deferred.reject(errResponse);
			}
		);
		return deferred.promise;
	}
	
	function DeleteCongViec(maCv) {
		var deferred = $q.defer();
		$http.get(contextPath + "/phancong/delete?" + "maCv=" + maCv)
			.then(
				function(response) {
					deferred.resolve(response.data);
				},
				function(errResponse) {
					deferred.reject(errResponse);
				}
			);
		return deferred.promise;
	}
	
	function InsertCongViec (congViecEntity){
		var deferred = $q.defer();
		console.log(congViecEntity);
		$http.post(contextPath + "/phancong/create", congViecEntity)
			.then(
				function(response) {
					deferred.resolve(response.data);
				 },
			    function(errResponse) {
					console.log("Có lỗi xảy ra trong khi thêm mới công việc.");
					deferred.resolve(errResponse.data);	
			    }
			);
		return deferred.promise;
	}
	
	function UpdateCongViec (congViecEntity){
		var deferred = $q.defer();
		console.log(congViecEntity);
		$http.post(contextPath + "/phancong/update" ,congViecEntity)
			.then(
				function(response) {
					deferred.resolve(response.data);
				 },
			    function(errResponse) {
					console.log("Có lỗi xảy ra trong khi update công việc.");
					deferred.resolve(errResponse.data);	
			    }
			);
		return deferred.promise;
	}
	
	function DeleteListCongViec (stt){
		var deferred = $q.defer();
		$http.get(contextPath + "/phancong/delete?" + "stt=" + stt)
			.then(
				function(response) {
					deferred.resolve(response.data);
				},
				function(errResponse) {
					console.log("Có lỗi xảy ra trong khi xóa công việc.");
					deferred.reject(errResponse);
				}
			);
		return deferred.promise;
	}
	
	function GetUserOfTongCuc (){
		var deferred = $q.defer();
		$http.get(contextPath + "/phancong/getUserOfTongCuc")
			.then(
				function(response) {
					deferred.resolve(response.data);
				},
				function(errResponse) {
					console.log("Có lỗi xảy ra trong khi xóa công việc.");
					deferred.reject(errResponse);
				}
			);
		return deferred.promise;
	}
	
	function ExportData (typeKetXuat, maCv, typeNhapXuat, typeCv){
		var deferred = $q.defer();
		$http.get(contextPath + "/phancong/export?" + "typeKetXuat=" +  typeKetXuat
														+"&maCv=" + maCv + 
														"&typeNhapXuat=" +  typeNhapXuat +
														"&typeCv=" +  typeCv )
		.then(
			function(response) {
				deferred.resolve(response.data);
			},
			function(errResponse) {
				console.log("Có lỗi xảy ra trong khi xóa công việc.");
				deferred.reject(errResponse);
			}
		);
		return deferred.promise;
		
	}
}