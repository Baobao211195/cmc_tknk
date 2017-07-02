/**
 * Created by cmcsoft on 6/2/2017.
 */

App.factory('tbsQtacTrigiaXuatkhauService',['$http','$q', 'contextPath' , tbsQtacTrigiaXuatkhauService]);

function tbsQtacTrigiaXuatkhauService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacTrigiaXuatkhau : GetListtbsQtacTrigiaXuatkhau,
        GettbsQtacTrigiaXuatkhauById : GettbsQtacTrigiaXuatkhauById,
        DoAddtbsQtacTrigiaXuatkhau   : DoAddtbsQtacTrigiaXuatkhau,
        DoDeletetbsQtacTrigiaXuatkhau: DoDeletetbsQtacTrigiaXuatkhau,
        DoUpdatetbsQtacTrigiaXuatkhau: DoUpdatetbsQtacTrigiaXuatkhau,
        SearchtbsQtacTrigiaXuatkhau  : SearchtbsQtacTrigiaXuatkhau
    };

    return factory;

    function SearchtbsQtacTrigiaXuatkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacTrigiaXuatkhau", data)
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

    function GetListtbsQtacTrigiaXuatkhau() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacTrigiaXuatkhau")
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
    function DoAddtbsQtacTrigiaXuatkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacTrigiaXuatkhau", data)
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

    function DoDeletetbsQtacTrigiaXuatkhau(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacTrigiaXuatkhau?" + "id="+ id)
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
    function DoUpdatetbsQtacTrigiaXuatkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacTrigiaXuatkhau", data)
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

    function GettbsQtacTrigiaXuatkhauById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacTrigiaXuatkhauById?" + "id="+ id)
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
