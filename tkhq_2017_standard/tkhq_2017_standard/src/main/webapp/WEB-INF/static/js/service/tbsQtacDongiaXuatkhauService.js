/**
 * Created by cmcsoft on 6/2/2017.
 */

App.factory('tbsQtacDongiaXuatkhauService',['$http','$q', 'contextPath' , tbsQtacDongiaXuatkhauService]);

function tbsQtacDongiaXuatkhauService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacDongiaXuatkhau: GetListtbsQtacDongiaXuatkhau,
        GettbsQtacDongiaXuatkhauById: GettbsQtacDongiaXuatkhauById,
        DoAddtbsQtacDongiaXuatkhau: DoAddtbsQtacDongiaXuatkhau,
        DoDeletetbsQtacDongiaXuatkhau: DoDeletetbsQtacDongiaXuatkhau,
        DoUpdatetbsQtacDongiaXuatkhau: DoUpdatetbsQtacDongiaXuatkhau,
        SearchtbsQtacDongiaXuatkhau  : SearchtbsQtacDongiaXuatkhau
    };

    return factory;

    function SearchtbsQtacDongiaXuatkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacDongiaXuatkhau", data)
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

    function GetListtbsQtacDongiaXuatkhau() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacDongiaXuatkhau")
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
    function DoAddtbsQtacDongiaXuatkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacDongiaXuatkhau", data)
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

    function DoDeletetbsQtacDongiaXuatkhau(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacDongiaXuatkhau?" + "id="+ id)
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
    function DoUpdatetbsQtacDongiaXuatkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacDongiaXuatkhau", data)
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

    function GettbsQtacDongiaXuatkhauById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacDongiaXuatkhauById?" + "id="+ id)
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
