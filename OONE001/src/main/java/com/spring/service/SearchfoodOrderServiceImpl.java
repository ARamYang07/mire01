package com.spring.service;

import java.sql.SQLException;
import java.util.List;

import com.spring.command.PageMaker;
import com.spring.dao.SearchfoodOrderDAO;
import com.spring.dto.foodOrderVO;

public class SearchfoodOrderServiceImpl extends foodOrderServiceImpl
									implements SearchfoodOrderService{
	
	private SearchfoodOrderDAO searchfoodOrderDAO;
	public void setSearchfoodOrderDAO(SearchfoodOrderDAO searchfoodOrderDAO) {
		this.searchfoodOrderDAO = searchfoodOrderDAO;
	}



	@Override
	public List<foodOrderVO> searchList(PageMaker pageMaker) throws SQLException {
		
		int totalCount = searchfoodOrderDAO.selectSearchfoodOrderListCount(pageMaker);
		pageMaker.setTotalCount(totalCount);
		return searchfoodOrderDAO.selectSearchfoodOrderList(pageMaker);
	}
	

}








