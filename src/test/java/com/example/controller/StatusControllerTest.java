package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest
class StatusControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getStatus() throws Exception {
        //mockMvc.perform(get("/status")).andExpect(status().isOk());
    }
}
