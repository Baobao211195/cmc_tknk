<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<c:url value='/static/js/service/tbsQtacCuaKhauDbVnService.js' />"></script>
<script src="<c:url value='/static/js/controller/tbsQtacCuaKhauDbVnController.js' />"></script>
<script src="<c:url value='/static/js/service/tbsDmQtacService.js' />"></script>

<style>
	textarea {
	    margin-left: -55px;
	    width: 476px;
	}
</style>

<div ng-controller="tbsQuyTacController">
	<div class="box-search">
		<fieldset class="form-group">
			<form class="form-search">
				<div class="col-md-12" ng-show="!isCollapsed">
					<div class="col-md-4 mab10">
						<label class="col-sm-4 pa0">Mã cửa khẩu:</label>
						<div class="col-sm-6 pa0">
							<input type="text" class="form-control" id="maCuaKhau" ng-model="dto.macuakhau" maxlength="20"/>
						</div>
					</div>
					<div class="col-md-4 mab10">
						<label class="col-sm-4 pa0">Mã nước đến:</label>
						<div class="col-sm-6 pa0">
							<input type="text" class="form-control" id="maNuocDen" ng-model="dto.manuocden" maxlength="20"/>
						</div>
					</div>
					<div class="col-md-4 mab10">
						<label class="col-sm-5 pa0">Mã cửa khẩu đến:</label>
						<div class="col-sm-6 pa0">
							<input type="text" class="form-control" id="maCuaKhauDen" ng-model="dto.macuakhauden" maxlength="20"/>
						</div>
					</div>
					
					<div class="col-md-4 mab10">
						<label class="col-sm-4 pa0">Tên cửa khẩu:</label>
						<div class="col-sm-6 pa0">
							<input type="text" class="form-control" id="tenCuaKhau" ng-model="dto.tenCuaKhau" maxlength="200"/>
						</div>
					</div>
					
					<div class="col-md-4 mab10">
						<label class="col-sm-4 pa0">Tên nước đến:</label>
						<div class="col-sm-6 pa0">
							<input type="text" class="form-control" id="tenNuocDen" ng-model="dto.tenNuocDen" maxlength="200"/>
						</div>
					</div>
					
					<div class="col-md-4 mab10">
						<label class="col-sm-5 pa0">Tên cửa khẩu đến:</label>
						<div class="col-sm-6 pa0">
							<input type="text" class="form-control" id="tenCuaKhauDen" ng-model="dto.tenCuaKhauDen" maxlength="200"/>
						</div>
					</div>
					
					<div class="col-md-6 mab10">
						<label class="col-sm-4 pa0">Mô tả:</label>
						<div class="col-sm-6 pa0">
							<textarea  rows="3" cols="54"  ng-model="dto.moTa" ng-change="disableEvent()" maxlength="500"></textarea>
						</div>
					</div>
					
				</div>
				<div class="col-md-12 fileArea" ng-show="isCollapsed">
					<label class="col-md-2 filelbl">Tệp tin:</label>
					<div class="col-md-4 fileContainer">
						<div class="file-input">
							<a class="btn btn-default btn-file" type="button" onclick="document.getElementById('file').click(); return false;">Chọn tệp tin</a>
							 <input id="file" name="file" file-model="myFile" type="file" style="visibility: hidden; display: none;" onchange="angular.element(this).scope().handleFile(this)" />
						 </div>
					</div>
					<label for="file" class="col-md-4 lable-file">{{nameFile}}</label>
				</div>
			</form>
		</fieldset>
		<div class="col-md-12" align="center" style="margin-top: 15px;">
			<button type="submit" id="btnSearch" ng-click="doSearch(1, pageSize)" class="btn btn-primary"></i>Tìm kiếm</button>
			<button type="button" class="btn btn-primary" ng-click="isCollapsed = !isCollapsed">Tải danh mục</button>
			<button type="button" id="upDateRow" class="btn btn-primary" ng-click="doUpdate()" ng-show="!isCollapsed">Cập nhật</button>
			<button type="button" id="upDateRow" class="btn btn-primary" ng-click="doUpload()" ng-show="isCollapsed">Tải lên</button>
		</div>
	</div>
	<div ng-show="isDisplay">
		 <div class="col-md-12">
	        <div class="col-sm-3 paging-record">Tổng số bản ghi: {{totalItems}}</div>
	    </div>
		<table id="tblQuyTacDb"
			class="table table-bordered table-striped table-responsive">
			<thead>
				<tr>
					<th>STT</th>
					<th>Mã cửa khẩu</th>
					<th>Mã nước đến</th>
					<th>Mã cửa khẩu đến</th>
					<th>Tên cửa khẩu</th>
					<th>Tên nước đến</th>
					<th>Tên cửa khẩu đến</th>
					<th>Trạng thái</th>
					<th>Mô tả</th>
					
					<th width="13%"></th>
					
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="row in lstTbsQuyTacDb">
					<td align="center"><span>{{(currentPage - 1) * pageSize + ($index + 1)}}</span></td>
					<td ng-bind="row.macuakhau" align="left"></td>
					<td ng-bind="row.manuocden" align="left"></td>
					<td ng-bind="row.macuakhauden" align="left"></td>
					<td ng-bind="row.tenCuaKhau" align="left"></td>
					<td ng-bind="row.tenNuocDen" align="left"></td>
					<td ng-bind="row.tenCuaKhauDen" align="left"></td>
					<td align="left">{{row.trangThai === 1 ? "Đã duyệt" : "chờ duyệt"}}</td>
					<td ng-bind="row.moTa" align="left"></td>
					<td width="13%" align="center">
						<button type="button" ng-click="doEditRow(row.id)" class="btn btn-primary">Sửa</button>
						<button type="button" ng-click="doDelete(row.id)" class="btn btn-danger">Xóa</button>
					</td>
				</tr>
			</tbody>
		</table>
		<div class="col-md-12">
			<div class="col-sm-6">
				<ul uib-pagination total-items="totalItems" ng-model="currentPage"
					max-size="maxSize" ng-change="pageChanged(currentPage)" class="pagination-sm"
					boundary-link-numbers="true" rotate="false" boundary-links="true"></ul>
			</div>
		</div>
	</div>
</div>
