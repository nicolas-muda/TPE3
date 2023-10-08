package TP3.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import TP3.entidades.Estudiante;
import TP3.repositorios.EstudianteRepository;

@RestController
@RequestMapping("/tpe3/estudiante")
public class EstudianteControler {

	@Autowired
	private EstudianteRepository EstudianteRepository;

	// punto c obtener todos los estudiantes con algun criterio de ordenamiento
	@GetMapping
	public List<Estudiante> obtenerEstudiantesOrdenados() {
		return EstudianteRepository.obtenerTodos();
	}

	// punto d Obtener todos los estudiantes por numeroLibreta
	@GetMapping("/{libreta}")
	public Estudiante obtenerEstudiantesLibreta(@PathVariable int libreta) {
		return EstudianteRepository.obtenerPorLibreta(libreta);
	}

	// punto e Obtener todos los estudiantes por genero
	@GetMapping("/{genero}")
	public List<Estudiante> obtenerEstudiantesGenero(@PathVariable String genero) {
		return EstudianteRepository.obtenerPorGenero(genero);
	}

	// punto g Obtener todos los estudiantes por genero
	@GetMapping("/{carrera}/{ciudad}")
	public List<Estudiante> obtenerEstudiantesPorCarreraYciudad(@PathVariable String carrera,
			@PathVariable String ciudad) {
		return EstudianteRepository.obtenerPorCarreraYCiudad(carrera, ciudad);
	}
}
