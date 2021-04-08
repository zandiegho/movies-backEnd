package co.edu.iudigital.app.services.iface;

import java.util.List;

import co.edu.iudigital.app.model.entity.Movie;

public interface MovieService {

	/**
	 * Obtener Peliculas
	 * @return
	 */
	public List<Movie> getAll(); 
	
	/**
	 * Crear Una Pelicula
	 * @param movie
	 */
	public void create(Movie movie);
	
	/**
	 * Edita una pelicula por su id
	 * @param movieId
	 */
	public void editMovie(Movie movie, int movieId);

	
	/**
	 * Borra uan pelicula
	 * @param movie
	 * @param movieId
	 */
	public void delete(int movieId);
	
	/**
	 * Califica una pelicula
	 * @param movie
	 * @param movieId
	 */
	public void rateMovie (Movie movie, int movieId);
	
}
