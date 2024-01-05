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

import com.spring.dto.Food_OrderVO;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/spring/context/root-context.xml")
@Transactional
public class TeatFood_OrderDAOImpl {
	
	
	@Autowired
	private Food_OrderDAO food_orderDAO;
	
	@Test
	public void testSelectFood_OrderList()throws Exception{
		List<Food_OrderVO> food_orderList = food_orderDAO.selectList();
		Assert.assertEquals(2, food_orderList.size());
	}
	
	@Test
	public void testSelectFood_OrderById()throws Exception{
		String testUser_Id ="ksy0208";
		Food_OrderVO food_order = food_orderDAO.selectFood_OrderById(testUser_Id);
		Assert.assertEquals(food_order.getUser_id(), testUser_Id);
	}
	
	String insertMenu = "koko";

	@Test
	@Rollback
	public void testInsertFood_Order() throws Exception{
		Food_OrderVO food_order = new Food_OrderVO();
		food_order.setOrder_menu("koko");
		food_order.setOrder_price("123,123");
		food_order.setUser_id("koko");
		food_order.setRestunt_id("koko");
		food_order.setOrder_time(new Date());

		food_orderDAO.insertFood_Order(food_order);
		
		Food_OrderVO getCus = food_orderDAO.selectFood_OrderById(food_order.getUser_id());
				
		Assert.assertEquals(food_order.getUser_id(), getCus.getUser_id());
	}



	@Test
	@Rollback
	public void testUpdateFood_Order() throws Exception{
		String testUser_Id = "ksy0208";
		String testOrder_price = "123,123";
		Food_OrderVO targetFood_Order = food_orderDAO.selectFood_OrderById(testUser_Id);
		
		Assert.assertNotEquals(testOrder_price,  targetFood_Order.getOrder_price());
		
		targetFood_Order.setOrder_price(testOrder_price);
		
		food_orderDAO.updateFood_Order(targetFood_Order);
		
		
	}
	
	@Test
	@Rollback
	public void testDeleteFood_Order() throws Exception{
		testInsertFood_Order();
		Food_OrderVO targetFood_Order = food_orderDAO.selectFood_OrderById(insertMenu);
		
		Assert.assertEquals(insertMenu , targetFood_Order.getOrder_menu());
		
		food_orderDAO.deleteFood_Order(insertMenu);
		
		Food_OrderVO deleteFood_Order = food_orderDAO.selectFood_OrderById(insertMenu);
		
		Assert.assertNull(deleteFood_Order);
	}


}
