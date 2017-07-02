/**
 * Service of  upload file phi cấu trúc.
 * 
 */

'use strict';
App.factory('nhapMoiFileService',['$http','$q', 'contextPath', nhapMoiFileService]);

function nhapMoiFileService($http, $q, contextPath) {

	
	var contextPath = contextPath;
	
	var factory = {
		getListNhapMoiFiles: getListNhapMoiFiles,
		insertThongTinNhapMoi : insertThongTinNhapMoi
	};
	
	return factory;

	function getListNhapMoiFiles(chuDe, typeNhapXuat) {
		var deferred = $q.defer();
		console.log("Hien thi file" + chuDe + "va" + typeNhapXuat);
		
		$http.get(contextPath + "/hienThiNhapMoiFile?" + "chuDe="+ chuDe +"&typeNhapXuat=" + typeNhapXuat)
			.then(
				function(response) {
					deferred.resolve(response.data)
				},
				function (errResponse) {
					deferred.reject(errResponse);
					console.log("Có lỗi xảy ra trong khi lấy thông tin");
				}
			);
		return deferred.promise;
	}
	
	 function insertThongTinNhapMoi(thongTinEntity) {
		console.log(thongTinEntity);
		var deferred = $q.defer();
		$http.post(contextPath + '/insertThongTinNhapMoi', thongTinEntity)
		    .then(
		        function(response) {
		            deferred.resolve(response.data)	
		        },
		        function(errResponse) {
		            console.log("Có lỗi xảy ra trong khi hoàn thành rà xoát ");
		                deferred.resolve(errResponse.data)	
		            }
		        );
		     return deferred.promise;   
		}  
	
}