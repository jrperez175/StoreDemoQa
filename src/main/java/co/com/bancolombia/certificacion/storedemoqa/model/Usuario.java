package co.com.bancolombia.certificacion.storedemoqa.model;

public class Usuario {
	
	private final String nombreUsuario;
	private final String contrasena;
	
	public Usuario(String nombreUsuario, String contrasena) {
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}
	

}
