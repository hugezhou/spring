package com.zhoushuguang.springbootcache.mappper;

import com.zhoushuguang.springbootcache.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    public Employee getEmployeeById(Integer id);

    @Select("select * from employee")
    public List<Employee> findAll();

}
