package com.makers.backendmakers.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makers.backendmakers.domain.Maker;
import com.makers.backendmakers.service.ListarMakerService;
import com.makers.backendmakers.service.MakerRepository;

@Service
public class ListarMakerServiceImpl implements ListarMakerService {

	@Autowired
	private MakerRepository makerRepository; 
	
	@Override
	public List<Maker> listar() {
		return makerRepository.findAll();
	}

	@Override
	public Maker listarById(int id) {
		return makerRepository.findOne(id);
	}

}
