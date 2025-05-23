package com.crud.gamboadeyker.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.gamboadeyker.controller.dto.MascotaRequest;
import com.crud.gamboadeyker.controller.dto.MascotaResponse;
import com.crud.gamboadeyker.model.Mascota;
import com.crud.gamboadeyker.service.MascotaService;
import com.crud.gambodeyker.repository.MascotaRepository;
import com.crud.gambodeyker.service.mapper.MascotaMapper;

@Service
public class MascotaServiceImpl implements MascotaService{
	

	private final MascotaRepository mascotaRepository;


	private final MascotaMapper mascotaMapper;
	public MascotaServiceImpl (MascotaMapper mascotaMapper, MascotaRepository mascotaRepository) {
		this.mascotaRepository = mascotaRepository;
		this.mascotaMapper = mascotaMapper;
		
	}
	

	@Override
	public Collection<MascotaResponse> findAllMascota() {
		Collection<Mascota> listMascotaResponses = mascotaRepository.findAll();
		return mascotaMapper.toListMascotaToMascotaResponse(listMascotaResponses);
	}

	@Override
	public MascotaResponse findByIdMascota(Long idMascota) {
		
		Mascota mascota = mascotaRepository.findById(idMascota).orElse(null);
		return mascotaMapper.toMascotaToMascotaResponse(mascota);
	}


	@Override
	public void saveMascota(MascotaRequest request) {
		Mascota mascotaNew = new Mascota();
		System.out.println("que llega" + mascotaNew);
		mascotaNew.setNombre(request.getNombre());
		mascotaNew.setTipo(request.getTipo());
		mascotaNew.setRaza(request.getRaza());
		mascotaNew.setEdad(request.getEdad());
		mascotaNew.setDueno(request.getDueno());
		mascotaNew.setFechaCreacion(request.getFechaCreacion());
		mascotaNew.setUltimaModificacion(request.getUltimaModificacion());
		mascotaRepository.save(mascotaNew);
	}

	@Override
	public void updateMascota(Long id, MascotaRequest request) {
		Mascota mascota = mascotaRepository.findById(id).orElse(null);
		if (mascota != null) {
			mascota.setNombre(request.getNombre());
			mascota.setTipo(request.getTipo());
			mascota.setRaza(request.getRaza());
			mascota.setEdad(request.getEdad());
			mascota.setDueno(request.getDueno());
			mascota.setFechaCreacion(request.getFechaCreacion());
			mascota.setUltimaModificacion(request.getUltimaModificacion());
			mascotaRepository.save(mascota);
		}
	}

	@Override
	public void deleteMascota(Long idMascota) {
		Mascota mascota = mascotaRepository.findById(idMascota).orElse(null);
		if (mascota != null) {
			mascotaRepository.delete(mascota);
		}
	}
}
