package co.edu.iudigital.app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.Gender;
import co.edu.iudigital.app.model.repository.GenderRepository;
import co.edu.iudigital.app.services.iface.GenderService;

@Service
public class GenserServicesImpl implements GenderService{

	//Inyección de dependencias! 
	@Autowired
	private GenderRepository genderRepository;

	
	@Override
	public List<Gender> getAll() {
		List<Gender> genders = new ArrayList<>();
		genders = (List<Gender>)genderRepository.findAll();
		return genders;
	}
}
