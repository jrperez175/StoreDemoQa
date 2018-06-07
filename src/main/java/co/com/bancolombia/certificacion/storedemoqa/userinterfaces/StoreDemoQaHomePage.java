package co.com.bancolombia.certificacion.storedemoqa.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://store.demoqa.com/")
public class StoreDemoQaHomePage extends PageObject{
	public static final Target BOTON_LOGIN = Target.the("Boton Login").located(By.id("account"));

}
