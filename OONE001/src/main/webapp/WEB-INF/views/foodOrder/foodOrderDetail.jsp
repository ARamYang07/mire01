<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/views/module/header.jsp"%>
<%@ include file="/WEB-INF/views/module/foodOrder_color.jsp" %>

<div>
    <section class="content-header">
        <div class="container-fluid">
            <div class="row md-2">
                <div class="col-sm-6">
                    <h1>상세페이지</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#"> <i class="fa fa-dashboard">회원관리</i></a></li>
                        <li class="breadcrumb-item active">상세보기</li>
                    </ol>
                </div>
            </div>
        </div>
    </section>

    <!-- Main content -->
    <section class="content register-page">
        <div class="register-box">
            <form role="form" class="form-horizontal" method="post">
                <div class="register-card-header">
                    <h1 class="text-center">회원 상세보기</h1>
                </div>
                <br />
                <div class="card">
				<div class="register-card-body">
					<form role="form" class="form-horizontal" action="foodOrderRegist"
						method="post" enctype="multipart/form-data">
                <!-- 주문ID -->
                <div class="form-group row">
                    <label for="order_id" class="col-sm-3 control-label text-right">주문ID</label>
                    <div class="col-sm-9">
                        <input name="order_id" type="text" class="form-control" id="order_id" value="${foodOrder.order_id}" readonly>
                    </div>
                </div>

                <!-- 매장이름 -->
                <div class="form-group row">
                    <label for="restrunt_id" class="col-sm-3 control-label text-right">매장ID</label>
                    <div class="col-sm-9">
                        <input name="restrunt_id" type="text" class="form-control" id="restrunt_id" value="${foodOrder.restrunt_id}" readonly>
                    </div>
                </div>

                <!-- 주문 메뉴 -->
                <div class="form-group row">
                    <label for="order_menu" class="col-sm-3 control-label text-right">주문 메뉴</label>
                    <div class="col-sm-9">
                        <input name="order_menu" type="text" class="form-control" id="order_menu" value="${foodOrder.order_menu}" readonly>
                    </div>
                </div>

                <!-- 주문 가격 -->
                <div class="form-group row">
                    <label for="order_price" class="col-sm-3 control-label text-right">주문 가격</label>
                    <div class="col-sm-9">
                        <input name="order_price" type="text" class="form-control" id="order_price" value="${foodOrder.order_price}" readonly>
                    </div>
                </div>
        
                <!-- 버튼 영역 -->
                <div class="card-footer" style="padding: 5px 0;">
                    <div class="row">
                        <div class="col-sm-4 text-center">
                            <button type="button" onclick="location.href='foodOrderModify?order_id=${foodOrder.order_id}';" id="modifyBtn" class="btn btn-block btn-outline-success">수 정</button>
                        </div>

                        <div class="col-sm-4 text-center">
                            <button type="button" onclick="location.href='foodOrderRemove?order_id=${foodOrder.order_id}';" id="deleteBtn" class="btn btn-block btn-outline-danger">삭 제</button>
                        </div>

                        <div class="col-sm-4 text-center">
                            <a class="btn btn-block btn-outline-success" onclick="CloseWindow();">
                                <i class="fas fa-times"></i> 취 소 
                            </a>
                        </div>
                    </div>
                </div>
            </form>
            </div>
            </div>
        </div>
    </section>
</div>

<%@ include file="/WEB-INF/views/module/common_js.jsp"%>
<%@ include file="/WEB-INF/views/module/footer.jsp"%>
