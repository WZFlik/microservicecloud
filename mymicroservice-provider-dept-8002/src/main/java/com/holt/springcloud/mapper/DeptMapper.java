package com.holt.springcloud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.holt.spirngcloud.entities.Dept;

/**@author hot
 * @version 创建时间：2020年3月11日
 *Dept部门数据模型对应的Mapper接口文件
 * ss
 */
@Mapper
public interface DeptMapper {
	public boolean addDept(Dept dept);
	public Dept findById(Long id);
	public List<Dept> findAll();
}
