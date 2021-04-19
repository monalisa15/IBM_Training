package com.ibm.train.repo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ibm.train.pojo.Train;

@Repository
public class TrainRepositoryImpl implements TrainRepository {
	
	private Map<Integer , Train> trains;
	
	public TrainRepositoryImpl() {
		trains = new LinkedHashMap<Integer, Train>();
		trains.put(1203, new Train(1203,"xyz","PQR","ABC"));
		}

	@Override
	public int saveTrain(Train t) {
		trains.put(t.getTcode(), t);
		return t.getTcode();
	}

	@Override
	public Train fetchTrain(int tcode) {
		
		return trains.get(tcode);
	}

	@Override
	public Collection<Train> fetchAll() {
		
		return trains.values();
	}

	@Override
	public void delTrain(int tcode) {
	
		
	}

}
