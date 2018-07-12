package co.com.bancolombia.certificacion.storedemoqa.model.builder;

import co.com.bancolombia.certificacion.storedemoqa.model.Usuario;

public class UsuarioBuilder {
	
	private String nombreUsuario;
	private String contrasena;
	
	public UsuarioBuilder(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public static UsuarioBuilder conNombre(String nombreUsuario) {
		return new UsuarioBuilder(nombreUsuario);
	}
	
	public Usuario ycontrasena(String password) {
		contrasena = password;
		return build();
	}
	
	public Usuario build() {
		return new Usuario(nombreUsuario, contrasena);
	}

}
