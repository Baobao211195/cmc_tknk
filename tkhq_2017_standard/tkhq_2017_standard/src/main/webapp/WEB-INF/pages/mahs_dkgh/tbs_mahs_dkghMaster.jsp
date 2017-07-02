<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
    var _contextPath = "${pageContext.request.contextPath}";
</script>
<!-- AngularJS -->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.6/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.6/angular-animate.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.6/angular-touch.min.js"></script>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.6/angular-route.js"></script> -->
<script src="http://ui-grid.info/release/ui-grid.js"></script>
<script src="http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.14.3.js"></script>
<script src="http://unpkg.com/angular-ui-router@0.4.2/release/angular-ui-router.js"></script>

<link href="//netdna.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
<link href="<c:url value="/static/css/app.css" />" rel="stylesheet" />

<title>Danh muc thong ke tieu chuan</title>
</head>
<body>
	<div ng-app="myApp" class="ng-cloak">
		<div class="messageArea"></div>
		<div class="messageErrorArea"></div>
		<%@ include file="tbs_mahs_dkgh.jsp" %>
	</div>
	<script src="<c:url value='/static/js/app.js' />"></script>
	<script src="<c:url value='/static/js/service/TBSMahsDkghService.js' />"></script>
	<script src="<c:url value='/static/js/service/pagerService.js' />"></script>		
	<script src="<c:url value='/static/js/service/confirmDialogService.js' />"></script>
	<script src="<c:url value='/static/js/controller/TBSMahsDkghControllser.js' />"></script>
</body>
</html>