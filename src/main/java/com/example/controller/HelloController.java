package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ld on 2017/12/27.
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    @ResponseBody
    public String getHelloWorld(){
        return "~~~~小叮咚ttt rrrrr hot complier yyyyyuuu test  let me updateto Hello world~~I am springboot!!";
    }
}
