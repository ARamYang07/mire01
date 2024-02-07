package com.spring.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.command.PageMaker;
import com.spring.command.foodOrderModifyCommand;
import com.spring.command.foodOrderRegistCommand;
import com.spring.dto.foodOrderVO;
import com.spring.service.SearchfoodOrderService;

@Controller

public class foodOrderController {
	
	
	
	@Autowired
	private SearchfoodOrderService foodOrderService;

	@GetMapping("foodOrder/foodOrderList")
	public ModelAndView list(@ModelAttribute PageMaker pageMaker, ModelAndView mnv) throws SQLException {
	    try {
	        // ...
	    } catch (Exception e) {
	        // 예외 처리 로직 추가
	        e.printStackTrace(); // 또는 로깅
	    }

		String url="/foodOrder/foodOrderList";
		
		List<foodOrderVO> foodOrderList = foodOrderService.searchList(pageMaker);

		mnv.addObject("foodOrderList",foodOrderList);
		mnv.setViewName(url);
		
		return mnv;
	}

	@GetMapping("foodOrder/foodOrderRegist")
	public ModelAndView foodOrderRegist(ModelAndView mnv) {
		String url = "/foodOrder/foodOrderRegist";
		
		mnv.setViewName(url);
		return mnv;
	}
	
	

	@GetMapping("idCheck")
	@ResponseBody
	public String idCheck(String order_id) throws Exception {
		String message = "duplicated";

		foodOrderVO foodOrder = foodOrderService.detail(order_id);

		if (foodOrder == null) {
			message = "";
		}

		return message;
	}
	


	@GetMapping("foodOrder/foodOrderDetail")
	public ModelAndView Detail(String order_id, ModelAndView mnv) throws Exception {
		String url = "/foodOrder/foodOrderDetail";

		foodOrderVO foodOrder = foodOrderService.detail(order_id);
		mnv.addObject("foodOrder", foodOrder);
		mnv.setViewName(url);
		return mnv;
	}

	@GetMapping("foodOrder/foodOrderModify")
	public ModelAndView ModifyForm(String order_id, ModelAndView mnv) throws Exception {
		String url = "/foodOrder/foodOrderModify";
		
		foodOrderVO foodOrder = foodOrderService.detail(order_id);

		mnv.addObject("foodOrder", foodOrder);
		mnv.setViewName(url);
		return mnv;
	}

	@GetMapping(value = "foodOrder/foodOrderRemove")
	public ModelAndView Remove(String order_id,ModelAndView mnv) throws Exception {
		String url = "/foodOrder/foodOrderRemove_success";

		// db삭제
		foodOrderService.remove(order_id);

		mnv.setViewName(url);
		return mnv;
	}
	
	@PostMapping(value = "foodOrder/foodOrderRegist")
	public ModelAndView Regist(foodOrderRegistCommand regCommand,ModelAndView mnv) throws SQLException {
		String url = "/foodOrder/foodOrderRegist_success";
		foodOrderVO foodOrder = regCommand.tofoodOrderVO();

		foodOrderService.regist(foodOrder);
		
		mnv.setViewName(url);
		return mnv;
		
}
	
	@PostMapping(value = "foodOrder/foodOrderModify")
	public ModelAndView Modify(foodOrderModifyCommand modifyCommand, ModelAndView mnv) throws Exception {
		String url = "/foodOrder/foodOrderModify_success";

		foodOrderVO foodOrder = modifyCommand.tofoodOrderVO();
	
		// DB 수정
		foodOrderService.modify(foodOrder);

		mnv.addObject("order_id", foodOrder.getOrder_id());
		mnv.setViewName(url);
		return mnv;
	}

}

