package com.selfos.services.people;

import com.selfos.services.utils.Constants;
import com.selfos.services.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProcessAddPerson {

    private static Logger logger = LoggerFactory.getLogger(ProcessAddPerson.class);

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
     */
    public boolean ensureValidPerson(AddPeopleRequest addPeopleRequest) {
        // ensure we have first and last names
        if (addPeopleRequest.getFirstName() == null || addPeopleRequest.getLastName() == null) {
            return false;
        }
        return true;
    }

    /**
     * process the addition of a person
     */
    public ResponseEntity<String> processAddingAPerson(AddPeopleRequest addPeopleRequest) {
        // check if person being added already exists
        if (personAlreadyExists(addPeopleRequest)) {
            // return user already exists
            logger.info("user already exists");
            return new ResponseEntity(Utils.result(Constants.USER_ALREADY_EXISTS), HttpStatus.BAD_REQUEST);
        } else {
            // record should be saved..
            this.addPersonRequestMongoRepository.save(addPeopleRequest);
            return new ResponseEntity(Utils.result(Constants.RECEIVED), HttpStatus.OK);
        }
    }


    /**
     * queries db and checks if person's first name and last name already exist..
     */
    private boolean personAlreadyExists(AddPeopleRequest addPeopleRequest) {
        // query db for this user
        AddPeopleRequest matchingEntry =
                this.addPersonRequestMongoRepository
                        .findPersonByFirstAndLastName(
                                addPeopleRequest.getFirstName(),
                                addPeopleRequest.getLastName());
        // if the value returned is null.. the value did not exist..
        if(matchingEntry == null){
            return false;
        }else{
            return true;
        }
    }

}
