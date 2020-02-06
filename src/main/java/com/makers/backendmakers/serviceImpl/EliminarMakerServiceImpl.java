package com.makers.backendmakers.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makers.backendmakers.domain.Maker;
import com.makers.backendmakers.service.EliminarMakerService;
import com.makers.backendmakers.service.MakerRepository;

@Service
public class EliminarMakerServiceImpl implements EliminarMakerService{

	@Autowired
	private MakerRepository makerRepository;

	@Override
	public Maker eliminar(int id) {
		
		Maker maker = makerRepository.findOne(id);
		
		if (maker != null) {
			makerRepository.delete(maker);
		}
		
		return maker;
	} 
	
	

}
