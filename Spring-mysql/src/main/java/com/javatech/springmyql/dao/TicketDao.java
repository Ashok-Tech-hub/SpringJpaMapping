package com.javatech.springmyql.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatech.springmyql.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
