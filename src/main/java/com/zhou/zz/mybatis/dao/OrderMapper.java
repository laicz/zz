package com.zhou.zz.mybatis.dao;

import com.zhou.zz.common.annotation.MybatisDao;
import com.zhou.zz.mybaties.model.Order;
import java.util.List;

@MybatisDao
public interface OrderMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Order record);

	Order selectByPrimaryKey(Integer id);

	List<Order> selectAll();

	int updateByPrimaryKey(Order record);

	Order findOrderAndDetailResultMap(Integer id);
}