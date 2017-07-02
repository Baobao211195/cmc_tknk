<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="box-search mab10">
	<div class="container-fluid">
		<div class="col-md-6 mab10">
			<label class="col-md-3 pa0">Cục Hải quan</label>
			<div class="col-md-7 pa0">
				<select name="cucHQSelect" class="form-control" ng-model="ctrl.cucHQSelected" ng-change="changeCucHQ()">
					<option value="">---Chọn---</option>
					<option ng-repeat="option in lstCucHQ" value="{{option.ma}}">{{option.ten}}</option>
				</select>
			</div>
		</div>
		<div class="col-md-6 mab10">
			<label class="col-md-3 pa0">Chi cục Hải quan</label>
			<div class="col-md-7 pa0">
				<select name="chiCucHQSelect" class="form-control" ng-model="ctrl.chiCucHQSelected">
					<option value="">---Chọn---</option>
					<option ng-repeat="option in lstChiCucHQ"
						value="{{option.ma}}">{{option.ten}}</option>
				</select>
			</div>
		</div>
		<div class="col-md-6 mab10">				
				<label class="col-md-3 pa0">Loại ngày</label>
				<div class="col-md-7 pa0">
					<select name="loaiNgaySelect" class="form-control" ng-model="ctrl.loaiNgaySelected">
						<option value="">---Chọn---</option>
						<option ng-repeat="option in lstLoaiNgay"
							value="{{option.id}}">{{option.name}}</option>
					</select>
				</div>		
		</div>
		<div class="col-md-6 mab10">
			<label class="col-md-3 pa0">Thời gian</label>
			<div class="col-md-7 pa0">
				<select name="thoigianSelect" class="form-control"
					ng-model="ctrl.thoigianSelected" ng-change="changeTG()">
					<option value="">---Chọn---</option>
					<option ng-repeat="option in lstTG" value="{{option.id}}">{{option.name}}</option>
				</select>
			</div>
		</div>
		<div id="daySelect" ng-show="showDay">
			<div  class="col-md-6 mab10">								
				<label class="col-md-3 pa0">Từ ngày</label>
				<div class="col-md-7 pa0">
					<input type="text" name="fromDate" class="form-control"
						uib-datepicker-popup="dd/MM/yyyy" ng-model="ctrl.fromDate"
						is-open="popup1.opened" datepicker-options="DayOptions"
						close-text="Đóng" ng-click="open1()"/>
					<i class="fa fa-calendar form-control-feedback" ng-click="open1()"
						style="top: 3px; right: -12px;"></i>
				</div>
			</div>
			<div class="col-md-6 mab10">
				<label class="col-md-3 pa0">Đến ngày</label>
				<div class="col-md-7 pa0">
					<input type="text" name="toDate" class="form-control"
						uib-datepicker-popup="dd/MM/yyyy" ng-model="ctrl.toDate"
						is-open="popup2.opened" datepicker-options="DayOptions"
						close-text="Đóng" ng-click="open2()"/>
					<i class="fa fa-calendar form-control-feedback" ng-click="open2()"
						style="top: 3px; right: -12px;"></i>
				</div>
			</div>
		</div>
		<div id="weekSelect" ng-show="showWeek">
			<div class="col-md-6 mab10">
				<label class="col-md-3 pa0">Từ tuần</label>
				<div class="col-md-3 pa0">
					<select name="weekSelect" class="form-control" ng-model="ctrl.fweekSelected">
						<option value="">---Chọn---</option>
						<option ng-repeat="option in lstWeek" value="{{option.id}}">{{option.name}}</option>
					</select>
				</div>
				<span class="col-md-1 slash">/</span>
				<div class="col-md-3 pa0">
					<select name="yearSelect" class="form-control" ng-model="ctrl.fweekYearSelected">
						<option value="">---Chọn---</option>
						<option ng-repeat="option in lstYear" value="{{option.id}}">{{option.name}}</option>
					</select>
				</div>
			</div>
			<div class="col-md-6 mab10">
				<label class="col-md-3 pa0">Đến tuần</label>
				<div class="col-md-3 pa0">
					<select name="weekSelect" class="form-control"
						ng-model="ctrl.tweekSelected">
						<option value="">---Chọn---</option>
						<option ng-repeat="option in lstWeek" value="{{option.id}}">{{option.name}}</option>
					</select>
				</div>
				<span class="col-md-1 slash">/</span>
				<div class="col-md-3 pa0">
					<select name="yearSelect" class="form-control"
						ng-model="ctrl.tweekYearSelected">
						<option value="">---Chọn---</option>
						<option ng-repeat="option in lstYear" value="{{option.id}}">{{option.name}}</option>
					</select>
				</div>
			</div>
		</div>
		<div id="monthSelect" ng-show="showMonth">
			<div class="col-md-6 mab10">
				<label class="col-md-3 pa0">Từ tháng</label>
				<div class="col-md-7 pa0">
					<input type="text" name="fromMonth" class="form-control"
						uib-datepicker-popup="MM/yyyy" ng-model="ctrl.fromMonth"
						is-open="popup3.opened"
						datepicker-options="{minMode: 'month'}"
						datepicker-mode="'month'" close-text="Đóng" ng-click="open3()"/>
					<i class="fa fa-calendar form-control-feedback" ng-click="open3()"
						style="top: 3px; right: -12px;"></i>
				</div>
			</div>
			<div class="col-md-6 mab10">
				<label class="col-md-3 pa0">Đến tháng</label>
				<div class="col-md-7 pa0">
					<input type="text" name="toMonth" class="form-control"
						uib-datepicker-popup="MM/yyyy" ng-model="ctrl.toMonth"
						is-open="popup4.opened"
						datepicker-options="{minMode: 'month'}"
						datepicker-mode="'month'" close-text="Đóng" ng-click="open4()"/>
					<i class="fa fa-calendar form-control-feedback" ng-click="open4()"
						style="top: 3px; right: -12px;"></i>
				</div>
			</div>
		</div>
		<div id="quarterSelect" ng-show="showQuarter">
			<div class="col-md-6 mab10">
				<label class="col-md-3 pa0">Từ quý</label>
				<div class="col-md-3 pa0">
					<select name="quarterSelect" class="form-control"
						ng-model="ctrl.fQuarterSelected">
						<option value="">---Chọn---</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
					</select>
				</div>
				<span class="col-md-1 slash">/</span>
				<div class="col-md-3 pa0">
					<select name="yearSelect" class="form-control" ng-model="ctrl.fQuarterYearSelected">
						<option value="">---Chọn---</option>
						<option ng-repeat="option in lstYear" value="{{option.id}}">{{option.name}}</option>
					</select>
				</div>
			</div>
			<div class="col-md-6 mab10">
				<label class="col-md-3 pa0">Đến quý</label>
				<div class="col-md-3 pa0">
					<select name="quarterSelect" class="form-control" ng-model="ctrl.tQuarterSelected">
						<option value="">---Chọn---</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
					</select>
				</div>
				<span class="col-md-1 slash">/</span>
				<div class="col-md-3 pa0">
					<select name="yearSelect" class="form-control"
						ng-model="ctrl.tQuarterYearSelected">
						<option value="">---Chọn---</option>
						<option ng-repeat="option in lstYear" value="{{option.id}}">{{option.name}}</option>
					</select>
				</div>
			</div>
		</div>
		<div id="yearSelect" ng-show="showYear">
			<div class="col-md-6 mab10">
				<label class="col-md-3 pa0">Năm</label>
				<div class="col-md-7 pa0">
					<input type="text" name="year" class="form-control"
						uib-datepicker-popup="yyyy" ng-model="ctrl.year"
						is-open="popup5.opened"
						datepicker-options="{minMode: 'year'}"
						datepicker-mode="'year'" close-text="Đóng" ng-click="open5()"/>
					<i class="fa fa-calendar form-control-feedback" ng-click="open5()"
						style="top: 3px; right: -12px;"></i>
				</div>
			</div>
		</div>
		<br />
		<div class="col-md-12" align="center">
			<button type="submit" id="btnSearchXK" ng-click="search()" class="btn btn-primary">
				Xem Báo cáo
			</button>
		</div>
	</div>
</div>

<div class="table-scroll" ng-show="showDataTable">
	<table id="tblWarnSLToKhai" class="table table-bordered" style="text-align: center;">
		<colgroup>
			<col width="200" />
		</colgroup>
		<thead>
			<tr>
				<th>Chỉ tiêu</th>
				<th colspan="{{lstWarnSoTKTTG[0].group_data[0].data_ky.data.length}}">Thời gian</th>
			</tr>
		</thead>
		<tbody ng-repeat="group in lstWarnSoTKTTG">
			<tr>
				<td ng-bind="group.group_name" colspan="{{lstWarnSoTKTTG[0].group_data[0].data_ky.data.length + 1}}"
					style="text-align: left;"></td>
			</tr>
			<tr ng-repeat-start="row in group.group_data">
				<td ng-bind="row.sub_name" style="text-align: left;"></td>
				<td ng-repeat="dataKy in row.data_ky.data" class="{{dataKy.background}}">
					<span ng-bind="dataKy.ky"></span>
					<br />
					<span ng-bind="dataKy.gia_tri"></span>
				</td>
			</tr>
			<tr ng-repeat-end>
				<td style="text-align: left;">AVG</td>
				<td ng-bind="row.avg" colspan="{{lstWarnSoTKTTG[0].group_data[0].data_ky.data.length}}"
					style="background-color: green; text-align: left;"></td>
			</tr>
		</tbody>
	</table>
</div>
<br />
<div class="col-md-12" align="center" ng-show="showDataTable">
	<button type="button" id="btnReportXK" ng-click="showFeedback()" data-toggle="modal"
		data-target="#myModal" class="btn btn-primary" style="width: 100px;">
		Phản hồi
	</button>
	<button type="button" id="btnExportXK" ng-click="doExport()" class="btn btn-primary"
		style="width: 100px;">Kết xuất
	</button>
	<button type="button" id="btnPrintXK" ng-click="doPrint()" class="btn btn-primary"
		style="width: 100px;">In
	</button>
</div>
<div class="col-md-12" align="left" ng-show="showDataTable">
	<a id="btnChartXK" ng-click="showChartInfo()" ng-disabled="btnDisable" width="116" href=""
		style="text-decoration: underline; font-size: 14px; font-weight: 700;">Biểu đồ</a>
</div>
<br />
<br />