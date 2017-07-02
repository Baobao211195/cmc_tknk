<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- <div ng-controller="PhanCong_Controller"> -->
	<fieldset class="form-group form-wrapper" >
		<div style="overflow-x: scroll;">
		<div class="col-md-12 pgcount">
			<h4 class="col-md-4" style="font-family: inherit;">Tổng số {{lstPhanCong.length}} bản ghi</h4>
		</div>
		<table id="example" class="table table-striped table-bordered" style="max-width: 100%;" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th rowspan="2">STT</th>
					<th rowspan="2">Tên công việc</th>
					<th rowspan="2"  ng-if="displayHQ">Tên cục</th>
					<th rowspan="2">Từ ngày</th>
					<th rowspan="2">Đến ngày</th>
					<th colspan="2">Phương án 1</th>
					<th colspan="2">Phương án 2</th>
					<th colspan="2">Phương án 3</th>
					<th rowspan="2">Ghi chú</th>
					<th colspan="4" rowspan="2">Sửa đổi</th>
				</tr>
				<tr>
					<th>Tên đăng nhập</th>
					<th>Tên đầy đủ</th>
					<th>Tên đăng nhập</th>
					<th>Tên đầy đủ</th>
					<th>Tên đăng nhập</th>
					<th>Tên đầy đủ</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="row in phantrang">
					<td align="center">{{(currentPage - 1) * numPerPage + ($index + 1)}}</td>
					<td>{{row.tenCv}}</td>
					<td ng-if="displayHQ">{{row.tenHq}}</td>
					<td>{{row.tuNgay  | date:'dd/MM/yyyy'}}</td>
					<td>{{row.denNgay | date:'dd/MM/yyyy'}}</td>
					<td>{{row.userNamePa1}}</td>
					<td>{{row.fullNamePa1}}</td>
					<td>{{row.userNamePa2}}</td>
					<td>{{row.fullNamePa2}}</td>
					<td>{{row.userNamePa3}}</td>
					<td>{{row.fullNamePa3}}</td>
					<td>{{row.ghiChu}}</td>
					<td><button type="button" ng-click="doOpenEdit(row.stt)" class="btn btn-primary custom-width">Sửa</button></td>
					<td><button type="button" ng-click="doRemove(row.stt)" class="btn btn-danger custom-width">Xóa</button></td>
				</tr>
			</tbody>
		</table>
		</div>
		<div class="col-md-12">
			<div class="col-md-2" style="margin-top: 25px;">Trang {{currentPage}} / {{totalPage}}</div>
			<div class="col-md-6">
				<pagination total-items="lstPhanCong.length"
					ng-change="pageChanged(currentPage)" ng-model="currentPage"
					max-size="maxSize" class="pagination" boundary-links="true"
					rotate="false"></pagination>
			</div>
		</div>
	</fieldset>
<!-- </div> -->