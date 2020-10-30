package com.zhoushuguang.springbootcache.controllor;

import com.zhoushuguang.springbootcache.bean.Employee;
import com.zhoushuguang.springbootcache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeControllor {

    @Autowired
    EmployeeService employeeService;



    @GetMapping("/emp/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id){
        Employee e = employeeService.getEmployeeById(id);
        return e;
    }

}
