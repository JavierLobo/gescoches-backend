package com.javierlobo.gescoche.persistence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javierlobo.gescoche.persistence.VistaCoche;
import com.javierlobo.gescoche.persistence.core.repository.ICocheRepository;
import com.javierlobo.gescoche.persistence.core.utils.CocheConverter;
import com.javierlobo.gescoche.persistence.service.ICrudCocheBO;

@Service
public class CrudCocheBOImpl implements ICrudCocheBO {


	@Autowired
	private ICocheRepository cocheRepository; 
	
	@Override
	public VistaCoche guardarCoche(VistaCoche vc) { 
		return CocheConverter.documentToVo(cocheRepository.save(CocheConverter.voToDocument(vc)));
	}

}