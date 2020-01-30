package com.javierlobo.gescoche.logic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javierlobo.gescoche.logic.service.ICrudCocheService;
import com.javierlobo.gescoche.persistence.VistaCoche;
import com.javierlobo.gescoche.persistence.VistaResultado;
import com.javierlobo.gescoche.persistence.service.ICrudCocheBO;

@Service
public class CrudCocheService implements ICrudCocheService {

	@Autowired
	private ICrudCocheBO crudCocheBO;
	
	@Override
	public VistaResultado obtenerCoche(String id) {
		return new VistaResultado(crudCocheBO.obtenerCoche(id), "Ok");
	}

	@Override
	public VistaResultado eliminarCoche(Long idCoche) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VistaResultado eliminarCoche(VistaCoche vistaCoche) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VistaResultado guardarCoche(VistaCoche vistaCoche) {
		// Validacion de los datos del json
		validarDatosDeCoche(vistaCoche);
		
		return new VistaResultado(crudCocheBO.guardarCoche(vistaCoche), "Ok");
	}
	
	// ------------------------------------------------------------------------------
	
	/**
	 * Validacion de los datos del json
	 * 
	 * @param vc Objeto json que contiene los datos a validar
	 */
	private void validarDatosDeCoche(VistaCoche vc) {
		/* --------------------------------
		 * Validación de la matricula
		 * -------------------------------- */
		if (vc.getNumMatricula() == null || vc.getNumMatricula() == "" || vc.getNumMatricula().isEmpty()) {
            throw new RuntimeException("Indica una matricula valida");
		}
		
		/* --------------------------------
		 * Validación del bastidor
		 * -------------------------------- */
		if (vc.getNumBastidor() == null || vc.getNumBastidor() == "" || vc.getNumBastidor().isEmpty()) {
            throw new RuntimeException("Indica una número de bastidor valido.");
		}
		
		// El número de bastidor debe tener 17 dígitos, ni mas ni menos
		if (vc.getNumBastidor().length() < 17 || vc.getNumBastidor().length() > 17) {
            throw new RuntimeException("El número del bastidor no es correcto, debe ser de 17 dígitos.");			
		}
		
		/*
		 *  incluye los números del 0 al 9 y todas las letras salvo la I, la O, la Q y la Ñ 
		 */
		char[] caracteresNoValidos =  { 'I', 'O', 'Q', 'Ñ' };
		if (incluyeCaracteresNoValidos(vc.getNumBastidor().toUpperCase(), caracteresNoValidos)) {
            throw new RuntimeException("El número del bastidor no es correcto, incluye caracteres NO validos.");	
		}

		/* --------------------------------
		 * Validación la marca
		 * -------------------------------- */
		if (vc.getMarca()==null || vc.getMarca()=="" || vc.getMarca().isEmpty()) {
			throw new RuntimeException("No se ha indicado la marcha del vehiculo.");
		}
		
		/* --------------------------------
		 * Validación del modelo
		 * -------------------------------- */
		if (vc.getModelo()==null || vc.getModelo()=="" || vc.getModelo().isEmpty()) {
			throw new RuntimeException("No se ha indicado el modelo del vehiculo.");
		}

		/* --------------------------------
		 * Validación de la cilindrada
		 * -------------------------------- */
		if (vc.getCilindrada()==null || vc.getCilindrada()=="" || vc.getCilindrada().isEmpty()) {
			throw new RuntimeException("No se ha indicado la cilindrada del vehiculo.");
		}

		/* --------------------------------
		 * Validación de la potencia
		 * -------------------------------- */
		if (vc.getPotencia()==null || vc.getPotencia()==0) {
			throw new RuntimeException("No se ha indicado la potincia del vehiculo.");
		}

		/* --------------------------------
		 * Validación del color del vehiculo 
		 * -------------------------------- */
		if (vc.getColor()==null || vc.getColor()=="" || vc.getColor().isEmpty()) {
			throw new RuntimeException("No se ha indicado el color del vehiculo.");
		}

		/* --------------------------------
		 * Validación del precio del vehiculo 
		 * -------------------------------- */
		if (vc.getPrecio()==null || vc.getPrecio()==0) {
			throw new RuntimeException("No se ha indicado el precio del vehiculo.");
		}
		
		if (vc.getPrecio() < 0) {
			throw new RuntimeException("El precio del vehiculo no puede tener un precio negativo.");			
		}

		/* --------------------------------
		 * Validación del motor del vehiculo 
		 * -------------------------------- */
		if (vc.getMotor()==null || vc.getMotor()=="" || vc.getMotor().isEmpty()) {
			throw new RuntimeException("No se ha indicado el motor del vehiculo.");
		}

		/* --------------------------------
		 * Validación de las observaciones 
		 * -------------------------------- */
		if (vc.getObservaciones()==null || vc.getObservaciones()=="" || vc.getObservaciones().isEmpty()) {
			throw new RuntimeException("No se ha indicado ningun tipo de observaciones del vehiculo.");
		}
		
		/* --------------------------------
		 * Validación de la foto 
		 * -------------------------------- */
		if (vc.getFoto()==null || vc.getFoto()=="" || vc.getFoto().isEmpty()) {
			throw new RuntimeException("No se ha indicado ningun tipo de observaciones del vehiculo.");
		}
		
		/* --------------------------------
		 * Validación de las fechas 
		 * -------------------------------- */
		// ToDo: La fecha de fabricacion no puede estar vacia y ser correcta
		// ToDo: La fecha de compra no puede estar vacia y ser correcta
		// ToDo: La fecha de venta no puede estar vacia y ser correcta
		
		// ToDo: la fecha de venta no puede ser menor que la fecha de compra y que la fecha de fabricacion
		// ToDo: La fecha de compra no puede ser mayor que la fecha de venta y menor que la fecha de fabricacion 
		// ToDo: La fecha de fabricacion no puede ser mayor que la fecha de compra y la de venta
	}

	/**
	 * Verifica si existen caracteres no validos en una cadena de textos
	 * 
	 * @param numBastidor Número del bastidor que vamos a validar
	 * @param caracteresNoValidos Lista de caracteres no permitidos
	 * @return Devuelve Verdadero o Falso
	 */
	private boolean incluyeCaracteresNoValidos (String numBastidor, char[] caracteresNoValidos) {
		for (int i=0; i<caracteresNoValidos.length; i++) {
			if (numBastidor.indexOf(caracteresNoValidos[i]) != -1 ) {
				return true;
			}
		}
		
		return false;
	}
}
