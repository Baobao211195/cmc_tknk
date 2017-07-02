/**
 * Created by cmcsoft on 6/9/2017.
 */

App.factory('tbsQtacVantaiHangnhapNnService',['$http','$q', 'contextPath' , tbsQtacVantaiHangnhapNnService]);

function tbsQtacVantaiHangnhapNnService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacVantaiHangnhapNn : GetListtbsQtacVantaiHangnhapNn,
        GettbsQtacVantaiHangnhapNnById : GettbsQtacVantaiHangnhapNnById,
        DoAddtbsQtacVantaiHangnhapNn   : DoAddtbsQtacVantaiHangnhapNn,
        DoDeletetbsQtacVantaiHangnhapNn: DoDeletetbsQtacVantaiHangnhapNn,
        DoUpdatetbsQtacVantaiHangnhapNn: DoUpdatetbsQtacVantaiHangnhapNn,
        SearchtbsQtacVantaiHangnhapNn  : SearchtbsQtacVantaiHangnhapNn
    };

    return factory;

    function SearchtbsQtacVantaiHangnhapNn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacVantaiHangnhapNn", data)
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

    function GetListtbsQtacVantaiHangnhapNn() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacVantaiHangnhapNn")
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
    function DoAddtbsQtacVantaiHangnhapNn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacVantaiHangnhapNn", data)
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

    function DoDeletetbsQtacVantaiHangnhapNn(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacVantaiHangnhapNn?" + "id="+ id)
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
    function DoUpdatetbsQtacVantaiHangnhapNn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacVantaiHangnhapNn", data)
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

    function GettbsQtacVantaiHangnhapNnById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacVantaiHangnhapNnById?" + "id="+ id)
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
