package com.crud.gamboadeyker.service.mapper;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.crud.gamboadeyker.controller.dto.MascotaResponse;
import com.crud.gamboadeyker.model.Mascota;

@Component
public class MascotaMapper {
	
	public Collection<MascotaResponse> toListMascotaToMascotaResponse(Collection<Mascota> listMascota) {
		Collection<MascotaResponse> listMascotaResponses = new ArrayList<>();

		if (listMascota != null && !listMascota.isEmpty()) {
			for (Mascota mascota : listMascota) {
				MascotaResponse mascotaResponse = new MascotaResponse();
				mascotaResponse.setIdentificador(mascota.getId());
				mascotaResponse.setNombre(mascota.getNombre());
				mascotaResponse.setTipo(mascota.getTipo());
				mascotaResponse.setRaza(mascota.getRaza());
				mascotaResponse.setEdad(mascota.getEdad());
				mascotaResponse.setDueno(mascota.getDueno());
				mascotaResponse.setFechaCreacion(mascota.getFechaCreacion());
				mascotaResponse.setUltimaModificacion(mascota.getUltimaModificacion());
				listMascotaResponses.add(mascotaResponse);
			}
		}

		return listMascotaResponses;
	}

	public MascotaResponse toMascotaToMascotaResponse(Mascota mascota) {
		MascotaResponse mascotaResponse = new MascotaResponse();
		if (mascota != null) {
			mascotaResponse.setNombre(mascota.getNombre());
			mascotaResponse.setTipo(mascota.getTipo());
			mascotaResponse.setRaza(mascota.getRaza());
			mascotaResponse.setEdad(mascota.getEdad());
			mascotaResponse.setDueno(mascota.getDueno());
			mascotaResponse.setFechaCreacion(mascota.getFechaCreacion());
			mascotaResponse.setUltimaModificacion(mascota.getUltimaModificacion());

		}
		return mascotaResponse;
	}
}
