package com.sraavan.starter;

import com.sraavan.starter.web.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void greetsDefaultWhenNoNameGiven() throws Exception {
        mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello, world!"));
    }

    @Test
    void greetsProvidedName() throws Exception {
        mockMvc.perform(get("/api/hello").param("name", "Sraavan"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello, Sraavan!"));
    }
}
