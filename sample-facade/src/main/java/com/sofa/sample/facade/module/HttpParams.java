package com.sofa.sample.facade.module;

/**
 * @author: song.z
 * @date: 2021/9/3 6:43 下午
 */
public class HttpParams {

    private String name;

    public HttpParams(String name) {
        this.name = name;
    }

    public HttpParams() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
