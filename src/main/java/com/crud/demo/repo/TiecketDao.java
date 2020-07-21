package com.crud.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.model.Ticket;

@Repository
public interface TiecketDao extends CrudRepository<Ticket, Integer> {

}
