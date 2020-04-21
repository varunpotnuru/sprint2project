package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Admin;
import com.cg.entity.Movie;
import com.cg.entity.Screen;
import com.cg.entity.Show;

import com.cg.entity.Theatre;
@Transactional
@Repository

public class AdminDaoImp implements AdminDaoI 
{
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Movie m) 
	{
		em.persist(m);

	}

	@Override
	public void create(Theatre t)
	{
	
      em.persist(t);
	}

	@Override
	public void create(Show s) 
	{
		em.persist(s);

	}

	

	@Override
	public void deleteMovie(int movieId) 
	{
		Movie m = em.find(Movie.class, movieId);//this method will which id to remove
		System.out.println(m.getMovieId()+""+m.getMovieName()+""+m.getGenre()+""+m.getDirector()+""+m.getLanguage());
		em.remove(m);

	}

	@Override
	public void deleteTheatre(int theatreId)
	{
		Theatre t = em.find(Theatre.class, theatreId);
		System.out.println(t.getTheatreId()+""+t.getTheatreName()+""+t.getTheatreCity()+""+t.getManagerName()+""+t.getManagerContact());
		em.remove(t);

	}

	@Override
	public void deleteShow(int id) {
		Show s = em.find(Show.class, id);
	
		em.remove(s);

	}

	@Override
	public void create(Admin a) {
		// TODO Auto-generated method stub
		em.persist(a);
		
	}

	@Override
	public List getAdmin() {
	 Query q = em.createQuery("from Admin a");
		return q.getResultList();
	}

	@Override
	public List getMovie() {
		
		Query q = em.createQuery("from Movie m");
		return q.getResultList();
	}

	@Override
	public List getTheatre() {
		Query q = em.createQuery("from Theatre t");
		return q.getResultList();
	}

	@Override
	public List getShow() {
		Query q = em.createQuery("from Show s");
		return q.getResultList();
	}

	@Override
	public List getScreen() {
		Query q = em.createQuery("from Screen sc");
		return q.getResultList();
	}

	@Override
	public void create(Screen sc) {
		// TODO Auto-generated method stub
		em.persist(sc);
		
	}

	
}
