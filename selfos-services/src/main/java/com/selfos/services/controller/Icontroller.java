package com.selfos.services.controller;

import com.selfos.services.person.AddPersonRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public interface Icontroller {

    /**
     * will allow for additional contacts to be added
     */
    @CrossOrigin
    @PostMapping(value = {"/addPerson", "/addperson"},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity addPerson(@Valid @RequestBody AddPersonRequest addPersonRequest);

}