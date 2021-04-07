package co.edu.iudigital.app.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "gender")
public class Gender implements Serializable {

	@Id
	@Column (name = "gender_id")
	private int id;
	private String name;
	
	/*
	 * Retorna id 
	 */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// Retorna Nombre de Genero 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 

	

}
