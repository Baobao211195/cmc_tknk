/**
 * Created by cmcsoft on 6/9/2017.
 */

App.factory('tbsQtacXuatxuHangnhapService',['$http','$q', 'contextPath' , tbsQtacXuatxuHangnhapService]);

function tbsQtacXuatxuHangnhapService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacXuatxuHangnhap : GetListtbsQtacXuatxuHangnhap,
        GettbsQtacXuatxuHangnhapById : GettbsQtacXuatxuHangnhapById,
        DoAddtbsQtacXuatxuHangnhap   : DoAddtbsQtacXuatxuHangnhap,
        DoDeletetbsQtacXuatxuHangnhap: DoDeletetbsQtacXuatxuHangnhap,
        DoUpdatetbsQtacXuatxuHangnhap: DoUpdatetbsQtacXuatxuHangnhap,
        SearchtbsQtacXuatxuHangnhap  : SearchtbsQtacXuatxuHangnhap
    };

    return factory;

    function SearchtbsQtacXuatxuHangnhap(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacXuatxuHangnhap", data)
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

    function GetListtbsQtacXuatxuHangnhap() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacXuatxuHangnhap")
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
    function DoAddtbsQtacXuatxuHangnhap(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacXuatxuHangnhap", data)
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

    function DoDeletetbsQtacXuatxuHangnhap(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacXuatxuHangnhap?" + "id="+ id)
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
    function DoUpdatetbsQtacXuatxuHangnhap(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacXuatxuHangnhap", data)
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

    function GettbsQtacXuatxuHangnhapById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacXuatxuHangnhapById?" + "id="+ id)
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
