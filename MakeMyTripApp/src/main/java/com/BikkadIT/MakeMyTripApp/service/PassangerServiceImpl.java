package com.BikkadIT.MakeMyTripApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.BikkadIT.MakeMyTripApp.model.Passanger;
import com.BikkadIT.MakeMyTripApp.model.Ticket;
import com.BikkadIT.MakeMyTripApp.repository.PassangerRepository;

import javax.print.attribute.standard.Media;

import org.springframework.http.MediaType;

import org.springframework.web.reactive.function.client.WebClient;


@Service
public class PassangerServiceImpl implements PassangerServiceI {

	@Autowired
	private PassangerRepository passangerRepository;

	@Override
	public Ticket bookTicket(Passanger psg) {

		passangerRepository.save(psg);
		
		String url = "http://localhost:7879/getTicket";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<Ticket> postForEntity = rt.postForEntity(url,psg , Ticket.class);
		Ticket ticket = postForEntity.getBody();
		
		
		return ticket;
	}
	
	
    @Override
	public void getPassangerDataSync() {
		
		String url = "http://localhost:7879/getTicket";
		
		WebClient webclient = WebClient.create();
		
		String block = webclient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class)
		.block();
		
		System.out.println(block);
		System.out.println("Welcome to BikkadIT");
		
	}
	
	@Override
	public void getPassangerDataAsync() {
		
		String url = "http://localhost:7879/getTicket";
		
		WebClient webClient = WebClient.create();
		
		webClient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class)
		.subscribe(System.out::println);
		
		System.out.println("Welcome to Bikkad IT");
		
	}

	

}