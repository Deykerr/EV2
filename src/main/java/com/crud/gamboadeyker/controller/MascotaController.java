package com.crud.gamboadeyker.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.crud.gamboadeyker.controller.dto.MascotaRequest;
import com.crud.gamboadeyker.controller.dto.MascotaResponse;
import com.crud.gamboadeyker.service.MascotaService;



@RestController
@RequestMapping("v1/mascota")
public class MascotaController {

	@Autowired
	private MascotaService mascotaService; 

	

	@GetMapping("/mascotas")
	public ResponseEntity<Collection<MascotaResponse>> getMascotas() {
		return ResponseEntity.ok(mascotaService.findAllMascota());
	}

	@GetMapping("/mascota/{id}")
	public ResponseEntity<MascotaResponse> getMascotasById(@PathVariable Long id) {
		return ResponseEntity.ok(mascotaService.findByIdMascota(id));
	}

	@PostMapping("/save/mascota")
	public void saveMascotasById(@RequestBody MascotaRequest request) {
		mascotaService.saveMascota(request);
	}

	@PutMapping("/update/mascota/{id}")
	public void updateMascotasById(@PathVariable Long id, @RequestBody MascotaRequest request) {
		mascotaService.updateMascota(id, request);
	}

	@PutMapping("/delete/mascota/{id}")
	public void deleteMascotasById(@PathVariable Long id) {
		mascotaService.deleteMascota(id);
	}
}
