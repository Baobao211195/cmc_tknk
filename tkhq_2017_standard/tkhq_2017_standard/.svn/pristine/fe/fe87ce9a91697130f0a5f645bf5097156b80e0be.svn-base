/**
 * Created by cmcsoft on 6/9/2017.
 */

App.factory('tbsQtacVantaiHangxuatVnService',['$http','$q', 'contextPath' , tbsQtacVantaiHangxuatVnService]);

function tbsQtacVantaiHangxuatVnService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacVantaiHangxuatVn : GetListtbsQtacVantaiHangxuatVn,
        GettbsQtacVantaiHangxuatVnById : GettbsQtacVantaiHangxuatVnById,
        DoAddtbsQtacVantaiHangxuatVn   : DoAddtbsQtacVantaiHangxuatVn,
        DoDeletetbsQtacVantaiHangxuatVn: DoDeletetbsQtacVantaiHangxuatVn,
        DoUpdatetbsQtacVantaiHangxuatVn: DoUpdatetbsQtacVantaiHangxuatVn,
        SearchtbsQtacVantaiHangxuatVn  : SearchtbsQtacVantaiHangxuatVn
    };

    return factory;

    function SearchtbsQtacVantaiHangxuatVn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacVantaiHangxuatVn", data)
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

    function GetListtbsQtacVantaiHangxuatVn() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacVantaiHangxuatVn")
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
    function DoAddtbsQtacVantaiHangxuatVn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacVantaiHangxuatVn", data)
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

    function DoDeletetbsQtacVantaiHangxuatVn(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacVantaiHangxuatVn?" + "id="+ id)
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
    function DoUpdatetbsQtacVantaiHangxuatVn(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacVantaiHangxuatVn", data)
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

    function GettbsQtacVantaiHangxuatVnById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacVantaiHangxuatVnById?" + "id="+ id)
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
