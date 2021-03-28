package com.selfos.services.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcessAddPerson {

    @Autowired
    private AddPersonRequestMongoRepository addPersonRequestMongoRepository;

    /**
     * process the addition of a person
     */
    public void processAddingAPerson(AddPersonRequest addPersonRequest) {
        // save the person in mongo..
        this.addPersonRequestMongoRepository.save(addPersonRequest);
    }


}
