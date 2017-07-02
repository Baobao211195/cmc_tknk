/**
 * Created by cmcsoft on 6/9/2017.
 */

App.factory('tbsQtacVantaiHangxuatNnService',['$http','$q', 'contextPath' , tbsQtacVantaiHangxuatNnService]);

function tbsQtacVantaiHangxuatNnService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacVantaiHangxuatNn : GetListtbsQtacVantaiHangxuatNn,
        GettbsQtacVantaiHangxuatNnById : GettbsQtacVantaiHangxuatNnById,
        DoAddtbsQtacVantaiHangxuatNn   : DoAddtbsQtacVantaiHangxuatNn,
        DoDeletetbsQtacVantaiHangxuatNn: DoDeletetbsQtacVantaiHangxuatNn,
        DoUpdatetbsQtacVantaiHangxuatNn: DoUpdatetbsQtacVantaiHangxuatNn,
        SearchtbsQtacVantaiHangxuatNn  : SearchtbsQtacVantaiHangxuatNn
    };

    return factory;

    function SearchtbsQtacVantaiHangxuatNn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacVantaiHangxuatNn", data)
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

    function GetListtbsQtacVantaiHangxuatNn() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacVantaiHangxuatNn")
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
    function DoAddtbsQtacVantaiHangxuatNn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacVantaiHangxuatNn", data)
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

    function DoDeletetbsQtacVantaiHangxuatNn(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacVantaiHangxuatNn?" + "id="+ id)
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
    function DoUpdatetbsQtacVantaiHangxuatNn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacVantaiHangxuatNn", data)
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

    function GettbsQtacVantaiHangxuatNnById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacVantaiHangxuatNnById?" + "id="+ id)
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
