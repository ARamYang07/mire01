package com.spring.dao;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dto.foodOrderVO;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/spring/context/root-context.xml")
@Transactional
public class TeatfoodOrderDAOImpl {
	
	
	@Autowired
	private foodOrderDAO foodOrderDAO;
	
	@Test
	public void testSelectfoodOrderList()throws Exception{
		List<foodOrderVO> foodOrderList = foodOrderDAO.selectList();
		Assert.assertEquals(1, foodOrderList.size());
	}
	
	@Test
	public void testSelectfoodOrderById()throws Exception{
		String testOrder_id ="aa";
		foodOrderVO foodOrder = foodOrderDAO.selectfoodOrderById(testOrder_id);
		Assert.assertEquals(foodOrder.getOrder_id(), testOrder_id);
	}
	
	String insertMenu = "koko";

	@Test
	@Rollback
	public void testInsertfoodOrder() throws Exception{
		foodOrderVO foodOrder = new foodOrderVO();
		foodOrder.setOrder_menu("koko");
		foodOrder.setOrder_price("123,123");
		foodOrder.setOrder_id("koko");

		foodOrderDAO.insertfoodOrder(foodOrder);
		
		foodOrderVO getCus = foodOrderDAO.selectfoodOrderById(foodOrder.getOrder_id());
				
		Assert.assertEquals(foodOrder.getOrder_id(), getCus.getOrder_id());
	}



	@Test
	@Rollback
	public void testUpdatefoodOrder() throws Exception{
		String testOrder_id = "aa";
		String testOrder_price = "123,123";
		foodOrderVO targetfoodOrder = foodOrderDAO.selectfoodOrderById(testOrder_id);
		
		Assert.assertNotEquals(testOrder_price,  targetfoodOrder.getOrder_price());
		
		targetfoodOrder.setOrder_price(testOrder_price);
		
		foodOrderDAO.updatefoodOrder(targetfoodOrder);
		
		
	}
	
	@Test
	@Rollback
	public void testDeletefoodOrder() throws Exception{
		testInsertfoodOrder();
		foodOrderVO targetfoodOrder = foodOrderDAO.selectfoodOrderById(insertMenu);
		
		Assert.assertEquals(insertMenu , targetfoodOrder.getOrder_menu());
		
		foodOrderDAO.deletefoodOrder(insertMenu);
		
		foodOrderVO deletefoodOrder = foodOrderDAO.selectfoodOrderById(insertMenu);
		
		Assert.assertNull(deletefoodOrder);
	}


}
