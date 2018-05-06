package com.zhou.zz.index.dao;

import com.zhou.zz.common.annotation.MybatisDao;
import com.zhou.zz.index.model.IndexUrl;
import java.util.List;

@MybatisDao
public interface IndexUrlMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(IndexUrl record);

	IndexUrl selectByPrimaryKey(Integer id);

	List<IndexUrl> selectAll();

	int updateByPrimaryKey(IndexUrl record);
}