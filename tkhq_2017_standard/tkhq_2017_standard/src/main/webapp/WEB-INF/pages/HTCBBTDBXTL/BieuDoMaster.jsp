<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="<c:url value='/static/js/service/HTCBBTDBXTLService.js' />"></script>
<script src="<c:url value='/static/js/controller/HTCBBTDBXTLController.js' />"></script>
<script src="<c:url value='/static/js/service/PhanHoiQuyTrinhXLDLService.js' />"></script>
<script src="<c:url value='/static/js/controller/PhanHoiQuyTrinhXLDLController.js' />"></script>
<div class="content-wrapper" ng-app="myApp"
	ng-controller="HTCBBTDBXTLController">
	<section class="content-header panel panel-success">
		<h5 class="title">Hiển thị và cảnh báo bất thường của diễn biến
			về lượng, đơn giá, trị giá mặt hàng</h5>
	</section>
	<section class="content">
		<form class="tab-form-demo" ng-hide="showReport">
			<uib-tabset active="activeForm"> <uib-tab
				index="1" heading="Xuất khẩu" select="tab1_Selected()"> </uib-tab> <uib-tab
				index="2" heading="Nhập khẩu" select="tab2_Selected()"> </uib-tab> </uib-tabset>
			<%@ include file="BieuDo.jsp"%>
		</form>
	</section>
</div>
