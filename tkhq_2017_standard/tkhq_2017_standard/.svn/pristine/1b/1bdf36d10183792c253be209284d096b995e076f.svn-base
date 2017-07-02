<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<c:url value='/static/js/service/tbsQtacDnTrigiaNhapkhauService.js'/>"></script>
<script src="<c:url value='/static/js/controller/tbsQtacDnTrigiaNhapkhauController.js'/>"></script>

<script src="<c:url value='/static/js/service/tbsDmQtacService.js' />"></script>

<div ng-controller="tbsQtacDnTrigiaNhapkhauController">
	<div class="box-search">
		<fieldset class="form-group">
			<form class="form-search">
				<div class="col-md-12" ng-show="!isCollapsed">
					<div class="col-md-6 mab10">
						<label class="col-sm-5 pa0">Mã số doanh nghiệp:</label>
						<div class="col-sm-6 pa0">
                            <input type="text" class="form-control" id="masodn" ng-model="dto.masodn" maxlength="20"/>
						</div>
					</div>
					<div class="col-md-6 mab10">
						<label class="col-sm-4 pa0">Trị giá nhập khẩu:</label>
						<div class="col-sm-6 pa0">
							<input type="number" class="form-control" id="trigianhapkhau" style="width: 311px;" ng-model="dto.trigianhapkhau" />
						</div>
					</div>
					
					<div class="col-md-6 mab10">
						<label class="col-sm-5 pa0">Tên doanh nghiệp:</label>
						<div class="col-sm-6 pa0">
							<input type="text" class="form-control" id="tenDn"  ng-model="dto.tenDn" maxlength="500"/>
						</div>
					</div>
					
					<div class="col-md-6 mab10">
						<label class="col-sm-4 pa0">Mô tả:</label>
						<div class="col-sm-6 pa0">
							<textarea  rows="3" cols="49"  ng-model="dto.moTa" maxlength="500"></textarea>
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
		<table id="tbsQtacDnTrigiaNhapkhau"
			class="table table-bordered table-striped table-responsive">
			<thead>
				<tr>
					<th>STT</th>
					<th>Mã số doanh nghiệp</th>
					<th>Trị giá nhập khẩu</th>
					<th>Tên doanh nghiệp</th>
					<th>Trạng thái</th>
					<th>Mô tả</th>
					<th width="13%"></th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="row in listData">
	                <td align="center"><span>{{(currentPage - 1) * pageSize + ($index + 1)}}</span></td>
					<td ng-bind="row.masodn" align="left"></td>
					<td  align="left">{{row.trigianhapkhau | number}}</td>
					<td  align="left">{{row.tenDn}}</td>
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
	                 boundary-link-numbers="true" rotate="false" boundary-links="true">
	            </ul>
	        </div>
	    </div>
    </div>
</div>
