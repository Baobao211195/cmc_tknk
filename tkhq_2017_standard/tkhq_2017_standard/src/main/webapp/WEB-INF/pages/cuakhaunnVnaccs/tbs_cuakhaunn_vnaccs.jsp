<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<c:url value='/static/js/service/tbs_cuakhaunnService.js' />"></script>
<script src="<c:url value='/static/js/controller/tbs_cuakhaunnController.js' />"></script>

<div class="" ng-controller="Tbs_CuaKhauNNController as cuaKhauNNCtrl">
	<div class="box-search">
		<fieldset class="form-group">
			<form class="form-search">
				<table style="width: 100%">
					<tr>
						<td>
							<label class="col-sm-3">Mã cảng:</label>
							<div class="col-sm-3">
								<input type="text" id="maCang" ng-model="maCang" />
							</div>
						</td>
						<td>
							<label class="col-sm-3">Loại cảng:</label>
							<div class="col-sm-6">
								<input type="text" id="loaiCang" ng-model="loaiCang" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<label class="col-sm-3">Mã nước:</label>
							<div class="col-sm-6">
								<input type="text" id="maNuoc" ng-model="maNuoc" />
							</div>
						</td>
						<td>
							<label class="col-sm-3">Tên nước:</label>
							<div class="col-sm-3">
								<input type="text" id="tenNuoc" ng-model="tenNuoc" />
							</div>
						</td>
					</tr>
					<tr>
						<td><label class="col-sm-3">Tên thành phố:</label>
							<div class="col-sm-3">
								<input type="text" id="tenTP" ng-model="tenTP" />
							</div></td>
						<td></td>
					</tr>
				</table>
				</br>
				<div class="form-group row form-btn-align" align="center">
					<button type="submit" id="btnSearch"
						ng-click="cuaKhauNNCtrl.search(1, cuaKhauNNCtrl.pageSize)" class="btn btn-primary">
						Tìm kiếm
					</button>
					<button type="button" id="addRow" class="btn btn-primary"
						ng-click="addRow()">Thêm mới
					</button>					
					<button type="button" id="btnDel" class="btn btn-danger"
						ng-click="cuaKhauNNCtrl.remove()">Xóa
					</button>
				</div>
			</form>
		</fieldset>
	</div>
	<div class="col-md-12">
		<div class ="col-sm-2 paging-record">Tổng số bản ghi: {{cuaKhauNNCtrl.totalItems}}</div>
		<div class ="col-sm-6">
			<pagination total-items="cuaKhauNNCtrl.totalItems" ng-change="pageChanged()" ng-model="cuaKhauNNCtrl.currentPage"
				max-size="cuaKhauNNCtrl.maxSize" class="pagination" boundary-links="true" rotate="false"></pagination>
		</div>
	</div>
	<table id="tblCuaKhauNN" class="table table-bordered table-striped table-responsive">
		<%-- <colgroup>
			<col width="6%" />
			<col width="16%" />
			<col width="25%" />
			<col width="15%" />
			<col width="25%" />
			<col width="10%" />
		</colgroup> --%>
		<thead>
			<tr>
				<th><input type="checkbox" ng-model="cuaKhauNNCtrl.checkAll" ng-click="toggleAll()"></th>
				<!--<th>STT</th> -->
				<th>Mã cảng</th>
				<th>Tên thành phố</th>
				<th>Mã nước</th>
				<th>Tên nước</th>
				<th>Loại cảng</th>
				<th>Thao tác</th>
			</tr>
		</thead>
		<tbody align="center">
			<tr ng-repeat="row in cuaKhauNNCtrl.lstCuaKhauNN">
				<td><input type="checkbox" ng-checked="cuaKhauNNCtrl.checkAll"
					ng-model="row.isChecked"></td>
				<!-- <td><input type="hidden" value="{{row.bieuThueId}}" /><span>{{$index +1}}</span></td> -->
				<td ng-bind="row.maCang"></td>
				<td ng-bind="row.tenTP"></td>
				<td ng-bind="row.maNuoc"></td>
				<td ng-bind="row.tenNuoc"></td>
				<td ng-bind="row.loaiCang"></td>
				<td>
					<button type="button" ng-click="cuaKhauNNCtrl.editRow(row.maCang)"
						class="btn btn-warning custom-width">Sửa</button>
				</td>
			</tr>
		</tbody>
	</table>
	<div class="col-md-12">
		<div class ="col-sm-2"></div>
		<div class ="col-sm-6">
			<pagination total-items="cuaKhauNNCtrl.totalItems" ng-change="pageChanged()" ng-model="cuaKhauNNCtrl.currentPage"
				max-size="cuaKhauNNCtrl.maxSize" class="pagination" boundary-links="true" rotate="false"></pagination>
		</div>
	</div>
</div>