package co.com.bancolombia.certificacion.storedemoqa.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class StoreDemoQaResultados extends PageObject {

	public static final Target PRODUCTO_DESEADO = Target.the("Producto Seleccionado")
							//.locatedBy("//*[@id=\"grid_view_products_page_container\"]/div/div/div/h2/a[contains(text(),'{0}')]");
							.locatedBy("//*[@id=\"grid_view_products_page_container\"]/div/div[1]/div[2]/h2/a");
	
	public static final Target PRODUCTO_DESEADO_DETALLE = Target.the("Producto Seleccionado Detalle")
								.locatedBy("//*[@id=\"single_product_page_container\"]/div[1]/div[2]/form/div[2]/div[1]/span/input");
	
	
}
