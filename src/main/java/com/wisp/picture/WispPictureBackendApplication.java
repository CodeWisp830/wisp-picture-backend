package com.wisp.picture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wisp.picture.mapper")
public class WispPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WispPictureBackendApplication.class, args);
    }

}
