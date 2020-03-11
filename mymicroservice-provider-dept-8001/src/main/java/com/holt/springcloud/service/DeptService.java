package com.holt.springcloud.service;
/**@author hot
 * @version 创建时间：2020年3月11日
 *
 */
import java.util.List;

import com.holt.spirngcloud.entities.Dept;
public interface DeptService
{
public boolean add(Dept dept);
public Dept    get(Long id);
public List<Dept> list();
}

