package com.hingsmy.wiki.controller;

import com.hingsmy.wiki.domain.Test;
import com.hingsmy.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    @Autowired
    private TestService testService;

    /**
     * GET, POST, PUT, DELETE
     *
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post，" + name;
    }

    @RequestMapping(value = "/test/list", method = RequestMethod.GET)
    public List<Test> list() {
        return testService.list();
    }
}
