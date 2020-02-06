package com.makers.backendmakers.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makers.backendmakers.domain.Maker;
import com.makers.backendmakers.service.EditarMakerService;
import com.makers.backendmakers.service.MakerRepository;

@Service
public class EditarMakerServiceImpl implements EditarMakerService {

	@Autowired
	private MakerRepository makerRepository; 
	
	@Override
	public Maker editar(Maker maker) {
		return makerRepository.save(maker);
	}

}
