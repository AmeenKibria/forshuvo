package com.ameen.countryServiceBack;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class HttpRequestTest {



    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getCountry() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:8081/country-app/countries", String.class)
                .contains("Finland"));
    }
}
