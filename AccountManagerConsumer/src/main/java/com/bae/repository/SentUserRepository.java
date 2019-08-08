package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.entity.SentUser;

@Repository
public interface SentUserRepository extends MongoRepository<SentUser, Long> {

}
