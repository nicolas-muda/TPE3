package TP3.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TP3.dtos.CarreraInscriptosDto;
import TP3.dtos.ReporteCarrerasDto;
import TP3.entidades.Carrera;
import TP3.repositorios.CarreraRepository;

@RestController
@RequestMapping("/tpe3/carrera")
public class CarreraControler {

	@Autowired
	private CarreraRepository CarreraRepository;

	// crear carrera
	@PostMapping
	public void crearCarrera(@RequestBody Carrera c) {
		CarreraRepository.save(c);
	}

	// punto F recuperar las carreras con estudiantes inscriptos, y ordenar por
	// cantidad de inscriptos.
	@GetMapping("/inscriptos")
	public List<CarreraInscriptosDto> obtenerCarrerasInscriptos() {
		return CarreraRepository.obtenerCarrerasInscriptos();
	}

	//punto h generar un reporte de las carreras, que para cada carrera incluya información de los inscriptos y egresados por año
	//Se deben ordenar las carreras alfabéticamente, y presentar los años de manera cronológica.
	@GetMapping("/reporte")
	public List<ReporteCarrerasDto> obtenerReporteCarreras() {
		return CarreraRepository.obtenerReporteCarreras();
	}

}
