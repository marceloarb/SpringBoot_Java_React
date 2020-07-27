package com.teksystems.java_react.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.teksystems.java_react.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

}
