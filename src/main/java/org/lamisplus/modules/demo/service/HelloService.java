package org.lamisplus.modules.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloService {

    public String sayHello(){
        System.out.println("Hello");
        return "Hello";
    }
}
