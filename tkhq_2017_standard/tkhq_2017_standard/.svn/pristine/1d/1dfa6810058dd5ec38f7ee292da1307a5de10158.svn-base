/**
 * Created by cmcsoft on 6/2/2017.
 */

App.factory('tbsQtacTrigiaNhapkhauService',['$http','$q', 'contextPath' , tbsQtacTrigiaNhapkhauService]);

function tbsQtacTrigiaNhapkhauService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacTrigiaNhapkhau : GetListtbsQtacTrigiaNhapkhau,
        GettbsQtacTrigiaNhapkhauById : GettbsQtacTrigiaNhapkhauById,
        DoAddtbsQtacTrigiaNhapkhau   : DoAddtbsQtacTrigiaNhapkhau,
        DoDeletetbsQtacTrigiaNhapkhau: DoDeletetbsQtacTrigiaNhapkhau,
        DoUpdatetbsQtacTrigiaNhapkhau: DoUpdatetbsQtacTrigiaNhapkhau,
        SearchtbsQtacTrigiaNhapkhau  : SearchtbsQtacTrigiaNhapkhau
    };

    return factory;

    function SearchtbsQtacTrigiaNhapkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacTrigiaNhapkhau", data)
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

    function GetListtbsQtacTrigiaNhapkhau() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacTrigiaNhapkhau")
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
    function DoAddtbsQtacTrigiaNhapkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacTrigiaNhapkhau", data)
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

    function DoDeletetbsQtacTrigiaNhapkhau(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacTrigiaNhapkhau?" + "id="+ id)
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
    function DoUpdatetbsQtacTrigiaNhapkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacTrigiaNhapkhau", data)
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

    function GettbsQtacTrigiaNhapkhauById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacTrigiaNhapkhauById?" + "id="+ id)
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
