package com.sofa.sample.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhangsong
 */
@SpringBootApplication
@ImportResource({"classpath*:consumer.xml"})
public class SofaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofaConsumerApplication.class);
    }
}
