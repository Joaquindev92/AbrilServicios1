package com.idat.AbrilServicio1.dto;

public class UsuarioRequestDTO {
	
	private String usuario;
	private String contraseña;
	
	
	
	public UsuarioRequestDTO(String usuario, String contraseña) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	public UsuarioRequestDTO() {
		super();
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	

}
