package com.sample.random.stringgenerator.integration.randomstring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;


/**
 * Kind of integration test , which basically test the behavior of the applicatoin
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RandomStringControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void generateRandomString() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/v1/api/randomString",
                String.class)).isNotNull();
    }

}

