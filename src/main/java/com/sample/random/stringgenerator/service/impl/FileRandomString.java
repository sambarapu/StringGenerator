package com.sample.random.stringgenerator.service.impl;

import com.sample.random.stringgenerator.service.RandomStringService;
import com.sample.random.stringgenerator.helper.RandomNumberGenerator;
import com.sample.random.stringgenerator.helper.WordsLoader;
import org.springframework.stereotype.Component;

@Component("FileReader")
public class FileRandomString implements RandomStringService {

    @Override
    public String getRandomString(String fileName) {
        return WordsLoader.loadWordsFromFile(fileName).get(RandomNumberGenerator.generateRandomNumber());
    }
}
