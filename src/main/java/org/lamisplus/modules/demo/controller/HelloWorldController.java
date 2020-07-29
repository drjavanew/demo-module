package org.lamisplus.modules.demo.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lamisplus.modules.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
@Slf4j
public class HelloWorldController {
    @Autowired
    private HelloService helloService;

    @GetMapping
    public String sayHello(){
        return this.helloService.sayHello();
    }

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name){
        return this.helloService.sayHello() + " " + name;
    }
}
