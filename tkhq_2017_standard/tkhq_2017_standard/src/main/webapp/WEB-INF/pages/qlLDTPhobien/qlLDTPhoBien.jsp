<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">
	var _isIE = /*@cc_on!@*/false || !!document.documentMode;
</script>

<script src="<c:url value='/static/js/service/qlLDTPhoBienService.js' />"></script>
<script src="<c:url value='/static/js/service/HoanThanhRaXoatSanPhamThongKeDauRaService.js' />"></script>
<script src="<c:url value='/static/js/controller/qlLDTPhoBienController.js' />"></script>

<div ng-app="myApp" class="content-wrapper ng-cloak">
	<section class="content-header">
		<h3 class="title">Quản lý của lãnh đạo trước khi phổ biến</h3>
	</section>
	<section class="content">
		<div ng-controller="QLLDTPhoBienController as ctrl" class="modal-body">
			<uib-tabset active="tabActiveIndex">
				<uib-tab index="0" heading="Xuất khẩu" select="changeTab(0)">
	      		</uib-tab>
	      		<uib-tab index="1" heading="Nhập khẩu" select="changeTab(1)">
	      		</uib-tab>
			</uib-tabset>
			
			<div class="">
				<%@ include file="qlLDTPhoBien_tab.jsp"%>
			</div>
		</div>
	</section>
	
	<div class="row">
		<div class="fade-in-out" ng-show="showLoading">
			<uib-progressbar class="progress-striped active progressBar" type="info"></uib-progressbar>
		</div>
	</div>
</div>