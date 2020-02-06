package com.makers.backendmakers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makers.backendmakers.domain.Maker;
import com.makers.backendmakers.service.AgregarMakerService;
import com.makers.backendmakers.service.EditarMakerService;
import com.makers.backendmakers.service.EliminarMakerService;
import com.makers.backendmakers.service.ListarMakerService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/makers"})
public class MakerController {
	
	@Autowired
	ListarMakerService listarMakerService;
	@Autowired
	AgregarMakerService agregarMakerService;
	@Autowired
	EditarMakerService editarMakerService;
	@Autowired
	EliminarMakerService eliminarMakerService;
	
	@GetMapping
	public List<Maker> listar() {
		return listarMakerService.listar();
	}
	
	@PostMapping
	public Maker agregar(@RequestBody Maker maker) {
		return agregarMakerService.agregar(maker);
	}
	
	@GetMapping(path = {"/{id}"})
	public Maker listarById(@PathVariable("id") int id) {
		return listarMakerService.listarById(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Maker editar(@RequestBody Maker maker, @PathVariable("id") int id) {
		maker.setId(id);
		return editarMakerService.editar(maker);
		
	}
	
	@DeleteMapping(path = {"{/id}"})
	public Maker eliminar(@PathVariable("id") int id) {
		return eliminarMakerService.eliminar(id);
	}

}
