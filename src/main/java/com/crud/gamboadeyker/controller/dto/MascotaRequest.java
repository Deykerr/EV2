package com.crud.gamboadeyker.controller.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MascotaRequest {
	

	
	private String nombre;
	private String tipo;
	private String raza;
	private String edad;
	private String dueno;
	private LocalDateTime fechaCreacion;
	private LocalDateTime ultimaModificacion;
	

	

}
