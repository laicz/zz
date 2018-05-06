package com.zhou.zz.index.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhou.zz.index.dao.IndexUrlMapper;
import com.zhou.zz.index.model.IndexUrl;

@Service
public class IndexUrlServiceImpl implements IndexUrlService {

	@Autowired
	private IndexUrlMapper indexUrlMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(IndexUrl record) {
		return indexUrlMapper.insert(record);
	}

	@Override
	public IndexUrl selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IndexUrl> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(IndexUrl record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
