package com.sample.random.stringgenerator.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static com.sample.random.stringgenerator.helper.ApplicationKeys.FILE_NAME;

@Component
public class RandomNumberGenerator {

    public static int MIN_VALUE = 0;

    @Value("${wordsListFile}")
    private String fileName;

    @Autowired
    WordsLoader wordsLoader;
    /**
     *
     * @return
     */
    public int generateRandomNumber(){
        return (int) ( Math.random() * ( wordsLoader.loadWordsFromFile(fileName).size() - MIN_VALUE + 1) + MIN_VALUE);
    }
}
