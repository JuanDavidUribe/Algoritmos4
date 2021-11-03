package Estudiante;

import java.util.ArrayList;

public class Estudiante {
	private String nombre, apellido, carrera, id;
	private ArrayList<Float> notas;
	
	public Estudiante(String id, String nombre, String apellido, String carrera, ArrayList<Float> notas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
		this.notas = notas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public ArrayList<Float> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Float> notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera
				+ ", notas=" + notas + "]";
	}

}
