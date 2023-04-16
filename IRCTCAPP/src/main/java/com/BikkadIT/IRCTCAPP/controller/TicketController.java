package com.BikkadIT.IRCTCAPP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.IRCTCAPP.model.Passanger;
import com.BikkadIT.IRCTCAPP.model.Ticket;
import com.BikkadIT.IRCTCAPP.service.TicketServiceI;

@RestController
public class TicketController {

	@Autowired
	private TicketServiceI ticketServiceI;
	
	@PostMapping("/getTicket")
	public ResponseEntity<Ticket> savePassangerGetTicket(@RequestBody Passanger passanger){
		
		
		boolean savePassanger = this.ticketServiceI.savePassangerGetTicket(passanger);
		
		if(savePassanger == true) {
			
			Ticket ticket = new Ticket();
			ticket.setTid(111);
			ticket.setPnr(123456);
			ticket.setTicketStatus("confirmed");
			ticket.setTicketPrice(560.00);
			
			return new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
		}
		
		else {
		
			Ticket ticket = new Ticket();
			
			ticket.setTid(0);
			ticket.setPnr(0000);
			ticket.setTicketStatus("Not confirmed");
			ticket.setTicketPrice(000.00);
			
			return new ResponseEntity<Ticket>(ticket,HttpStatus.BAD_REQUEST);
		}
		
		
		
	}
	
}
