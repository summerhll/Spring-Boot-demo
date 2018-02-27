package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangli on 2018/2/27.
 */
@RestController
public class HellowController {
    @RequestMapping("hello")
    public String say(){
        return "hello Java!";
    }
}
