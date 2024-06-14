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
@Table (name="curso") 
public class Curso {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="Nombrecurso")
	private String Nombrecurso;
	@Column(name="Numcurso")
	private String Numcurso;
	@Column(name="Horas")
	private String Horas;
	@Column(name="Departamento")
	private String Departamento;

	public Curso() {
		
		
		
}

public Curso (String Nombrecurso, String Numcurso, String Horas, String Departamento) {


	this.Nombrecurso = Nombrecurso;
	this.Numcurso = Numcurso;
	this.Horas = Horas;
	this.Departamento=Departamento;

	
}

public String getNombrecurso() {
	return Nombrecurso;
}

public void setNombrecurso(String nombrecurso) {
	Nombrecurso = nombrecurso;
}

public String getNumcurso() {
	return Numcurso;
}

public void setNumcurso(String numcurso) {
	Numcurso = numcurso;
}

public String getHoras() {
	return Horas;
}

public void setHoras(String horas) {
	Horas = horas;
}

public String getDepartamento() {
	return Departamento;
}

public void setDepartamento(String departamento) {
	Departamento = departamento;
}

@Override
public String toString() {
	return "Curso [Nombrecurso=" + Nombrecurso + ", Numcurso=" + Numcurso + ", Horas=" + Horas + ", Departamento="
			+ Departamento + "]";
}

}