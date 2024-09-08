package com.km.Empleados.microserver.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "empleados")

public class Empleados {
	
	@Id
    private String id;
    private String nombre;
    private String puesto;
    private String salario;
    
    
    
	public Empleados(String id, String nombre, String puesto, String salario) {
		this.id = id;
		this.nombre = nombre;
		this.puesto = puesto;
		this.salario = salario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
    
    

}
