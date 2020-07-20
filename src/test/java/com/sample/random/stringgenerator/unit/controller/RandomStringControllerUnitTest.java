package com.sample.random.stringgenerator.unit.controller;

import com.sample.random.stringgenerator.service.RandomStringService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RandomStringControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean(name="FileReader")
    private RandomStringService randomStringService;


    @Test
    public void shouldGenerateRandomString() throws Exception {
        when(randomStringService.getRandomString(anyString())).thenReturn("testword");
        this.mockMvc.perform(get("/v1/api/randomString")).andExpect(status().isOk());
        this.mockMvc.perform(get("/v1/api/randomString")).andReturn()
                .getResponse().getContentAsString().equalsIgnoreCase("testword");
    }

}
