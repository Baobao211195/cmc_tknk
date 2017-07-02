<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>

<div style="width: 100%; height: 85%;">
	<div class="modal-header">
		<h4 class="col-md-8" >Quản lý tổ chức cá nhân làm công tác thống kê</h4>
		<div class="col-md-4" align="right">

			<a href="{{UrlPDF}}" class="btn btn-primary">PDF</a>
			<button class="btn btn-primary" ng-click="cancel()">Đóng</button>
		</div>
	</div>
	<div style="width: 100%; height: 100%;">

		<div style="width: 100%; height: 100%;" align="center">	
			
				<iframe src="{{Url}}" style="width: 100%; height: 100%;"></iframe>		
		</div>
	</div>
	<br /> <br />
</div>