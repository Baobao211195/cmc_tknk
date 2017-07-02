<%@page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
	var _coquan = "1";
	  
</script>
<script
	src="<c:url value='/static/js/service/Tbs_dmBaoCaoService.js' />"></script>
<script
	src="<c:url value='/static/js/controller/Tbs_dmBaoCaoController.js' />"></script>
<div ng-app="myApp" class="content-wrapper"
	ng-controller="Tbs_dmBaoCaoController as PHBBCtrl">
	<section class="content-header" >
		<h3 class="title">Phổ biến bảng biểu theo QĐ 15</h3>
	</section>
	<%@ include file="phobienbanbieu_Form.jsp"%>
</div>




