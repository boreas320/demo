package org.boreas320.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xiangshuai on 2017/2/4.
 */
@SpringBootApplication
//@ServletComponentScan(basePackages = "org.boreas320.demo.filter")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
