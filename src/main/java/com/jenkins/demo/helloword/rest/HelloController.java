package com.jenkins.demo.helloword.rest;

import org.springframework.web.bind.annotation.*;

import javax.management.Query;

/**
 * @Author:HuaweiLiu
 * @Description:
 * @Date:Created in 17:20 2019/5/24
 * @Modified By:
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String list(){
      return "Hello Jenkins";
    }
}
