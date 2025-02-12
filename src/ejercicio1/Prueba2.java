package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Prueba2 {

	static WebDriver driver1 = new ChromeDriver();;

	@BeforeAll
	static void setURL() {
		driver1.get("http://localhost:3000/");
	}
	
    @Test
    void testCabecera() {
        WebElement paginaFormulario = driver1.findElement(By.id("page-formulario"));
        String textoCabecera = paginaFormulario.getText();
        assertEquals("Formulario de registro - Mi web", textoCabecera);
    }
    

    @Test
    void testNombre() {
        WebElement nombre = driver1.findElement(By.id("nombre"));
        String nombreTexto = nombre.getText();
        assertEquals("Nombre:", nombreTexto);
    }

    @Test
    void testInputNombre() {
        WebElement nombreImput = driver1.findElement(By.id("nombre-input"));
        String nombreImputTexto = nombreImput.getText();
        assertEquals("", nombreImputTexto);
    }

    @Test
    void testApellidos() {
        WebElement apellidos = driver1.findElement(By.id("apellidos"));
        String apellidosTexto = apellidos.getText();
        assertEquals("Apellidos:", apellidosTexto);
    }
    
    @Test
    void testInputApellidos() {
        WebElement apellidosInput = driver1.findElement(By.id("apellidos-input"));
        String apellidosInputTexto = apellidosInput.getText();
        assertEquals("", apellidosInputTexto);
    }
    
//    
//    //Test para comprobar que existe el texto de sexo
//    @Test
//    void comprobarTextoSexo() {
//        WebElement elemento = driver1.findElement(By.id("sexo"));
//        String textoSexo = elemento.getText();
//        assertEquals("Sexo:", textoSexo);
//    }
//    
//    //Test para comprobar que existe el texto hombre en el check
//    @Test
//    void comprobarSexoHombre() {
//        WebElement elemento = driver1.findElement(By.id("hombre"));
//        String textoSexo = elemento.getAttribute("value");
//        assertEquals("hombre", textoSexo);
//    }
//    //Test para comprobar que si se ha presionado el check de hombre
//    @Test
//    void comprobarSexoHombrePresionado() {
//        WebElement elemento = driver1.findElement(By.id("hombre"));
//        elemento.click();
//        String presionado = elemento.getAttribute("aria-checked");
//        assertEquals("true", presionado);
//    }
//    
//    //Test para comprobar que existe el texto hombre en el check
//    @Test
//    void comprobarSexoMujer() {
//        WebElement elemento = driver1.findElement(By.id("mujer"));
//        String textoSexo = elemento.getAttribute("value");
//        assertEquals("mujer", textoSexo);
//    }
//    
//    //Test para comprobar que si se ha presionado el check de mujer
//    @Test
//    void comprobarSexoMujerPresionado() {
//        WebElement elemento = driver1.findElement(By.id("mujer"));
//        elemento.click();
//        String presionado = elemento.getAttribute("aria-checked");
//        assertEquals("true", presionado);
//    }
    

    @Test
    void testCorreo() {
        WebElement correo = driver1.findElement(By.id("correo"));
        String correoTexto = correo.getText();
        assertEquals("Correo:", correoTexto);
    }
    

    void testInputCorreo() {
        WebElement correoInput = driver1.findElement(By.id("correo-input"));
        String correoInputTexto = correoInput.getText();
        assertEquals("", correoInputTexto);
    }
    
    //Test para comprobar que existe el informacion en el check
    @Test
    void testTextoCasillaVerificcion1() {
        WebElement informacion = driver1.findElement(By.id("informacion-checkbox"));
        String informacionTexto = informacion.getAttribute("value");
        assertEquals("Deseo recibir información sobre novedades y ofertas", informacionTexto);
    }
    
    //Test para comprobar que el check de la info esta presionado por defecto
    @Test
    void testTextoCasillaVerificcion1Pulsado() {
    	WebElement casilla = driver1.findElement(By.id("informacion-checkbox"));
    	String casillaPrecionada = casilla.getAttribute("aria-checked");
    	assertEquals("true", casillaPrecionada);
    }
    
    //Test para comprobar en el check el texto de la normativa
    @Test
    void testTextoCasillaVerificcion2() {
    	WebElement normativa = driver1.findElement(By.id("normativa-checkbox"));
        String normativaTexto = normativa.getAttribute("value");
        assertEquals("Declaro haber leido y aceptar las condiciones generales del programa y la normativa sobre protección de datos", normativaTexto);
    }
    
    
//    //Test para comprobar el texto del boton
//    @Test
//    void comprobarBoton() {
//    	WebElement elemento = driver1.findElement(By.id("texto-btn"));
//    	String presionado = elemento.getText();
//    	assertEquals("Enviar", presionado);
//    }

}
