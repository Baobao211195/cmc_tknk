<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<style type="text/css">
form.tab-form-demo .tab-pane {
	margin: 20px 20px;
}
</style>


<!-- <title>Danh mục thống kê tiêu chuẩn</title> -->
<!-- </head> -->
<div class="content-wrapper" ng-app="myApp" ng-controller="TabsDemoCtrl">
	<section class="content-header panel panel-success">
	<h5 class="title">Xem thay đổi do bổ sung tờ khai từ các hệ thống</h5>
	</section>
	<section class="content">

	<form name="outerForm" class="tab-form-demo">
		<uib-tabset active="activeForm"> 
			<uib-tab index="1" heading="Xuất khẩu" select="tabSelected1()"> </uib-tab> 
			<uib-tab index="2" heading="Nhập khẩu" select="tabSelected2()"> </uib-tab> 
		</uib-tabset>
	</form>

	<div class="messageArea"></div>
	<div class="messageErrorArea"></div>
	<div class="">
		<%@ include file="thayDoiBoSungToKhaiHeThong.jsp"%>
	</div>
	</section>
</div>


