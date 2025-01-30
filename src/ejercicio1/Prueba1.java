package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		WebElement paginaBuscadores = driver1.findElement(By.id("page-buscadores"));
		String buscadoresText = paginaBuscadores.getText();
		assertEquals("Buscadores", buscadoresText);
	}
	
	@Test
	void test3() {
		driver1.get("http://localhost:3000/");
		
		
		WebElement redes = driver1.findElement(By.id("redes"));
		String redesText = redes.getText();
		assertEquals("Redes sociales", redesText);
	}

}
