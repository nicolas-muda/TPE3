package TP3.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import TP3.entidades.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
	@Query("SELECT e FROM Estudiante e WHERE e.numeroLibreta = numeroLibreta")
	Estudiante obtenerPorLibreta(int numeroLibreta);

	@Query("SELECT e FROM Estudiante e ORDER BY e.apellido ASC")
	List<Estudiante> obtenerTodos();
	
	@Query("SELECT e FROM Estudiante e WHERE e.genero = :genero")
	List<Estudiante> obtenerPorGenero(String genero);
	
	@Query("SELECT e FROM Estudiante e JOIN e.carreras c WHERE c.carrera.nombre = :carrera AND e.ciudad = :ciudad")
	List<Estudiante> obtenerPorCarreraYCiudad(String carrera, String ciudad);
}