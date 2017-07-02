<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script src="<c:url value='/static/js/service/lichCBTTTKService.js' />"></script>
<script src="<c:url value='/static/js/controller/lichCBTTTKController.js' />"></script>

<div ng-app="myApp" class="content-wrapper ng-cloak">
	<section class="content-header">
		<h3 class="title">Lịch công bố thông tin thống kê</h3>
	</section>
	<section class="content">
		<div ng-controller="LichCBTTTKController as ctrl" class="modal-body">
			<uib-tabset active="tabActiveIndex">
				<uib-tab index="0" heading="Lịch chính thức" select="changeTab(0)">	    	
	      		</uib-tab>
	      		<uib-tab index="1" heading="Lịch nội bộ" select="changeTab(1)">	    	
	      		</uib-tab>
			</uib-tabset>
			
			<div class="">
				<%@ include file="lichCBTTTK_tab.jsp"%>
			</div>
			
			<input type="hidden" ng-bind="ctrl.lichCBTTId"/>
		</div>
	</section>
	<div class="row">
		<div class="fade-in-out" ng-show="showLoading">
			<uib-progressbar class="progress-striped active progressBar" type="info"></uib-progressbar>
		</div>
	</div>
</div>