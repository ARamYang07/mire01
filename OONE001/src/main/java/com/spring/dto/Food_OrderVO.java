package com.spring.dto;

import java.util.Date;

public class Food_OrderVO {
	
	private String order_menu; //주문내역
	private String order_price; //주문가격
	private Date order_time; //주문일자
	private String user_id; //고객ID
	private String restunt_id; //매장ID
	
	
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
	public String getRestunt_id() {
		return restunt_id;
	}
	public void setRestunt_id(String restunt_id) {
		this.restunt_id = restunt_id;
	}
	
}
	