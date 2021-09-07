package com.sofa.sample.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhangsong
 */
@SpringBootApplication
@ImportResource({"classpath*:facade-impl.xml"})
public class SofaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofaProviderApplication.class);
    }
}
