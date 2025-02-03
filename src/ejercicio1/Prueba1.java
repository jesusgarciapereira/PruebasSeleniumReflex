package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Prueba1 {

	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new ChromeDriver();
	}

	@Test
	void test1() {
		driver1.get("http://localhost:3000/");
		
		WebElement indexCorrecto = driver1.findElement(By.id("enlaces"));
		String textoLogin = indexCorrecto.getText();
		assertEquals("Enlaces favoritos", textoLogin);

	}

	@Test
	void test2() {
		driver1.get("http://localhost:3000/");
		
		
		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();
		String buscadoresText = buscadores.getText();
		assertEquals("Buscadores", buscadoresText);
		
		 // Esperar a que el elemento con id "page-buscadores" esté presente en la página
	    WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));
	    
		WebElement paginaBuscadores = driver1.findElement(By.id("page-buscadores"));
		String buscadoresPageText = paginaBuscadores.getText();
		assertEquals("Buscadores", buscadoresPageText);
		
		
	}
	
	@Test
	void test3() {
		driver1.get("http://localhost:3000/");
		
		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();
		String redesText = redes.getText();
		assertEquals("Redes Sociales", redesText);
		
		 // Esperar a que el elemento con id "page-redes" esté presente en la página
	    WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));
	    
		WebElement paginaRedes = driver1.findElement(By.id("page-redes"));
		String buscadoresPageRedes = paginaRedes.getText();
		assertEquals("Redes Sociales", buscadoresPageRedes);
		

	}

}
