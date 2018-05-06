package com.zhou.zz.mybatis.service;

import java.util.List;

import com.zhou.zz.mybaties.model.Order;

public interface OrderService {
	int deleteByPrimaryKey(Integer id);

	int insert(Order record);

	Order selectByPrimaryKey(Integer id);

	List<Order> selectAll();

	int updateByPrimaryKey(Order record);

	Order findOrderAndDetailResultMap(Integer id);
}
