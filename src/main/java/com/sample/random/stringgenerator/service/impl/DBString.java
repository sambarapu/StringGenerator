package com.sample.random.stringgenerator.service.impl;

import com.sample.random.stringgenerator.service.RandomStringService;
import org.springframework.stereotype.Component;

@Component("DBReader")
public class DBString implements RandomStringService {

    @Override
    public String getRandomString(String fileName) {
        // TO DO : We can add DB implementation if we want to generate String from DB
        return null;
    }
}
