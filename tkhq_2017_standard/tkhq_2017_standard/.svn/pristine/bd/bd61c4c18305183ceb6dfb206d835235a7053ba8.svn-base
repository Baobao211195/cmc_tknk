<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- <script src="<c:url value='/static/js/service/dienBienSoLieuChiTieuTKService.js' />"></script>
<script src="<c:url value='/static/js/controller/dienBienSoLieuChiTieuTKController_chart.js' />"></script>  --%>

<div class="generic-container">

	<fieldset class="form-group form-wrapper">
		<form class="form-search">
			<div class="row" style="width: 60%;">
				<div class="col-md-4">
					<input type="radio" name="gender" value="KY" ng-model="radioBox">
					Kỳ
				</div>
				<div class="col-md-4 ">
					<input type="radio" name="gender" value="THA" ng-model="radioBox"
						checked="true"> Tháng
				</div>
			</div>
			<div align="center">
				<button type="submit" id="btnSearch" ng-click="showChart()"
					class="btn btn-primary">Xem biểu đồ</button>
			</div>
		</form>
	</fieldset>
	<div ng-show="showChart2">
	<!-- <div class="row"> -->
	<div style="text-align: right">Đơn vị tính: Nghìn USD</div>
<!-- </div> -->
<!-- <div style="width:100%; overflow-x: scroll;"> -->
<table id="tblSoLieuChiTieu"
	style="width: 100%; border-spacing: 5px; border-collapse: separate;">
	<!-- class="table table-bordered table-striped table-responsive"> -->
	<tr class="row">
		<td><label>Biểu đồ trị giá thống kê(USD)</label>
	<iframe ng-src="{{soLieuChiTieuTKNNCtrl.linkAPI}}"
		style="width: 100%; height: 320px; border: 1px solid grey;"
		scrolling="auto" allowtransparency="true"></iframe>
		</td>
	</tr>
</table>
<!-- </div> -->
<div class="form-group row form-btn-align" align="center">
	<button type="button" class="btn btn-primary" data-toggle="modal"
			data-target="#myModal" >
		<!-- ng-click="soLieuChiTieuTKNNCtrl.feedBack()"> -->
		<i class="glyphicon icon-white"></i>Phản hồi
	</button>
	<button type="button" id="btnDel" class="btn btn-primary"
		ng-click="clickDongButton()">
		<i class="glyphicon icon-white"></i>Đóng
	</button>
</div>
</div>
</div>
