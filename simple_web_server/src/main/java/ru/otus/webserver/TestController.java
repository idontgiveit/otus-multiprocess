package ru.otus.webserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${some.value}")
    String aaa;
    @GetMapping(path = "hello")
    public String hello() {
        return "{}";
    }
}
