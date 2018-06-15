package co.com.bancolombia.certificacion.storedemoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.storedemoqa.model.CredencialesAcceso;
import co.com.bancolombia.certificacion.storedemoqa.model.Usuario;

import static co.com.bancolombia.certificacion.storedemoqa.userinterfaces.StoreDemoQaLogin.*;

import static co.com.bancolombia.certificacion.storedemoqa.userinterfaces.StoreDemoQaHomePage.BOTON_LOGIN;

public class Autenticar implements Task{

	 private final Usuario usuario;
	 
	
	 public Autenticar(Usuario usuario) {
		 this.usuario = usuario;
		 
	 }
	 
	 
	 @Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BOTON_LOGIN),
						Enter.theValue(usuario.getNombreUsuario()).into(TEXTO_USUARIO),
						Enter.theValue(usuario.getContrasena()).into(TEXTO_CONTRASEÑA),
						Click.on(BOTON_LOGIN)	
				);
		
	}
	 

	public static Autenticar alUsuario(Usuario usuario) {
		return instrumented(Autenticar.class,usuario);
	}
	
	

}
