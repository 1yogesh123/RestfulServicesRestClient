package com.BikkadIT.IRCTCAPP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.IRCTCAPP.model.Passanger;
import com.BikkadIT.IRCTCAPP.repository.PassengerRepository;

@Service
public class TicketServiceImpl implements TicketServiceI{

	
	@Autowired
	private PassengerRepository passengerRepository;
	
	@Override
	public boolean savePassangerGetTicket(Passanger passanger) {
      
		
             Passanger save = this.passengerRepository.save(passanger);
		
             if(save != null) {
            	 return true;
             }
             else {
		return false;
             }
	
	}
	
}	
