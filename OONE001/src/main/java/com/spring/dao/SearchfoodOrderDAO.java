package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import com.spring.command.PageMaker;
import com.spring.dto.foodOrderVO;

public interface SearchfoodOrderDAO extends foodOrderDAO{

	List<foodOrderVO> selectSearchfoodOrderList(PageMaker pageMaker) throws SQLException;
	
	int selectSearchfoodOrderListCount(PageMaker pageMaker)throws SQLException;
}
