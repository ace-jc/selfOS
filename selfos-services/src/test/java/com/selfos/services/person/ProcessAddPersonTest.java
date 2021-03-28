package com.selfos.services.person;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;


@SpringBootTest
@AutoConfigureMockMvc
public class ProcessAddPersonTest {

    private static final Logger logger = LoggerFactory.getLogger(ProcessAddPersonTest.class);

    @Test
    public void makeAMockedMongoSaveCall() {
        // create record to add
        AddPersonRequest addPersonRequest = new AddPersonRequest(null, "Lionel", "Messi",
                "", "3326667777", "billy@bob.com", "3333 Kirkwood Ln",
                "", "Boston", "TX", "44555");
        // mock the repository
        AddPersonRequestMongoRepository addPersonRequestMongoRepository =
                Mockito.mock(AddPersonRequestMongoRepository.class);
        Mockito.when(addPersonRequestMongoRepository.save(any(AddPersonRequest.class)))
                .thenReturn(null);
        // build the object of the class we are testing
        ProcessAddPerson processAddPerson = new ProcessAddPerson(addPersonRequestMongoRepository);
        // make the mocked call
        processAddPerson.processAddingAPerson(addPersonRequest);
    }


    @Test
    public void ensureValidPersonCalculation() {
        // create person to be validated
        AddPersonRequest addPersonRequest = new AddPersonRequest(null, "Lionel", "Messi",
                null, null, null, null, null, null,
                null, null);
        ProcessAddPerson processAddPerson = new ProcessAddPerson();
        assert(processAddPerson.ensureValidPerson(addPersonRequest));
    }


    @Test
    public void ensureInvalidPersonCalculationFirstNameNull() {
        // create person to be validated
        AddPersonRequest addPersonRequest = new AddPersonRequest(null, null, "Messi",
                null, null, null, null, null, null,
                null, null);
        ProcessAddPerson processAddPerson = new ProcessAddPerson();
        assert(!processAddPerson.ensureValidPerson(addPersonRequest));
    }

    @Test
    public void ensureInvalidPersonCalculationLastNameNull() {
        // create person to be validated
        AddPersonRequest addPersonRequest = new AddPersonRequest(null, "Lionel", null,
                null, null, null, null, null, null,
                null, null);
        ProcessAddPerson processAddPerson = new ProcessAddPerson();
        assert(!processAddPerson.ensureValidPerson(addPersonRequest));
    }


    @Test
    public void ensureInvalidPersonCalculationFirstAndLastNameNull() {
        // create person to be validated
        AddPersonRequest addPersonRequest = new AddPersonRequest(null, null, null,
                null, null, null, null, null, null,
                null, null);
        ProcessAddPerson processAddPerson = new ProcessAddPerson();
        assert(!processAddPerson.ensureValidPerson(addPersonRequest));
    }
}
