<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div>
	<div class="modal-header">
		<h4 class="modal-title">Thêm mới/Cập nhật tỷ giá</h4>
	</div>
	<div class="modal-body">
		<form name="tygiaForm">
			<table style="width: 100%">
				<tr>
					<td>
						<label class="col-sm-4 pa0">Mã ngoại tệ *:</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" name="maNT" ng-model="self.entity.maNt" maxlength="5" ng-disabled="self.entity.addOrUpdate == 'update' "
								required/>
						</div>
					</td>
					<td>
						<label class="col-sm-4 pa0">Ngày *:</label>
						<div class="col-sm-8">
		  						<input type="text" name="ngay" class="form-control" uib-datepicker-popup="" ng-model="self.entity.ngay"
		  							is-open="popup1.opened" datepicker-options="dateOptions" close-text="Đóng" ng-click="open1()"
		  							required datepicker-Manually/>
		  						<i class="fa fa-calendar form-control-feedback" ng-click="open1()" style="top: 3px;"></i>
         				</div>
					</td>
				</tr>
				<tr>
					<td>
						<label class="col-sm-4 pa0">Tỷ giá VND:</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" name="tygiaVND" ng-model="self.entity.tygiaVnd"
								only-Digits/>
						</div>
					</td>
					<td>
						<label class="col-sm-4 pa0">Tỷ giá USD:</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" name="tygiaUSD" ng-model="self.entity.tygiaUsd"
								only-Digits/>
						</div>
					</td>
				</tr>
				<tr>					
					<td>
						<input class="" type="hidden" ng-model="self.entity.addOrUpdate" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<br/>
	<div class="modal-footer" align="center">
		<button class="btn btn-primary" ng-click="self.saveData()"
			ng-disabled="tygiaForm.tygiaVND.$invalid || tygiaForm.tygiaUSD.$invalid
				|| (tygiaForm.maNT.$error.required && tygiaForm.maNT.$invalid)
				|| (tygiaForm.ngay.$error.required && tygiaForm.ngay.$invalid)">Lưu</button>
		<button class="btn btn-primary" ng-click="self.cancel()">Hủy bỏ</button>
	</div>
</div>