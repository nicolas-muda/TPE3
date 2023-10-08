package TP3.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TP3.dtos.CarreraInscriptosDto;
import TP3.dtos.ReporteCarrerasDto;
import TP3.repositorios.CarreraRepository;

@RestController
@RequestMapping("/tpe3/carrera")
public class CarreraControler {
	@Autowired
	private CarreraRepository CarreraRepository;

	// punto F recuperar las carreras con estudiantes inscriptos, y ordenar por
	// cantidad de inscriptos.
	@GetMapping("carreras/inscriptos")
	public List<CarreraInscriptosDto> obtenerCarrerasInscriptos() {
		return CarreraRepository.obtenerCarrerasInscriptos();
	}

}
