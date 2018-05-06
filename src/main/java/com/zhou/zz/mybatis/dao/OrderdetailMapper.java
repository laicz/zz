package com.zhou.zz.mybatis.dao;

import com.zhou.zz.mybaties.model.Orderdetail;
import java.util.List;

public interface OrderdetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderdetail record);

    Orderdetail selectByPrimaryKey(Integer id);

    List<Orderdetail> selectAll();

    int updateByPrimaryKey(Orderdetail record);
}