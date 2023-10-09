package TP3.controler;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TP3.entidades.Carrera;
import TP3.entidades.Carrera_Estudiante;
import TP3.entidades.Estudiante;
import TP3.repositorios.CarreraEstudianteRepository;

@RestController
@RequestMapping("/tpe3/inscripcion")
public class Carrera_EstudianteControler {

	@Autowired
	private CarreraEstudianteRepository CarreraEstudianteRepository;

	//punto b matricular estudiante
	@PostMapping
	public void InscribirEstudiante(@RequestBody Carrera c, Estudiante e) {
		Carrera_Estudiante ce = new Carrera_Estudiante(e, c, LocalDate.now(), null);
		CarreraEstudianteRepository.save(ce);
	}
}
