<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<c:url value='/static/js/service/ThayDoiDoTHQTNVService.js' />"></script>
<script src="<c:url value='/static/js/controller/ThayDoiDoTHQTNVController.js' />"></script>

<div ng-app="myApp" class="content-wrapper">
	<div ng-controller="ThayDoiDoTHQTNVController as Scope">
		<form class="tab-form-demo" ng-hide="Scope.showReport">
			<section class="content-header">
				<h3 class="title">Thay đổi do thực hiện các quy trình,
					nghiệp vụ, bước nghiệp vụ thống kê</h3>
			</section>
			<section class="content">
				<uib-tabset active="activeForm">
					<uib-tab index="1" heading="Xuất khẩu" select="Scope.tabSelected1()">
						<div class="messageArea"></div>
						<div class="messageErrorArea"></div>
					</uib-tab>
					<uib-tab index="2" heading="Nhập khẩu" select="Scope.tabSelected2()">
						<div class="messageArea"></div>
						<div class="messageErrorArea"></div>
					</uib-tab> 
				</uib-tabset>
			
			<%@ include file="thayDoiDoTHQTNV.jsp"%>
			</section>
		</form>
		
		<div class="row">
			<div class="fade-in-out" ng-show="showLoading">
				<uib-progressbar class="progress-striped active progressBar" type="info"></uib-progressbar>
			</div>
		</div>
	</div>

</div>