package com.javierlobo.gescoche.persistence.core.utils;

import com.javierlobo.gescoche.persistence.VistaCoche;
import com.javierlobo.gescoche.persistence.core.document.CocheDocument;

public class CocheConverter {

	/**
	 * Convierte los datos de un objeto de tipo vista a uno de tipo documento. 
	 * 
	 * @param vc Objeto  VistaCoche que contiene los datos de entrada.
	 * @return Devuelve el objeto CocheDocument con los datos del objeto vista.
	 */
	public static CocheDocument voToDocument(VistaCoche vc) {
		if (vc == null) { return null; }
		
		CocheDocument cd = new CocheDocument();
		
		cd.setObjectId(vc.getObjectId());
		cd.setNumMatricula(vc.getNumMatricula());
		cd.setNumBastidor(vc.getNumBastidor());
		cd.setMarca(vc.getMarca());
		cd.setModelo(vc.getModelo());
		cd.setCilindrada(vc.getCilindrada());
		cd.setPotencia(vc.getPotencia());
		cd.setColor(vc.getColor());
		cd.setPrecio(vc.getPrecio());
		cd.setMotor(vc.getMotor());
		cd.setExtras(vc.getExtras());
		cd.setObservaciones(vc.getObservaciones());
		cd.setFoto(vc.getFoto());
		cd.setFechaFabricacion(vc.getFechaFabricacion());
		cd.setFechaCompra(vc.getFechaCompra());
		cd.setFechaVenta(vc.getFechaVenta());
		
		return cd;
	}
	
	/**
	 * Convierte los datos de un objeto de tipo documento a una vista
	 * 
	 * @param cd Objeto CocheDocument que contiene los datos de entrada.
	 * @return Devuelve el objeto VistaCoche con los datos del objeto documento.
	 */
	public static VistaCoche documentToVo(CocheDocument cd) {
		if (cd == null) { return null; }
		
		VistaCoche vc = new VistaCoche();
		
		vc.setObjectId(cd.getObjectId());
		vc.setNumMatricula(cd.getNumMatricula());
		vc.setNumBastidor(cd.getNumBastidor());
		vc.setMarca(cd.getMarca());
		vc.setModelo(cd.getModelo());
		vc.setCilindrada(cd.getCilindrada());
		vc.setPotencia(cd.getPotencia());
		vc.setColor(cd.getColor());
		vc.setPrecio(cd.getPrecio());
		vc.setMotor(cd.getMotor());
		vc.setExtras(cd.getExtras());
		vc.setObservaciones(cd.getObservaciones());
		vc.setFoto(cd.getFoto());
		vc.setFechaFabricacion(cd.getFechaFabricacion());
		vc.setFechaCompra(cd.getFechaCompra());
		vc.setFechaVenta(cd.getFechaVenta());
		
		return vc;
	}
}
