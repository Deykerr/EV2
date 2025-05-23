package com.crud.gambodeyker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.gamboadeyker.model.Mascota;



public interface MascotaRepository extends JpaRepository<Mascota, Long>{

}
