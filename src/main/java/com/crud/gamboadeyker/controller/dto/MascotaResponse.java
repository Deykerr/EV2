package com.crud.gamboadeyker.controller.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MascotaResponse {
        private Long identificador;
        private String nombre;
    	private String tipo;
    	private String raza;
    	private String edad;
    	private String dueno;
    	private LocalDateTime fechaCreacion;
    	private LocalDateTime ultimaModificacion;
		
    	
    	
}
