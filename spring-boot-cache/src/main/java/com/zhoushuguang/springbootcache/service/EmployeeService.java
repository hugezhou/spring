package com.zhoushuguang.springbootcache.service;

import com.zhoushuguang.springbootcache.bean.Employee;
import com.zhoushuguang.springbootcache.mappper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Cacheable(cacheNames = "emp")
    public Employee getEmployeeById(Integer id){
        System.out.println("start emp");
        return employeeMapper.getEmployeeById(id);
    }


}
