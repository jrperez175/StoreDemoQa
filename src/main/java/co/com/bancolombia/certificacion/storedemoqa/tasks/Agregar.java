package co.com.bancolombia.certificacion.storedemoqa.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;

import static co.com.bancolombia.certificacion.storedemoqa.userinterfaces.StoreDemoQaResultados.*;
import cucumber.runtime.SerenityBackend;

import static co.com.bancolombia.certificacion.storedemoqa.userinterfaces.StoreDemoQaBusqueda.CAMPO_DE_BUSQUEDA;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Agregar implements Task {

	private final String producto;

	public Agregar(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(producto).into(CAMPO_DE_BUSQUEDA).thenHit(Keys.ENTER),
						Click.on(PRODUCTO_DESEADO),
						Click.on(PRODUCTO_DESEADO_DETALLE)

		);
	}

	public static Agregar unProducto(String producto) {

		return instrumented(Agregar.class, producto);
	}

}
