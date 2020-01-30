package com.javierlobo.gescoche.gestion.rest.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javierlobo.gescoche.logic.service.ICrudCocheService;
import com.javierlobo.gescoche.persistence.VistaCoche;
import com.javierlobo.gescoche.persistence.VistaResultado;

@RestController
@RequestMapping("/coche")
public class CrudCochesResource {
	
	@Autowired
	private ICrudCocheService crudCocheService;

	@ResponseStatus(value=HttpStatus.OK)
	@GetMapping("/obtener/{Object_Id}")
	public @ResponseBody VistaResultado getObtenerCochePorObject_Id(
			@PathVariable("Object_Id") String Object_Id) {
		return crudCocheService.obtenerCoche(Object_Id);
	}
	
	@ResponseStatus(value=HttpStatus.OK)
	@DeleteMapping("/eliminar/{idCoche}")
	public @ResponseBody VistaResultado deleteEliminarCoche(
			@PathVariable("idCoche") Long idCoche) {
		return crudCocheService.eliminarCoche(idCoche);		
	}
	
	@ResponseStatus(value=HttpStatus.OK)
	@DeleteMapping("/eliminar")
	public @ResponseBody VistaResultado deleteEliminarCoche(
			@RequestBody VistaCoche vistaCoche) {
		return crudCocheService.eliminarCoche(vistaCoche);
	}
	
	@ResponseStatus(value=HttpStatus.OK)
	@PutMapping("/guardar")
	public @ResponseBody VistaResultado putGuardarCoche(
			@RequestBody VistaCoche vistaCoche) {
		return crudCocheService.guardarCoche(vistaCoche);
	}
	
}
