<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/views/module/header.jsp"%>

<%@ include file="/WEB-INF/views/module/foodOrder_color.jsp" %>
<!-- Content Wrapper. Contains page content -->
<div>
    <section class="content-header">
        <div class="container-fluid">
            <div class="row md-2">
                <div class="col-sm-6">
                    <h1>수정페이지</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#"> <i class="fa fa-dashboard">주문관리</i></a></li>
                        <li class="breadcrumb-item active">수정</li>
                    </ol>
                </div>
            </div>
        </div>
    </section>

    <!-- Main content -->
    <section class="content register-page">
        <form role="form" class="form-horizontal" action="foodOrderModify.do" method="post" enctype="multipart/form-data">
            <div class="register-card-header">
                <h1 class="text-center">회원 수정하기</h1>
            </div>
            <br />
            <div class="card">
                <div class="register-card-body">
                    <div class="form-group row">
                        <label for="order_menu" class="col-sm-4 control-label text-center">주문 메뉴</label>
                        <div class="col-sm-8">
                            <input name="order_menu" type="text" class="form-control" id="order_menu" value="${foodOrder.order_menu }" />
                        </div>
                    </div>

                    <div class="form-group row">
                        <label for="order_price" class="col-sm-4 control-label text-center">주문 가격</label>
                        <div class="col-sm-8">
                            <input name="order_price" type="text" class="form-control" id="order_price" value="${foodOrder.order_price }" />
                        </div>
                    </div>

                    <div class="form-group row">
                        <label for="user_id" class="col-sm-4 control-label text-center">고객 아이디</label>
                        <div class="col-sm-8">
                            <input readonly name="user_id" type="text" class="form-control" id="user_id" value="${foodOrder.user_id }" />
                        </div>
                    </div>
                    
                      <div class="form-group row">
                        <label for="restrunt_id" class="col-sm-4 control-label text-center">매장 아이디</label>
                        <div class="col-sm-8">
                            <input readonly name="restrunt_id" type="text" class="form-control" id="restrunt_id" value="${foodOrder.restrunt_id }" />
                        </div>
                    </div>
                    

                    <div class="form-group row">
                        <label for="order_id" class="col-sm-4 control-label text-center">주문 아이디</label>
                        <div class="col-sm-8">
                            <input readonly name="order_id" type="text" class="form-control" id="order_id" value="${foodOrder.order_id }">
                        </div>
                    </div>

                    <div class="card-footer row" style="margin-top: 0; border-top: none;">
                        <button type="button" id="modifyBtn" onclick="modify_go();" class="btn btn-warning col-sm-4 text-center">수정하기</button>
                        <div class="col-sm-4"></div>
                        <button type="button" id="cancelBtn" onclick="history.go(-1);" class="btn btn-default pull-right col-sm-4 text-center">취 소</button>
                    </div>
                </div>
            </div>
        </form>
    </section>
    <!-- /.content -->
</div>

<%@ include file="/WEB-INF/views/module/common_js.jsp"%>

<script>
    function modify_go() {
        var form = $('form[role="form"]');
        form.submit();
    }
</script>

<%@ include file="/WEB-INF/views/module/footer.jsp"%>
