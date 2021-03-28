package com.selfos.services.controller;

import com.selfos.services.people.AddPeopleRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
public interface Icontroller {

    /**
     * will allow for additional contacts to be added
     */
    @PostMapping(value = {"/addPerson", "/addperson"},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<String> addPerson(@Valid @RequestBody AddPeopleRequest addPeopleRequest);


    /**
     * will return all the people
     * */
    @GetMapping(value = {"/getPeople", "/getpeople"})
    ResponseEntity<String> getAllPeople();



}