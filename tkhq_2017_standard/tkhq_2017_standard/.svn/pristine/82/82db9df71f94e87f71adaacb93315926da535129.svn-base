<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div ng-controller="PhanHoiQuyTrinhXLDLController">
	<%@ include file="../PhanHoiQuyTrinhXLDL/PhanHoiQuyTrinhXLDL.jsp"%>
</div>
<div class="row">
	<div class="fade-in-out" ng-show="showLoading">
		<uib-progressbar class="progress-striped active progressBar" type="info"></uib-progressbar>
	</div>
</div>
<style>
.col-md-6{
padding-left: 5px;
padding-right: 1px;
padding-bottom: 5px;
}
</style>
<div style="border: 0px !important;" class="modal-body" ng-hide="showChart1">
	<div class="generic-container">
		<fieldset class="form-group form-wrapper">
			<form class="form-search">
				</br>
			<div 
					class="row">
				
						<div class="col-md-6"><label class="col-md-4">Trạng thái</label>
							<div class="col-md-8">
								<select class="form-control"
									ng-options="item as item.Ten for item in lstTrangThai"
									ng-model="cmbTrangThai"></select>
							</div></div>
						<div class="col-md-6"><label class="col-md-4">Phần</label>
							<div class="col-md-8">
								<select class="form-control"
									ng-options="item as item.ten for item in lstPhan"
									ng-model="cmbPhan"></select>
							</div></div>
				
						<div class="col-md-6"><label class="col-md-4">Cục Hải quan</label>
							<div class="col-md-8">
								<select class="form-control"
									ng-options="item as item.ten for item in lstCucHQ"
									ng-model="cmbCucHQ" ng-change="CucHQSelected(cmbCucHQ)"></select>
							</div></div>
						<div class="col-md-6"><label class="col-md-4">Chi cục Hải quan</label>
							<div class="col-md-8">
								<select class="form-control"
									ng-options="item as item.ten for item in lstChiCucHQ"
									ng-model="cmbChiCucHQ"></select>
							</div></div>
					

				</div>
			</form>
		</fieldset>
	</div>
	<div class="form-group row form-btn-align" align="center">
		<button type="submit" id="btnPhanHoi" ng-click="btnXemBC_Click()"
			class="btn btn-primary">
			<i class="glyphicon icon-white"></i>Xem báo cáo
		</button>
	</div>
	</br>
	<div ng-hide="showReport1">
	<div class="row">
		<!-- <div>Total: {{Scope.totalItems}}</div> -->
		<div>
			<!-- <pagination total-items="Scope.totalItems" ng-change="pageChanged()" ng-model="Scope.currentPage" max-size="Scope.maxSize" class="pagination" boundary-links="true" rotate="false"></pagination> -->
		</div>
	</div>
	<div style="width: 100%; overflow-x: scroll;">
		<table id="tbTongThe" class="table table-bordered table-responsive">
			<thead>
				<tr align="center">
					<th>Chỉ tiêu</th>
					<th>Kỳ</th>
					<th colspan="{{lstResult[0].data_ky.data.length}}">Thời gian</th>
					<th>So sánh với kỳ trước</th>
					<th>So sánh với cùng kỳ năm trước</th>
					<!-- <th>Dự báo năm tiếp theo – Hàm Trend</th>
					<th>So sánh với cùng kỳ năm trước</th> -->

				</tr>
			</thead>
			<tbody ng-repeat="row in lstResult">
				<tr>
					<td rowspan="2">{{row.sub_name}}</td>
					<td>Kỳ</td>
					<td ng-repeat="ky in row.data_ky.data" align="center"
					ng-class='{red : (ky.gia_tri != null && ky.gia_tri.trim() != "" && ky.gia_tri == row.data_ky.maxKy && ky.ky != row.data_ky.tenKY), 
					yellow : (ky.gia_tri != null && ky.gia_tri.trim() != "" && ky.gia_tri == row.data_ky.minKy && ky.ky != row.data_ky.tenKY)}'>
						{{ky.ky}}
						<br />
						{{ky.gia_tri}}
					</td>
					<td ng-bind="row.data_ky.ss_ky_truoc" align="center"></td>
					<td ng-bind="row.data_ky.ss_ky_nam_truoc" align="center"></td>
					<!-- <td ng-bind="row.data_ky.trend" align="center"></td>
					<td ng-bind="row.data_ky.forecast" align="center"></td> -->
				</tr>

				<tr>
					<td>Tháng</td>
					<td ng-repeat="thang in row.data_thang.data" colspan="2" align="center"
					ng-class='{red : (thang.gia_tri != null && thang.gia_tri.trim() != "" && thang.gia_tri == row.data_thang.maxThang && thang.thang != row.data_thang.tenTHANG), 
					yellow : (thang.gia_tri != null && thang.gia_tri.trim() != "" && thang.gia_tri == row.data_thang.minThang && thang.thang != row.data_thang.tenTHANG)}'>
						{{thang.thang}}
						<br />
						{{thang.gia_tri}}
					</td>
					<td ng-bind="row.data_thang.ss_thang_truoc" align="center"></td>
					<td ng-bind="row.data_thang.ss_thang_nam_truoc" align="center"></td>
					<!-- <td ng-bind="row.data_thang.trend" align="center"></td>
					<td ng-bind="row.data_thang.forecast" align="center"></td> -->
				</tr>
				<tr>
					<td>AVG</td>
					<!-- <td ng-class='{green : true}' -->
					<td class="green"
						colspan="{{row.data_ky.data.length +1}}"
						ng-bind="row.avg"></td>
					<td></td>
					<td></td>
				</tr>

			</tbody>
		</table>
	</div>
	<div class="form-group row form-btn-align" align="center">
		<button type="button" class="btn btn-primary" data-toggle="modal"
			data-target="#myModal" ng-click="btnPhanHoi_Click()" style="width: 100px;">
			<i class="glyphicon icon-white"></i> Phản hồi
		</button>
		<button type="submit" id="btnKetXuat" ng-click="doExport()"
			class="btn btn-primary" style="width: 100px;">
			<i class="glyphicon icon-white"></i> Kết xuất
		</button>
		<button type="button" id="btnIn" class="btn btn-primary"
			ng-click="doExport()" style="width: 100px;">
			<i class="glyphicon icon-white"></i> In
		</button>
		<!-- <button type="button" id="btnClose" class="btn btn-primary"
			ng-click="btnClose_Click()">
			<i class="glyphicon icon-white"></i> Đóng
		</button> -->
	</div>
	</br>
	<div class="form-group row form-btn-align" align="center">
		<div class="row">
			<div></div>
			<div></div>

		</div>
	</div>
	<!-- <a href="HTCBBTGTMHSITCBieuDo" style="text-decoration: underline; font-weight: bold">Biểu đồ</a> -->
	<br/>	
	<div>
	   	<a ng-click="showChart()" style="text-decoration: underline; font-weight: bold" class="btn"><span>Biểu đồ</span></a> &nbsp; &nbsp;
	</div>	
	</div>
	<br/><br/>
</div>
<div ng-show="showChart1">
	<%@ include file="BieuDo.jsp"%>
</div>
<br/>
<br/>

