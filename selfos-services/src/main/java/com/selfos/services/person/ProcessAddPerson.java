package com.selfos.services.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcessAddPerson {

    @Autowired
    private AddPersonRequestMongoRepository addPersonRequestMongoRepository;

    /**
     * constructor used for creating mock test object
     */
    protected ProcessAddPerson(AddPersonRequestMongoRepository addPersonRequestMongoRepository) {
        this.addPersonRequestMongoRepository = addPersonRequestMongoRepository;
    }

    /**
     * constructor used for creating mock test object
     */
    protected ProcessAddPerson() {
    }

    /**
     * ensure we have a valid request
     * */
    public boolean ensureValidPerson(AddPersonRequest addPersonRequest){
        // ensure we have first and last names
        if(addPersonRequest.getFirstName() == null || addPersonRequest.getLastName() == null){
            return false;
        }
        return true;
    }

    /**
     * process the addition of a person
     */
    public void processAddingAPerson(AddPersonRequest addPersonRequest) {
        // save the person in mongo..
        this.addPersonRequestMongoRepository.save(addPersonRequest);
    }

}
