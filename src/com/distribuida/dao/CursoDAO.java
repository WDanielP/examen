package com.distribuida.dao;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.distribuida.entities.Curso;


@Repository
public interface CursoDAO {
	
	public List<Curso> findAll();
	public Curso findOne (int id);
	public void add(Curso curso);
	public void up (Curso curso);
	public void del(int id);
		

	
	
}

