/**
 * 
 */
App.factory('Phanquyen_Service', [ '$http', '$q', 'contextPath','$httpParamSerializerJQLike', Phanquyen_Service ]);
function Phanquyen_Service($http, $q, contextPath, $httpParamSerializerJQLike) {
	var REST_SERVICE_URI = contextPath + '/tbd_sys_groups/';
	var REST_SERVICE_ROLE_GROUP=contextPath + '/getAllRoleByGroup/';
	var REST_SERVICE_ROLE_USER=contextPath + '/getAllRoleByUser/';
	var REST_SERVICE_URI_USER = contextPath + '/tbd_sys_user/';
	var REST_SERVICE_ALLROLE= contextPath + '/getAllFunctions/';
	var REST_SERVICE_UPDATEROLE= contextPath + '/updateRole/';;
	var factory ={
			GetGroups:GetGroups,
			getAllNSD : getAllNSD,
			getRoleByOject: getRoleByOject,
			getAllRole : getAllRole,
			updateRole:updateRole
	};
	return factory;
	function updateRole(type,lstPermistion)
	{
		var deferred = $q.defer();
        $http.put(REST_SERVICE_UPDATEROLE + type,lstPermistion).then(
				function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Không thể cập nhập thông tin');
					deferred.reject(errResponse);
				});
		return deferred.promise;
	}
	function getAllRole (){
		var deferred = $q.defer();
        $http.get(REST_SERVICE_ALLROLE)        
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
	function getRoleByOject(type,Id){
		var URL_ROLE_BY_OBJECT ="";
		if(type === 0)
			{
			URL_ROLE_BY_OBJECT =REST_SERVICE_ROLE_GROUP;
			}
		if(type === 1)
		{
			URL_ROLE_BY_OBJECT =REST_SERVICE_ROLE_USER;
		}
		var deferred = $q.defer();
        $http.get(URL_ROLE_BY_OBJECT + Id)        
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
}