package com.udea.apifestivos.repository;


import com.udea.apifestivos.entities.Festivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FestivoRepository extends JpaRepository<Festivo,Long>{
}