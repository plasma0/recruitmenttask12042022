package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
    private MockMvc mvc;
    
    @Test
    public void givenStandardRequestGetCorrectResponse() throws Exception {
        mvc.perform(get("/repositories/plasma0/hellogit"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.description").value("Training repository for students"))
      .andExpect(jsonPath("$.full_name").value("plasma0/hellogit"))
      .andExpect(jsonPath("$.clone_url").value("https://github.com/plasma0/hellogit.git"))
      .andExpect(jsonPath("$.stargazers_count").value(0))
      .andExpect(jsonPath("$.created_at").value("https://github.com/plasma0/hellogit.git"));
    }

}
