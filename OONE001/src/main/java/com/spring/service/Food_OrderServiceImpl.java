package com.spring.service;

import java.sql.SQLException;
import java.util.List;

import com.spring.dao.Food_OrderDAO;
import com.spring.dto.Food_OrderVO;

public class Food_OrderServiceImpl implements Food_OrderService{

	private Food_OrderDAO food_orderDAO;
	public void setFood_OrderDAO(Food_OrderDAO food_orderDAO) {
		this.food_orderDAO = food_orderDAO;
	}
	
	@Override
	public List<Food_OrderVO> list() throws SQLException {
		return food_orderDAO.selectList();
	}

	@Override
	public Food_OrderVO detail(String user_id) throws SQLException {
		return food_orderDAO.selectFood_OrderById(user_id);
	}

	@Override
	public void regist(Food_OrderVO food_order) throws SQLException {
		food_orderDAO.insertFood_Order(food_order);
		
	}

	@Override
	public void modify(Food_OrderVO food_order) throws SQLException {
		food_orderDAO.updateFood_Order(food_order);
		
	}

	@Override
	public void remove(String user_id) throws SQLException {
		food_orderDAO.deleteFood_Order(user_id);
		
	}

}
