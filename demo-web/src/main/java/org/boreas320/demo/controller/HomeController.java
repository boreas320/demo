package org.boreas320.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiangshuai on 2017/2/4.
 */
@RestController
@RequestMapping
public class HomeController {


    @RequestMapping
    public String index() {
        return "";
    }
}
