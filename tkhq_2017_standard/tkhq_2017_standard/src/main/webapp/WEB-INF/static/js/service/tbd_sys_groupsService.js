/**
 * 
 */
App.factory('Tbs_sysGroupsService', [ '$http', '$q', 'contextPath','$httpParamSerializerJQLike', Tbs_sysGroupsService ]);
function Tbs_sysGroupsService($http, $q, contextPath, $httpParamSerializerJQLike) {
	
	
	var REST_SERVICE_URI_CUCHQ = contextPath+'/bcpt/GetCustom';
	var REST_SERVICE_URI = contextPath + '/tbd_sys_groups/';
	var REST_SERVICE_URI_USER = contextPath + '/tbd_sys_user/';
	console.log(REST_SERVICE_URI);
	var factory ={
			GetGroups:GetGroups,
			crtGroups:crtGroups,
			updGroups:updGroups,
			delGroups:delGroups,
			GetCucHQ : GetCucHQ,
			GetChiCucHQByCuc : GetChiCucHQByCuc,	
			GetDsNguoiDung:GetDsNguoiDung,
			getAllNSD : getAllNSD,
			updUser :updUser ,
			SearchGroup : SearchGroup
	    	  	
	};
	
	return factory;
	function SearchGroup(ten,tendaydu)
	{
		var deferred = $q.defer();
		$http.get(REST_SERVICE_URI + 'Search?groupCode='+ ten +'&groupName='+ tendaydu).then(function(response) {
			deferred.resolve(response.data);
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi lấy thông tin');
			deferred.reject(errResponse);
		});
		
		return deferred.promise;
	}
	function getAllNSD(){
		var deferred = $q.defer();
        $http.get(REST_SERVICE_URI_USER)        
            .then(
            function (response) {            
                deferred.resolve(response.data);   
            },
            function(errResponse){            	
                console.error('Có lỗi xảy ra trong khi lấy thông tin');
                deferred.reject(errResponse);
            }
        );        
        return deferred.promise;
	}
	function GetGroups() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI)        
            .then(
            function (response) {            
                deferred.resolve(response.data);                
            },
            function(errResponse){            	
                console.error('Có lỗi xảy ra trong khi lấy thông tin');
                deferred.reject(errResponse);
            }
        );        
        return deferred.promise;
    }
	function crtGroups(entity) {
		var deferred = $q.defer();
		 $http.post(REST_SERVICE_URI, entity)
         .then(
         function (response) {
             deferred.resolve(response.data);
         },
         function(errResponse){
             console.error('Không thể tạo mới ');
             deferred.reject(errResponse);
         }
     );
     return deferred.promise;	
	
	}

	function updGroups(entity, groupId) {
		var deferred = $q.defer();
		$http.put(REST_SERVICE_URI + groupId, entity).then(
				function(response) {
					
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Không thể sửa thông tin');
					deferred.reject(errResponse);
				});
		return deferred.promise;
	}

	function delGroups(groupId) {		
		var deferred = $q.defer();		
		  $http.delete(REST_SERVICE_URI + groupId) .then( function (response) {
		  deferred.resolve(response.data); }, function(errResponse){
				  console.error('Không thể xóa bản ghi vừa chọn');
				  deferred.reject(errResponse); 
		  } );
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
	function GetDsNguoiDung(maHQ){		
		var deferred = $q.defer();
		$http.post(REST_SERVICE_URI_USER + 'Search?active=1&maHQ='+ maHQ).then(function(response) {
			deferred.resolve(response.data);
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi lấy thông tin');
			deferred.reject(errResponse);
		});
		
		return deferred.promise;
	}
	function updUser(sysUserEntity, username) {
		var deferred = $q.defer();
		$http.put(REST_SERVICE_URI_USER + username, sysUserEntity).then(
				function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Không thể sửa thông tin');
					deferred.reject(errResponse);
				});
		return deferred.promise;
	}
	
}