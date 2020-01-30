package com.javierlobo.gescoche.persistence.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javierlobo.gescoche.persistence.core.document.CocheDocument;

@Repository
@Transactional
public interface ICocheRepository extends MongoRepository<CocheDocument, String> {

}
