package com.makers.backendmakers.service;

import java.util.List;

import com.makers.backendmakers.domain.Maker;

public interface ListarMakerService {
	
	List<Maker> listar();
	Maker listarById(int id);

}
