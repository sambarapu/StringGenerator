package com.sample.random.stringgenerator.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
    public static List<String> loadWordsFromFile(String fileName){
        List<String> words = Collections.emptyList();
        try{
            words = Files.readAllLines(Paths.get(new ClassPathResource(fileName).getURI()));
        }catch (IOException exception ){
            logger.error("Error while loading words to list::",exception);
        }
        return words;
    }
}
