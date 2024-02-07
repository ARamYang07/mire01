package com.spring.service;

import java.sql.SQLException;
import java.util.List;

import com.spring.dao.foodOrderDAO;
import com.spring.dto.foodOrderVO;

public class foodOrderServiceImpl implements foodOrderService{

	private foodOrderDAO foodOrderDAO;
	
	public void setFoodOrderDAO(foodOrderDAO foodOrderDAO) {
		this.foodOrderDAO = foodOrderDAO;
	}


	@Override
	public List<foodOrderVO> list() throws SQLException {
		return foodOrderDAO.selectList();
	}


	@Override
	public void remove(String order_id) throws SQLException {
		foodOrderDAO.deletefoodOrder(order_id);
		
	}

	@Override
	public foodOrderVO detail(String order_id) throws SQLException {
		return foodOrderDAO.selectfoodOrderById(order_id);
	}

	@Override
	public void regist(foodOrderVO foodOrder) throws SQLException {
		foodOrderDAO.insertfoodOrder(foodOrder);
		
	}

	@Override
	public void modify(foodOrderVO foodOrder) throws SQLException {
		foodOrderDAO.updatefoodOrder(foodOrder);
		
	}

}
