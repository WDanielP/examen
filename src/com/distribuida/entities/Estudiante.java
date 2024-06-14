package com.distribuida.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table (name="estudiante") 

public class Estudiante {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="Nombre")
	private String Nombre;
	@Column(name="NumEstudiante")
	private String NumEstudiante;
	@Column(name="Clase")
	private String Clase;
	@Column(name="Especialidad")
	private String Especialidad;
	public Estudiante() {
		
		
	}
	
	public Estudiante(String Nombre, String NumEstudiante, String Clase, String Especialidad) {


		this.Nombre = Nombre;
		this.NumEstudiante = NumEstudiante;
		this.Clase = Clase;
		this.Especialidad = Especialidad;
		
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getNumEstudiante() {
		return NumEstudiante;
	}
	public void setNumEstudiante(String numEstudiante) {
		NumEstudiante = numEstudiante;
	}
	public String getClase() {
		return Clase;
	}
	public void setClase(String clase) {
		Clase = clase;
	}
	public String getEspecialidad() {
		return Especialidad;
	}
	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	@Override
	public String toString() {
		return "Estudiante [Nombre=" + Nombre + ", NumEstudiante=" + NumEstudiante + ", Clase=" + Clase
				+ ", Especialidad=" + Especialidad + "]";
	}
	


	
}
