package com.selfos.services.person;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddPersonRequestMongoRepository extends MongoRepository<AddPersonRequest, String> {
}
