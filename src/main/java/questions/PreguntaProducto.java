package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebHomeCenter;

public class PreguntaProducto implements Question <Boolean> {

String pregunta;
    public PreguntaProducto(String pregunta){
        this.pregunta=pregunta;
    }

  public static PreguntaProducto seAgregoAlCarro(String pregunta){
      return new PreguntaProducto(pregunta);
  }


    @Override
    public Boolean answeredBy(Actor actor) {
    String respuesta;
    respuesta= Text.of(ElementosWebHomeCenter.Verificar).viewedBy(actor).asString();
    if(respuesta.equals(pregunta)){
        return true;

    }else{
        return false;
    }
    }
}
