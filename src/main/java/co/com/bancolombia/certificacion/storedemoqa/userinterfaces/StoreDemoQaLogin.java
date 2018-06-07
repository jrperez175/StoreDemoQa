package co.com.bancolombia.certificacion.storedemoqa.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class StoreDemoQaLogin extends PageObject {
	public static final Target TEXTO_USUARIO = Target.the("Cajon de Texto Usuario").located(By.id("log"));
	public static final Target TEXTO_CONTRASE�A = Target.the("Cajon de Texto Contrase�a").located(By.id("pwd"));
	public static final Target BOTON_LOGIN = Target.the("Boton de Logueo").located(By.id("login"));

}
