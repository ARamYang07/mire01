package com.spring.service;

import java.sql.SQLException;
import java.util.List;

import com.spring.command.PageMaker;
import com.spring.dto.foodOrderVO;

public interface SearchfoodOrderService extends foodOrderService{

	List<foodOrderVO> searchList(PageMaker pageMaker)throws SQLException;
}
