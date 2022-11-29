package br.com.pards.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //the annotation shows SB that this class serves URLs
public class HelloController {

    @GetMapping("/test") //on the url/test, it will return the result of running this method
    public String sayHi(){

        return "Hello world! My first SpringBoot project! This is very cool!!";
    }
}
