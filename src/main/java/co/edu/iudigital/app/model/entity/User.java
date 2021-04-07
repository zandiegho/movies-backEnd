package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name = "user") 
public class User implements Serializable {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	private String name;
	private String email; 
	private String password;
	@Column(name = "create_at")
	private LocalDateTime createAt;
	@ManyToOne
	@JoinColumn(name = "profile_id")
	private Profile profileId;
	
	//Retorna identificador de usuario
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	//Retorna Nombre de Usuario
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Retorna email de usuario
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Retorna contraseña de usuario
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Retorna Fecha y hora de creación de cuenta
	public LocalDateTime getCreateAt() {
		return createAt;
	}
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}
	
	//Retorna identificadoe de perfil
	public Profile getProfileId() {
		return profileId;
	}
	public void setProfileId(Profile profileId) {
		this.profileId = profileId;
	}
	
}
