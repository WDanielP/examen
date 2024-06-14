package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Curso;

@Repository
public class CursoDAOImpl implements CursoDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	////ACTUALIZACION
	public List<Curso> findAll(){
		//
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from curso",Curso.class).getResultList();
		
	}
	

	@Override
	public Curso findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Curso curso) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Curso curso) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}






}
