/**
 * Created by cmcsoft on 6/9/2017.
 */

App.factory('tbsQtacVantaiHangnhapVnService',['$http','$q', 'contextPath' , tbsQtacVantaiHangnhapVnService]);

function tbsQtacVantaiHangnhapVnService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacVantaiHangnhapVn : GetListtbsQtacVantaiHangnhapVn,
        GettbsQtacVantaiHangnhapVnById : GettbsQtacVantaiHangnhapVnById,
        DoAddtbsQtacVantaiHangnhapVn   : DoAddtbsQtacVantaiHangnhapVn,
        DoDeletetbsQtacVantaiHangnhapVn: DoDeletetbsQtacVantaiHangnhapVn,
        DoUpdatetbsQtacVantaiHangnhapVn: DoUpdatetbsQtacVantaiHangnhapVn,
        SearchtbsQtacVantaiHangnhapVn  : SearchtbsQtacVantaiHangnhapVn
    };

    return factory;

    function SearchtbsQtacVantaiHangnhapVn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacVantaiHangnhapVn", data)
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

    function GetListtbsQtacVantaiHangnhapVn() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacVantaiHangnhapVn")
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
    function DoAddtbsQtacVantaiHangnhapVn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacVantaiHangnhapVn", data)
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

    function DoDeletetbsQtacVantaiHangnhapVn(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacVantaiHangnhapVn?" + "id="+ id)
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
    function DoUpdatetbsQtacVantaiHangnhapVn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacVantaiHangnhapVn", data)
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

    function GettbsQtacVantaiHangnhapVnById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacVantaiHangnhapVnById?" + "id="+ id)
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
