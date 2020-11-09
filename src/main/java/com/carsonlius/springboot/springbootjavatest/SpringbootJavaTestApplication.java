package com.carsonlius.springboot.springbootjavatest;

import com.carsonlius.springboot.springbootjavatest.service.Hello;
import com.carsonlius.springboot.springbootjavatest.service.impl.HelloImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sun.tools.jar.CommandLine;

//@SpringBootApplication
//public class SpringbootJavaTestApplication {
//
//    public static void main(String[] args) {
////        SpringApplication.run(SpringbootJavaTestApplication.class, args);
//        // 第一种实现方式 从容器中拿
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootJavaTestApplication.class, args);
//        HelloImpl helloImpl= (HelloImpl)applicationContext.getBean("helloImpl");
//       String str = helloImpl.sayHello();
//       System.out.println(str);
//
//    }
//}

@SpringBootApplication
public class SpringbootJavaTestApplication implements CommandLineRunner {

    @Autowired
    private Hello hello;
    public static void main(String[] args) {
        SpringApplication.run(SpringbootJavaTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(hello.sayHello());
    }
}
