package com.spring.service;

import java.sql.SQLException;
import java.util.List;

import com.spring.dto.Food_OrderVO;

public interface Food_OrderService {
	
	List<Food_OrderVO> list()throws SQLException;
	Food_OrderVO detail(String uesr_id) throws SQLException;
	void regist(Food_OrderVO food_order) throws SQLException;
	void modify(Food_OrderVO food_order) throws SQLException;
	void remove(String user_id) throws SQLException;

}
