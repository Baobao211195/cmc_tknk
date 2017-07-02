<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
.col-sm-5, .col-sm-6 {
	padding-left: 4px;
	padding-right: 5px;
}
</style>
<div>
	<section class="content-header panel panel-success"
		>
		<h3 class="modal-title">Thêm mới/Cập nhật cửa khẩu nước ngoài</h3>
	</section>
	<section>
		<form name="cangnnVnaccsForm">
			<div class="row">
				<div class="col-sm-6" style="margin-top: 10px">
					<label class="col-sm-5">Mã cảng(*):</label>
					<div class="col-sm-7">
						<input class="input" type="text" ng-model="self.entity.maCang"
							name="maCang" maxlength="20" ng-pattern="/^[a-zA-Z0-9_]*$/"
							ng-required=true
							ng-disabled="self.entity.addOrUpdate == 'update' " /> <span
							class="error" ng-show="cangnnVnaccsForm.maCang.$error.required ">Vui
							lòng nhập mã cảng</span> <span class="error "
							ng-show="cangnnVnaccsForm.maCang.$error.pattern">Mã cảng
							không được có ký tự đặc biệt</span>
					</div>
				</div>
				<div class="col-sm-6" style="margin-top: 10px">
					<label class="col-sm-5">Tên thành phố:</label>
					<div class="col-sm-7">
						<input class="input" type="text" ng-model="self.entity.tenTP"
							maxlength="100" />
					</div>
				</div>
			</div>
			<div class="row">
				<div>
					<input class="input" type="hidden"
						ng-model="self.entity.addOrUpdate" />
				</div>
				<div class="col-sm-6" style="margin-top: 10px">
					<label class="col-sm-5">Tên nước:</label>
					<div class="col-sm-7">
						<input class="input" type="text" ng-model="self.entity.tenNuoc"
							maxlength="100" />
					</div>
				</div>
				<div class="col-sm-6" style="margin-top: 10px">
					<label class="col-sm-5">Mã nước:</label>
					<div class="col-sm-7">
						<input class="input" type="text" ng-model="self.entity.maNuoc"
							name="maNuoc" maxlength="20" /> <span class="error "
							ng-show="cangnnVnaccsForm.maNuoc.$error.pattern">Mã nước
							không được có ký tự đặc biệt</span>
					</div>
				</div>
			</div>
		</form>
		<div class="modal-footer" align="center" style="margin-top: 10px">
			<button class="btn btn-primary" ng-click="self.saveData()"
				ng-disabled="cangnnVnaccsForm.$invalid">Lưu</button>
			<button class="btn btn-primary" ng-click="self.cancel()">Hủy
				bỏ</button>
		</div>
	</section>
</div>