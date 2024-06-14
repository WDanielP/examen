package com.distribuida.entities;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class Seccion {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="IdSeccion")
	private String IdSeccion;
	@Column(name="NumCurso")
	private String NumCurso;
	@Column(name="Semestre")
	private String Semestre;
	@Column(name="Año")
	private String Año;
	@Column(name="Profesor")
	private String Profesor;
		
	public Seccion() {
		
		
		
}
	public Seccion (String IdSeccion, String NumCurso, String Semestre, String Año,String Profesor ) {


		this.IdSeccion = IdSeccion;
		this.NumCurso = NumCurso;
		this.Semestre = Semestre;
		this.Año=Año;
		this.Profesor=Profesor;
				
	}
	public String getIdSeccion() {
		return IdSeccion;
	}
	public void setIdSeccion(String idSeccion) {
		IdSeccion = idSeccion;
	}
	public String getNumCurso() {
		return NumCurso;
	}
	public void setNumCurso(String numCurso) {
		NumCurso = numCurso;
	}
	public String getSemestre() {
		return Semestre;
	}
	public void setSemestre(String semestre) {
		Semestre = semestre;
	}
	public String getAño() {
		return Año;
	}
	public void setAño(String año) {
		Año = año;
	}
	public String getProfesor() {
		return Profesor;
	}
	public void setProfesor(String profesor) {
		Profesor = profesor;
	}
	@Override
	public String toString() {
		return "Seccion [IdSeccion=" + IdSeccion + ", NumCurso=" + NumCurso + ", Semestre=" + Semestre + ", Año=" + Año
				+ ", Profesor=" + Profesor + "]";
	}
	

}
