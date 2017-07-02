/**
 * Created by cmcsoft on 6/2/2017.
 */

App.factory('tbsQtacQuocgiaNghingoNkService',['$http','$q', 'contextPath' , tbsQtacQuocgiaNghingoNkService]);

function tbsQtacQuocgiaNghingoNkService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacQuocgiaNghingoNk : GetListtbsQtacQuocgiaNghingoNk,
        GettbsQtacQuocgiaNghingoNkById : GettbsQtacQuocgiaNghingoNkById,
        DoAddtbsQtacQuocgiaNghingoNk   : DoAddtbsQtacQuocgiaNghingoNk,
        DoDeletetbsQtacQuocgiaNghingoNk: DoDeletetbsQtacQuocgiaNghingoNk,
        DoUpdatetbsQtacQuocgiaNghingoNk: DoUpdatetbsQtacQuocgiaNghingoNk,
        SearchtbsQtacQuocgiaNghingoNk  : SearchtbsQtacQuocgiaNghingoNk
    };

    return factory;

    function SearchtbsQtacQuocgiaNghingoNk(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacQuocgiaNghingoNk", data)
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

    function GetListtbsQtacQuocgiaNghingoNk() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacQuocgiaNghingoNk")
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
    function DoAddtbsQtacQuocgiaNghingoNk(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacQuocgiaNghingoNk", data)
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

    function DoDeletetbsQtacQuocgiaNghingoNk(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacQuocgiaNghingoNk?" + "id="+ id)
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
    function DoUpdatetbsQtacQuocgiaNghingoNk(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacQuocgiaNghingoNk", data)
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

    function GettbsQtacQuocgiaNghingoNkById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacQuocgiaNghingoNkById?" + "id="+ id)
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
