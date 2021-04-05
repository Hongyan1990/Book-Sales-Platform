package com.booksalesplatform.service;

import java.util.List;
import java.util.Map;

import com.booksalesplatform.po.OrderModel;
import com.booksalesplatform.po.ResBaseModel;

public interface OrderService {
	ResBaseModel queryOrder(Map<String, Object> order);
	ResBaseModel addOrder(Map<String, Object> order);
	ResBaseModel updateOrder(Map<String, Object> order);
}
