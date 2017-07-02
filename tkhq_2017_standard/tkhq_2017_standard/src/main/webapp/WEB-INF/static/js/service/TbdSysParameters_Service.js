/**
 * 
 */
App.factory('TbdSysParameterService', [ '$http', '$q', 'contextPath',
		'$httpParamSerializerJQLike', TbdSysParameterService ]);
function TbdSysParameterService($http, $q, contextPath, $httpParamSerializerJQLike) {
	
	var REST_SERVICE_URI =contextPath +"/tbd_sys_parameters/"
	
	var factory = {
			getAllParameters:getAllParameters,
			deleteParameters:deleteParameters,
			updateParameters :updateParameters,
			insertParameters :insertParameters,
			Search :Search
	}
	return factory;

	function getAllParameters()
	{
		var deferred = $q.defer();
		$http.get(REST_SERVICE_URI).then(function(response) {		
			deferred.resolve(response.data);			
		}, function(errResponse) {
			console.error('Có lỗi xảy ra trong khi lấy thông tin');
			deferred.reject(errResponse);
		});

		return deferred.promise;
	}
	function deleteParameters(ma)
	{
		var deferred = $q.defer();
		 $http.delete(REST_SERVICE_URI + ma) .then( function (response) {
			  deferred.resolve(response.data); }, function(errResponse){
					  console.error('Không thể xóa bản ghi vừa chọn');
					  deferred.reject(errResponse); 
			  } );
			 return deferred.promise;
	}
	function updateParameters(entity) {		
		console.log(entity);
		var deferred = $q.defer();
		$http.put(REST_SERVICE_URI ,  entity).then(
				function(response) {
					deferred.resolve(response.data);
				}, function(errResponse) {
					console.error('Không thể sửa thông tin');
					deferred.reject(errResponse);
				});
		return deferred.promise;
	}
	function insertParameters(entity) {		
		var deferred = $q.defer();
		 $http.post(REST_SERVICE_URI, entity)
         .then(
         function (response) {
             deferred.resolve(response.data);
             console.log(response.data);
         }
     );
     return deferred.promise;	
	
	}
	function Search(param){
		var deferred = $q.defer();
		$http({
			headers : {
				'Content-Type' : 'application/json;charset=utf-8'
			},
			method : 'POST',
			url : REST_SERVICE_URI + "Search/" ,
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
}