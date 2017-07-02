<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<c:url value='/static/js/service/canhBao_TriGiaMH_PTHS_XNKService.js' />"></script>
<script src="<c:url value='/static/js/controller/canhBao_TriGiaMH_PTHS_XNKController.js' />"></script>
<script src="<c:url value='/static/js/controller/PhanHoiQuyTrinhXLDLController.js' />"></script>
<script src="<c:url value='/static/js/service/PhanHoiQuyTrinhXLDLService.js' />"></script>

<div ng-app="myApp" class="content-wrapper">
	<section class="content-header">
		<h3 class="title">Hiển thị và cảnh báo bất thường của diễn biến về lượng, đơn giá, trị giá mặt hàng</h3>
	</section>
	<section class="content">
		<div class="modal-body" ng-controller="CanhBao_TriGia_MH_PTHS_XNKController as ctrl">
			<div id ="messageArea" class="messageArea"></div>
			<div id="messageErrorArea" class="messageErrorArea" ng-model="showError"></div>
			<uib-tabset active="tabActiveIndex">
				<uib-tab index="0" heading="Xuất khẩu" select="changeTab(0)">
				</uib-tab>
				<uib-tab index="0" heading="Nhập khẩu" select="changeTab(1)">
				</uib-tab>
				<uib-tab index="0" heading="Xuất nhập khẩu" select="changeTab(2)">
				</uib-tab>
			</uib-tabset>
			
			<div class="" ng-if="showGrid">
				<%@ include file="canhBao_TriGiaMH_PTHS_XNK_tab.jsp"%>
			</div>
			
			<div class="" ng-if="showChart">
				<%@ include file="canhBao_TriGiaMH_PTHS_BD_tab.jsp"%>
			</div>
			<br />
			<br />
		</div>
	</section>
	<div class="row">
		<div class="fade-in-out" ng-show="showLoading">
			<uib-progressbar class="progress-striped active progressBar" type="info"></uib-progressbar>
		</div>
	</div>
	
	<div ng-controller="PhanHoiQuyTrinhXLDLController">
		<%@ include file="../PhanHoiQuyTrinhXLDL/PhanHoiQuyTrinhXLDL.jsp"%>
	</div>
</div>
