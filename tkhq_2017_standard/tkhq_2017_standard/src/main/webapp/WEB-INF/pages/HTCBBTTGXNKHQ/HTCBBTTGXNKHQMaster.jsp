<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script
	src="<c:url value='/static/js/service/HTCBBTTGXNKHQService.js' />"></script>
<script
	src="<c:url value='/static/js/controller/HTCBBTTGXNKHQController.js' />"></script>
<script
	src="<c:url value='/static/js/service/PhanHoiQuyTrinhXLDLService.js' />"></script>
<script
	src="<c:url value='/static/js/controller/PhanHoiQuyTrinhXLDLController.js' />"></script>
<div class="content-wrapper" ng-app="myApp"
	ng-controller="HTCBBTTGXNKHQController">
	<section class="content-header panel panel-success">
		<h5 class="title">Hiển thị và cảnh báo bất thường của diễn biến
			trị giá xuất nhập khẩu Cục, Chi cục Hải quan</h5>
	</section>
	<section class="content">
		<form class="tab-form-demo" ng-hide="showReport">
			<uib-tabset active="activeForm"
				style="height: 42px !important;border: 0 !important;">
			<uib-tab index="1" heading="Xuất khẩu" select="tab1_Selected()">
			</uib-tab> <uib-tab index="2" heading="Nhập khẩu" select="tab2_Selected()">
			</uib-tab> <uib-tab index="3" heading="Xuất nhập khẩu" select="tab3_Selected()">
			</uib-tab> </uib-tabset>
			<%@ include file="HTCBBTTGXNKHQ.jsp"%>
		</form>
		<!-- <div style="width: 100%;" ng-show="showReport">
			<button type="button" style="float: right; margin: 10px 4px;"
				class="btn btn-info" ng-click="hideReport();">Hủy bỏ</button>
			<iframe id="frReport" src="{{srcReport}}" class=""
				style="display: block; width: 100%; height: 600px;"></iframe>
		</div> -->
	</section>
</div>
