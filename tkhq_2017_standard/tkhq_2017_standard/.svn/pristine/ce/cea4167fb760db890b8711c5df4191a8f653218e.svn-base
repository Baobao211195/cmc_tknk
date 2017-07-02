
/*Create object Date from String Date*/
var createDate_fromStrDate = function (strDate) {
    try {
        var textDate = strDate.trim();
        
        /*Format Date yyyy-MM-ddThh:mm:ss       (2016-07-12T00:00:00) */
        if (textDate.length == 19) {
            textDate = textDate.substring(0, 10);
            alert(textDate);
            var Y_M_D = textDate.split('-');
            var dt = new Date(parseInt(Y_M_D[0], 10),
                      parseInt(Y_M_D[1], 10) - 1,
                      parseInt(Y_M_D[2], 10),
                      0,
                      0);
            return dt;
        }
                
        if (textDate.length == 10) {
            if (textDate.indexOf('/') > 2)
            {
                /*Format Date YYYY/MM/DD*/
                var Y_M_D = textDate.split('/');
                var dt = new Date(parseInt(Y_M_D[0], 10),
                          parseInt(Y_M_D[1], 10) - 1,
                          parseInt(Y_M_D[2], 10),
                          0,
                          0);
            }
            else {
                /*var textDate = '17/12/2015';*/
                var D_M_Y = textDate.split('/');
                var dt = new Date(parseInt(D_M_Y[2], 10),
                          parseInt(D_M_Y[1], 10) - 1,
                          parseInt(D_M_Y[0], 10),
                          0,
                          0);
            }            
            return dt;
        }

        /*Format Date DD/MM/YYYY*/
        if (textDate.length == 16) {
            /*var textDate = '17/12/2015 23:25';*/
            var arrDate = textDate.split(' ');
            var D_M_Y = arrDate[0].split('/');
            var H_M = arrDate[1].split(':');
            var dt = new Date(parseInt(D_M_Y[2], 10),
                      parseInt(D_M_Y[1], 10) - 1,
                      parseInt(D_M_Y[0], 10),
                      H_M[0],
                      H_M[1]);
            return dt;
        }

        /*Format Date DD/MM/YYYY*/
        if (textDate.length == 8) { /* '17/12/2015'  */
            var now = new Date();
            var dd = strDate.substring(0, 2);
            var mm = strDate.substring(2, 4);
            var yyyy = strDate.substring(4, 8);
            var hh = now.getHours();
            var mi = now.getMinutes();

            var dt = new Date(parseInt(yyyy, 10),
                      parseInt(mm, 10) - 1,
                      parseInt(dd, 10),
                      hh,
                      mi);
            return dt;
        }
    }
    catch (er) {
    }
};


var getdateformat_yyyymmdd = function (strdate) {
    // chuyen tu dd/mm/yyyy sang yyyymmdd
    try{
        if (strdate != null && strdate != undefined) {
            var yyyymmdd = strdate.split('/');
            return yyyymmdd[2] + yyyymmdd[1] + yyyymmdd[0];
        }
    }
    catch(ex)
    {
        return '';
    }
   
};

/*Get chuỗi date để thông báo lỗi cho datefield  */
var getDateString = function (date) {
    if (date != null && date != undefined) {
        var day = date.getDate();
        var month = date.getMonth();
        var year = date.getFullYear();
        var strDay = '';
        var strMonth = '';

        month = month + 1;
        if (day < 10) {
            strDay = '0' + day.toString();
        }
        else {
            strDay = day.toString();
        }
        /*month*/
        if (month < 10) {
            strMonth = '0' + month.toString();
        }
        else {
            strMonth = month.toString();
        }
        var dateString = strDay + '/' + strMonth + '/' + year;
        return dateString;
    }
};

// set date from json to input date
var formatDateToString = function (strDate) {
    /*2016-07-12T00:00:00  =>  12/07/2016 */
    if (strDate != "" && strDate != null && strDate != undefined) {
        strDate = strDate.substring(0, 10);
        var arrDate = strDate.split('-');        
        var dateString = arrDate[2] + '/' + arrDate[1] + '/' + arrDate[0];
        return dateString;
    }
};

/*Get chuỗi date để thông báo lỗi cho datefield có giờ và phút  */
var getDateString_Hours_Minutes = function (date) {
    try {
        var strDay = '';
        var strMonth = '';
        var strHours = '';
        var strMinutes = '';

        if (date != null && date != undefined) {
            var day = date.getDate();
            var month = date.getMonth();
            var year = date.getFullYear();
            var hours = date.getHours();
            var minutes = date.getMinutes();

            /*(month + 1)*/
            month = month + 1;

            /*day*/
            if (day < 10) {
                strDay = '0' + day.toString();
            }
            else {
                strDay = day.toString();
            }
            /*month*/
            if (month < 10) {
                strMonth = '0' + month.toString();
            }
            else {
                strMonth = month.toString();
            }

            /*Hours*/
            if (hours < 10) {
                strHours = '0' + hours.toString();
            }
            else {
                strHours = hours.toString();
            }

            /*Minutes*/
            if (minutes < 10) {
                strMinutes = '0' + minutes.toString();
            }
            else {
                strMinutes = minutes.toString();
            }

            var dateString = strDay + '/' + strMonth + '/' + year + ' ' + strHours + ':' + strMinutes;
            return dateString;
        }
    }
    catch (err) {
    }
};

var isNumberKey = function (obj, e) {
    var theEvent = e || window.event;
    var key = theEvent.keyCode || theEvent.which;
    var code = key;
    key = String.fromCharCode(key);
    var regex = /[0-9]|\.|[\b]|[\t]/;
    if (e.ctrlKey) {
        if (code == 65 || code == 67 || code == 88 || code == 90) { //|| code == 86   //Ctrl + V
            //console.log(price);
            var str = obj.value;
            //alert(str);
            //price = price_format(str);

        }
    } else {
        if (!regex.test(key)) {
            theEvent.returnValue = false;
            if (theEvent.preventDefault) theEvent.preventDefault();
            return false;
        }
    }

    
    if (obj.value.length == 0) {
        if (key == ".") {
            obj.value = "0";
        }
    }
    var n = obj.value.indexOf(".");
    if ((key == ".") && (n >= 0)) {
        theEvent.returnValue = false;
        if (theEvent.preventDefault) theEvent.preventDefault();
        return false;
    }
    return true;
};

var isNotNumbericKey = function (obj, evt) {
    var theEvent = evt || window.event;
    var key = theEvent.keyCode || theEvent.which;
    key = String.fromCharCode(key);
    var regex = /[0-9]/;
    if (!regex.test(key)) {
        theEvent.returnValue = false;
        if (theEvent.preventDefault) theEvent.preventDefault();
        return false;
    }
    if (obj.value.length == 0) {
        if (key == ".") {
            obj.value = "0";
        }
    }
    var n = obj.value.indexOf(".");
    if ((key == ".") && (n >= 0)) {
        theEvent.returnValue = false;
        if (theEvent.preventDefault) theEvent.preventDefault();
        return false;
    }
};

/*
$("input.input-number").keypress(function (event) {
                isNumberKey(this, event);
});
$("input.input-notnumberic").keypress(function (event) {
    isNotNumbericKey(this, event);
});
*/

var converStringToNumber = function (strNumber) {
    var number = 0;
    var strTmp = "" + strNumber;
    if (strTmp.indexOf("-") == -1) {
        strNumber = "0" + strNumber;
    }
    
    if(strNumber.toString() != "" && strNumber.toString() != null && strNumber.toString()!= undefined)
    {       
        //var re = /(-?\d+(?:\.\d*)?)F\b/g;
        var re = /\.|\,/gi;
        strNumber = strNumber.replace(re, '').trim();  
        number = parseInt(strNumber);
    }
    return number;
};

var converNumberToString = function (number) {
    var strTemp="";
    var strNumber = "";    
    var arrTemp = [];
    var arrStrNumber = [];
    var dem = 0;
    var so_am = false;
    
    if (typeof (number) == "number" && number != null && number != undefined) {
        strTemp = number.toString();
        arrTemp = strTemp.split('');
        //Xử lý dấu âm
        if (arrTemp[0] == "-") {
            so_am = true;
            arrTemp.shift();
        }

        strTemp = "";
        for (i = arrTemp.length - 1; i >= 0 ; i--) {
            if (dem == 3) {
                strTemp += '.';
                dem = 0;
            }
            strTemp += arrTemp[i];
            dem = dem + 1;
        }

        arrStrNumber = strTemp.split('');
        arrStrNumber.reverse();

        for (i = 0; i < arrStrNumber.length; i++) {
            strNumber += arrStrNumber[i];
        }

        if (so_am == true) {
            strNumber = "-" + strNumber;
        }
    }
    return strNumber;
};

//convert string to date .net
var regexIso8601 = /^(\d{4}|\+\d{6})(?:-(\d{2})(?:-(\d{2})(?:T(\d{2}):(\d{2}):(\d{2})\.(\d{1,})(Z|([\-+])(\d{2}):(\d{2}))?)?)?)?$/;

function convertDateStringsToDates(strdate) {
    try{
        function getdate(datestr) {
            /*var textDate = '17/12/2015';*/
            var D_M_Y = datestr.split('/');
            var dt = D_M_Y[2] + '-' + D_M_Y[1] + '-' + D_M_Y[0];
            return dt;
        };
        var input = getdate(strdate);
        function convertDateStringsToDatesapp(input) {
            // Ignore things that aren't objects.
            if (typeof input !== "object") return input;

            for (var key in input) {
                if (!input.hasOwnProperty(key)) continue;

                var value = input[key];
                var match;
                // Check for string properties which look like dates.
                // TODO: Improve this regex to better match ISO 8601 date strings.
                if (typeof value === "string" && (match = value.match(regexIso8601))) {
                    // Assume that Date.parse can parse ISO 8601 strings, or has been shimmed in older browsers to do so.
                    var milliseconds = Date.parse(match[0]);
                    if (!isNaN(milliseconds)) {
                        input[key] = new Date(milliseconds);
                    }
                } else if (typeof value === "object") {
                    // Recurse into object
                    convertDateStringsToDatesapp(value);
                }
            }
        };
        return convertDateStringsToDatesapp(input);
    }
    catch(ex)
    {
        return null;
    }
};

/*********HÀM UPPERCASE KÝ TỰ ĐẦU TIÊN VÀ VALIDATE TÊN NGƯỜI ĐẠI DIỆN**********/
var validFullName = function (sFullName) {
    var nameInValid = sFullName.trim();
    var arrName = nameInValid.split(" ");
    var count = arrName.length;
    var n_i;
    var s_i;
    var s_First;
    var s_End;
    /*Phải gán bằng rỗng để không bị lỗi undefined, vì lúc đầu không xác định được kiểu dữ liệu*/
    var name_IsValid = "";
    var FullName = "";
    for (i = 0; i < count; i++) {
        if (arrName[i] != null && arrName[i] != "") {
            s_i = arrName[i];
            s_First = s_i.substring(0, 1);
            s_End = s_i.substring(1, (s_i.length));
            n_i = s_First.toUpperCase() + s_End.toLowerCase();
            name_IsValid += n_i + " ";
        }
    }
    if (name_IsValid != null && name_IsValid != "") {
        FullName = name_IsValid;
    }

    return FullName.trim();
};


/*********HÀM UPPERCASE TẤT CẢ KÝ TỰ**********/
var UppercaseAllString = function (str) {
    var strInValid = str.trim();
    var strUpper = strInValid.toUpperCase();    
    return strUpper;
};

var setColorSelectRow = function (rowIndex) {
    var tb_grid = [];
    var tr_grid = [];    
    tb_grid = document.getElementsByClassName("tb-grid");
    
    for (i = 0; i < tb_grid.length; i++) {
        //addEventListener
        tr_grid = tb_grid[i].getElementsByTagName("tbody")[0].getElementsByTagName("tr");
        for (j = 0; j < tr_grid.length; j++) {
            //if (tr_grid[j].getAttribute("ng-repeat") != "") {
                //tr_grid[j].addEventListener("click", function () {
                
                //});
            tr_grid[j].removeAttribute("style");
            //}
        }
        tr_grid[rowIndex].setAttribute("style", "background-color:#cde7f4;");
    }
};


var setColorCheckedRow = function (rowIndex) {
    var tb_grid = [];
    var tr_grid = [];
    tb_grid = document.getElementsByClassName("tb-grid");

    for (i = 0; i < tb_grid.length; i++) {
        //addEventListener
        tr_grid = tb_grid[i].getElementsByTagName("tbody")[0].getElementsByTagName("tr");        
        tr_grid[rowIndex].setAttribute("style", "background-color:#cde7f4;");
    }
};

var unsetColorCheckedRow = function (rowIndex) {
    var tb_grid = [];
    var tr_grid = [];
    tb_grid = document.getElementsByClassName("tb-grid");

    for (i = 0; i < tb_grid.length; i++) {
        //addEventListener
        tr_grid = tb_grid[i].getElementsByTagName("tbody")[0].getElementsByTagName("tr");
        tr_grid[rowIndex].removeAttribute("style");
    }
};

/*Set focus By Model Name*/
var focusModel = function (model) {
    var arrInput = document.getElementsByTagName("input");
    var input;
    var i = arrInput.length;
    while (i--) {
        input = arrInput[i];
        if (!input.type || input.type === 'text') {
            if (input.getAttribute("ng-model") == model) {
                input.focus();
                break;
            }
        }
    }
};

function createClass(name, rules) {
    var style = document.createElement('style');
    style.type = 'text/css';
    document.getElementsByTagName('head')[0].appendChild(style);
    if (!(style.sheet || {}).insertRule)
        (style.styleSheet || style.sheet).addRule(name, rules);
    else
        style.sheet.insertRule(name + "{" + rules + "}", 0);
}

var browserName = function () {
    var Browser = navigator.userAgent;
    if (Browser.indexOf('MSIE') >= 0) {
        Browser = 'MSIE';
    }
    else if (Browser.indexOf('Firefox') >= 0) {
        Browser = 'Firefox';
    }
    else if (Browser.indexOf('Chrome') >= 0) {
        Browser = 'Chrome';
    }
    else if (Browser.indexOf('Safari') >= 0) {
        Browser = 'Safari';
    }
    else if (Browser.indexOf('Opera') >= 0) {
        Browser = 'Opera';
    }
    else {
        Browser = 'UNKNOWN';
    }
    return Browser;
};

var browserVersion = function () {
    var index;
    var version = 0;
    var name = browserName();
    var info = navigator.userAgent;
    index = info.indexOf(name) + name.length + 1;
    version = parseFloat(info.substring(index, index + 3));
    return version;
};

/*Xử lý ngày khi truyền qua URL Report*/
var convertDateReport = function (strDate) {
    var ngayTmp = "" + strDate;
    var arrTmp = [];
    if(ngayTmp.trim().length>0)
    {
        arrTmp = ngayTmp.split("/");
    }
    if(arrTmp.length>=3)
    {
        strDate = arrTmp[1] + "/" + arrTmp[0] + "/" + arrTmp[2];
    }
    return strDate;
};

function setValueDatePicker()
{
    var lstPicker = document.getElementsByClassName("date");
    var i = 0;
    for(i=0;i<lstPicker.length;i++)
    {
        lstPicker[i].addEventListener("focus", function () {
            //console.log(12345);
            var value = $(this).val();
            var dt = new Date();
            $(".date").each(function (index) {
                if (i == index)
                {
                    if (value != null && value != undefined && parseInt(value) > 0) {
                        $(this).datepicker('setDate', value);  //$(this).val()
                       /* $(this).datepicker(
                            {
                                'setDate': value,
                                format: 'dd/mm/yyyy',
                                language: 'vi',
                                startDate: "01/10/1975",
                                endDate: "31/10/2405",
                                autoclose: true,
                                weekStart: 0
                            });*/
                    }
                    else {
                        if (!$(this).hasClass("date-null")) {
                            value = dt.getDate() + "/" + (dt.getMonth() + 1) + "/" + dt.getFullYear();
                            $(this).datepicker('setDate', value);
                        }
                    }
                }
                
            });
        });
    }
    //tr_grid[j].addEventListener("click", function () {
};

var spinnerVisible = false;
function showProgress() {
    if (!spinnerVisible) {
        $("div#loading").fadeIn("fast");
        spinnerVisible = true;
        document.activeElement.blur();
        //Xử lý phím Tab, không cho tab khi loading data
        window.onkeydown = function (event) {
            var theEvent = event || window.event;
            var key = theEvent.keyCode || theEvent.which;
            if (key === 9) {
                theEvent.returnValue = false;
                if (theEvent.preventDefault) theEvent.preventDefault();
                return false;
            }
        };
    }
};
function hideProgress() {
    if (spinnerVisible) {
        var spinner = $("div#loading");
        spinner.stop();
        spinner.fadeOut("fast");
        spinnerVisible = false;
        //Reset Keydown để có thể tab
        window.onkeydown = null;
    }
};