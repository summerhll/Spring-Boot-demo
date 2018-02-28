package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangli on 2018/2/27.
 */
// 访问地址： http://localhost:8080/hello
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String say(){
        return "hello Java!";
    }
}
