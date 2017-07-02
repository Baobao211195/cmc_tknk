<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div>
	<div class="modal-header">
		<h4 class="modal-title">Thêm mới/Cập nhật đơn vị tính VNACCS</h4>
	</div>
	<div class="modal-body">
		<form name="dvtVnaccsForm">
			<table style="width: 100%">
				<tr>
					<td>
						<label class="col-sm-4">Mã đơn vị tính *:</label>
						<div class="col-sm-4">
							<input class="input" type="text" name="maDvt" ng-model="self.entity.maDvt" maxlength="254" 
								ng-disabled="self.entity.addOrUpdate == 'update' " required/>
						</div>
						<span ng-show="dvtVnaccsForm.maDvt.$error.required" class="col-sm-4 input-warning">Mã đơn vị tính là bắt buộc</span>
					</td>
				</tr>
				<tr>
					<td>
						<label class="col-sm-4">Tên đơn vị tính:</label>
						<div class="col-sm-4">
							<input class="input" type="text" ng-model="self.entity.tenDvt" maxlength="254"/>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<label class="col-sm-4">Tên đơn vị tính tiếng Việt:</label>
						<div class="col-sm-4">
							<input class="input" type="text" ng-model="self.entity.tenDvtv" maxlength="254"/>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<label class="col-sm-4">Tên đơn vị tính UNICODE:</label>
						<div class="col-sm-4">
							<input class="input" type="text" ng-model="self.entity.tenDvtUni" maxlength="254"/>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<input class="input" type="hidden" ng-model="self.entity.addOrUpdate" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<br/>
	<div class="modal-footer" align="center">
		<button class="btn btn-primary" ng-click="self.saveData()"
			ng-disabled="(dvtVnaccsForm.maDvt.$error.required && dvtVnaccsForm.maDvt.$invalid)">Lưu</button>
		<button class="btn btn-primary" ng-click="self.cancel()">Hủy bỏ</button>
	</div>
</div>