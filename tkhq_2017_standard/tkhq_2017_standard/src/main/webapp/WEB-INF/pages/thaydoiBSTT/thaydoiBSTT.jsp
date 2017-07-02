<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<c:url value='/static/js/service/thaydoiBSTTService.js' />"></script>
<script src="<c:url value='/static/js/controller/thaydoiBSTTController.js' />"></script>

<div ng-app="myApp" class="content-wrapper">
	<div class="container-fluid">
		<section class="content-header">
			<h3 class="title">Thay đổi do bổ sung thông tin nhập và cập nhật</h3>
		</section>
		<section class="content">
			<div class="modal-body" ng-controller="ThaydoiBSTTController as ctrl">
				<div id ="messageArea" class="messageArea"></div>
				<div id="messageErrorArea" class="messageErrorArea" ng-model="showError"></div>
				<uib-tabset active="tabActiveIndex">
					<uib-tab index="0" heading="Xuất khẩu" select="changeTab(0)">
					</uib-tab>
				
					<uib-tab index="1" heading="Nhập khẩu" select="changeTab(1)">
					</uib-tab>
				</uib-tabset>
				
				<div class="">
				<%@ include file="thaydoiBSTT_tab.jsp"%>
				</div>
				
				<div class="row">
					<div class="fade-in-out" ng-show="showLoading">
						<uib-progressbar class="progress-striped active progressBar" type="info"></uib-progressbar>
					</div>
				</div>
			</div>
		</section>
	</div>
</div>