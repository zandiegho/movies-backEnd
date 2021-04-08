package co.edu.iudigital.app.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.User;
import co.edu.iudigital.app.model.repository.UserRepository;
import co.edu.iudigital.app.services.iface.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void create(User user) {
		// TODO Implementar
	}

	@Override
	public User login(User user) throws Exception {
		User existUser = userRepository.
				findByEmailAndPassword(user.getEmail(), user.getPassword());
		if (existUser == null)
		{
			throw new Exception("Usuario y/o Contraseña invalido");
		}
		return existUser;		
	}
}
