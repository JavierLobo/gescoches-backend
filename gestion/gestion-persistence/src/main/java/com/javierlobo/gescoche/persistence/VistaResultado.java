/**
 * 
 */
package com.javierlobo.gescoche.persistence;

import org.springframework.stereotype.Service;

/**
 * @author franc
 *
 */
@Service
public class VistaResultado {

	private VistaCoche resultado;
	
	private String estado; 

	public VistaResultado() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param resultado
	 * @param estado
	 */
	public VistaResultado(VistaCoche combinacion, String estado) {
		super();
		this.resultado = combinacion;
		this.estado = estado;
	}

	/**
	 * @return the resultado
	 */
	public VistaCoche getResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(VistaCoche combinacion) {
		this.resultado = combinacion;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
