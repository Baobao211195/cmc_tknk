<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div style="width:100%;height:100%;">
	<div class="modal-header">
		<h4 class="modal-title">Phản Hồi quy trình xử lý dữ liệu chi tiết</h4>
	</div>
	<div style="width:100%;height:80%;">					
		<div>
		<label class="col-sm-4">Biểu đồ</label>		
		</div>
		<div style="width:100%;height:100%;" align="center">
		 <!-- <form name="phanHoiQuyTrinhXLDLForm" style="width:100%;height:100%;" >  -->
			<!-- <table class="table table-bordered" style="width: 100%">	 -->							
				<!-- <tbody style="width:100%;"> -->						
					<iframe src="/pbtk/Ts_TEST?maHQ=00&ky=1&thang=1&nam=2016&loai_BC=SB" style="width:100%;height:100%;"></iframe> 			
				<!-- </tbody>		 -->		
			<!-- </table>	 --> 		
		 <!-- </form>  -->
		</div>
	</div>
	<br/>
	<div align="center" >
		<button class="btn btn-primary" ng-click="">Phản hồi</button>
		<button class="btn btn-primary" ng-click="self.cancel()">Đóng</button>
	</div>
	<br/>	
</div>