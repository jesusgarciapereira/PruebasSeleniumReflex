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
    
    @Test
    void testSexo() {
        WebElement sexo = driver1.findElement(By.id("sexo"));
        String sexoTexto = sexo.getText();
        assertEquals("Sexo:", sexoTexto);
    }
    
    @Test
    void testSexoHombre() {
        WebElement hombre = driver1.findElement(By.cssSelector("button[value='hombre']"));
        String hombreTexto = hombre.getAttribute("value");
        assertEquals("hombre", hombreTexto);
    }
       
    
    @Test
    void testSexoMujer() {
        WebElement mujer = driver1.findElement(By.cssSelector("button[value='mujer']"));
        String mujerTexto = mujer.getAttribute("value");
        assertEquals("mujer", mujerTexto);
    }
    
    @Test
    void testPresionadosExcluyentes1() {
        WebElement casillaHombre = driver1.findElement(By.cssSelector("button[value='hombre']"));
        WebElement casillaMujer = driver1.findElement(By.cssSelector("button[value='mujer']"));

        casillaHombre.click();
        casillaMujer.click();

        String casillaHombrePresionado = casillaHombre.getAttribute("aria-checked");
        assertEquals("false", casillaHombrePresionado);
    }
  
    @Test
    void testPresionadosExcluyentes2() {
        WebElement casillaHombre = driver1.findElement(By.cssSelector("button[value='hombre']"));
        WebElement casillaMujer = driver1.findElement(By.cssSelector("button[value='mujer']"));

        casillaHombre.click();

        String casillaMujerPresionado = casillaMujer.getAttribute("aria-checked");
        assertEquals("false", casillaMujerPresionado);
    }
   

    @Test
    void testCorreo() {
        WebElement correo = driver1.findElement(By.id("correo"));
        String correoTexto = correo.getText();
        assertEquals("Correo:", correoTexto);
    }
    

    @Test
    void testInputCorreo() {
        WebElement correoInput = driver1.findElement(By.id("correo-input"));
        String correoInputTexto = correoInput.getText();
        assertEquals("", correoInputTexto);
    }
    
    @Test
    void testTextoCasillaVerificcion1() {
        WebElement informacion = driver1.findElement(By.id("informacion-checkbox"));
        String informacionTexto = informacion.getAttribute("value");
        assertEquals("Deseo recibir información sobre novedades y ofertas", informacionTexto);
    }
    
    @Test
    void testTextoCasillaVerificcion1Pulsado() {
    	WebElement casillaInformacion = driver1.findElement(By.id("informacion-checkbox"));
    	String casillaInformacionPresionada = casillaInformacion.getAttribute("aria-checked");
    	assertEquals("true", casillaInformacionPresionada);
    }
    
    @Test
    void testTextoCasillaVerificcion2() {
    	WebElement normativa = driver1.findElement(By.id("normativa-checkbox"));
        String normativaTexto = normativa.getAttribute("value");
        assertEquals("Declaro haber leído y aceptar las condiciones generales del programa y la normativa sobre protección de datos", normativaTexto);
    }
    
    @Test
    void testTextoCasillaVerificcion2Pulsado() {
    	WebElement casillaNormativa = driver1.findElement(By.id("normativa-checkbox"));
    	String casillaNormativaPresionada = casillaNormativa.getAttribute("aria-checked");
    	assertEquals("false", casillaNormativaPresionada);
    }
    
    
    @Test
    void testEnviarBoton() {
    	WebElement enviar = driver1.findElement(By.id("enviar-boton"));
    	String enviarTexto = enviar.getText();
    	assertEquals("Enviar", enviarTexto);
    }

}
