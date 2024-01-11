package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import com.spring.dto.foodOrderVO;

public interface foodOrderDAO {
	
	List<foodOrderVO> selectList()throws SQLException;
	foodOrderVO selectfoodOrderById(String order_id)throws SQLException;
	void insertfoodOrder(foodOrderVO foodorder)throws SQLException;
	void updatefoodOrder(foodOrderVO foodorder)throws SQLException;
	void deletefoodOrder(String order_id)throws SQLException;
}
