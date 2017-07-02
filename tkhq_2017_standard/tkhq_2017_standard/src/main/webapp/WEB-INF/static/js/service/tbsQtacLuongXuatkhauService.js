/**
 * Created by cmcsoft on 6/2/2017.
 */

App.factory('tbsQtacLuongXuatkhauService',['$http','$q', 'contextPath' , tbsQtacLuongXuatkhauService]);

function tbsQtacLuongXuatkhauService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacLuongXuatkhau: GetListtbsQtacLuongXuatkhau,
        GettbsQtacLuongXuatkhauById: GettbsQtacLuongXuatkhauById,
        DoAddtbsQtacLuongXuatkhau: DoAddtbsQtacLuongXuatkhau,
        DoDeletetbsQtacLuongXuatkhau: DoDeletetbsQtacLuongXuatkhau,
        DoUpdatetbsQtacLuongXuatkhau: DoUpdatetbsQtacLuongXuatkhau,
        SearchtbsQtacLuongXuatkhau  : SearchtbsQtacLuongXuatkhau
    };

    return factory;

    function SearchtbsQtacLuongXuatkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacLuongXuatkhau", data)
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

    function GetListtbsQtacLuongXuatkhau() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacLuongXuatkhau")
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
    function DoAddtbsQtacLuongXuatkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacLuongXuatkhau", data)
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

    function DoDeletetbsQtacLuongXuatkhau(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacLuongXuatkhau?" + "id="+ id)
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
    function DoUpdatetbsQtacLuongXuatkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacLuongXuatkhau", data)
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

    function GettbsQtacLuongXuatkhauById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacLuongXuatkhauById?" + "id="+ id)
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

}
