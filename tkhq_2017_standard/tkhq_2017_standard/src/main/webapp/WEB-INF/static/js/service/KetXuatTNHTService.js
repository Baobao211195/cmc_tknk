/**
 * Service of model TBD_KetXuatTNHT
 * 
 */

'use strict';
App.factory('ketXuatTNHTService',['$http','$q', 'contextPath', ketXuatTNHTService]);

function ketXuatTNHTService($http, $q, contextPath) {

	
	var factory = {
		GetListKetXuatTNHT: GetListKetXuatTNHT,
		UpdateKetXuatTNHT : UpdateKetXuatTNHT,
		ExportKetXuatNTHT : ExportKetXuatNTHT,
		GetHqByUserLogin : GetHqByUserLogin,
	};

	return factory;
	
	function GetHqByUserLogin(userName) {
		var deferred = $q.defer();
		
		$http.get(contextPath + "/getHqbyUsername?" + "userName="+ userName)
			.then(
				function(response) {
					deferred.resolve(response.data)
				},
				function (errResponse) {
					console.log("Có lỗi xảy ra trong khi lấy thông tin");
					deferred.reject(errResponse);
				}
		);
		return deferred.promise;

	}
	

	function GetListKetXuatTNHT(userName, tuNgay, denNgay) {
		var deferred = $q.defer();
		console.log("Lọc dữ liệu từ ngày:" + tuNgay + "đến ngày " + denNgay);
		
		console.log(contextPath + "/kxTnHT?" + "tuNgay="+ tuNgay +"&denNgay=" + denNgay);
		$http.get(contextPath + "/kxTnHT?" + "userName="+ userName +"&tuNgay=" + tuNgay + "&denNgay=" + denNgay)
			.then(
				function(response) {
					deferred.resolve(response.data)
				},
				function (errResponse) {
					console.log("Có lỗi xảy ra trong khi lấy thông tin");
					deferred.reject(errResponse);
				}
		);
		return deferred.promise;

	}

	function UpdateKetXuatTNHT(ketXuatId, loaiHangHoaKx, trangThaiPheDuyet) {
		var deferred = $q.defer();
		console.log("Cập nhật trạng thái ph duyệt: " + ketXuatId + "với " + trangThaiPheDuyet);
		$http.post(contextPath + "/kxTnHT?" + "ketXuatId="+ ketXuatId +"&loaiHangHoaKx=" + loaiHangHoaKx + "&trangThaiPheDuyet="+ trangThaiPheDuyet)
			.then(
				function (response){
					deferred.resolve(response.data)	
				},
				function(errResponse){
					console.log("Có lỗi xảy ra trong khi cập nhật trạng thái phê duyệt");
					deferred.reject(errResponse);
				}
		);
		return deferred.promise;
	}

	function ExportKetXuatNTHT(userName, tuNgay, denNgay, typeKetXuat) {
		var deferred = $q.defer();
		console.log("Kết xuất thông tin ra file.");

		$http.get(contextPath + "/kxTnHT/printKetXuatTNHT?" +"userName=" + userName  + "&tuNgay="+ tuNgay +"&denNgay=" + denNgay + "&typeKetXuat="+ typeKetXuat)
			.then (
				function (response) {
					deferred.resolve(response.data);
				},
				function (errResponse) {
					console.log("Có lỗi xảy ra trong khi kết xuất thông tin ra file.");
					deferred.reject(errResponse);	
				}
		);
		return deferred.promise;
	}
}