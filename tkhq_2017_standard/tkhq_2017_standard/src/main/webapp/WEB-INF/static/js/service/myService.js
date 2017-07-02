/**
 * Pagination
 */
'use strict';

App.factory('myService', function() {
	var myData = [];

    var addData = function(newObj) {
    	console.log('myService:'+newObj);
        myData.push(newObj);
    }

    var getData = function(){
    	console.log('myService:'+myData);
        return myData;
    }

    return {
        addData: addData,
        getData: getData
    };

	});