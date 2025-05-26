package com.crud.gamboadeyker.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Mascotas")
@Data
public class Mascota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String tipo;
	private String raza;
	private String edad;
	private String dueno;
	private LocalDateTime fechaCreacion;
	private LocalDateTime ultimaModificacion;
			

}
