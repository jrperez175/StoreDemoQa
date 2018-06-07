package co.com.bancolombia.certificacion.storedemoqa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class StoreDemoQaCarroCompras extends PageObject {

	public static final Target TEXTO_SUBTOTAL = Target.the("Texto Subtotal")
									.locatedBy("//*[@id=\"checkout_page_container\"]/div[1]/span");
}
