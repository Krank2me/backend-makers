package com.makers.backendmakers.service;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.makers.backendmakers.domain.Maker;

public interface MakerRepository extends Repository<Maker, Integer> {
	
	List<Maker> findAll();
	Maker findOne(int id);
	Maker save(Maker maker);
	void delete(Maker maker);

}
