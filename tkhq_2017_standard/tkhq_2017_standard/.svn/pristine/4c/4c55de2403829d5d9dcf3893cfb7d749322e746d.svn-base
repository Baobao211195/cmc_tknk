<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<title>Phân tích dữ liệu tổng hợp sử dụng bảng biểu</title>
<!-- </head> -->

	<style type="text/css">
form.tab-form-demo .tab-pane {
	margin: 20px 20px;
}
</style>
<div class="content-wrapper" ng-app="myApp" ng-controller="TabsDemoCtrl">
	<section class="content-header panel panel-success">
	<h5 class="title">Hiển thị và cảnh báo bất thường của diễn biến số liệu theo các chỉ tiêu thống kê tổng hợp theo thời gian</h5>
	</section>
	<section class="content">
	<form name="outerForm" class="tab-form-demo">
			<uib-tabset active="activeForm"> 
				<uib-tab index="1"
					heading="Xuất khẩu" select="tabSelected1()">  </uib-tab> 
				<uib-tab index="2"
					heading="Nhập khẩu" select="tabSelected2()"> </uib-tab> 
				<uib-tab index="3"
					heading="Xuất nhập khẩu" select="tabSelected3()"> </uib-tab>
			</uib-tabset>
		</form>

		<div class="messageArea"></div>
		<div class="messageErrorArea"></div>
		
		<script src="<c:url value='/static/js/service/dienBienSoLieuChiTieuTKService.js' />"></script>
		<script src="<c:url value='/static/js/controller/dienBienSoLieuChiTieuTKController_chart.js' />"></script>
		 
		<script src="<c:url value='/static/js/controller/PhanHoiQuyTrinhXLDLController.js' />"></script>
		<script src="<c:url value='/static/js/service/PhanHoiQuyTrinhXLDLService.js' />"></script>
		
		<div ng-controller="PhanHoiQuyTrinhXLDLController">
			<%@ include file="../PhanHoiQuyTrinhXLDL/PhanHoiQuyTrinhXLDL.jsp"%>
		</div>
		<!-- <div class="generic-container"  -->
		 <div class="modal-body"
		 	ng-controller="dienBienSoLieuChiTieuTKController_chart as soLieuChiTieuTKNNCtrl">
			<%@ include file="dienBienSoLieuChiTieuTK_chart.jsp"%>
		 </div>

		<!--  Model:
  <pre>{{ model | json }}</pre> -->
		<!-- Nested Form:
  <pre>{{ outerForm.nestedForm | json }}</pre> -->

	</div>
</div>
<!-- </html> -->

