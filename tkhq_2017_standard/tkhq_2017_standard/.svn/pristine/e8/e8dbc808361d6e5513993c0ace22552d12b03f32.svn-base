/**
 * 
 */
App.factory('dienBienHangHoaXNKService',['$http','$q','contextPath', '$httpParamSerializerJQLike', dienBienHangHoaXNKService]);
function dienBienHangHoaXNKService($http, $q, contextPath, $httpParamSerializerJQLike){
	
	var REST_SERVICE_URI_CUCHQ = contextPath+'/bcpt/GetCustom';//contextPath + '/tbs_cuakhaunn_vnaccs/';
	var REST_SERVICE_URI_CHICUCHQ = contextPath+'/bcpt/GetSubCustom';
	var REST_SERVICE_URI_MATHANG = contextPath+'/bcpt/DSMatHangChuYeu';
	var REST_SERVICE_SOlIEU =contextPath+'/bcpt/SoLieuTheoChiTieuThongKe04'
	var factory ={
			GetCucHQ:GetCucHQ,
	    	GetChiCucHQByCuc: GetChiCucHQByCuc,
	    	GetlstMatHang: GetlstMatHang,
	    	GetSoLieuChiTieuTK04 : GetSoLieuChiTieuTK04,
	    	doExport:doExport
	};
	
	return factory;
	function GetCucHQ() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI_CUCHQ)
            .then(
            function (response) {            
                deferred.resolve(response.data);                
            },
            function(errResponse){            	
                console.error('Có lỗi xảy ra trong khi lấy thông tin');
                deferred.reject(errResponse);
            }
        );
        
        return deferred.promise;
    }

    function GetChiCucHQByCuc(maCuc) {
        var deferred = $q.defer();
        console.log('GetChiCucHQByCuc@maCuc:'+maCuc);
        $http.get(contextPath+'/bcpt/GetSubCustom?maCucHQ='+ maCuc)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi lấy thông tin');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    
    function GetlstMatHang(data) {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI_MATHANG +'?nhx='+data)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi lấy thông tin');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }
    function GetSoLieuChiTieuTK04(ma,type,trangthai,mathang,maChicucHQ) {
        var deferred = $q.defer();
        /*console.log('Service GetSoLieuChiTieuTK04@maCucHQ:'+ma+'|maChicucHQ:'+maChicucHQ+'|trangthai:' + trangthai + "|nhx:" + type+ "|mathang:" + mathang);*/
        var URI_TEST =REST_SERVICE_SOlIEU + "?maCucHQ="+ma+"&maChicucHQ="+maChicucHQ+"&trangthai=" + trangthai + "&nhx=" + type+ "&mathang=" + mathang;
        console.log(URI_TEST);
        $http.get(REST_SERVICE_SOlIEU + "?maCucHQ="+ma+"&maChicucHQ="+maChicucHQ+"&trangthai=" + trangthai + "&nhx=" + type+ "&mathang=" + mathang)
            .then(
            function (response) {
            	//console.log('Service@response:'+response);
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Có lỗi xảy ra trong khi lấy thông tin service:'+ errResponse);
                deferred.reject(errResponse);
            }
        );
                
        return deferred.promise;
    }
    function doExport(param){
		$http({
    		headers: {
    			'Content-Type': 'application/json;charset=utf-8',
    			'Accept': 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
    		},
    		method: 'POST',
    		url: contextPath + '/doExport/dienbienHHXNK',
    		data: JSON.stringify(param),
    		responseType: 'arraybuffer'
    	})
    	.then(
            function (response) {
    		var fileName = "dienbienHHXNK_" + (new Date()).getTime() + ".xls";
    		
    	    var blob = new Blob([response.data], {
    	        type: 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
    	    });
    	    saveAs(blob, fileName);
		},
		function(errResponse){
			console.log("Can't download file with error: " + errResponse.data);
		});
	}
    
}