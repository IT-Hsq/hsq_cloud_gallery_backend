package com.jyu.hsqcloudgallerybackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.jyu.hsqcloudgallerybackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class HsqCloudGalleryBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HsqCloudGalleryBackendApplication.class, args);
    }

}
