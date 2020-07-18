package com.dxc.springApp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.springApp.entity.Movie;
import com.dxc.springApp.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	MovieService movieService;

	// http://localhost:8562/employee/all
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Movie> getAllMovies() {
		return this.movieService.getAllMovies();
	}

	// http://localhost:8562/employee/addEmployee
	@RequestMapping(value = "/addMovie", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie addMovie(@RequestBody Movie movie) {
		return this.movieService.addMovie(movie);
	}

	// http://localhost:8562/employee/updateEmployee
	@RequestMapping(value = "/updateMovie", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie updateMovie(@RequestBody Movie movie) {
		return this.movieService.updateMovie(movie);
	}

	// http://localhost:8562/employee/1
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Movie> getMovie(@PathVariable int id) {
		return this.movieService.getMovieById(id);
	}

	// http://localhost:8562/employee/all
	@RequestMapping(value = "/all", method = RequestMethod.DELETE)
	public void deleteAllMovies() {
		this.movieService.deleteAllMovies();
	}

	// http://localhost:8562/employee/1
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteMovie(@PathVariable int id) {
		this.movieService.deleteMovieById(id);
	}
}