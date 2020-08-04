package com.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("UserService1")
@Slf4j
public class UserService {
    public static void getName(){
        log.info("读到了");
    }
}
