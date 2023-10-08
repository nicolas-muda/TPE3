package TP3.entidades;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Carrera_Estudiante {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "estudiante_id")
	private Estudiante estudiante;
	
	@ManyToOne
	@JoinColumn(name = "carrera_id")
	private Carrera carrera;
	
	@Column
	private LocalDate ingreso;
	
	@Column
	private LocalDate egreso;

	public Carrera_Estudiante(Estudiante estudiante, Carrera carrera, LocalDate ingreso, LocalDate egreso) {
		super();
		this.estudiante = estudiante;
		this.carrera = carrera;
		this.ingreso = ingreso;
		this.egreso = egreso;
	}

	public Carrera_Estudiante() {
		super();
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public LocalDate getIngreso() {
		return ingreso;
	}

	public void setIngreso(LocalDate ingreso) {
		this.ingreso = ingreso;
	}

	public LocalDate getEgreso() {
		return egreso;
	}

	public void setEgreso(LocalDate egreso) {
		this.egreso = egreso;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Carrera_Estudiante [id=" + id + ", estudiante=" + estudiante.getNombre() + ", carrera=" + carrera.getNombre() + ", ingreso="
				+ ingreso + ", egreso=" + egreso + "]";
	}
	
	
}