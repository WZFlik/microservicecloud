package com.holt.springcloud.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holt.spirngcloud.entities.Dept;
import com.holt.springcloud.mapper.DeptMapper;
import com.holt.springcloud.service.DeptService;

/**
 * 
 * @author hot
 */
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper dao;

	@Override
	public boolean add(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}
}
