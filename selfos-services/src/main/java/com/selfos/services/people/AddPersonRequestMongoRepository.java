package com.selfos.services.people;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AddPersonRequestMongoRepository extends MongoRepository<AddPeopleRequest, String> {

    @Query(value = "{'firstName' : ?0, 'lastName' : ?1}")
    AddPeopleRequest findPersonByFirstAndLastName(String firstName, String lastName);


    //    should have the following available:
    //    List saveAll(List employees);
    //    List findAll();
    //    List findAll(Sort sort);
    //    Optional findById(String empId);
    //    Employee insert(Employee employee);
    //    List insert(List employees);
    //    List findAll(Example empExample);
    //    List findAll(Example example, Sort sort);
    //    void delete(Employee emp);
    //    void deleteById(String id);
    //    void deleteAll(List emps)
}
