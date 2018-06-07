package co.com.bancolombia.certificacion.storedemoqa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/agregar_articulo.feature"},
				glue = {"co.com.bancolombia.certificacion.storedemoqa.stepdefinitions"},
				snippets = SnippetType.CAMELCASE
)

public class AgregarArticulo {

}
