<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div>
	<div class="modal-header">
		<h4 class="modal-title">Thêm mới/Cập nhật phí phương tiện</h4>
	</div>
	<div class="modal-body">
		<form name="mahsdkghForm">
			<table style="width: 100%">
				<tr>
					<td><label class="col-sm-3">STT:</label>
						<div class="col-sm-3">
							<input class="input" type="text" ng-model="self.entity.stt" ng-disabled="self.entity.addOrUpdate == 'update' "/>
						</div></td>
					<td><label class="col-sm-3">Mã phương thức vận tải:</label>
						<div class="col-sm-3">
							<input class="input" type="text" ng-model="self.entity.ma_PTVT" />
						</div></td>
				</tr>
				<tr>
					<td><label class="col-sm-3">Tên phương thức vận tải:</label>
						<div class="col-sm-3">
							<input class="input" type="text" ng-model="self.entity.ten_PTVT" />
						</div></td>
					<td><label class="col-sm-3">Phí bảo hiểm quốc tế:</label>
						<div class="col-sm-3">
							<input class="input" type="text" ng-model="self.entity.i" />
						</div></td>
				</tr>
				<tr>
					<td><label class="col-sm-3">Phí vận tải quốc tế:</label>
						<div class="col-sm-3">
							<input class="input" type="text" ng-model="self.entity.f" />
						</div></td>
					<td>
						<input class="input" type="hidden"
						ng-model="self.entity.addOrUpdate" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	</br>
	<div class="modal-footer" align="center">
		<button class="btn btn-primary" ng-click="self.saveData()">Save</button>
		<button class="btn btn-primary" ng-click="self.cancel()">Cancel</button>
	</div>
</div>