package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.spring.command.PageMaker;
import com.spring.dto.foodOrderVO;

public class SearchfoodOrderDAOImpl extends foodOrderDAOImpl
								 implements SearchfoodOrderDAO{

	private SqlSession sqlSession;
	public void setSqlSession(SqlSession session) {
		this.sqlSession = session;
	}
	
	@Override
	public List<foodOrderVO> selectSearchfoodOrderList(PageMaker pageMaker) throws SQLException {
		int offset = pageMaker.getStartRow();
		int limit = pageMaker.getPerPageNum();
		RowBounds rows = new RowBounds(offset,limit);
		
		List<foodOrderVO> foodOrderList 
		= sqlSession.selectList("foodOrder-Mapper.selectSearchfoodOrderList",pageMaker,rows);
		return foodOrderList;
	}

	@Override
	public int selectSearchfoodOrderListCount(PageMaker pageMaker) throws SQLException {
		return sqlSession.selectOne("foodOrder-Mapper.selectSearchfoodOrderListCount",pageMaker);
	}



}
