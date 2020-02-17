package com.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Auther cuichao
 * @Description: TestInterface
 * @Date: create in 2020/2/11 20:23
 */
@FeignClient("mall-cms")
@Service
public interface TestInterface {

    @RequestMapping("simple")
    String simple(@RequestParam("simpleValue") String simpleValue);

    @RequestMapping("simpleList")
    String simpleList(@RequestParam("simpleValue") List<String> simpleValue);


}
