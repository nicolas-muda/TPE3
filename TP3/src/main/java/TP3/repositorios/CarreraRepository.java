package TP3.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import TP3.dtos.CarreraInscriptosDto;
import TP3.dtos.ReporteCarrerasDto;
import TP3.entidades.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Integer> {
	@Query("SELECT c.nombre, COUNT(ce) FROM Carrera c JOIN c.estudiantes ce GROUP BY c.nombre ORDER BY COUNT(ce) DESC")
	List<CarreraInscriptosDto> obtenerCarrerasInscriptos();
	
	@Query("SELECT c.nombre AS Carrera, FUNCTION('YEAR', ce.ingreso) AS Anio, COUNT(ce.id) AS Inscriptos, COUNT(CASE WHEN ce.egreso IS NOT NULL THEN 1 ELSE NULL END) AS Egresados FROM Carrera c LEFT JOIN c.estudiantes ce GROUP BY c.nombre, Anio ORDER BY c.nombre ASC, Anio ASC")
	List<ReporteCarrerasDto> obtenerReporteCarreras();
}
