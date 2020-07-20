package com.sample.random.stringgenerator.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class WordsLoader {

    private static final Logger logger = LoggerFactory.getLogger(WordsLoader.class);

    /**
     *
     * @param
     * @return
     */
    public  List<String> loadWordsFromFile(String fileName){
        List<String> words = new ArrayList<>();
        try{
            InputStream inputStream = getClass().getResourceAsStream(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,
                    StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = null;
            while(( line = bufferedReader.readLine()) != null) {
                words.add(line);
            }
        }catch (Exception exception ){
            logger.error("Error while loading words to list::",exception);
        }
        return words;
    }
}
