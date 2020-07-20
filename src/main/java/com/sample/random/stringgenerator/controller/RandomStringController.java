package com.sample.random.stringgenerator.controller;

import com.sample.random.stringgenerator.service.RandomStringService;
import com.sample.random.stringgenerator.helper.WordsLoader;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.sample.random.stringgenerator.helper.ApplicationKeys.API;
import static com.sample.random.stringgenerator.helper.ApplicationKeys.FILE_NAME;
import static com.sample.random.stringgenerator.helper.ApplicationKeys.GET_STRING_API;
import static java.net.HttpURLConnection.HTTP_OK;

@RestController
@RequestMapping(API)
public class RandomStringController {


    @Value("${wordsListFile}")
    private String fileName;

    @Qualifier("FileReader")
    @Autowired
    RandomStringService randomStringService;

    @GetMapping(GET_STRING_API)
    @ApiResponses(value = {
        @ApiResponse(code = HTTP_OK, message = "", response = String.class),
    })
    public ResponseEntity<String> getRandomString(){
        return ResponseEntity.ok().body(randomStringService.getRandomString(fileName));
    }



}
