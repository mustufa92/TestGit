package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class SpringBootJdbcController {  
    @Autowired  
    JdbcTemplate jdbc;    
    @RequestMapping("/insert")  
    public String index(){  
        jdbc.execute("insert into employee(id,name,salary)values(1,'qwerty',20000)");  
        return"data inserted Successfully";  
    }  
}  