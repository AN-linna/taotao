package com.itln.service.impl;

import com.itln.service.TestService;
import org.springframework.stereotype.Service;


@Service
public class TestServiceImpl implements TestService {
    public void sayHi(){
        System.out.println("TestServiceImpl方法被调用了~~");
    }
}
