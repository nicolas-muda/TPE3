package TP3.entidades;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Estudiante {

	@Id @GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private int dni;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private int edad;
	
	@Column
	private String genero;
	
	@Column
	private String ciudad;
	
	@Column(unique = true)
	private int numeroLibreta;
	
	@OneToMany(mappedBy = "estudiante", fetch = FetchType.EAGER)
	private List<Carrera_Estudiante> carreras;

	public Estudiante(int dni, String nombre, String apellido, int edad, String genero, String ciudad, int numeroLibreta) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.ciudad = ciudad;
		this.numeroLibreta = numeroLibreta;
		this.carreras = new ArrayList<>();
	}

	public Estudiante() {
		super();
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumeroLibreta() {
		return numeroLibreta;
	}

	public void setNumeroLibreta(int numeroLibreta) {
		this.numeroLibreta = numeroLibreta;
	}

	public int getId() {
		return id;
	}

	public List<Carrera_Estudiante> getCarreras() {
		return carreras;
	}
	
	public void addCarrera(Carrera_Estudiante carrera) {
		this.carreras.add(carrera);
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad="
				+ edad + ", genero=" + genero + ", ciudad=" + ciudad + ", numeroLibreta=" + numeroLibreta
				+ ", carreras=" + carreras + "]";
	}
	
	
}
