package com.makers.backendmakers.service;

import com.makers.backendmakers.domain.Maker;

@FunctionalInterface
public interface AgregarMakerService {

	Maker agregar(Maker maker);
}
