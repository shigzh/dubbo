package com.sgz;

import com.sgz.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        applicationContext.start();
        System.out.println("###order服務,开始调用会员服务");
        UserService userService=(UserService) applicationContext.getBean("userService");
        String userName = userService.getUser(2l);
        System.out.println("###order服務,结束调用会员服务,userName:" + userName);
    }
}
