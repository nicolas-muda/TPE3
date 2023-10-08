package TP3.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import TP3.entidades.Carrera_Estudiante;

@Repository
public interface CarreraEstudianteRepository extends JpaRepository<Carrera_Estudiante, Integer> {

}

