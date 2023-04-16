package com.BikkadIT.MakeMyTripApp.service;

import com.BikkadIT.MakeMyTripApp.model.Passanger;
import com.BikkadIT.MakeMyTripApp.model.Ticket;

public interface PassangerServiceI {

	public Ticket bookTicket(Passanger psg);
	
	public void getPassangerDataSync() ;
	
	public void getPassangerDataAsync();
}
