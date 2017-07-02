/**
 * Created by cmcsoft on 6/2/2017.
 */

App.factory('tbsQtacDongiaNhapkhauService',['$http','$q', 'contextPath' , tbsQtacDongiaNhapkhauService]);

function tbsQtacDongiaNhapkhauService($http, $q, contextPath) {
    'use strict';
    var factory = {
        GetListtbsQtacDongiaNhapkhau: GetListtbsQtacDongiaNhapkhau,
        GettbsQtacDongiaNhapkhauById: GettbsQtacDongiaNhapkhauById,
        DoAddtbsQtacDongiaNhapkhau: DoAddtbsQtacDongiaNhapkhau,
        DoDeletetbsQtacDongiaNhapkhau: DoDeletetbsQtacDongiaNhapkhau,
        DoUpdatetbsQtacDongiaNhapkhau: DoUpdatetbsQtacDongiaNhapkhau,
        SearchtbsQtacDongiaNhapkhau  : SearchtbsQtacDongiaNhapkhau
    };

    return factory;

    function SearchtbsQtacDongiaNhapkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/search/tbsQtacDongiaNhapkhau", data)
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

    function GetListtbsQtacDongiaNhapkhau() {
        var deferred = $q.defer();
        $http.get(contextPath + "/tbsQtacDongiaNhapkhau")
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
    function DoAddtbsQtacDongiaNhapkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/add/tbsQtacDongiaNhapkhau", data)
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

    function DoDeletetbsQtacDongiaNhapkhau(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "/delete/tbsQtacDongiaNhapkhau?" + "id="+ id)
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
    function DoUpdatetbsQtacDongiaNhapkhau(data) {
        var deferred = $q.defer();
        $http.post(contextPath + "/update/tbsQtacDongiaNhapkhau", data)
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

    function GettbsQtacDongiaNhapkhauById(id) {
        var deferred = $q.defer();
        $http.get(contextPath + "tbsQtacDongiaNhapkhauById?" + "id="+ id)
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
