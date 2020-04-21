package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Admin;
import com.cg.entity.Movie;
import com.cg.entity.Show;

import com.cg.entity.Theatre;
import com.cg.service.AdminServiceI;

@RestController
public class AdminController 
{
    @Autowired
    AdminServiceI adminservice;
    @GetMapping("/admin")
    public List<Admin> fetchAdmin()
    {
  	return adminservice.getAdmin(); 
    }
    @GetMapping("/Movie")
    public List<Movie> fetchMovie()
    {
  	return adminservice.getMovie(); 
    }
    @GetMapping("/theatre")
    public List<Theatre> fetchTheatre()
    {
  	return adminservice.getTheatre();
    }
    @GetMapping("/show")
    public List<Show> fetchShow()
    {
  	return adminservice.getShow();  
    }
    @PostMapping(value="/movie/new",consumes= {"application/json"})
    public String addMovie(@RequestBody Movie movie)
    {
    	adminservice.createMovie(movie);
		return "statement added";
    	
    }
    @PostMapping(value="/theatre/new",consumes= {"application/json"})	
    public String addTheatre(@RequestBody Theatre theatre)
    {
    	adminservice.createTheatre(theatre);
    	return "statement added";
    }
    @PostMapping(value="/show/new",consumes= {"application/json"})
    public String addShow(@RequestBody Show show)
    {
    	adminservice.createShow(show);
    	return "statement added";
    }
    @GetMapping(value="/deleteMovie/{movieId}")
    public void deleteMovie(@PathVariable int movieId)
    {
    	adminservice.deleteMovie(movieId);
    }
    @GetMapping(value="/deleteTheatre/{theatreId}")
    public void deleteTheatre(@PathVariable int theatreId)
    {
    	adminservice.deleteTheatre(theatreId);
    }
    @GetMapping(value="/deleteShow/{showId}")
    public void deleteShow(@PathVariable int showId)
    {
    	adminservice.deleteShow(showId );                                                                                                                            
    }
}
