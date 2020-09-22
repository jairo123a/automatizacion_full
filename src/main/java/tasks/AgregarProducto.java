package tasks;

import model.HomeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.ElementosWebHomeCenter;
import util.Constantes;
import util.Tiempos;
import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProducto implements Task {

    List<HomeData> losdatos;
    Tiempos tiempos;
   public AgregarProducto(List losdatos){
       this.losdatos=losdatos;
   }


   public static AgregarProducto alCarritoCon(List<HomeData> losdatos){
       return new AgregarProducto(losdatos);
   }

    @Override
    public <T extends Actor> void performAs(T actor) {
          actor.attemptsTo(
                  WaitUntil.the(ElementosWebHomeCenter.aceptar,isVisible()).forNoMoreThan(30).seconds(),
                  Click.on(ElementosWebHomeCenter.aceptar),
                  Click.on(ElementosWebHomeCenter.ana),
                  Enter.theValue(losdatos.get(Constantes.posicion).getPregunta()).into(ElementosWebHomeCenter.input),
                  Click.on(ElementosWebHomeCenter.send),
                  Click.on(ElementosWebHomeCenter.input),
                  WaitUntil.the(ElementosWebHomeCenter.espera,isVisible()).forNoMoreThan(30).seconds(),
                  Enter.theValue(losdatos.get(Constantes.posicion).getTipo()).into(ElementosWebHomeCenter.input),
                  Click.on(ElementosWebHomeCenter.send),
                  WaitUntil.the(ElementosWebHomeCenter.pintura,isVisible()).forNoMoreThan(30).seconds(),
                  Click.on(ElementosWebHomeCenter.pintura),
                  Click.on(ElementosWebHomeCenter.agregaralcarro),
                  Click.on(ElementosWebHomeCenter.cerrar)
          );

    }
}
