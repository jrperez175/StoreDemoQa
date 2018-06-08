package co.com.bancolombia.certificacion.storedemoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.storedemoqa.model.CredencialesAcceso;

import static co.com.bancolombia.certificacion.storedemoqa.userinterfaces.StoreDemoQaLogin.*;

import static co.com.bancolombia.certificacion.storedemoqa.userinterfaces.StoreDemoQaHomePage.BOTON_LOGIN;

public class Autenticar implements Task{

	 //private final String usuario;
	 //private final String password;
	 private final CredencialesAcceso credencialesacceso;
	 
//	 public Autenticar(String usuario, String password) {
//		 this.usuario = usuario;
//		 this.password = password;
//		 	 
//	 }
	
	 public Autenticar(CredencialesAcceso credencialesAcceso) {
		 this.credencialesacceso = credencialesAcceso;
		 
	 }
	 
//	 @Override
//	public <T extends Actor> void performAs(T actor) {
//		actor.attemptsTo(Click.on(BOTON_LOGIN),
//						Enter.theValue(usuario).into(TEXTO_USUARIO),
//						Enter.theValue(password).into(TEXTO_CONTRASEŅA),
//						Click.on(BOTON_LOGIN)	
//				);
//		
//	}

	 
	 @Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BOTON_LOGIN),
						Enter.theValue(credencialesacceso.getUsuario()).into(TEXTO_USUARIO),
						Enter.theValue(credencialesacceso.getPassword()).into(TEXTO_CONTRASEŅA),
						Click.on(BOTON_LOGIN)	
				);
		
	}
	 
	public static Autenticar alUsuario(String usuario, String password) {
		return instrumented(Autenticar.class, usuario, password );
	}

	public static Autenticar alUsuario(CredencialesAcceso credencialesAcceso) {
		return instrumented(Autenticar.class,credencialesAcceso);
	}
	
	

}
