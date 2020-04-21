package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.AdminDaoI;
import com.cg.entity.Admin;
import com.cg.entity.Customer;
import com.cg.entity.Movie;
import com.cg.entity.Show;
import com.cg.entity.Theatre;
import com.cg.entity.UserType;
import com.cg.service.AdminServiceI;

@SpringBootApplication
public class OnlinemovieApplication implements CommandLineRunner {
 @Autowired
 AdminServiceI adminservice;
	

	public static void main(String[] args)	
	{
	SpringApplication.run(OnlinemovieApplication.class, args);
 
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	//Movie m = new Movie();
	//m.setDirector("trivikram");
	//m.setGenre("action");
	//m.setHero("maheshbabu");
	//m.setHeroine("trisha");
	//adminservice.createMovie(m);
	//System.out.println("its done");
		
		Theatre t = new Theatre();
		t.setManagerContact("mobile");
		t.setManagerName("varun");
		t.setTheatreCity("srikakulam");
		t.setTheatreName("ramalaxmana");
		t.setTheatreId(100);
		adminservice.createTheatre(t);
		System.out.println("hiii");
		
		
		
		
		
	
	}
}
