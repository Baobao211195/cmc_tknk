/**
 * Created by cmcsoft on 6/2/2017.
 */

App.factory('tbsQtacQuocgiaNghingoXkService',['$http','$q', 'contextPath' , tbsQtacQuocgiaNghingoXkService]);

function tbsQtacQuocgiaNghingoXkService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacQuocgiaNghingoXk : GetListtbsQtacQuocgiaNghingoXk,
        GettbsQtacQuocgiaNghingoXkById : GettbsQtacQuocgiaNghingoXkById,
        DoAddtbsQtacQuocgiaNghingoXk   : DoAddtbsQtacQuocgiaNghingoXk,
        DoDeletetbsQtacQuocgiaNghingoXk: DoDeletetbsQtacQuocgiaNghingoXk,
        DoUpdatetbsQtacQuocgiaNghingoXk: DoUpdatetbsQtacQuocgiaNghingoXk,
        SearchtbsQtacQuocgiaNghingoXk  : SearchtbsQtacQuocgiaNghingoXk
    };

    return factory;

    function SearchtbsQtacQuocgiaNghingoXk(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacQuocgiaNghingoXk", data)
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

    function GetListtbsQtacQuocgiaNghingoXk() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacQuocgiaNghingoXk")
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
    function DoAddtbsQtacQuocgiaNghingoXk(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacQuocgiaNghingoXk", data)
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

    function DoDeletetbsQtacQuocgiaNghingoXk(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacQuocgiaNghingoXk?" + "id="+ id)
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
    function DoUpdatetbsQtacQuocgiaNghingoXk(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacQuocgiaNghingoXk", data)
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

    function GettbsQtacQuocgiaNghingoXkById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacQuocgiaNghingoXkById?" + "id="+ id)
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
