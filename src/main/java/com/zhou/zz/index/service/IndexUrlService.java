package com.zhou.zz.index.service;

import java.util.List;

import com.zhou.zz.index.model.IndexUrl;

public interface IndexUrlService {
	
	int deleteByPrimaryKey(Integer id);

	int insert(IndexUrl record);

	IndexUrl selectByPrimaryKey(Integer id);

	List<IndexUrl> selectAll();

	int updateByPrimaryKey(IndexUrl record);
}
