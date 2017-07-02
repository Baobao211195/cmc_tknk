<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="generic-container"
	ng-controller="TBSMahsDkghControllser as maHsdkgh">
	<div class="panel panel-success">
		<h3 class="panel-heading">Danh mục phí phương thức vận tải</h3>
	</div>
	<div class="container">
		<fieldset class="form-group form-wrapper">
			<legend class="form-wrapper">Thông tin tìm kiếm</legend>
			<form class="form-search">
				<table style="width: 100%">
					<tr>
						<td><label class="col-sm-3">STT:</label>
							<div class="col-sm-3">
								<input type="text" id="stt" ng-model="stt" />
							</div></td>
						<td><label class="col-sm-3">Mã phương thức vận tải:</label>
							<div class="col-sm-6">
								<input type="text" id="ma_PTVT" ng-model="ma_PTVT" />
							</div></td>
					</tr>
					<tr>
						<td><label class="col-sm-3">Phí bảo hiểm quốc tế:</label>
							<div class="col-sm-3">
								<input type="text" id="i" ng-model="i" />
							</div></td>
						<td><label class="col-sm-3">Phí vận tải quốc tế:</label>
							<div class="col-sm-6">
								<input type="text" id="f" ng-model="f" />
							</div></td>
					</tr>
					
				</table>
				</br>
				<div class="form-group row form-btn-align" align="center">
					<button type="submit" id="btnSearch"
						ng-click="cuaKhauNNCtrl.search(1, cuaKhauNNCtrl.pageSize)" class="btn btn-success">
						<i class="glyphicon glyphicon-search icon-white"></i>Tìm kiếm
					</button>
					<button type="button" id="addRow" class="btn btn-success"
						ng-click="addRow()">
						<i class="glyphicon glyphicon-plus icon-white"></i>Thêm mới
					</button>					
					<button type="button" id="btnDel" class="btn btn-danger"
						ng-click="cuaKhauNNCtrl.remove()">
						<i class="glyphicon glyphicon-remove icon-white"></i>Xóa
					</button>
				</div>
			</form>
		</fieldset>
	</div>
	
	<div class="row">
			<!-- <div>Total: {{maHsdkgh.totalItems}}</div> -->
			<div>
	<!-- <pagination total-items="maHsdkgh.totalItems" ng-change="pageChanged()" ng-model="maHsdkgh.currentPage" max-size="maHsdkgh.maxSize" class="pagination" boundary-links="true" rotate="false"></pagination> -->
	</div>
		</div>
	<table id="tblCuaKhauNN">
		<colgroup>
			<col width="5%" />
			<col width="10%" />
			<col width="25%" />
			<col width="20%" />
			<col width="25%" />
			<col width="15%" />
		</colgroup>
		<thead>
			<tr>
				<th><input type="checkbox" ng-model="maHsdkgh.checkAll"></th>
				<th>STT</th>
				<th>Mã phương thức vận tải</th>
				<th>Tên phương thức vận tải</th>
				<th>Phí bảo hiểm quốc tế</th>
				<th>Phí vận tải quốc tế</th>
			</tr>
		</thead>
		<tbody>
			<tr ng-repeat="row in maHsdkgh.lstCuaKhauNN">
				<td><input type="checkbox" ng-checked="maHsdkgh.checkAll"
					ng-model="row.isChecked"></td>
				<td ng-bind="row.stt"></td>
				<td ng-bind="row.ma_PTVT"></td>
				<td ng-bind="row.ten_PTVT"></td>
				<td ng-bind="row.i"></td>
				<td ng-bind="row.f"></td>
				<td>
					<button type="button" ng-click="maHsdkgh.editRow(row.stt)"
						class="btn btn-success custom-width">Edit</button>
				</td>
			</tr>
		</tbody>
	</table>
	<div class="row">
			<div></div>
			<div>
	<pagination total-items="maHsdkgh.totalItems" ng-change="pageChanged()" ng-model="maHsdkgh.currentPage" max-size="maHsdkgh.maxSize" class="pagination" boundary-links="true" rotate="false"></pagination>
	</div>
		</div>	
	<script type="text/ng-template" id="cuaKhaunnVnaccsEdit.html">
	<div>
		<div class="modal-header">
			<h4 class="modal-title">Thêm mới/Cập nhật Biểu thuế</h4>
		</div>
		<div class="modal-body">
			<form name="bieuThueForm">
				<div class="block">
					<label>Mã biểu thuế</label> <input class="input" type="text"
						ng-model="self.bieuthueEntity.maBieuThue" />
				</div>
				<div class="block">
					<label>Tên biểu thuế</label> <input class="input" type="text"
						ng-model="self.bieuthueEntity.tenBieuThue" />
				</div>
				<div class="block">
					<label>Thuế suất</label> <input class="input" type="text"
						ng-model="self.bieuthueEntity.thueSuat" />
				</div>
				<div class="block">
					<label>Kiểu biểu thuế</label> <input class="input" type="text"
						ng-model="self.bieuthueEntity.kieuBieuThue" />
				</div>
				<div class="block">
					<label>Mã hàng hóa</label> <input class="input" type="text"
						ng-model="self.bieuthueEntity.maHS" />
				</div>
				<div class="block">
					<label>Ngày hiệu lực</label> <input class="input" type="text"
						ng-model="self.bieuthueEntity.ngayHL" />
				</div>
				<div class="block">
					<label>Ngày hết hiệu lực</label> <input class="input" type="text"
						ng-model="self.bieuthueEntity.ngayHHL" />
				</div>
			</form>
		</div>
		<div class="modal-footer">
			<button class="btn btn-primary" ng-click="self.saveData()">Save</button>
			<button class="btn btn-primary" ng-click="$close()">Cancel</button>
		</div>
	</div>
	</script>
</div>