package co.com.bancolombia.certificacion.storedemoqa.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class StoreDemoQaBusqueda extends PageObject{
	public static final Target CAMPO_DE_BUSQUEDA = Target.the("Campo de Busqueda del Articulo")
													.locatedBy("//*[@id=\"main-nav\"]/form/fieldset/input[@value=\"Search Products\"]");

}
