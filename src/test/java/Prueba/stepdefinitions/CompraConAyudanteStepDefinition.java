package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.HomeData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.PreguntaProducto;
import tasks.Abrir;
import tasks.AgregarProducto;

import java.util.List;

public class CompraConAyudanteStepDefinition {

@Before
     public void setStage(){
         OnStage.setTheStage(new OnlineCast());
     }

    @Given("^ingreso al sitio web$")
    public void ingresoAlSitioWeb() {
       OnStage.theActorCalled("jairo").wasAbleTo(Abrir.laPagina());
    }


    @When("^ingresar al ayudante y agregar un producto al carrito de compras$")
    public void ingresarAlAyudanteYAgregarUnProductoAlCarritoDeCompras(List<HomeData> losdatos) {
      OnStage.theActorInTheSpotlight().attemptsTo(AgregarProducto.alCarritoCon(losdatos));
    }

    @Then("^Verificar el producto en el carrito \"([^\"]*)\"$")
    public void verificarElProductoEnElCarrito(String comprobante) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PreguntaProducto.seAgregoAlCarro(comprobante)));
    }



}
