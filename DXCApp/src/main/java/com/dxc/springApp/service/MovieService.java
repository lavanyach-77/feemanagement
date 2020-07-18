package com.dxc.springApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.springApp.dao.MovieDAO;
import com.dxc.springApp.entity.Movie;

@Service
public class MovieService {

	@Autowired
	MovieDAO movieDao;
	
	public List<Movie> getAllMovies() {
		return this.movieDao.findAll();
	}
	
	public Movie addMovie(Movie movie) {
		return this.movieDao.save(movie);
	}
	
	// Optional is a Container object which may or may not contain non null values
	public Optional <Movie> getMovieById(int id ) {
		return this.movieDao.findById(id);
	}
	
	public Movie updateMovie(Movie movie) {
		return this.movieDao.save(movie);
	}
	
	public void deleteMovieById(int id) {
		this.movieDao.deleteById(id);
	}
	
	public void deleteAllMovies() {
		this.movieDao.deleteAll();
	}
}
