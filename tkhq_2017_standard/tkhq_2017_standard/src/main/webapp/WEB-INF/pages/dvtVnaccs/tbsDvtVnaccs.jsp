<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<c:url value='/static/js/service/tbsDvtVnaccsService.js' />"></script>
<script src="<c:url value='/static/js/controller/tbsDvtVnacccsController.js' />"></script>

<div class="" ng-controller="TbsDvtVnacccsController as dvtVnaccsCtrl">
	<div class="box-search">
		<fieldset class="form-group">
			<form class="form-search">
				<table style="width: 100%">
					<tr>
						<td><label class="col-sm-3">Mã đơn vị tính:</label>
							<div class="col-sm-3">
								<input type="text" id="maDvt" ng-model="maDvt" />
							</div></td>
						<td><label class="col-sm-3">Tên đơn vị tính:</label>
							<div class="col-sm-6">
								<input type="text" id="tenDvt" ng-model="tenDvt" />
							</div></td>
					</tr>
					<tr>
						<td><label class="col-sm-3">Tên đơn vị tính tiếng Việt:</label>
							<div class="col-sm-3">
								<input type="text" id="tenDvtv" ng-model="tenDvtv" />
							</div></td>
						<td><label class="col-sm-3">Tên đơn vị tính UNICODE:</label>
							<div class="col-sm-6">
								<input type="text" id="tenDvtUni" ng-model="tenDvtUni" />
							</div></td>
					</tr>					
				</table>
				<br/>
				<div class="form-group row form-btn-align" align="center">
					<button type="submit" id="btnSearch"
						ng-click="dvtVnaccsCtrl.search(1, dvtVnaccsCtrl.pageSize)" class="btn btn-primary">
						Tìm kiếm
					</button>
					<button type="button" id="addRow" class="btn btn-primary"
						ng-click="addRow()">
						Thêm mới
					</button>					
					<button type="button" id="btnDel" class="btn btn-danger"
						ng-click="dvtVnaccsCtrl.remove()">
						Xóa
					</button>
				</div>
			</form>
		</fieldset>
	</div>
	<div class="col-md-12">
		<div class ="col-sm-2 paging-record">Tổng số bản ghi: {{dvtVnaccsCtrl.totalItems}}</div>
		<div class ="col-sm-6">
			<pagination total-items="dvtVnaccsCtrl.totalItems" ng-change="pageChanged()" ng-model="dvtVnaccsCtrl.currentPage" 
				max-size="dvtVnaccsCtrl.maxSize" class="pagination" boundary-links="true" rotate="false"></pagination>
		</div>
	</div>
	<table id="tblDvtVnaccs" class="table table-bordered table-striped table-responsive">
		<%-- <colgroup>
			<col width="6%" />
			<col width="17%" />
			<col width="27%" />
			<col width="22%" />
			<col width="25%" />			
		</colgroup> --%>
		<thead>
			<tr>
				<th><input type="checkbox" ng-model="dvtVnaccsCtrl.checkAll" ng-click="toggleAll()"></th>
				<!--<th>STT</th> -->
				<th>Mã đơn vị tính</th>
				<th>Tên đơn vị tính</th>
				<th>Tên đơn vị tính tiếng Việt</th>
				<th>Tên đơn vị tính UNICODE</th>				
				<th>Thao tác</th>
			</tr>
		</thead>
		<tbody align="center">
			<tr ng-repeat="row in dvtVnaccsCtrl.lstDvtVnaccs">
				<td><input type="checkbox" ng-checked="dvtVnaccsCtrl.checkAll"
					ng-model="row.isChecked"></td>				
				<td ng-bind="row.maDvt"></td>
				<td ng-bind="row.tenDvt"></td>
				<td ng-bind="row.tenDvtv"></td>
				<td ng-bind="row.tenDvtUni"></td>				
				<td>
					<button type="button" ng-click="dvtVnaccsCtrl.editRow(row.maDvt)"
						class="btn btn-warning custom-width">Sửa</button>
				</td>
			</tr>
		</tbody>
	</table>
	<div class="col-md-12">
		<div class ="col-sm-2"></div>
		<div class ="col-sm-6">
			<pagination total-items="dvtVnaccsCtrl.totalItems" ng-change="pageChanged()" ng-model="dvtVnaccsCtrl.currentPage" 
				max-size="dvtVnaccsCtrl.maxSize" class="pagination" boundary-links="true" rotate="false"></pagination>
		</div>
	</div>
</div>