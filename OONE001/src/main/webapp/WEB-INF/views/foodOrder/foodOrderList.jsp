<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<%@ include file="/WEB-INF/views/module/header.jsp" %>

<%@ include file="/WEB-INF/views/module/foodOrder_color.jsp" %>

<div class="wrapper">
<!-- Content Wrapper. Contains page content -->    

	 <!-- Main content -->
	<section class="content-header"  style ="background: rgb(40,167,69); color: white;">
	  	<div class="container-fluid">
	  		<div class="row md-2">
	  			<div class="col-sm-6">
	  				<h1>주문목록</h1>  				
	  			</div>
	  			<div class="col-sm-6 ">
	  				<ol class="breadcrumb float-sm-right">
			        <li class="breadcrumb-item">
			        	<a href="list.do "style ="background: rgb(40,167,69); color: white;">
				        	<i class="fa fa-dashboard "></i>주문관리
				        </a>
			        </li>
			        <li class="breadcrumb-item active"style ="background: rgb(40,167,69); color: white;">
			        	목록
			        </li>		        
	    	  </ol>
	  			</div>
	  		</div>
	  	</div>
	</section>
	 
	 
   	<section class="content">
   		<div class="card">
   			<div class="card-header with-border">
   			
   				<button type="button" class="btn btn-primary btn-success btn-sm" onclick="OpenWindow('foodOrderRegist','주문관리',700,800);" >주문관리</button>
   				<div id="keyword" class="card-tools" style="width:550px;">
   					 <div class="input-group row">
   					 	<!-- search bar -->
   					 	<!-- sort num -->
					  	<select class="form-control col-md-3 btn-outline-success btn-xs" name="perPageNum" id="perPageNum" onchange="">					  		  		
					  		<option value="10">정렬개수</option>
					  		<option value="2" ${pageMaker.perPageNum eq 2 ? 'selected':'' }>2개씩 정렬</option>
					  		<option value="3" ${pageMaker.perPageNum eq 3 ? 'selected':'' }>3개씩 정렬</option>
					  	</select>
					  	
					  	<!-- search bar -->
					 	<select class="form-control col-md-3 btn-outline-success btn-xs" name="searchType" id="searchType">
					 		<option value=""  >검색구분</option>
					 		<option value="u" ${pageMaker.searchType eq 'u' ? 'selected':'' } >고객 아이디</option>
							<option value="o" ${pageMaker.searchType eq 'o' ? 'selected':'' }>주문 아이디</option>
							<option value="r" ${pageMaker.searchType eq 'r' ? 'selected':'' }>매장 아이디</option>
							<option value="m" ${pageMaker.searchType eq 'm' ? 'selected':'' }>주문 메뉴</option>				 									
						</select>
						<!-- keyword -->
						
   					 	<input  class="form-control btn-outline-success btn-xs" type="text" name="keyword" 
   					 			placeholder="검색어를 입력하세요." value="${pageMaker.keyword }"/>
						<span class="input-group-append">
							<button class="btn btn-primary btn-success btn-sm" type="button" onclick="search_list(1);"
									id="searchBtn" data-card-widget="search" >
								<i class="fa fa-fw fa-search"></i>
							</button>
						</span>
					<!-- end : search bar -->		 
   					 </div>
   				</div>   			
   			</div>
   			<div class="card-body" style="text-align:center;">
    		  <div class="row">
	             <div class="col-sm-12">	
		    		<table class="table table-bordered">
		    			<tr>
		    				<th>주문 아이디</th>
		                	<th>고객 아이디</th>
		                	<th>주문 메뉴</th>
		                	<th>주문 가격 </th>
		                	<th>매장 아이디 </th>
		                	<!-- <th>전화번호</th> -->
		                	<th>등록날짜</th> <!-- yyyy-MM-dd  -->
		               	</tr>
		               	<c:if test="${not empty foodOrderList }">
		              	<c:forEach var="foodOrder" items="${foodOrderList }">
		              		<tr onclick="OpenWindow('foodOrderDetail?order_id=${foodOrder.order_id}','상세보기',700,800);"  style="cursor:pointer;">
		              				
		              			<td>${foodOrder.order_id }</td>		              				
		              			<td>${foodOrder.user_id }</td>
		              			<td>${foodOrder.order_menu }</td>
		              			<td>${foodOrder.order_price }</td>
		              			<td>${foodOrder.restrunt_id }</td>
		              			<!-- <td>${customer.user_phone }</td> -->
		              			<td>
		              				<fmt:formatDate value="${foodOrder.order_time }" pattern="yyyy-MM-dd"/>
		              			</td>
		              		</tr>
		              	</c:forEach>
		              	</c:if>
		              	<c:if test="${empty foodOrderList }">
		              		<tr>
		            			<td colspan="7" class="text-center">
		            				해당내용이 없습니다.
		            			</td>
		            		</tr>
		              	</c:if>
		            </table>
    		     </div> <!-- col-sm-12 -->
    	       </div> <!-- row -->
    		</div> <!-- card-body -->
    		<div class="card-footer">
    			<!-- pagination -->
    			<%@ include file="/WEB-INF/views/module/pagination.jsp" %>
    		</div>
	     </div>
   	</section>

</div>
<!-- ./wrapper -->


<%@ include file="/WEB-INF/views/module/common_js.jsp" %>
<!-- REQUIRED SCRIPTS -->


<%@ include file="/WEB-INF/views/module/footer.jsp" %>





