package com.javierlobo.gescoche.logic.service;

import com.javierlobo.gescoche.persistence.VistaCoche;
import com.javierlobo.gescoche.persistence.VistaResultado;

public interface ICrudCocheService {

	VistaResultado obtenerCoche(Long idCoche);

	VistaResultado obtenerCoche(VistaCoche vistaCoche);

	VistaResultado eliminarCoche(Long idCoche);

	VistaResultado eliminarCoche(VistaCoche vistaCoche);

	VistaResultado guardarCoche(VistaCoche vistaCoche);

}
