package com.crud.gamboadeyker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.gamboadeyker.model.Mascota;


@Repository
public interface MascotaRepository extends  JpaRepository<Mascota, Long>{

}
