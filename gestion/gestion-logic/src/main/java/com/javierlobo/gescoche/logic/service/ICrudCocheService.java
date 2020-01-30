package com.javierlobo.gescoche.logic.service;

import com.javierlobo.gescoche.persistence.VistaCoche;
import com.javierlobo.gescoche.persistence.VistaResultado;

public interface ICrudCocheService {

	VistaResultado obtenerCoche(String idCoche);

	VistaResultado eliminarCoche(String Object_Id);

	VistaResultado guardarCoche(VistaCoche vistaCoche);

}
