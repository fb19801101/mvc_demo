package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-14 8:15
 */
@Controller
//@RequestMapping("/test")
public class DemoController {
    @RequestMapping("/demo")
    public String demo(Model model){ //参数中传入Model
        model.addAttribute("name","com.mvc.controller"); //指定Model的值
        model.addAttribute("url","http://www.baidu.com/"); //指定Model的值
        return "demo";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}