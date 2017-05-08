package com.spring.repositories;


import com.spring.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "user")
public interface UserRepository extends CrudRepository<User, Integer> {

}
