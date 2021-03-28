package com.selfos.services.controller;

import com.selfos.services.person.AddPersonRequest;
import com.selfos.services.person.ProcessAddPerson;
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
        // ensure request is valid


        // process adding person to people db
        this.processAddPerson.processAddingAPerson(addPersonRequest);


        return new ResponseEntity("got it", HttpStatus.OK);
    }

}
