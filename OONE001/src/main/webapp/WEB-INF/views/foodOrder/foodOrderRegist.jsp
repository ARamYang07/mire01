<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ include file="/WEB-INF/views/module/header.jsp"%>
<%@ include file="/WEB-INF/views/module/foodOrder_color.jsp"%>


<!-- Content Wrapper. Contains page content -->
<div class="">

	<section class="content-header">
		<div class="container-fluid">
			<div class="row md-2">
				<div class="col-sm-6">
					<h1>주문관리</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"> <i
								class="fa fa-dashboard">주문</i>
						</li>
						<li class="breadcrumb-item active">등록</li>
					</ol>
				</div>
			</div>
		</div>
	</section>
	<!-- Main content -->
	<section class="content register-page">
		<div class="register-box">
			<div class="login-logo">
				<b>주문 관리</b></a>
			</div>
			<!-- form start -->
			<div class="card">
				<div class="register-card-body">
					<form role="form" class="form-horizontal" action="foodOrderRegist"
						method="post" enctype="multipart/form-data">

						<div class="form-group row">
							<input name="restrunt_id" id="restrunt_id" type="hidden"
								value="bull01">
								 <label for="order_menu"
								class="col-sm-3" style="font-size: 0.9em;"> <span
								style="color: red; font-weight: bold;">*</span>주문 메뉴
							</label>
							<div class="col-sm-9 input-group-sm">
								<input class="form-control" name="order_menu" type="text"
									class="form-control" id="order_menu" placeholder="관리할 고객 메뉴를 입력하세요"
									onkeyup="this.value=this.value.trim();" />
							</div>

						</div>
						<div class="form-group row">
							<label for="order_price" class="col-sm-3"
								style="font-size: 0.9em;"> <span
								style="color: red; font-weight: bold;">*</span>주문가격
							</label>
							<div class="col-sm-9 input-group-sm">
								<input class="form-control" name="order_price" type="text"
									class="form-control" id="order_price" placeholder="관리할 메뉴가격을 입력하세요" />
							</div>

						</div>
						<div class="form-group row">
							<label for="user_id" class="col-sm-3" style="font-size: 0.9em;">
								<span style="color: red; font-weight: bold;">*</span>고객 ID
							</label>
							<div class="col-sm-9 input-group-sm">
								<input class="form-control" name="user_id" type="text"
									class="form-control" id="user_id"value="lsw0608" readonly
									onkeyup="this.value=this.value.trim();" />
							</div>

						</div>
				</div>
				<div class="card-footer">
					<div class="row">
						<div class="col-sm-4">
							<button type="button" id="registBtn" onclick="regist_go();"
								class="btn btn-warning text-center">등록</button>
						</div>

						<div class="col-sm-8 text-right">
							<button type="button" id="cancelBtn" onclick="CloseWindow();"
								class="btn btn-default">취소</button>
						</div>
					</div>
				</div>



				</form>
			</div>
			<!-- register-card-body -->
		</div>
</div>
</section>
<!-- /.content -->
</div>
<!-- /.content -->

<!-- /.content-wrapper -->

<%@ include file="/WEB-INF/views/module/common_js.jsp"%>

<script>
	var checkedID;

	function idCheck_go() {
		let id = $('input[name="user_name"]').val();

		if (!id) {
			alert("이름을 작성하세요.");
			$('input[name="user_name"]').focus();
			return;
		}
	}

	function regist_go() {

		if (!$('input[name="order_menu"]').val()) {
			alert("메뉴는 필수입니다.");
			return;
		}

		if (!$('input[name="user_id"]').val()) {
			alert("id은 필수입니다.");
			return;
		}

		var form = $('form[role="form"]');
		form.submit();
	}
</script>

<%@ include file="/WEB-INF/views/module/footer.jsp"%>

