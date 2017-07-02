/**
 * Service of model TBS_BIEUTHUE
 * 
 */

'use strict';

App.factory('TbsDvtVnaccsService',['$http','$q','contextPath', '$httpParamSerializerJQLike', TbsDvtVnaccsService]);
function TbsDvtVnaccsService($http, $q, contextPath, $httpParamSerializerJQLike){

	var REST_SERVICE_URI = contextPath + '/tbsdvtvnaccs/';
	var semaphore = false;

	var factory = {
//		fetchAllBieuThues : fetchAllBieuThues,
			crtDvtVnaccs: crtDvtVnaccs,
			updDvtVnaccs: updDvtVnaccs,
			delDvtVnaccs: delDvtVnaccs,
			searchDvtVnaccs: searchDvtVnaccs
	};

	return factory;

//	function fetchAllBieuThues() {
//		var deferred = $q.defer();
//		$http.get(REST_SERVICE_URI).then(
//			function(response) {
//				deferred.resolve(response.data);
//			},
//			function(errResponse) {
//				console.error('Có lỗi xảy ra trong khi lấy thông tin biểu thuế');
//				deferred.reject(errResponse);
//			});
//
//		return deferred.promise;
//	}
	
	function crtDvtVnaccs(dvtVnaccsEntity) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI, dvtVnaccsEntity)
            .then(
            function (response) {
//                deferred.resolve(response.data);
            	deferred.resolve(response.status);
                console.log("response.data:",response.data);
                console.log("response.status:",response.status);
            },
            function(errResponse){
                console.error('Không thể tạo mới đơn vị tính VNACCS');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
	
	function updDvtVnaccs(dvtVnaccsEntity, maDvt) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI + maDvt, dvtVnaccsEntity)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Không thể sửa đơn vị tính VNACCS');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
	
	function delDvtVnaccs(selectedList) {
    	console.log("Json: " + JSON.stringify(selectedList));
        var deferred = $q.defer();
        $http.delete(REST_SERVICE_URI, {params: {lstDvtVnaccs: JSON.stringify(selectedList)}})
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Không thể xóa bản ghi vừa chọn');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    
    function searchDvtVnaccs(formData){						    	
    	console.log('TbsDvtVnaccsService@searchDvtVnaccs START formData:',formData);
    	var deferred = $q.defer();
    	$http({
    		headers: {'Content-Type': 'application/json;charset=utf-8'},
    		method: 'POST',
    		url: REST_SERVICE_URI + 'search',
    		data: formData
    	})
//		.success(function(data, status) {
//			console.log('Return data: ' + data + "|" + status);
//			deferred.resolve(data);
//		})
//		.error(function(data, status) {
//			console.error('Return data: ' + data + "|" + status);
//			deferred.reject(data);
//		}
    	.then(function(response) {
			console.log('Return data & status: ' + response.data + " " + response.status);
			deferred.resolve(response.data);
			},
			function(errorResponse) {
				console.error('Return data & status: ' + errorResponse.data + " " + errorResponse.status);
				deferred.reject(errorResponse.status);
			}
		);
    	return deferred.promise;
    }

}

angular.module('myApp').service('modalService',
		[ '$uibModal', function($uibModal) {

			var modalDefaults = {
				backdrop : true,
				keyboard : true,
				modalFade : true,
				animation : true,
				templateUrl : 'dvtVnaccsEdit',
				controller : 'TbsDvtVnacccsController',
				controllerAs : 'self'
			};

			this.showModal = function(grid, row) {
				// Create temp objects to work with since we're in a singleton
				// service
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
				// var tempModalOptions = {};

				// Map angular-ui modal custom defaults to modal defaults
				// defined in service
				angular.extend(tempModalDefaults, modalDefaults);

				return $uibModal.open(tempModalDefaults).result;
			};

		} ]);
