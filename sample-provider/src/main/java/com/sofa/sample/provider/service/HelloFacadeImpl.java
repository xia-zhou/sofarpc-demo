package com.sofa.sample.provider.service;

import com.sofa.sample.facade.HelloFacade;
import com.sofa.sample.facade.module.HttpParams;
import com.sofa.sample.facade.module.HttpResult;
import org.springframework.stereotype.Service;

/**
 * @author zhangsong
 */
@Service("helloFacade")
public class HelloFacadeImpl implements HelloFacade {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }

    @Override
    public HttpResult hello(HttpParams params) {
        return new HttpResult(hello(params.getName()));
    }
}
