<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="box-search container-fluid">
	<!-- <div class="container-fluid"> -->
	<div align="center">
		<div class="col-md-8">
			<div class="col-md-4">
				<input type="radio" ng-model="rbLoaiKy.value" value="ky" />&nbsp;Kỳ
			</div>
			<div class="col-md-4">
				<input type="radio" ng-model="rbLoaiKy.value" value="thang" />&nbsp;Tháng
			</div>
		</div>
		<div align="center">
			<div class="col-md-6">
				<label class="col-md-4">Trạng thái*</label>
				<div class="col-md-8">
					<select name="TTSelect" class="form-control"
						ng-model="ctrl.TTSelected">
						<option value="">---Chọn---</option>
						<option value="SB">Sơ bộ</option>
						<option value="DC">Điều chỉnh</option>
						<option value="CT">Chính thức</option>
					</select>
				</div>
			</div>
			<div class="col-md-6">
				<label class="col-md-4">Tỉnh/Thành phố</label>
				<div class="col-md-8">
					<select name="tinhTPSelect" class="form-control"
						ng-model="ctrl.tinhTPSelected">
						<option value="">---Chọn---</option>
						<option ng-repeat="option in lstTinhTP" value="{{option.ma}}">{{option.ten}}</option>
					</select>
				</div>
			</div>
		</div>
		</div>
	<br />
		<div align="center">
			<button type="submit" id="btnSearchXK" ng-click="searchChart()" class="btn btn-primary">
				Xem Biểu đồ
			</button>
			<button type="button" id="btnClose" ng-click="closeChart()" class="btn btn-primary" ng-show="showButton">
				Đóng
			</button>
		</div>
	<!-- </div> -->
</div>

<div class="" ng-show="showData">
	<div class="col-md-12" style="margin: 10px 0;" align="right">
		<span>Đơn vị tính: Nghìn USD</span>
	</div>
	<div style="width: 100%; height: 100%; overflow-x: scroll;">
		<iframe id="frReportXNK" ng-src="{{srcBieuDo}}" class=""
			style="display: block; width: 100%; height: 400px;"></iframe>
	</div>
	
	<div class="col-md-12" align="center">
		<button type="button" id="btnReportXK" ng-click="showFeedback()" class="btn btn-primary"
			data-toggle="modal" data-target="#myModal">
			Phản hồi
		</button>
	</div>
</div>