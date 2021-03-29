package com.selfos.services.controller;

import com.selfos.services.people.AddPeopleRequest;
import com.selfos.services.people.ProcessAddPerson;
import com.selfos.services.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class Controller implements Icontroller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private ProcessAddPerson processAddPerson;


    @Override
    public ResponseEntity addPerson(@Valid @RequestBody AddPeopleRequest addPeopleRequest) {
        try {
            // ensure request is valid
            if (!this.processAddPerson.ensureValidPerson(addPeopleRequest)) {
                // invalid request
                return new ResponseEntity(
                        Utils.result("missing first or last name"), HttpStatus.BAD_REQUEST);
            }
            // process adding person to people db
            return this.processAddPerson.processAddingAPerson(addPeopleRequest);
        } catch (Exception e) {
            return new ResponseEntity(Utils.result("error 3248173"), HttpStatus.BAD_REQUEST);
        }
    }


    @Override
    public ResponseEntity<String> getAllPeople() {
        try {
            List<AddPeopleRequest> listOfAllPeople = this.processAddPerson.getAllPeople();
            logger.info("the list of all people is: {}", listOfAllPeople);
            return new ResponseEntity(listOfAllPeople, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(Utils.result("error 3452664"), HttpStatus.BAD_REQUEST);
        }
    }


}
