
App.factory('TBSMahsDkghService', ['$http', '$q', 'contextPath', '$httpParamSerializerJQLike', TBSMahsDkghService]);
function TBSMahsDkghService($http, $q, contextPath, $httpParamSerializerJQLike){

    var REST_SERVICE_URI = contextPath + '/tbs_mahs_dkgh/';    
    
    var semaphore = false;

    var factory = {
    	GetAllTBSMahsDkgh: GetAllTBSMahsDkgh,
    	createTylePhiVanTai: createTylePhiVanTai,
    	updateTylePhiVanTai: updateTylePhiVanTai,
//        delBieuThue: delBieuThue,
//        searchBieuThue: searchBieuThue
    };

    return factory;

    function GetAllTBSMahsDkgh() {
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

    function createTylePhiVanTai(bieuthueEntity) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI, bieuthueEntity)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Không thể tạo mới biểu thuế');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    function updateTylePhiVanTai(bieuthueEntity, id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI + id, bieuthueEntity)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Không thể sửa biểu thuế');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
//
//    function delBieuThue(selectedList) {
//    	console.log("Json: " + JSON.stringify(selectedList));
//        var deferred = $q.defer();
//        $http.delete(REST_SERVICE_URI, {params: {lstBieuThue: JSON.stringify(selectedList)}})
//            .then(
//            function (response) {
//                deferred.resolve(response.data);
//            },
//            function(errResponse){
//                console.error('Không thể xóa bản ghi vừa chọn');
//                deferred.reject(errResponse);
//            }
//        );
//        return deferred.promise;
//    }
//    
//    function searchBieuThue(formData){
//    	var deferred = $q.defer();
//    	$http({
//    		headers: {'Content-Type': 'application/json;charset=utf-8'},
//    		method: 'POST',
//    		url: REST_SERVICE_URI + 'search',
//    		data: formData
//    	})
//		.success(function(data, status) {
//			console.log('Return data: ' + data);
//			deferred.resolve(data);
//		})
//		.error(function(data, status) {
//			console.error('Return data: ' + data);
//			deferred.reject(data);
//		});
//    	return deferred.promise;
//    }

}

angular.module('myApp').service('modalService', ['$uibModal',
    function ($uibModal) {

    	var modalDefaults = {
    			backdrop: true,
    			keyboard: true,
    			modalFade: true,
    			animation: true,
    			templateUrl: 'bieuThueEdit',
    			controller: 'TBSMahsDkghController',
    			controllerAs: 'self'
    	};
      
//      var modalOptions = {
//              closeButtonText: 'Close',
//              actionButtonText: 'OK',
//              headerText: 'Proceed?',
//              bodyText: 'Perform this action?'
//      };

    	this.showModal = function (grid, row) {
          //Create temp objects to work with since we're in a singleton service
    		var tempModalDefaults = {
    				resolve : {
    					grid : function() {
    						return grid;
    					},
    					row : function() {
    						return row;
    					}
    				}
    		};
          //var tempModalOptions = {};

          //Map angular-ui modal custom defaults to modal defaults defined in service
    		angular.extend(tempModalDefaults, modalDefaults);

          //Map modal.html $scope custom properties to defaults defined in service
          //angular.extend(tempModalOptions, modalOptions);

//          if (!tempModalDefaults.controller) {
//              tempModalDefaults.controller = function ($scope, $modalInstance) {
//                  $scope.modalOptions = tempModalOptions;
//                  $scope.modalOptions.ok = function (result) {
//                      $modalInstance.close(result);
//                  };
//                  $scope.modalOptions.close = function (result) {
//                      $modalInstance.dismiss('cancel');
//                  };
//              }
//          }

    		return $uibModal.open(tempModalDefaults).result;
    };

}]);
