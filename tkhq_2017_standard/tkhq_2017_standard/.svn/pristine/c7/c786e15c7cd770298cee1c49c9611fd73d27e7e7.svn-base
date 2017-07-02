<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<c:url value='/static/js/controller/hoanThanhRaXoatSanPhamThongKeDauRaController.js' />"></script>
<script src="<c:url value='/static/js/service/HoanThanhRaXoatSanPhamThongKeDauRaService.js' />"></script>

<div ng-app="myApp" class="content-wrapper" ng-controller="TabsDemoCtrl">
	<section class="content-header panel panel-success">
		<h5 class="title">Hoàn thành rà soát sản phẩm thống kê đầu ra.</h5>
	</section>
	<section class="content">
<!-- 		<form name="outerForm" class="tab-form-demo"> -->
<!-- 				<uib-tab index="1" heading="Xuất khẩu" select="tabXuatKhau()"> -->
<%-- 						<%@ include file="HoanThanhRaXoatSanPhamThongKeDauRa.jsp"%> --%>
<!-- 				</uib-tab>  -->
<!-- 				<uib-tab index="2" heading="Nhập khẩu" select="tabNhapKhau()"> -->
<%-- 					<%@ include file="HoanThanhRaXoatSanPhamThongKeDauRa.jsp"%> --%>
<!-- 		</form> -->
		<form name="outerForm" class="tab-form-demo">
			<uib-tabset active="activeForm"> <uib-tab index="1"
			heading="Xuất khẩu" select="tabSelected1()"> </uib-tab> <uib-tab
			index="2" heading="Nhập khẩu" select="tabSelected2()"> </uib-tab> </uib-tabset>
		</form>
		
		<%@ include file="HoanThanhRaXoatSanPhamThongKeDauRa.jsp"%>
	</section>
</div>
