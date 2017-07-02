<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div>
	<div class="modal-header">
		<h4 class="modal-title">Phản Hồi quy trình xử lý dữ liệu chi tiết</h4>
	</div>
	<div class="modal-body">
		<div class="block">
	  		<label class="col-sm-4" for="noiDung">Nội dung:</label>
	  		<textarea class="form-control" id="noiDung" rows="5" ng-model="noiDung"></textarea>	  		
		</div>
		</br>
		<div>
	  		<label class="col-sm-4">Công chức quản lý:</label>
	  		<div class="col-sm-5">
	  		<select class="form-control"  ng-options="item for item in self.lstManager" 
				ng-model="Manager" ng-change="">
			</select>
			</div>		
		</div>
		</br>		
		<div>
		<label class="col-sm-4">Thông tin phản hồi</label>		
		</div>
		<div>
		<form name="phanHoiQuyTrinhXLDLForm">
			<table class="table table-bordered" style="width: 100%">				
				<%-- <colgroup>
					<col width="6%" />
					<col width="17%" />
					<col width="27%" />
					<col width="22%" />
					<col width="25%" />			
				</colgroup> --%>
				<thead>
					<tr>							
						<th>Nội dung</th>
						<th>Người sử dụng</th>
						<th>Thời gian</th>							
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="row in self.lstManager">								
						<td ng-bind="row.maNt"></td>
						<td ng-bind="row.ngay"></td>
						<td ng-bind="row.tygiaVnd"></td>																							
					</tr>
				</tbody>				
			</table>
		</form>
		</div>
	</div>
	</br>
	<div class="modal-footer" align="center">
		<button class="btn btn-primary" ng-click="">Chuyển</button>
		<button class="btn btn-primary" ng-click="self.cancel()">Cancel</button>
	</div>
</div>