package com.selfos.services.controller;

import com.selfos.services.person.AddPersonRequest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(ControllerTest.class);

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addTestPersonToContacts()
            throws Exception {
        AddPersonRequest addPersonRequest = new AddPersonRequest("Lionel", "Messi", "",
                "3326667777", "billy@bob.com", "1307 Kirkwood Rd", "",
                "Boston", "TX", "44555");

        mockMvc.perform(MockMvcRequestBuilders
                .post("/addPerson")
                .content(addPersonRequest.serialize().toString())
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }

//    @Test
//    public void addTestPersonToContactsWithANullRequiredField()
//            throws Exception {
//        AddPersonRequest addPersonRequest = new AddPersonRequest(null, "Jameson", "",
//                "7706667777", "billy@bob.com", "1307 Kirkwood Rd", "",
//                "Cape Coral", "TX", "77666");
//
//        mockMvc.perform(MockMvcRequestBuilders
//                .post("/addPerson")
//                .content(addPersonRequest.serialize().toString())
//                .contentType(MediaType.APPLICATION_JSON_VALUE))
//                .andExpect(status().isBadRequest());
//    }
}
