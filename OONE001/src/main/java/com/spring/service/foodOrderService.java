package com.spring.service;

import java.sql.SQLException;
import java.util.List;

import com.spring.dto.foodOrderVO;

public interface foodOrderService {
	
	List<foodOrderVO> list()throws SQLException;
	foodOrderVO detail(String order_id) throws SQLException;
	void regist(foodOrderVO foodOrder) throws SQLException;
	void modify(foodOrderVO foodOrder) throws SQLException;
	void remove(String order_id) throws SQLException;

}
