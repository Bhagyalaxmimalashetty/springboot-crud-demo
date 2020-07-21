package com.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.model.Ticket;
import com.crud.demo.repo.TiecketDao;

@RestController
@RequestMapping("/api")
public class TicketController {
	
	@Autowired
	private TiecketDao ticketDao;
	
	@PostMapping("/saveTickets")
	public String bookTicket(@RequestBody List<Ticket>  tickets) {
		ticketDao.saveAll(tickets);
		return "Success";	
	}
	
	@GetMapping("/getAllTickets")
	public List<Ticket> getAllTickets(){
		return (List<Ticket>)ticketDao.findAll();
	}

}
