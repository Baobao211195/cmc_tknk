<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script>
	// 	$(document).ready(function(){
	// 		$(".date").datepicker(
	//         {
	//             format: 'dd/mm/yyyy',
	//             language: 'vi' ,
	//             startDate: "01/10/1975",
	//             endDate: new Date(),
	//             autoclose: true,
	//             weekStart: 0
	//         });		        

	// 		$(".date-null").datepicker(
	// 		        {
	// 		            format: 'dd/mm/yyyy',
	// 		            language: 'vi',
	// 		            startDate: "01/10/1975",
	// 		            endDate: new Date(),
	// 		            autoclose: true,
	// 		            weekStart: 0
	// 		        });
	// 		        //date-null
	//         $(".date").mask("99/99/9999", { placeholder: "__/__/____" });
	//         $(".date-null").mask("99/99/9999", { placeholder: "__/__/____" });
	//         setValueDatePicker();

	//         function setValueDatePicker()
	//         {
	//             var lstPicker = document.getElementsByClassName("date");
	//             var i = 0;
	//             for(i=0;i<lstPicker.length;i++)
	//             {
	//                 lstPicker[i].addEventListener("focus", function () {
	//                     //console.log(12345);
	//                     var value = $(this).val();
	//                     var dt = new Date();
	//                     $(".date").each(function (index) {
	//                         if (i == index)
	//                         {
	//                             if (value != null && value != undefined && parseInt(value) > 0) {
	//                                 $(this).datepicker('setDate', value);  //$(this).val()
	//                                /* $(this).datepicker(
	//                                     {
	//                                         'setDate': value,
	//                                         format: 'dd/mm/yyyy',
	//                                         language: 'vi',
	//                                         startDate: "01/10/1975",
	//                                         endDate: "31/10/2405",
	//                                         autoclose: true,
	//                                         weekStart: 0
	//                                     });*/
	//                             }
	//                             else {
	//                                 if (!$(this).hasClass("date-null")) {
	//                                     value = dt.getDate() + "/" + (dt.getMonth() + 1) + "/" + dt.getFullYear();
	//                                     $(this).datepicker('setDate', value);
	//                                 }
	//                             }
	//                         }

	//                     });
	//                 });
	//             }
	//             //tr_grid[j].addEventListener("click", function () {};       
	// 	});
</script>

<div ng-app="myApp" class="content-wrapper">
	<section class="content-header">
		<h3 class="title">Danh mục thống kê tiêu chuẩn</h3>
	</section>
	<section class="content">
		<div class="messageArea"></div>
		<div class="messageErrorArea"></div>
		<div ng-controller="DMTongHopController">
			<div class="row" style="margin-left: 30px">
				<label class="col-md-2" for="dmSelect"> Lựa chọn danh mục: </label>
				<div  class="col-md-3" style="margin-left: 30px">
					<select style="height: 25px" name="dmSelect" id="dmSelect" class="form-control"
						ng-model="itemSelected">
						<option ng-repeat="option in lstDm.availableOptions"
							value="{{option.id}}">{{option.name}}</option>
					</select>
				</div>
			</div>
			<div ng-if="itemSelected == 1">
				<%@ include file="bieuthue/tbs_bieuthue.jsp"%>
			</div>
			<div ng-if="itemSelected == 2">
				<%@ include file="tinhTP/tbs_tinhTP.jsp"%>
			</div>
			<div ng-if="itemSelected == 4">
				<%@ include file="cangnnVnaccs/tbs_cangnn_vnaccs.jsp"%>
			</div>
			<div ng-if="itemSelected == 10">
				<%@ include file="cuakhaunnVnaccs/tbs_cuakhaunn_vnaccs.jsp"%>
			</div>
			<div ng-if="itemSelected == 13">
				<%@ include file="dvtVnaccs/tbsDvtVnaccs.jsp"%>
			</div>
			<div ng-if="itemSelected == 14">
				<%@ include file="tyGia/tbsCapnhatTygia.jsp"%>
			</div>
			<div ng-if="itemSelected == 16">
				<%@ include file="chuyende/tbs_chuyende.jsp"%>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3 fade-in-out" ng-show="showLoading">
				<uib-progressbar class="progress-striped active progressBar"
					type="info"></uib-progressbar>
			</div>
		</div>
	</section>
</div>