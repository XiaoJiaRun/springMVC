package com.atguigu.mvc.controller;
/*
@author JiaLess
@date 2021/11/28 16:13
*/

import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HttpController {

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody:"+requestBody);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestentity(RequestEntity<String> requestEntity) {
        System.out.println("请求头" + requestEntity.getHeaders());
        System.out.println("请求体" + requestEntity.getBody());
        return "success";
    }

}
