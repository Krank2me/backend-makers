package com.makers.backendmakers.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makers.backendmakers.domain.Maker;
import com.makers.backendmakers.service.AgregarMakerService;
import com.makers.backendmakers.service.MakerRepository;

@Service
public class AgregarMakerServiceImpl implements AgregarMakerService{
	
	@Autowired
	private MakerRepository makerRepository;

	@Override
	public Maker agregar(Maker maker) {
		return makerRepository.save(maker);
	}
	
	

}
