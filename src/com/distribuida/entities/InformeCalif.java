package com.distribuida.entities;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class InformeCalif {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="NumEstudiante")
	private String NumEstudiante;
	@Column(name="IDSeccion")
	private String IDSeccion;
	@Column(name="Nota")
	private String Nota;
}
