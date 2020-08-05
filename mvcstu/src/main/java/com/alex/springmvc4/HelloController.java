package com.alex.springmvc4;

import com.alex.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author alex
 * @Title: HelloController
 * @ProjectName mvcstu
 * @Description: TODO
 * @date 2020-08-03  22:16
 */
@Controller
public class HelloController {
    
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
    
    @ResponseBody
    @RequestMapping("/findByAge/{age}")
    public Employee findByAge(@PathVariable("age") Integer age){
        Employee employee = new Employee();
        employee.setName("Alex");
        employee.setAge(age);
        return employee;
    }
}
