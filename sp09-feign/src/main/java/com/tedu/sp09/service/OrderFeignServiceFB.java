package com.tedu.sp09.service;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.Order;
import com.tedu.web.util.JsonResult;

@Component
public class OrderFeignServiceFB implements OrderFeignService{

	@Override
	public JsonResult<Order> getOder(String orderId) {
		return JsonResult.err("无法获得商品订单");
	}

	@Override
	public JsonResult addOrder() {
		return JsonResult.err("无法保存订单");
	}

	
}
