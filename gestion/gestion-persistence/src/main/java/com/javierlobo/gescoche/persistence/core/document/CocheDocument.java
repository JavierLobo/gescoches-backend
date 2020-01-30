package com.javierlobo.gescoche.persistence.core.document;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cocheDocument")
public class CocheDocument {

	@Id
	private ObjectId objectId;
	
	private String numMatricula;
	
	private String numBastidor;
	
	private String marca;
	
	private String modelo;
	
	private String cilindrada;
	
	private Long potencia;
	
	private String color;
	
	private Long precio;
	
	private String motor;
	
	private String extras;
	
	private String observaciones;
	
	private String foto;

	private LocalDateTime fechaFabricacion;
	
	private LocalDateTime fechaCompra;
	
	private LocalDateTime fechaVenta;

	public CocheDocument() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id Identificador del coche en la base de datos
	 * @param numMatricula Identificador que relaciona el coche con la matricula, es posible que se rematricule el coche.
	 * @param numBastidor Número de bastidor, está marcado físicamente y no es modificable.
	 * @param marca Marca del coche.
	 * @param modelo Modelo del coche.
	 * @param cilindrada Cilindrada expresada en CC (Centimetros Cúbicos)
	 * @param potencia Potencia expresada en CV
	 * @param color Color
	 * @param precio Precio en euros
	 * @param motor Tipo de motor: gasolina, diesel, hibrido o electrico
	 * @param extras 
	 * @param observaciones 
	 * @param foto 
	 * @param fechaFabricacion fecha de fabricación del vehículo
	 * @param fechaCompra Fecha de compra del vehículo
	 * @param fechaVenta Vecha de venta del vehículo
	 */
	public CocheDocument(ObjectId objectId, String numMatricula, String numBastidor, String marca, String modelo, String cilindrada,
			Long potencia, String color, Long precio, String motor, String extras, String observaciones, String foto,
			LocalDateTime fechaFabricacion, LocalDateTime fechaCompra, LocalDateTime fechaVenta) {
		super();
		this.objectId = objectId;
		this.numMatricula = numMatricula;
		this.numBastidor = numBastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.color = color;
		this.precio = precio;
		this.motor = motor;
		this.extras = extras;
		this.observaciones = observaciones;
		this.foto = foto;
		this.fechaFabricacion = fechaFabricacion;
		this.fechaCompra = fechaCompra;
		this.fechaVenta = fechaVenta;
	}

	public ObjectId  getObjectId() {
		return objectId;
	}

	public void setObjectId(ObjectId objectId) {
		this.objectId = objectId;
	}

	public String getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Long getPotencia() {
		return potencia;
	}

	public void setPotencia(Long potencia) {
		this.potencia = potencia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDateTime getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(LocalDateTime fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
}
