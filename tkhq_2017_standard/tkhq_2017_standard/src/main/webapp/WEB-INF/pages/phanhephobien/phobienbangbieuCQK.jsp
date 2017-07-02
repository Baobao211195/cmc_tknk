<%@page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
	var _coquan = "4";
	var _isIE = /*@cc_on!@*/false || !!document.documentMode;
	var _isKetXuat = false;
</script>
<script
	src="<c:url value='/static/js/service/Tbs_dmBaoCaoService.js' />"></script>
<script
	src="<c:url value='/static/js/controller/Tbs_dmBaoCaoController.js' />"></script>
<div ng-app="myApp" class="content-wrapper" ng-controller="Tbs_dmBaoCaoController as controller">
	<section class="content-header">
		<h3 class="title">PHỔ BIẾN BẢNG BIỂU THEO CƠ QUAN KHÁC</h3>
	</section>
	<%@ include file="phobienbanbieu_Form.jsp"%>
</div>

