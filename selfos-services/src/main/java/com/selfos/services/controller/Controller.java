package com.selfos.services.controller;

import com.selfos.services.person.AddPersonRequest;
import com.selfos.services.person.ProcessAddPerson;
import com.selfos.services.utils.Constants;
import com.selfos.services.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class Controller implements Icontroller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private ProcessAddPerson processAddPerson;

    @Override
    public ResponseEntity addPerson(@Valid @RequestBody AddPersonRequest addPersonRequest) {
        try {
            // ensure request is valid
            if (!this.processAddPerson.ensureValidPerson(addPersonRequest)) {
                // invalid request
                return new ResponseEntity(
                        Utils.result("missing first or last name"), HttpStatus.BAD_REQUEST);
            }
            // process adding person to people db
            return this.processAddPerson.processAddingAPerson(addPersonRequest);
        } catch (Exception e) {
            return new ResponseEntity(
                    Utils.result("error 3248173"), HttpStatus.BAD_REQUEST);
        }
    }

}
