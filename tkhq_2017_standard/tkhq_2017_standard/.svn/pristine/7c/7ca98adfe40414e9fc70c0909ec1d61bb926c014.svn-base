/**
 * Created by cmcsoft on 6/2/2017.
 */

App.factory('tbsQtacLuongNhapkhauService',['$http','$q', 'contextPath' , tbsQtacLuongNhapkhauService]);

function tbsQtacLuongNhapkhauService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacLuongNhapkhau: GetListtbsQtacLuongNhapkhau,
        GettbsQtacLuongNhapkhauById: GettbsQtacLuongNhapkhauById,
        DoAddtbsQtacLuongNhapkhau: DoAddtbsQtacLuongNhapkhau,
        DoDeletetbsQtacLuongNhapkhau: DoDeletetbsQtacLuongNhapkhau,
        DoUpdatetbsQtacLuongNhapkhau: DoUpdatetbsQtacLuongNhapkhau,
        SearchtbsQtacLuongNhapkhau  : SearchtbsQtacLuongNhapkhau
    };

    return factory;

    function SearchtbsQtacLuongNhapkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacLuongNhapkhau", data)
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

    function GetListtbsQtacLuongNhapkhau() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacLuongNhapkhau")
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
    function DoAddtbsQtacLuongNhapkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacLuongNhapkhau", data)
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

    function DoDeletetbsQtacLuongNhapkhau(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacLuongNhapkhau?" + "id="+ id)
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
    function DoUpdatetbsQtacLuongNhapkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacLuongNhapkhau", data)
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

    function GettbsQtacLuongNhapkhauById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacLuongNhapkhauById?" + "id="+ id)
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
