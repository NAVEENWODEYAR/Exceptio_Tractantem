package com.gowri.controller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * @author NaveenWodeyar
 * @date 24-Feb-2025 11:17:10 pm
 */
@SpringBootTest
public class WeatherControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeAll
    static void setUpBeforeClass() {
        // Code to run before all tests, if needed
    }

    @AfterAll
    static void tearDownAfterClass() {
        // Code to run after all tests, if needed
    }

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @AfterEach
    void tearDown() {
        // Code to run after each test, if needed
    }

    @Test
    void testGetWeatherEndpoint() throws Exception {
        // Simulate calling the endpoint with a name parameter
        String name = "John";

        mockMvc.perform(get("/weather")
                        .param("name", name))
                .andExpect(status().isOk())
                .andExpect(content().string("Welcome John"));
    }
}
