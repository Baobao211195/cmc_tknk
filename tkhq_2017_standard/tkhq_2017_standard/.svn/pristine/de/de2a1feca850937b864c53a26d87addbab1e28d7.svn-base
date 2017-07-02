App.factory('HTCBTGTXNKService', [ '$http', '$q', function($http, $q) {

	return {
		getData: function (trangthai, nhx) {
			var deferred = $q.defer();
            $http.get(contextPath+"/bcpt/SoLieuTheoChiTieuThongKe03?trangthai=" + trangthai +"&nhx="+ nhx)
            .then(
                    function (response) {
                        deferred.resolve(response.data);
                    },
                    function(errResponse){
                        console.error('Có lỗi xảy ra');
                        deferred.reject(errResponse);
                    }
                );
                
                return deferred.promise;
            }

	}
} ]);