package com.sample.random.stringgenerator.service.impl;

import com.sample.random.stringgenerator.service.RandomStringService;
import com.sample.random.stringgenerator.helper.RandomNumberGenerator;
import com.sample.random.stringgenerator.helper.WordsLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("FileReader")
public class FileRandomString implements RandomStringService {

    @Autowired
    WordsLoader wordsLoader;


    @Autowired
    RandomNumberGenerator randomNumberGenerator;

    @Override
    public String getRandomString(String fileName) {
        return wordsLoader.loadWordsFromFile(fileName).get(randomNumberGenerator.generateRandomNumber());
    }
}
