package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import com.spring.dto.Food_OrderVO;

public interface Food_OrderDAO {
	
	List<Food_OrderVO> selectList()throws SQLException;
	Food_OrderVO selectFood_OrderById(String user_id)throws SQLException;
	void insertFood_Order(Food_OrderVO food_order)throws SQLException;
	void updateFood_Order(Food_OrderVO food_order)throws SQLException;
	void deleteFood_Order(String user_id)throws SQLException;
}
