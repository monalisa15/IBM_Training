package com.ibm.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.entity.Flight;
import com.ibm.repo.FlightRepository;

public class FlightController {
	
	@Autowired
	private FlightRepository repo;
	
	
	@RequestMapping(value ="/save.do", method = RequestMethod.POST)
	public String saveFlight(Flight flight, Map<String,String> model)
	{
		String code = repo.save(flight);
		model.put("message"," Flight added with code: " + code);
		return "home";
	}
	
	@RequestMapping("/showflights.do")
	public String fetchFlights(Map<String ,List<Flight>> model)
	{
		List<Flight> flights = repo.fetchall();
		model.put("flights" , flights);
		return "showflights";
	}
}
