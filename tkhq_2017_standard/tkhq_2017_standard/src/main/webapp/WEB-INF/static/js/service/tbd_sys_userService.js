/**
 * 
 */
App.factory('Tbs_sysUserService', [ '$http', '$q', 'contextPath',
		'$httpParamSerializerJQLike', Tbs_sysUserService ]);
function Tbs_sysUserService($http, $q, contextPath, $httpParamSerializerJQLike) {

	var REST_SERVICE_URI_CUCHQ = contextPath+'/bcpt/GetCustom';
	var REST_SERVICE_URI_CHICUCHQ = contextPath+'/bcpt/GetSubCustom';
	var REST_SERVICE_URI_NHOMNSD = contextPath + '/tbd_sys_groups/';
	var REST_SERVICE_URI = contextPath + '/tbd_sys_user/';
	var REST_SERVICE_URI_HAIQUAN = contextPath + '/tbs_hqkttxnk/';
	var REST_TEST = contextPath +'tbd_sys_user';
	var factory = {
		GetCucHQ : GetCucHQ,
		GetChiCucHQByCuc : GetChiCucHQByCuc,
		GetDSNguoiDung : GetDSNguoiDung,
		GetNhomNSD : GetNhomNSD,
		crtUser : crtUser,
		updUser : updUser,
		delUser : delUser,
		getUserByActive :getUserByActive,
		GetHaiQuan : GetHaiQuan,
		doimatkhau:doimatkhau,
		Search : Search
	};

	return factory;
	function Search(param){
		var deferred = $q.defer();
		$http({
			headers : {
				'Content-Type' : 'application/json;charset=utf-8'
			},
			method : 'POST',
			url : REST_SERVICE_URI + "searchCondition" ,
			data : param
		}).then(
				function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Không thể sửa thông tin');
					deferred.reject(errResponse);
				});
		return deferred.promise;
	}
	function doimatkhau(username,oldPass,newPass){
		var deferred = $q.defer();
		$http.put(REST_SERVICE_URI +"doimatkhau?username=" + username +"&oldPass=" + oldPass +"&newPass=" + newPass).then(
				function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Không thể sửa thông tin');
					deferred.reject(errResponse);
				});
		return deferred.promise;
	}
	function GetHaiQuan() {
		var deferred = $q.defer();
		$http.get(REST_SERVICE_URI_HAIQUAN).then(function(response) {		
			deferred.resolve(response.data);			
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi lấy thông tin');
			deferred.reject(errResponse);
		});

		return deferred.promise;
	}
	
	function GetDSNguoiDung() {
		var deferred = $q.defer();
		$http.get(REST_SERVICE_URI).then(function(response) {		
			deferred.resolve(response.data);			
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi lấy thông tin');
			deferred.reject(errResponse);
		});

		return deferred.promise;
	}
function getUserByActive(active)
{	
	var deferred = $q.defer();
	$http.post(REST_SERVICE_URI + 'Search?active=' + active +'&maHQ=').then(function(response) {
		deferred.resolve(response.data);
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
		$http.get(
				contextPath+'/bcpt/GetSubCustom?maCucHQ='
						+ maCuc).then(function(response) {
			deferred.resolve(response.data);
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi lấy thông tin');
			deferred.reject(errResponse);
		});
		return deferred.promise;
	}
	function crtUser(sysUserEntity) {		
		var deferred = $q.defer();
		 $http.post(REST_SERVICE_URI, sysUserEntity)
         .then(
         function (response) {
             deferred.resolve(response.data);
             console.log(response.data);
         }
     );
     return deferred.promise;	
	
	}

	function updUser(sysUserEntity, username) {		
		var deferred = $q.defer();
		$http.put(REST_SERVICE_URI + username, sysUserEntity).then(
				function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Không thể sửa thông tin');
					deferred.reject(errResponse);
				});
		return deferred.promise;
	}

	function delUser(username) {		
		var deferred = $q.defer();		
		  $http.delete(REST_SERVICE_URI + username) .then( function (response) {
		  deferred.resolve(response.data); }, function(errResponse){
				  console.error('Không thể xóa bản ghi vừa chọn');
				  deferred.reject(errResponse); 
		  } );
		 return deferred.promise;
	}

	function GetNhomNSD() {
		var deferred = $q.defer();
		$http.get(REST_SERVICE_URI_NHOMNSD).then(function(response) {
			deferred.resolve(response.data);
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi lấy thông tin');
			deferred.reject(errResponse);
		});

		return deferred.promise;

	}
	
}
