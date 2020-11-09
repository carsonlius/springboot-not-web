package com.carsonlius.springboot.springbootjavatest.service.impl;

import com.carsonlius.springboot.springbootjavatest.service.Hello;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HelloImpl implements Hello {
    @Override
    public String sayHello() {
        return "Hello World!" + (new Date()).toString();
    }
}
