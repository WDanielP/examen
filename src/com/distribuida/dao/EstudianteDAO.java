package com.distribuida.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.distribuida.entities.Estudiante;

@Repository

public interface EstudianteDAO {



public List<Estudiante>findAll();
public Estudiante findOne (int id);
public void add(Estudiante estudiante);
public void up (Estudiante estudiante);
public void del(int id);


		

}