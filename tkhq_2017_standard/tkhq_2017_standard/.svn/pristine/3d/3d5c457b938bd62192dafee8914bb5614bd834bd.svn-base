<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div>
  <div class="modal-header">
      <h4 class="modal-title">Thêm mới/Cập nhật Tỉnh/TP</h4>
  </div>
  <div class="modal-body">
    <form name="tinhTpForm">
		<div class="row mab10">
	  		<label class="col-sm-3" tooltip-animation="true" uib-tooltip="Mã hệ thống tự sinh">Mã tỉnh/TP</label>
	  		<div class="col-sm-5 pa0">
	  			<input class="form-control" type="text" ng-model="self.entity.maTinhTP" disabled/>
	  		</div>
		</div>
		<div class="row mab10">
	  		<label class="col-sm-3">Tên Tỉnh/TP *</label>
	  		<div class="col-sm-5 pa0">
	  			<input class="form-control" type="text" name="tenTTP" ng-model="self.entity.tenTinhTP" required
	  				maxlength="40" no-special-char/>
	  		</div>
	  		<span ng-show="tinhTpForm.tenTTP.$error.required" class="col-sm-4 input-warning">Tên tỉnh/TP là bắt buộc</span>
		</div>
	</form>
  </div>
  <div class="modal-footer">
      <button class="btn btn-primary" ng-click="self.saveData()"
      	ng-disabled="(tinhTpForm.tenTTP.$error.required && tinhTpForm.tenTTP.$invalid)">Lưu</button>
      <button class="btn btn-primary" ng-click="self.cancel()">Hủy bỏ</button>
  </div>
</div>