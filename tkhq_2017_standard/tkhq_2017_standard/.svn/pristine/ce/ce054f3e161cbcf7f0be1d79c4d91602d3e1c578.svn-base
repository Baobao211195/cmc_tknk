/**
 * Service of  upload file phi cấu trúc.
 * 
 */

'use strict';
App.factory('displayFilePhiCauTrucService',['$http','$q', 'contextPath' , displayFilePhiCauTrucService]);

function displayFilePhiCauTrucService($http, $q, contextPath) {	
	
	var factory = {
		GetListFilePhiCauTruc: GetListFilePhiCauTruc,
		DoDownloadFile : DoDownloadFile,
		DoDeleteFile : DoDeleteFile,
		DoUploadFile : DoUploadFile,
	};
	
	return factory;

	function GetListFilePhiCauTruc(chuDe, typeNhapXuat) {
		var deferred = $q.defer();
		console.log("Hien thi file" + chuDe + "va" + typeNhapXuat);
		
		$http.get(contextPath + "/hienThiFile?" + "chuDe="+ chuDe +"&typeNhapXuat=" + typeNhapXuat)
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

	function DoDownloadFile(fileId) {
		var deferred = $q.defer();
		console.log("Hien thi file :" + fileId);
		// do  dowload
		$http.get(contextPath + "/downLoadFile/?" + "fileId="+ fileId)
			.then(
				function(response) {
					deferred.resolve(response.data)
				},
				function (errResponse) {
					deferred.reject(errResponse);
					console.log("Có lỗi xảy ra trong khi dowload thông tin");
				}
			);
		return deferred.promise;
		
	}

	function DoDeleteFile(fileId) {
		var deferred = $q.defer();
		console.log("Xoa thi file :" + fileId);
		$http.get(contextPath + "/delete?" + "fileId="+ fileId)
			.then(
				function(response)   {
					deferred.resolve(response.data)
				},
				function (errResponse) {
					deferred.reject(errResponse);
					console.log("Có lỗi xảy ra trong khi dowload thông tin");
				} 
			);
		return deferred.promise;
	}

	function DoUploadFile(fileUpload, fileObj, mota) {
		var deferred = $q.defer();
		var formData = new FormData();
		formData.append('fileUpLoad', fileUpload);
		formData.append('fileObject', angular.toJson(fileObj, true))
		formData.append('mota', mota.toString());
		var url = contextPath + "/uploadFile",formData;
		$http.post(url, formData,
					{
						transformRequest : angular.identity,
						headers : {
							'Content-Type': undefined,
						}
					}
			)
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