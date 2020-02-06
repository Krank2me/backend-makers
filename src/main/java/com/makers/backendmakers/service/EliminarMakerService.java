package com.makers.backendmakers.service;

import com.makers.backendmakers.domain.Maker;

@FunctionalInterface
public interface EliminarMakerService {

	Maker eliminar(int id);
}
