package co.edu.iudigital.app.services.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.Movie;
import co.edu.iudigital.app.model.repository.GenderRepository;
import co.edu.iudigital.app.model.repository.MovieRepository;
import co.edu.iudigital.app.services.iface.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository movieReposotory;

	@Autowired
	private GenderRepository genderRepository;
	
	
	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		movies = (List<Movie>) movieReposotory.findAll();
		return movies;
	}

	@Override
	public void create(Movie movie) {
		boolean existGender = genderRepository
				.existsById(movie.getGenderId().getId());
		if(existGender)
		{
			movie.setCreateAt(LocalDateTime.now());
			movieReposotory.save(movie);
		}
		
	}

	@Override
	public void editMovie(Movie movie, int movieId) {
		Optional<Movie> existMovie = movieReposotory.findById(movieId);
		if(existMovie.isPresent()) {
			existMovie.get().setName(movie.getName());
			existMovie.get().setDescription(movie.getDescription());
			existMovie.get().setActors(movie.getActors());
			existMovie.get().setImage(movie.getImage());
			existMovie.get().setRating(movie.getRating());
			existMovie.get().setReleaseDate(movie.getReleaseDate());
			existMovie.get().setName(movie.getName());
			//existMovie.get().set(movie.getName());
			boolean existGender = genderRepository
					.existsById(movie.getGenderId().getId());
			if(existGender)
			{
				existMovie.get().setGenderId(movie.getGenderId());
			}
			movieReposotory.save(existMovie.get());			
		}	
	}

	@Override
	public void delete(int movieId) {
		Optional<Movie> existMovie = movieReposotory.findById(movieId);
		if (existMovie.isPresent())
		{
			movieReposotory.delete(existMovie.get());
		}
		
	}

	@Override
	public void rateMovie(Movie movie, int movieId) {
		Optional<Movie> existMovie = movieReposotory.findById(movieId);
		if (existMovie.isPresent())
		{
			existMovie.get()
			.setRating(existMovie.get().getRating() + movie.getRating());
			movieReposotory.save(existMovie.get());
		}
	}

}
