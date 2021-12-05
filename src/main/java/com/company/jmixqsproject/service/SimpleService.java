package com.company.jmixqsproject.service;

import org.springframework.stereotype.Service;

@Service("testService")
public class SimpleService {

    public String getHello(String name) {
        return "Hello "+name;
    }


}
