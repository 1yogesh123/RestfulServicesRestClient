package com.BikkadIT.MakeMyTripApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.MakeMyTripApp.model.Passanger;
import com.BikkadIT.MakeMyTripApp.model.Ticket;
import com.BikkadIT.MakeMyTripApp.service.PassangerServiceI;

@RestController
public class PassangerController {

	@Autowired
	private PassangerServiceI passnagerServiceI;
	
	
		@PostMapping("/bookticket")
		public ResponseEntity<Ticket> bookticket(@RequestBody Passanger psg) {
			Ticket ticket = passnagerServiceI.bookTicket(psg);

			return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);

		}

		@GetMapping("/getPassangerSync")
		public void getPassangerDataSync() {
			
			passnagerServiceI.getPassangerDataSync();
		}
		
		@GetMapping("/getPassangerAsync")
		public void getPassangerDataAsync() {
			
			passnagerServiceI.getPassangerDataAsync();
		}
		
		
	}
