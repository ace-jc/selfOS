package com.selfos.services.person;

import com.selfos.services.utils.Constants;
import com.selfos.services.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

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
    public boolean ensureValidPerson(AddPersonRequest addPersonRequest) {
        // ensure we have first and last names
        if (addPersonRequest.getFirstName() == null || addPersonRequest.getLastName() == null) {
            return false;
        }
        return true;
    }

    /**
     * process the addition of a person
     */
    public ResponseEntity<String> processAddingAPerson(AddPersonRequest addPersonRequest) {
        // check if person being added already exists
        if (personAlreadyExists(addPersonRequest)) {
            // return user already exists
            logger.info("user already exists");
            return new ResponseEntity(Utils.result(Constants.USER_ALREADY_EXISTS), HttpStatus.BAD_REQUEST);
        } else {
            // record should be saved..
            this.addPersonRequestMongoRepository.save(addPersonRequest);
            return new ResponseEntity(Utils.result(Constants.RECEIVED), HttpStatus.OK);
        }
    }


    /**
     * queries db and checks if person's first name and last name already exist..
     */
    private boolean personAlreadyExists(AddPersonRequest addPersonRequest) {
        // query db for this user
        AddPersonRequest matchingEntry =
                this.addPersonRequestMongoRepository
                        .findPersonByFirstAndLastName(
                                addPersonRequest.getFirstName(),
                                addPersonRequest.getLastName());
        // if the value returned is null.. the value did not exist..
        if(matchingEntry == null){
            return false;
        }else{
            return true;
        }
    }

}
