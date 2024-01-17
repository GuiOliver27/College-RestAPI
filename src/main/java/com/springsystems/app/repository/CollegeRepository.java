package com.springsystems.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springsystems.app.entity.College;

@Repository
public interface CollegeRepository extends CrudRepository<College, Long> {

}
