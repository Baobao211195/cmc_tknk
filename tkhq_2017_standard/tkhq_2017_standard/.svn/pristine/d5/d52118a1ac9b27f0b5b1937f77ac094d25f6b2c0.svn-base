<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<c:url value='/static/js/service/qlUserSDSPTKService.js' />"></script>
<script src="<c:url value='/static/js/controller/qlUserSDSPTKController.js' />"></script>

<div ng-app="myApp" class="content-wrapper ng-cloak">
	<section class="content-header">
		<h2 class="title">Quản lý tổ chức, cá nhân sử dụng sản phẩm thống kê</h2>
	</section>
	<section class="content">
		<div ng-controller="QLUserSDSPTKController as ctrl" class="modal-body">
			<div class="table-scroll" style="text-align: center;">
				<div class="col-md-12">
					<div class="col-sm-2">Tổng số bản ghi: {{ctrl.totalItems}}</div>
				</div>
				<table id="tblQLUserSDSPTK" class="table table-bordered">
					<colgroup>
						<%-- 						<col width="50" /> --%>
						<%-- 						<col width="50" /> --%>
						<%-- 						<col width="150" /> --%>
						<%-- 						<col width="150" /> --%>
						<%-- 						<col width="150" /> --%>
						<%-- 						<col width="120" /> --%>
						<%-- 						<col width="300" /> --%>
						<%-- 						<col width="120" /> --%>
						<%-- 						<col width="120" /> --%>
						<%-- 						<col width="150" /> --%>
						<%-- 						<col width="120" /> --%>
						<%-- 						<col width="120" /> --%>
						<%-- 						<col width="150" /> --%>
						<%-- 						<col width="150" /> --%>
						<%-- 						<col width="120" /> --%>
						<%-- 						<col width="120" /> --%>
					</colgroup>
					<thead>
						<tr>
							<th><input type="checkbox" ng-model="ctrl.checkAll" ng-click="toggleAll()"></th>
							<th>STT</th>
							<th>Tổ chức sử dụng sản phẩm thống kê</th>
							<th>Cá nhân sử dụng sản phẩm thống kê</th>
							<th>Email</th>
							<th>Điện thoại</th>
							<th>Mô tả chi tiết nhu cầu thông tin/ số liệu của người sử dụng</th>
							<th>Các chỉ tiêu thống kê chính</th>
							<th>Các khái niệm định nghĩa (nếu có)</th>
							<th>Căn cứ vào công văn, bản ghi nhớ, thỏa thuận, thông tư, nghị định, quyết định</th>
							<th>Tần suất Thường xuyên/Không thường xuyên</th>
							<th>Đề xuất dạng dữ liệu</th>
							<th>Công chức được phân công xử lý</th>
							<th>Ghi chú</th>
							<th>Mức độ áp dụng</th>
							<th>Thao tác</th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="row in ctrl.lstQLUser">
							<td><input type="checkbox" ng-checked="ctrl.checkAll" ng-model="row.isChecked"></td>
							<td><input type="hidden" value="{{row.resourceId}}" /><span>{{(ctrl.currentPage
									- 1) * ctrl.pageSize + ($index + 1)}}</span></td>
							<td ng-bind="row.tenTochuc"></td>
							<td ng-bind="row.tenCanhan"></td>
							<td ng-bind="row.email"></td>
							<td ng-bind="row.mobile"></td>
							<td ng-bind="row.mota"></td>
							<td ng-bind="row.chitieuTK"></td>
							<td ng-bind="row.khainiem"></td>
							<td ng-bind="row.cancu"></td>
							<td ng-bind="row.tansuat"></td>
							<td ng-bind="row.dexuatDL"></td>
							<td ng-bind="row.userName"><input type="hidden"
								value="{{row.userId}}" /></td>
							<td ng-bind="row.ghichu"></td>
							<td ng-bind="row.mucdo"></td>
							<td>
								<button type="button" ng-click="ctrl.editRow(row.resourceId)"
									class="btn btn-warning">Sửa</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-sm-12">
				<ul uib-pagination total-items="ctrl.totalItems" style="margin: 5px"
					ng-model="ctrl.currentPage" max-size="ctrl.maxSize"
					ng-change="pageChanged()" class="pagination-sm"
					boundary-link-numbers="true" rotate="false"></ul>
			</div>
			<div class="col-md-12" align="center">
				<button type="button" id="addButton" class="btn btn-primary"
					ng-click="ctrl.addRow()">Thêm mới</button>
				<button type="button" id="btnDel" class="btn btn-danger"
					ng-click="ctrl.remove()">Xóa</button>
				<button type="button" id="btnExportXK" ng-click="ctrl.doExport()"
					class="btn btn-primary">Kết xuất</button>
				<button type="button" id="btnPrintXK" ng-click="ctrl.doPrint()"
					class="btn btn-info">In</button>
			</div>
		</div>
	</section>
	
	<div class="row">
		<div class="fade-in-out" ng-show="showLoading">
			<uib-progressbar class="progress-striped active progressBar" type="info"></uib-progressbar>
		</div>
	</div>
</div>
