package com.jcodepoint.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("bean")
@RequestScoped
public class ExampleBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private Boolean accepted;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Boolean getAccepted() {
		return accepted;
	}
	
	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	public String register() {
		if (!this.accepted) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Debe aceptar los Términos y Condiciones.", "Debe aceptar los Términos y Condiciones."));
			return "";
		}
		
		return "result";
	}
	
	public String volver() {
		return "inicio";
	}

}
