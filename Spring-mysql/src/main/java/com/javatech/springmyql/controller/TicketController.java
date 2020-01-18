package com.javatech.springmyql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatech.springmyql.dao.TicketDao;
import com.javatech.springmyql.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
   
	@Autowired
	TicketDao ticketDao;
    
	@PostMapping("/bookTickets")
    public String bookTicket( @RequestBody List<Ticket> tickets) {    	
    	ticketDao.saveAll(tickets);    	
    	return "ticket booked:"+tickets.size();    	
    }
    
	@GetMapping("/getTickets")
    public List<Ticket> getTickets(){		
    	return (List<Ticket>) ticketDao.findAll();    	
    }
    
    
    
}
