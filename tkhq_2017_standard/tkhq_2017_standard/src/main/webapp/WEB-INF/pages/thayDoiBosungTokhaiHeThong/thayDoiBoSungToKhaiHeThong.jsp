<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script
	src="<c:url value='/static/js/service/thayDoiBoSungToKhaiHeThongService.js' />"></script>
<script
	src="<c:url value='/static/js/controller/thayDoiBoSungToKhaiHeThongController.js' />"></script>

<!-- <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/> -->
<style>
.col-md-4 {
	padding-right: 5px;
	padding-left: 1px;
}
</style>
<div
	ng-controller="thayDoiBoSungToKhaiHeThongController as heThongNNCtrl">
	<div class="row">
		<div class="fade-in-out" ng-show="showLoading">
			<uib-progressbar class="progress-striped active progressBar"
				type="info"></uib-progressbar>
		</div>
	</div>
	<!-- <script type="text/javascript">
		var _isIE = /*@cc_on!@*/false || !!document.documentMode;	
	</script> -->
	<!-- <div>	 -->
	<!-- <fieldset class="form-group form-wrapper">			
			<form class="form-search"> -->
	<div class="col-md-12">

		<div class="col-md-4">
			<label class="col-md-4">Loại kỳ:</label>
			<div class="col-md-8">
				<select class="form-control"
					ng-options="item as item.ten for item in heThongNNCtrl.lstLoaiKy"
					ng-model="LoaiKy" ng-change="heThongNNCtrl.selectLoaiKy(LoaiKy)"></select>
			</div>
		</div>
		<div class="col-md-4">
			<label class="col-md-4">Cục Hải quan:</label>
			<div class="col-md-8">
				<select class="form-control "
					ng-options="item as item.ten for item in heThongNNCtrl.lstCucHQ"
					ng-model="CucHQ" ng-change="heThongNNCtrl.CucHQSelect(CucHQ)"></select>
			</div>
		</div>
		<div class="col-md-4">
			<label class="col-md-4">Chi cục HQ:</label>
			<div class="col-md-8">
				<select class="form-control "
					ng-options="item as item.ten for item in heThongNNCtrl.lstChiCucHQ"
					ng-model="ChiCucHQ" ng-change=""></select>
			</div>
		</div>
		<div class="col-md-4" ng-hide="heThongNNCtrl.hideKy">
			<label class="col-md-4">Kỳ:</label>
			<div class="col-md-8">
				<select class="form-control"
					ng-options="item for item in heThongNNCtrl.lstKy" ng-model="Ky"
					ng-change=""></select>
			</div>
		</div>
		<div class="col-md-4" ng-hide="heThongNNCtrl.hideThang">
			<label class="col-md-4">Tháng:</label>
			<div class="col-md-8">
				<select class="form-control"
					ng-options="item for item in heThongNNCtrl.lstThang"
					ng-model="Thang" ng-change=""></select>
			</div>
		</div>
		<div ng-hide="heThongNNCtrl.hideNam" class="col-md-4">
			<label class="col-md-4">Năm:</label>
			<div class="col-md-8">
				<select class="form-control"
					ng-options="item as item for item in heThongNNCtrl.lstNam"
					ng-model="Nam"></select>
			</div>
			<!-- <div class="form-group has-feedback col-md-8"
				style="margin-bottom: 0px">

				<input type="text" name="year" class="form-control date-picker" readonly="readonly" style="background: white;"
					uib-datepicker-popup="yyyy" ng-model="heThongNNCtrl.year"
					is-open="popup3.opened" ng-click="open3()"
					datepicker-options="yearOptions" close-text="Close" required /> <i
					class="fa fa-calendar form-control-feedback" ng-click="open3()"
					style="top: 3px;"></i>

			</div> -->
		</div>
		<div ng-hide="heThongNNCtrl.hideFromDate" class="col-md-4">
			<label class="col-md-4">Từ ngày:</label>
			<div class="form-group has-feedback col-md-8"
				style="margin-bottom: 0px">

				<input type="text" name="fromDate" class="form-control"
					uib-datepicker-popup="dd/MM/yyyy" ng-model="heThongNNCtrl.fromDate" readonly="readonly" style="background-color: white;"
					is-open="popup1.opened" ng-click="open1()"
					datepicker-options="dateOptions" close-text="Close" required /> <i
					class="fa fa-calendar form-control-feedback" ng-click="open1()"
					style="top: 3px;"></i>


			</div>
		</div>
		<div ng-hide="heThongNNCtrl.hideToDate" class="col-md-4">
			<label class="col-md-4">Đến ngày:</label>
			<div class="form-group has-feedback col-md-8" 
				style="margin-bottom: 0px">

				<input type="text" name="toDate" class="form-control" readonly="readonly" style="background-color: white;"
					uib-datepicker-popup="dd/MM/yyyy" ng-model="heThongNNCtrl.toDate"
					is-open="popup2.opened" ng-click="open2()"
					datepicker-options="dateOptions" close-text="Close" required /> <i
					class="fa fa-calendar form-control-feedback" ng-click="open2()"
					style="top: 3px;"></i>


			</div>
		</div>
		<div class="col-md-4">
			<label class="col-md-4">Mặt hàng:</label>
			<div class="col-md-8">
				<select class="form-control "
					ng-options="item as item.ten for item in heThongNNCtrl.lstMatHang"
					ng-model="MatHang" ng-change=""></select>
			</div>
		</div>

	</div>
	<!-- <table style="width: 100%">
					
					
				</table> -->
	<br />
	<div class="form-group row form-btn-align" align="center">
		<button type="submit" id="btnSearch" ng-click="heThongNNCtrl.search()"
			class="btn btn-primary">
			<i class="glyphicon icon-white"></i>Xem báo cáo
		</button>
	</div>
	<!-- </form>
		</fieldset> -->
	<!-- </div> -->
	<!-- <div class="row" >
		<label class="pagination-md col-md-4 ">Tổng: {{heThongNNCtrl.totalItems}}</label>				
			<ul uib-pagination total-items="heThongNNCtrl.totalItems"
				ng-model="heThongNNCtrl.currentPage"
				max-size="heThongNNCtrl.maxSize" ng-change="pageChanged()"
				class="" boundary-link-numbers="true" rotate="false"></ul>		
	</div> -->
	<div ng-show="showReport1">
		<div class="col-md-12">
			<div class="box">
				<div class="box-body" style="overflow-x: scroll">
					<table id="tblHethong"
						class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
								<!-- <th><input type="checkbox" ng-model="heThongNNCtrl.checkAll"></th> -->
								<!--<th>STT</th> -->
								<th>Mô tả HH</th>
								<th>Mã hàng</th>
								<th>Mã TK</th>
								<th>Nghi ngờ</th>
								<th>Is_tk</th>
								<th>SD</th>
								<th>ĐVT TK</th>
								<th>Đơn giá(USD)</th>
								<th>Đơn giá(VND)</th>
								<th>Lượng</th>
								<th>Lượng TK</th>
								<th>Trị giá(USD)</th>
								<th>Trị giá(VND)</th>
								<th>Trị giá TK(USD)</th>
								<th>Trị giá TK(VND)</th>
								<th>Mã ĐV</th>
								<th>Mã HQ</th>
								<th>Mã loại hình</th>
								<th>Số tờ khai</th>
								<th>Tháng</th>
								<th>Kỳ</th>
								<th>{{heThongNNCtrl.nuocXNK}}</th>
								<th>Nước XX</th>
								<th>Mã nguyên tệ</th>
								<th>Ngày đăng kí</th>
								<th>Cảng NN</th>
								<th>Mã CK nhập</th>
								<th>Tên CK nhập</th>
								<th>Mã CK xuất</th>
								<th>Tên CK xuất</th>
							</tr>
						</thead>
						<tbody>
							<tr ng-repeat="row in heThongNNCtrl.lstCuaKhauNN"
								ng-model="lstVANLH">
								<td ng-bind="row.mo_ta"></td>
								<td ng-bind="row.ma_hang"></td>
								<td ng-bind="row.ma_tk"></td>
								<td><input type="checkbox" ng-checked="row.is_nghingo"
									ng-model="row.is_nghingo"></td>
								<td ng-bind="row.is_tk"></td>
								<td ng-bind="row.sd"></td>
								<td ng-bind="row.dvt_tk"></td>
								<td ng-bind="row.don_gia_usd"></td>
								<td ng-bind="row.don_gia_vnd"></td>
								<td ng-bind="row.luong"></td>
								<td ng-bind="row.luong_tk"></td>
								<td ng-bind="row.tri_gia_usd"></td>
								<td ng-bind="row.tri_gia_vnd"></td>
								<td ng-bind="row.tri_gia_tk_usd"></td>
								<td ng-bind="row.tri_gia_tk_vnd"></td>
								<td ng-bind="row.ma_dv"></td>
								<td ng-bind="row.ma_hq"></td>
								<td ng-bind="row.ma_lh"></td>
								<td ng-bind="row.so_tk"></td>
								<td ng-bind="row.thang"></td>
								<td ng-bind="row.ky"></td>
								<td ng-bind="row.nuoc_nk"></td>
								<td ng-bind="row.nuoc_xx"></td>
								<td ng-bind="row.ma_nt"></td>
								<td ng-bind="row.ngay_dk"></td>
								<td ng-bind="row.cang_nn"></td>
								<td ng-bind="row.ma_cuakhau_nk"></td>
								<td ng-bind="row.ten_cuakhau_nk"></td>
								<td ng-bind="row.ma_cuakhau_xk"></td>
								<td ng-bind="row.ten_cuakhau_xk"></td>

								<!-- <td>
					<button type="button" ng-click="heThongNNCtrl.editRow(row.maCang)"
						class="btn btn-success custom-width">Edit</button>
				</td> -->
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<br /> <br />
		<div class="form-group row form-btn-align" align="center">
			<button type="submit" id="doExport" ng-click="doExport()"
				class="btn btn-primary" style="width: 100px;">
				<i class="glyphicon icon-white"></i>Kết xuất
			</button>
			<button type="button" id="doPrint" class="btn btn-primary"
				ng-click="doPrint()" style="width: 100px;">
				<i class="glyphicon icon-white"></i>In
			</button>
			<!-- <button type="button" id="btnDel" class="btn btn-primary"
			ng-click="">
			<i class="glyphicon icon-white"></i>Đóng
		</button> -->
		</div>
		<br />
	</div>
</div>