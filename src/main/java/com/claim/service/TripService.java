package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Trip;
import com.claim.repository.TripRepository;

@Service
public class TripService {

	@Autowired
	private TripRepository tripRepository;
	public void saveTrip(Trip trip)
	{
		tripRepository.save(trip);
	}	
	//public Trip 
}
