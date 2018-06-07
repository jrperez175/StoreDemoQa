package co.com.bancolombia.certificacion.storedemoqa.questions;

import static co.com.bancolombia.certificacion.storedemoqa.userinterfaces.StoreDemoQaHomePage.BOTON_CARRO_COMPRAS;

import static co.com.bancolombia.certificacion.storedemoqa.userinterfaces.StoreDemoQaCarroCompras.TEXTO_SUBTOTAL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class Detalle implements Question<String>{

	
	
	public static Detalle deSuProducto() {
		return new Detalle();
	}

	
	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(Click.on(BOTON_CARRO_COMPRAS));
		return TEXTO_SUBTOTAL.resolveFor(actor).getText();
	}
	

}
