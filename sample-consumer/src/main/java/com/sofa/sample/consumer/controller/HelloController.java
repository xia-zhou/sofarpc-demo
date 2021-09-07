package com.sofa.sample.consumer.controller;

import com.sofa.sample.facade.HelloFacade;
import com.sofa.sample.facade.module.HttpParams;
import com.sofa.sample.facade.module.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * @author zhangsong
 */
@RestController
public class HelloController {

    private final HelloFacade helloFacade;

    public HelloController(HelloFacade helloFacade) {
        this.helloFacade = helloFacade;
    }

    @GetMapping("/")
    public String hello(String name) {
        return helloFacade.hello(name);
    }


    @GetMapping("/hello")
    public HttpResult hello1(String name) {
        return helloFacade.hello(new HttpParams(name));
    }

    public static void main(String[] args) {
        List<HttpParams> params = new ArrayList<>();

        System.out.println(
                params.stream().reduce((param1, param2) -> new HttpParams(param1.getName() + ":" + param2.getName())));

    }
}

