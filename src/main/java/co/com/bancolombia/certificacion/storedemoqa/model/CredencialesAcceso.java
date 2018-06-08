package co.com.bancolombia.certificacion.storedemoqa.model;

public class CredencialesAcceso {
	
	private String usuario;
	private String password;
	
	public CredencialesAcceso (String usuario, String password){
		this.usuario = usuario;
		this.password  = password;
		
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	

}
