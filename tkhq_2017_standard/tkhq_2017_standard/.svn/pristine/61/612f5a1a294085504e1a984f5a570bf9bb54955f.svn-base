/**
 * Created by cmcsoft on 6/9/2017.
 */

App.factory('tbsQtacXuatxuHangxuatService',['$http','$q', 'contextPath' , tbsQtacXuatxuHangxuatService]);

function tbsQtacXuatxuHangxuatService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacXuatxuHangxuat : GetListtbsQtacXuatxuHangxuat,
        GettbsQtacXuatxuHangxuatById : GettbsQtacXuatxuHangxuatById,
        DoAddtbsQtacXuatxuHangxuat   : DoAddtbsQtacXuatxuHangxuat,
        DoDeletetbsQtacXuatxuHangxuat: DoDeletetbsQtacXuatxuHangxuat,
        DoUpdatetbsQtacXuatxuHangxuat: DoUpdatetbsQtacXuatxuHangxuat,
        SearchtbsQtacXuatxuHangxuat  : SearchtbsQtacXuatxuHangxuat
    };

    return factory;

    function SearchtbsQtacXuatxuHangxuat(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacXuatxuHangxuat", data)
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

    function GetListtbsQtacXuatxuHangxuat() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacXuatxuHangxuat")
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
    function DoAddtbsQtacXuatxuHangxuat(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacXuatxuHangxuat", data)
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

    function DoDeletetbsQtacXuatxuHangxuat(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacXuatxuHangxuat?" + "id="+ id)
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
    function DoUpdatetbsQtacXuatxuHangxuat(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacXuatxuHangxuat", data)
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

    function GettbsQtacXuatxuHangxuatById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacXuatxuHangxuatById?" + "id="+ id)
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
