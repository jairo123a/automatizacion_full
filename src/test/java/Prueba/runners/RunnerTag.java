package Prueba.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/automatizacion_compra_con_ayudante.feature",
        glue = "Prueba/stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTag {
}
