package co.com.bancolombia.certificacion.storedemoqa.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.bancolombia.certificacion.storedemoqa.questions.Detalle;
import co.com.bancolombia.certificacion.storedemoqa.tasks.Agregar;
import co.com.bancolombia.certificacion.storedemoqa.tasks.Autenticar;
import co.com.bancolombia.certificacion.storedemoqa.userinterfaces.StoreDemoQaHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.hamcrest.CoreMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class AgregarArticuloStepDefinitions {
	private StoreDemoQaHomePage storedemoqahomepage;
	
	@Before
	public void preparaEscenario() {
		OnStage.setTheStage(new OnlineCast()); 
	}
	
	@Dado("^que (.*) (.*) (.*) quiere agregar a su carrito productos$")
	public void queCesarQuiereAgregarASuCarritoProductos(String nombreActor, String usuario, String password) {
		theActorCalled(nombreActor).wasAbleTo(Open.browserOn(storedemoqahomepage),
											//Autenticar.alUsuario(conNombre(usuario).ycontrasena(password))
											Autenticar.alUsuario(usuario,password)	
				);
	}

	@Cuando("^el agrega un (.*) al carrito de compras$")
	public void elAgregaUnProductoAlCarritoDeCompras(String producto) {
		theActorInTheSpotlight().attemptsTo(Agregar.unProducto(producto));   
	}

	@Entonces("^se debe visualizar el producto en el detalle del carrito de compras (.*)$")
	public void seDebeVisualizarElProductoEnElDetalleDelCarritoDeCompras(String resultado)  {
		theActorInTheSpotlight().should(seeThat(Detalle.deSuProducto(), is(resultado)));
	}



}
