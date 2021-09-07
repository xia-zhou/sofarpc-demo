package com.sofa.sample.facade;

import com.sofa.sample.facade.module.HttpParams;
import com.sofa.sample.facade.module.HttpResult;

/**
 * @author song.z
 * @date 2021/9/3 6:42 下午
 */
public interface HelloFacade {

    /**
     * @param name 字符串
     * @return 字符串
     */
    String hello(String name);

    /**
     * @param params 字符串
     * @return 字符串
     */
    HttpResult hello(HttpParams params);

}
