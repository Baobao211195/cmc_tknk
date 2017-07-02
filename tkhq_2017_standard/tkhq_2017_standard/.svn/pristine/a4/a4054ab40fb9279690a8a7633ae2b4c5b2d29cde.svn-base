<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style type="text/css">
.row {
	padding: 5px;
}
</style>
<div class="" style="background-color: #ecf0f5;">
	<section class="content-header">
		<h3 class="title">Thêm mới/Cập nhật Tổ chức, cá nhân sử dụng sản phẩm thống kê</h3>
	</section>
	<section class="content">
		<div class="modal-body" style="padding: 15px;">
			<form name="UserForm">
				<div class="row">
					<div class="col-md-6">
						<div class="col-md-6">
							<input type="radio" ng-model="rbLoai.value" value="TC" 
								ng-change="changeRb()"/>&nbsp;Tổ chức
						</div>
						<div class="col-md-6">
							<input type="radio" ng-model="rbLoai.value" value="CN"
								ng-change="changeRb()"/>&nbsp;Cá nhân
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6" ng-show="showTochuc">
						<label class="col-md-4 pa0">Tổ chức sử dụng *</label>
						<div class="col-md-8">
							<input class="form-control" type="text" name="tochuc" maxlength="100"
								ng-model="self.entity.tenTochuc" required="required"/>
						</div>
						<span ng-show="UserForm.tochuc.$error.required" class="col-md-6 input-warning">Tên tổ chức là bắt buộc</span>
					</div>
					<div class="col-md-6" ng-show="showCanhan">
						<label class="col-md-4 pa0">Cá nhân sử dụng *</label>
						<div class="col-md-8">
							<input class="form-control" type="text" name="canhan" maxlength="100"
								ng-model="self.entity.tenCanhan" required="required"/>
						</div>
						<span ng-show="UserForm.canhan.$error.required" class="col-md-6 input-warning">Tên cá nhân là bắt buộc</span>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label class="col-md-4 pa0">Email</label>
						<div class="col-md-8">
							<input class="form-control" type="text" name="email" ng-model="self.entity.email"
								ng-pattern="emailFormat"/>
						</div>
						<span ng-show="UserForm.email.$error.pattern" class="col-md-6 input-warning">
							Sai định dạng Email</span>
					</div>
					<div class="col-md-6">
						<label class="col-md-4 pa0">Điện thoại</label>
						<div class="col-md-8">
							<input class="form-control" type="text" name="mobile" ng-model="self.entity.mobile"
								ng-pattern="phoneNumber" maxlength="15"/>
						</div>
						<span ng-show="UserForm.mobile.$error.pattern" class="col-md-6 input-warning">
							Sai định dạng số</span>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label class="col-md-4 pa0">Thông tin số liệu của người sử dụng</label>
						<div class="col-md-8">
							<textarea rows="2" cols="50" class="form-control" maxlength="500"
								ng-model="self.entity.mota"></textarea>
						</div>
					</div>
					<div class="col-md-6">
						<label class="col-md-4 pa0">Chỉ tiêu thống kê chính</label>
						<div class="col-md-8">
							<input class="form-control" type="text" ng-model="self.entity.chitieuTK" maxlength="200"/>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label class="col-md-4 pa0">Khái niệm, định nghĩa</label>
						<div class="col-md-8">
							<input class="form-control" type="text" ng-model="self.entity.khainiem" maxlength="100"/>
						</div>
					</div>
					<div class="col-md-6">
						<label class="col-md-4 pa0">Căn cứ vào tài liệu</label>
						<div class="col-md-8">
							<textarea rows="2" cols="50" class="form-control" maxlength="200"
								ng-model="self.entity.cancu"></textarea>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label class="col-md-4 pa0">Tần suất<br />(ngày, tuần, tháng,...)</label>
						<div class="col-md-8">
							<textarea rows="2" cols="50" class="form-control" maxlength="100"
								ng-model="self.entity.tansuat"></textarea>
						</div>
					</div>
					<div class="col-md-6">
						<label class="col-sm-4 pa0">Dạng dữ liệu<br />(MS Excel, Word,...)</label>
						<div class="col-sm-8">
							<input class="form-control" type="text" maxlength="100"
								ng-model="self.entity.dexuatDL" />
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label class="col-md-4 pa0">Công chức xử lý *</label>
						<div class="col-md-8">
							<select name="congchucSelect" class="form-control" ng-model="self.entity.userQL" required="required">
								<option value="">---Chọn---</option>
								<option ng-repeat="option in self.lstUser"
									value="{{option.userId}}">{{option.userName}}</option>
							</select>
						</div>
					</div>
					<div class="col-md-6">
						<label class="col-md-4 pa0">Mức độ đáp ứng</label>
						<div class="col-md-8">
							<input class="form-control" type="text" ng-model="self.entity.mucdo" maxlength="100"/>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label class="col-md-4 pa0">Ghi chú</label>
						<div class="col-md-8">
							<textarea rows="2" cols="50" class="form-control" maxlength="200"
								ng-model="self.entity.ghichu"></textarea>
						</div>
					</div>
				</div>
				<div class="col-sm-12" align="center">
					<button class="btn btn-primary" ng-click="self.saveData()"
						ng-disabled="(UserForm.tochuc.$error.required && UserForm.canhan.$error.required)
							|| UserForm.email.$error.pattern
							|| UserForm.mobile.$error.pattern
							|| UserForm.congchucSelect.$error.required">Lưu</button>
					<button class="btn btn-primary" ng-click="self.cancel()">Hủy bỏ</button>
				</div>
				<br/>
			</form>
		</div>
	</section>
</div>