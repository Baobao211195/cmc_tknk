<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.col-md-4 {
	padding-left: 5px;
	padding-right: 1px;
}
</style>
<div class="generic-container">
	<fieldset class="form-group form-wrapper">
		<form class="form-search">
			<div class="row">

				<div class="col-md-6">
					<label class="col-md-4">Mặt hàng </label>
					<div class="col-md-8">
						<select class="form-control"
							ng-options="item as item.ten for item in dienBienHangHoaXNKCtrl.lstMatHang"
							ng-model="matHang"></select>
					</div>
				</div>
				<div class="col-md-6">
					<div class="col-md-6">
						<input type="radio" name="gender" value="KY" ng-model="radioBox"
							checked="true"> Kỳ
					</div>
					<!-- </div>
						<div class="col-md-3"> -->
					<div class="col-md-6">
						<input type="radio" name="gender" value="THA" ng-model="radioBox">
						Tháng
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<label class="col-md-4">Cục Hải quan </label>
					<div class="col-md-8">
						<select class="form-control"
							ng-options="item as item.ten for item in dienBienHangHoaXNKCtrl.lstCucHQ"
							ng-model="cucHQSeletected"
							ng-change="GetChiCucHQByCuc()">
							<!-- ng-change="dienBienHangHoaXNKCtrl.CucHQSelect(cucHQSeletected)"> --></select>
					</div>
				</div>
				<div class="col-md-6">
					<label class="col-md-4">Chi cục Hải quan </label>
					<div class="col-md-8">
						<select class="form-control"
							ng-options="item as item.ten for item in dienBienHangHoaXNKCtrl.lstChiCuc"
							ng-model="chicucHQSeletected" ng-change=""></select>
					</div>
				</div>
			</div>
			<br />
			<div align="center">
				<button type="submit" id="btnSearch" ng-click="showChart()"
					class="btn btn-primary">Xem biểu đồ</button>
			</div>
		</form>
	</fieldset>
</div>
<div ng-show="showChart2">
	<!-- <div style="width:100%; overflow-x: scroll;"> -->
	<table id="tblSoLieuChiTieu"
		style="width: 100%; border-spacing: 5px; border-collapse: separate;">
		<tr>
			<!-- <td class="col-md-6"><label class="col-md-6">Biểu đồ đơn
					vị tính</label> <iframe src="{{dienBienHangHoaXNKCtrl.linkAPI_dvt}}"
					style="width: 100%; height: 320px; border: 1px solid grey;"
					scrolling="none" allowtransparency="true"></iframe></td> -->
			<td class="col-md-6"><label class="col-md-6">Biểu đồ số
					lượng thống kê</label> <iframe
					ng-src="{{dienBienHangHoaXNKCtrl.linkAPI_LuongTK}}"
					style="width: 100%; height: 320px; border: 1px solid grey;"
					scrolling="none" allowtransparency="true"></iframe></td>
			<td class="col-md-6"><label class="col-md-6">Biểu đồ đơn
					giá thống kê</label>
				<!-- <div class="row">
					<div style="text-align: right">&nbsp;</div>
				</div>  -->
				<iframe ng-src="{{dienBienHangHoaXNKCtrl.linkAPI_dongiaTK}}"
					style="width: 100%; height: 320px; border: 1px solid grey;"
					scrolling="none" allowtransparency="true"></iframe></td>
		</tr>
		<tr>
			<td class="col-md-6"><label class="col-md-6">Biểu đồ trị
					giá thống kê(USD)</label>
				<div class="row">
					<div style="text-align: right">Đơn vị tính: Nghìn USD</div>
				</div> <iframe ng-src="{{dienBienHangHoaXNKCtrl.linkAPI_trigiaTk}}"
					style="width: 100%; height: 320px; border: 1px solid grey;"
					scrolling="none" allowtransparency="true"></iframe></td>			
		</tr>
	</table>
	<!-- </div> -->
	</br>
	<div class="form-group row form-btn-align" align="center">
		<button type="button" class="btn btn-primary" data-toggle="modal"
			data-target="#myModal">
			<!-- ng-click="dienBienHangHoaXNKCtrl.feedBack()"> -->
			<i class="glyphicon icon-white"></i>Phản hồi
		</button>
		<button type="button" id="btnDel" class="btn btn-primary"
			ng-click="clickDongButton()">
			<i class="glyphicon icon-white"></i>Đóng
		</button>
	</div>
	<br />
</div>
<style>
.red {
	background-color: red;
}

.green {
	background-color: green;
}
</style>
