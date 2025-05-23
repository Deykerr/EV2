package com.crud.gamboadeyker.service;

import java.util.Collection;

import com.crud.gamboadeyker.controller.dto.MascotaRequest;
import com.crud.gamboadeyker.controller.dto.MascotaResponse;




public interface MascotaService {
	// Para Traer las mascotas
	Collection<MascotaResponse> findAllMascota();

	// Para buscar por id de la mascota
	MascotaResponse findByIdMascota(Long idMascota);

	// Para crear mascota
	void saveMascota(MascotaRequest request);

	// Para Actualizar mascota
	void updateMascota(Long id, MascotaRequest request);

	// Para borrar mascota
	void deleteMascota(Long idMascota);
}
