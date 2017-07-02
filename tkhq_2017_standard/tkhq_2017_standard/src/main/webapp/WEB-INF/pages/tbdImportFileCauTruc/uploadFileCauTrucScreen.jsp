<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="myModal" role="dialog" style="height: 270px;width:600px;margin:auto;background-color:aliceblue">
	<section class="content-header panel panel-success">
		<h4 class="modal-title" >{{title}}</h4>
	</section>
	<section class="content">
	<div class="modal-body">
		<form name="uploadFileForm"  ng-submit="doUploadFile()">
			<table style="width: 100%;height: 125px;">
				<tr >
					<td class="col-md-3">
						<label class="col-md-2">Chủ đề:</label>
						<div class="col-md-8">
							<select class="form-control" ng-model="chuDe" ng-change="setChuDe()" style="width: 341px;">
								<option value="1">Dầu thô</option>
								<option value="2">Chuyển phát nhanh</option>
								<option value="3">Phương tiện xuất nhập cảnh</option>
							</select>
						</div>
					</td>	
				</tr>
				<tr>
<!-- 					<td class="col-md-3"> -->
<!-- 						<label class="col-md-2">Tệp tin:</label> -->
<!-- 						<div class="col-md-4"> -->
<!-- 							<input id="file" type ="file" file-model = "myFile" ng-model="myFilesl" accept="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/vnd.ms-excel"/> -->
<!-- 						</div> -->
<!-- 					</td> -->
					<td class="col-md-3">
						<label class="col-md-2">Tệp tin:</label>
						<div class="col-md-8 fileContainer">
							<div class="col-md-4 file-input">
								<a class="btn btn-default btn-file" type="button" onclick="document.getElementById('file').click(); return false;">Chọn tệp tin</a>
								 <input id="file" name="file" file-model="myFile" type="file" style="visibility: hidden; display: none;" onchange="angular.element(this).scope().handleFile(this)" />
							 </div>
							 <label for="file" class="col-md-6 lable-file">{{nameFile}}</label>
						</div>
					</td>
				</tr>
				<tr>
					<td class="col-md-3">
						<label class="col-md-2">Mô tả:</label>
						<div class="col-md-4">
							<textarea  rows="3" cols="54"  ng-model="moTa" ng-change="disableEvent()"></textarea>
						</div>
					</td>
				</tr>
			</table>
			
		</form>
		<div class="btnMobal" style="margin-left: 121px;;margin-top: 20px;">
			<a class="btn btn-primary" ng-disabled="disbleBtn"  ng-click="openNhapMoi(chuDe)" target="_blank" style="margin-left: 22px">Nhập mới</a>
			<button type="submit" class="btn btn-primary" ng-click="doUploadFile()">Tải tệp tin</button>
			<button class="btn btn-primary thoat" ng-click="doClose()" style="width: 84px;">Thoát</button>
		</div>
	</div>
	</section>
</div>