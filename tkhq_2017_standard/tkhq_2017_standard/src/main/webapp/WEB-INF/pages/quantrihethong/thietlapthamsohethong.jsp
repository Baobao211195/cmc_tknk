<%@page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script
	src="<c:url value='/static/js/service/TbdSysParameters_Service.js' />"></script>
<script
	src="<c:url value='/static/js/controller/TbdSysParameters_Controller.js' />"></script>
<style>
.table-bordered>tbody>tr>td {
	white-space: nowrap;
}

.col-md-4 {
	padding-left: 5px;
	padding-right: 1px;
	padding-bottom: 10px;
}
</style>
<div ng-app="myApp" class="content-wrapper"
	ng-controller="TbdSysParameterController as ctrl">
	<section class="content-header">
		<h3 class="title">
			<span style="vertical-align: middle;">THIẾT LẬP THAM SỐ HỆ
				THỐNG</span>
		</h3>
	</section>
	<section class="content">
		<div class="row" style="padding-top: 10px;">

			<div class="col-md-6">
				<label class="col-md-4">Tên tham số: </label>
				<div class="col-md-8">
					<input type="text" name="userName" class="form-control"
						ng-model="paramName" />
				</div>
			</div>
			<div class="col-md-6">
				<label class="col-md-4">Giá trị: </label>
				<div class="col-md-8">
					<input type="text" name="fullName" ng-model="paramValue"
						class="form-control" />
				</div>
			</div>
			<div class="col-md-6">
				<label class="col-md-4">Người cập nhật: </label>
				<div class="col-md-8">
					<input type="text" name="userName" class="form-control"
						ng-model="paramUser" />
				</div>
			</div>
			<div class="col-md-6">
				<label class="col-md-4">Ngày cập nhật: </label>
				<div class="col-md-8">
					<input type="text" name="fullName" ng-model="paramDate" readonly="readonly" style="background-color: white;"
						class="form-control" uib-datepicker-popup="dd/MM/yyyy"
						is-open="popup1.opened" ng-click="open1()"
						datepicker-options="dateOptions" close-text="Close" required /> <i
						class="fa fa-calendar form-control-feedback"
						style="margin-top: -23px" ng-click="open1()"></i>
				</div>
			</div>

		</div>
		<div class="row">
				<div class="form-group row form-btn-align" align="center">
					<button type="submit" id="addRow" ng-click="Search()"
						class="btn btn-primary">
						<i class="glyphicon icon-white"></i>Tìm kiếm
					</button>
				</div>
			</div>
		<div class="col-md-12">
			<div class="col-sm-2">
				<label>Tổng số {{ctrl.lstParameters.length}} bản ghi </label>
			</div>
		</div>
		<div class="modal-body">
			<div class="box" style="margin-top: 10px;">
				<div class="box-body ">
					<div class="" style="overflow-x: scroll; overflow-y: scroll">
						<table id="example" class="table table-striped table-bordered"
							style="border-bottom: 1px solid #cccccc; -webkit-border-radius: 5px 5px 0px 0px !important; border-collapse: collapse; border-spacing: 0"
							cellspacing="0" width="100%">
							<thead>
								<tr>
									<!--<th>STT</th> -->
									<th align="center" class="col-md-1">Tên tham số</th>
									<th align="center" class="col-md-3">Giá trị</th>
									<th align="center" class="col-md-3">Người cập nhật</th>
									<th align="center" class="col-md-3">Ngày cập nhật</th>
									<th align="center" class="col-md-2">Sửa/Xóa</th>
								</tr>
							</thead>
							<tbody>
								<tr ng-if="ctrl.lstParameters "></tr>
								<tr ng-repeat="row in phantrang ">
									<td ng-bind="row.ten_thamSo" align="center"></td>
									<td ng-bind="row.gia_tri"></td>
									<td ng-bind="row.nguoi_capnhat"></td>
									<td ng-bind="row.ngay_capnhat"></td>
									<td align="center"><button type="button"
											ng-click="ctrl.editRow(row.ma)" data-toggle="modal"
											data-target="#myModal" class="btn btn-primary custom-width">Sửa</button>
										<button type="button" ng-click="ctrl.remove(row.ma)"
											class="btn btn-danger custom-width">Xóa</button></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="col-md-12">
					<div class="col-sm-2 paging-record">Trang {{currentPage}} /
						{{totalPage}}</div>
					<div class="col-sm-6">
						<pagination total-items="ctrl.lstParameters.length"
							ng-change="pageChanged()" ng-model="currentPage"
							max-size="maxSize" class="pagination" boundary-links="true"
							rotate="false"></pagination>
					</div>
				</div>
			</div>
		</div>
		<div class="form-group row form-btn-align" align="center">
			<button type="submit" id="addRow" ng-click="addRow()"  data-backdrop="static" 
				class="btn btn-primary" data-toggle="modal" data-target="#myModal">Thêm</button>

		</div>
	</section>
	<style type="text/css">
.col-sm-4 span {
	color: red;
	font-size: xx-small;
}

.app-modal-window .modal-dialog {
	width: 800px;
}

.content-wrapper {
	margin-left: 0px;
	min-height: 100%;
}

td {
	padding-top: 5px
}

select {
	width: 150px;
}
</style>
	<div class="modal fade" role="dialog" id="myModal"
		style="margin-top: 50px; margin-left: 35%; background: transparent;">
		<div style="background-color: #ecf0f5; width: 500px;">
			<section class="content-header panel panel-success"
				style="height: 50px;">
				<h2 class="title" style="font-size: 25px; padding: 2px"">{{Title}}</h2>
			</section>
			<section class="">
				<div class="modal-body">
					<form name="userForm" ng-submit="submitForm()" novalidate>

						<div class="col-md-12" style="margin: 5px">
							<label class="col-md-4">Tên tham số: </label>
							<div class="col-md-8">
								<input type="text" name="groupCode" maxlength="255"
									ng-model="ctrl.entity.ten_thamSo" style="width: 100%"
									ng-required=true /> <span class="error"
									ng-show="userForm.groupCode.$error.required ">Vui lòng
									không để trống</span>
							</div>

						</div>

						<div class="col-md-12" style="margin: 5px">
							<label class="col-md-4">Giá trị: </label>
							<div class="col-md-8">
								<input type="text" name="txtgroupName" maxlength="255"
									ng-model="ctrl.entity.gia_tri" required style="width: 100%"
									ng-required=true /> <span class="error"
									ng-show="userForm.txtgroupName.$error.required">Vui lòng
									không để trống</span>
							</div>
						</div>
						<div class="form-group row form-btn-align" align="center">
							<button type="button" name="btnGhilai" class="btn btn-primary"
								ng-click="AddNew()" ng-disabled="userForm.$invalid">Ghi
								Lại</button>
							<button type="button" name="btnThoat" class="btn btn-danger"
								ng-click="cancel()">Thoát</button>
						</div>
					</form>
				</div>
			</section>
		</div>
	</div>
</div>
