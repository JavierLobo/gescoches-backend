package com.javierlobo.gescoche.persistence.service;

import com.javierlobo.gescoche.persistence.VistaCoche;

public interface ICrudCocheBO {

	VistaCoche guardarCoche(VistaCoche vistaCoche);

	VistaCoche obtenerCoche(String idCoche);

	VistaCoche eliminarCoche(String object_Id);

}
