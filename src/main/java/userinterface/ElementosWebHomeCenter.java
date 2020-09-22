package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebHomeCenter {

    public static final Target ana=Target.the("click en ana").located(By.xpath("//div[contains(@class,'_avatarMinimizeAna_avatar-minimize-ana--default__1Ricp')]"));
    public static final Target aceptar=Target.the("Click en aceptar").located(By.id("btnAceptacionCookies"));
    public static final Target input=Target.the("escribir en  input").located(By.xpath("//input[@placeholder='Escribe tu mensaje…']"));
    public static final Target send=Target.the("click en send").located(By.className("css-11v3mzl"));
    public static final Target espera=Target.the("espera").located(By.xpath("//p[contains(text(),'¿Qué tipo de producto quieres?')]"));
    public static final Target pintura=Target.the("click en pintura").located(By.xpath("//div[@class='chatbot-main slide--scale-in']//div[2]//div[2]//div[5]"));
    public static final Target agregaralcarro=Target.the("click en agregar al carrito").located(By.xpath("//div[@class='_modal_content-modal__3BZ4k chat-content-modal']//div//span[@class='undefined'][contains(text(),'Agregar al carro')]"));
    public static final Target cerrar=Target.the("click en cerrar").located(By.xpath("/html/body/div[11]/div/div[1]/div/div/span"));
    public static final Target Verificar=Target.the("click en cerrar").located(By.xpath("//p[contains(text(),'¡Excelente! Tu producto ya está en el carro.')]"));
}
