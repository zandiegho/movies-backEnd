package co.edu.iudigital.app.services.iface;

import java.util.List;

import co.edu.iudigital.app.model.entity.Gender;

public interface GenderService {
	
	//Listar todos los generos
	public List<Gender> getAll();
}
