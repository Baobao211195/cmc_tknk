<%@page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div
	class="col-sm-9 col-sm-offset-4 col-md-9 col-md-offset-2 main bgwhite"
	style="width: 1060px; margin-left: -200px;">
	<div class="container-fluid">
		<h4 class="title" align="center">Phân quyền cho Người sử dụng, nhóm người sử dụng</h4>
		<div class="container">
			<fieldset class="form-group form-wrapper">
				<table style="width: 100%">
					<tr>
						<td class="col-sm-4"><label class="col-sm-4">Tổng
								cục, cục HQ <span>(*)</span>:
						</label>
							<div class="col-sm-5 	">
								<select class="form-control"
									ng-options="item as item.ten for item in self.lstCucHQ | orderBy:'ma'"
									ng-model="self.item"
									ng-change="self.GetChiCucHQByCuc(self.item.ma)"><option></option></select>
							</div></td>
						<td class="col-sm-4"><label class="col-sm-4">Chi cục
								:</label>
							<div class="col-sm-5 	">
								<select class="form-control"
									ng-options="item as item.ten for item in self.lstChiCuc | orderBy:'ma'"
									ng-model="self.chiCucSelected" ng-change=""><option></option></select>
							</div></td>
					</tr>
					<tr>
						<td class="col-sm-4"><label class="col-sm-4">Mã Nhóm
								:</label>
							<div class="col-sm-5 	">
								<select class="form-control"
									ng-options="item as item.groupId for item in self.lstNhomNSD"
									ng-model="self.Group" ng-change=""><option></option></select>
							</div></td>
						<td class="col-sm-4"><label class="col-sm-4">Tên nhóm
								: </label>
							<div class="col-sm-5">
								<input class="form-control" type="text" name="txtgroupName"
									ng-model="self.groupName" />
							</div></td>
					</tr>
				</table>
				<div align="center">
				<button id="btnDSNSD"  name="btnDSNSD" class="btn btn-success"
				ng-click="self.getdsNSD(self.item.ma,self.chiCucSelected.ma);" >Danh
				sách NSD</button></div>
		
				<br/>
				<br/>
				<table class="col-md-11" id="dsNguoiSuDung" >					
					<tr>
						<td class="col-md-5">
							<div class="col-md-10">
							<span>Danh sách người sử dụng :</span>
								<select class="form-control"
									ng-options="item as item.username for item in self.dsNSD"
									ng-model="self.dsNSD2" ng-change="" multiple></select>
							</div></td>
							<td class="col-md-1"><button ng-click="self.addNhom();" class="btn btn-success" style="background-color: blue;"><span> >> </span></button > 
							<button ng-click="self.removeNhom();" class="btn btn-success" style="background-color: blue;"><span> << </span></button></td>
						<td class="col-md-5">
							<div class="col-md-10">
							<span>Danh sách người trong nhóm :</span>
								<select class="form-control"
									ng-options="item as item.username for item in self.dsNSDinN"
									ng-model="self.dsNSDinNSelected2" ng-change="" multiple></select>
							</div></td>
					</tr>

				</table>
			</fieldset>
		</div>

		<br />
		<div class="form-group row form-btn-align" align="center">
			
			<button type="button" name="btnGhilai" class="btn btn-success"
				ng-click="self.saveData()">Ghi Lại</button>
			<button type="button" name="btnThoat" class="btn btn-danger"
				ng-click="self.cancel()">Thoát</button>
		</div>
	</div>
</div>