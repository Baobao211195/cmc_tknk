
App.factory('ThayDoiDoNVHQService', ['$http', '$q', 'contextPath', '$httpParamSerializerJQLike', ThayDoiDoNVHQService]);
function ThayDoiDoNVHQService($http, $q, contextPath, $httpParamSerializerJQLike){

    var REST_SERVICE_URI = contextPath + '/tbs_mahs_dkgh/';
    var ROOT_API = contextPath+'/bcpt';
    
    var semaphore = false;

    var factory = {
    	GetCucHQ:GetCucHQ,
    	GetChiCucHQByCuc: GetChiCucHQByCuc,
    	GetlstNghiepVuHQ: GetlstNghiepVuHQ,
    	GetDLTongThe:GetDLTongThe,
    	GetDLBoSungTK:GetDLBoSungTK,
    	GetDLHuyXoa:GetDLHuyXoa,
    	GetDLSuaDoiBoSung:GetDLSuaDoiBoSung
    };

    return factory;

    function GetCucHQ() {
        var deferred = $q.defer();
        $http.get(contextPath+'/bcpt/GetCustom')
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi get HQ');
                deferred.reject(errResponse);
            }
        );
        
        return deferred.promise;
    }

    function GetChiCucHQByCuc(maCuc) {
        var deferred = $q.defer();
        $http.get(contextPath+'/bcpt/GetSubCustom?maCucHQ='+ maCuc)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Lỗi trong quá trình get chi cục HQ');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    
    function GetlstNghiepVuHQ() {
        var deferred = $q.defer();
        $http.get(contextPath+'/bcpt/GetMajor')
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Lỗi get lst nghiệp vụ');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    
    function GetDLTongThe(maCucHQ, maChicucHQ, nhx,loai_ky, tu_ngay, den_ngay, ky, thang, nam) {
        var deferred = $q.defer();
        var api = ROOT_API+'/ThayDoiDoNVHQ/TongThe?maCucHQ=' + maCucHQ + '&maChicucHQ=' + maChicucHQ
		+ '&nhx=' + nhx + '&loai_ky=' + loai_ky + '&tu_ngay=' + tu_ngay + '&den_ngay=' + den_ngay 
		+ '&ky=' + ky + '&thang=' + thang + '&nam=' + nam;
        /*api = ROOT_API+'/ThayDoiDoNVHQ/TongThe';*/
        console.log('*******************************api:'+api);
        $http.get(api)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Lỗi GetKXTongThe');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    function GetDLBoSungTK(maCucHQ, maChicucHQ, nhx, maNghiepvu,loai_ky, tu_ngay, den_ngay, ky, thang, nam) {
        var deferred = $q.defer();
        var api = ROOT_API + '/ThayDoiDoNVHQ/BSToKhai?maCucHQ=' + maCucHQ + '&maChicucHQ=' + maChicucHQ
		+ '&nhx=' + nhx + '&maNghiepvu=' + maNghiepvu + '&loai_ky=' + loai_ky + '&tu_ngay=' + tu_ngay + '&den_ngay=' + den_ngay 
		+ '&ky=' + ky + '&thang=' + thang + '&nam=' + nam;
        $http.get(api)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Lỗi GetKXBoSungTK');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    function GetDLHuyXoa(maCucHQ, maChicucHQ, nhx, maNghiepvu,loai_ky, tu_ngay, den_ngay, ky, thang, nam) {
        var deferred = $q.defer();
        var api = ROOT_API + '/ThayDoiDoNVHQ/HuyXoa?maCucHQ=' + maCucHQ + '&maChicucHQ=' + maChicucHQ
		+ '&nhx=' + nhx + '&maNghiepvu=' + maNghiepvu +
		'&loai_ky=' + loai_ky + '&tu_ngay=' + tu_ngay + '&den_ngay=' + den_ngay 
		+ '&ky=' + ky + '&thang=' + thang + '&nam=' + nam;
        $http.get(api)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Lỗi GetKXHuyXoa');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }    
    function GetDLSuaDoiBoSung(maCucHQ, maChicucHQ, nhx, maNghiepvu,loai_ky, tu_ngay, den_ngay, ky, thang, nam) {
        var deferred = $q.defer();
        var api = ROOT_API+ '/ThayDoiDoNVHQ/SDBS?maCucHQ=' + maCucHQ + '&maChicucHQ=' + maChicucHQ
		+ '&nhx=' + nhx + '&maNghiepvu=' + maNghiepvu +
		'&loai_ky=' + loai_ky + '&tu_ngay=' + tu_ngay + '&den_ngay=' + den_ngay 
		+ '&ky=' + ky + '&thang=' + thang + '&nam=' + nam;
        $http.get(api)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Lỗi GetDLSuaDoiBoSung');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
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
