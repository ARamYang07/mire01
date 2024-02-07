package com.spring.command;


import java.util.Date;

import com.spring.dto.foodOrderVO;

public class foodOrderRegistCommand {
	
	private String order_menu; //주문내역
	private String order_price; //주문가격
	private Date order_time; //주문일자
	private String user_id; //고객ID			외래키
	private String restrunt_id; //매장ID		외래키
	private String order_id; //주문ID			기본키
	
	public String getOrder_menu() {
		return order_menu;
	}
	public void setOrder_menu(String order_menu) {
		this.order_menu = order_menu;
	}
	public String getOrder_price() {
		return order_price;
	}
	public void setOrder_price(String order_price) {
		this.order_price = order_price;
	}
	public Date getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRestrunt_id() {
		return restrunt_id;
	}
	public void setRestrunt_id(String restrunt_id) {
		this.restrunt_id = restrunt_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	
	
	
	public foodOrderVO tofoodOrderVO() {
		foodOrderVO foodOrder = new foodOrderVO();
		foodOrder.setOrder_menu(order_menu);
		foodOrder.setOrder_price(order_price);
		foodOrder.setUser_id(user_id);
		foodOrder.setRestrunt_id(restrunt_id);
		foodOrder.setOrder_id(order_id);
		foodOrder.setOrder_time(new Date());
		 
		 return foodOrder;
	}
	
}





