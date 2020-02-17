package com.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther cuichao
 * @Description: TestController
 * @Date: create in 2020/2/11 20:20
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestInterface impl;

    @RequestMapping("simple")
    public String simple(){
        return impl.simple("the simple value send");
    }

    @RequestMapping("simpleList")
    public String simpleList(){
        List<String> list = Arrays.asList(new String[]{"牛","马","羊"});
        return impl.simpleList(list);
    }

}
