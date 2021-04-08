package co.edu.iudigital.app.services.iface;

import co.edu.iudigital.app.model.entity.User;
import net.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor;

public interface UserService {

	/**
	 * Crear Nuevi Usuario
	 * @param user
	 */
	public void create (User user);
	
	/**
	 * Login de Usuario
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User login (User user) throws Exception;
}
