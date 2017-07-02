<%@page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div ng-app="myApp"
	class="col-sm-9 col-sm-offset-4 col-md-9 col-md-offset-2 main bgwhite">
	<h4 class="title" align="center">Thiết lập profile người sử dụng</h4>
	<br />
	<div class="col-md-4" align="center" style="margin: 0">
		<label>Danh mục</label> <select class="form-control "
			ng-options="item as item.ten for item in tbsSysUserCtrl.lstActive "
			ng-model="active" ng-change="getUserByActive()"><option></option>
		</select>

	</div>
	<br />
	<div class="col-md-12">
		<table id="tblGroups" border="1"
			style="vertical-align: middle; margin: 0 auto;">
			
			<thead>
				<tr align="center">
					<th>STT</th>
					<th align="center">MA PTVT</th>
					<th align="center">TÊN PTVT </th>
					<th align="center">NHẬP <input type="checkbox" id="importAll"></th>
					<th align="center">XUẤT<input type="checkbox" id="exporttAll"></th>
				</tr>
			</thead>
			<tbody>
				<tr ng-if="tbsSysUserCtrl.lstUser"></tr>
				<tr ng-repeat="row in tbsSysUserCtrl.lstUser">
						<td>{{$index +1}}</td>
						<td ng-bind="row.username"></td>
						<td ng-bind="row.password"></td>
						<td ng-bind="row.fullName"></td>
						<td ng-bind="row.maHq">
								</td>
			</tbody>
		</table>
	</div>

</div>