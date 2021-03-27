package com.selfos.services.controller;

import com.selfos.services.person.AddPersonRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller implements Icontroller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Override
    public ResponseEntity addPerson(@RequestBody AddPersonRequest addPersonRequest) {
        // ensure we have a valid request
        logger.debug(addPersonRequest.toString());
        return new ResponseEntity("got it", HttpStatus.OK);
    }

}
