package com.ibm.train.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.train.pojo.Train;
import com.ibm.train.service.TrainService;

@RestController
public class TrainController {
	
	@Autowired
	private TrainService service;
	
	@PostMapping(value ="/add" , consumes="application/json")
	public int addTrain(@RequestBody Train t)
	{
		service.addTrain(t);
		return t.getTcode();
	}

	@GetMapping(value = "/train/{code}", produces ="application/json")
	public Train getTrain(@PathVariable("code") int code)
	{
		return service.getTrain(code);
	}
	@GetMapping(value ="/trains" , produces ="application/json")
	public Collection<Train> getAll()
	{
		return service.getAll();
	}
}
