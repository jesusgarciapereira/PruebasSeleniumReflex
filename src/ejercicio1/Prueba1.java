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
//	    WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
//	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));
//	    
//		WebElement paginaBuscadores = driver1.findElement(By.id("page-buscadores"));
//		String buscadoresPageText = paginaBuscadores.getText();
//		assertEquals("Buscadores", buscadoresPageText);
		
		
	}
	
	@Test
	void test3() {
		driver1.get("http://localhost:3000/");
		
		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();
		String redesText = redes.getText();
		assertEquals("Redes Sociales", redesText);
		
		 // Esperar a que el elemento con id "page-redes" esté presente en la página
//	    WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
//	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));
//	    
//		WebElement paginaRedes = driver1.findElement(By.id("page-redes"));
//		String buscadoresPageRedes = paginaRedes.getText();
//		assertEquals("Redes Sociales", buscadoresPageRedes);
		

	}
	
	@Test
	void test4() {
		driver1.get("http://localhost:3000/buscadores");
	    
		WebElement paginaBuscadores = driver1.findElement(By.id("page-buscadores"));
		String buscadoresPageText = paginaBuscadores.getText();
		assertEquals("Buscadores", buscadoresPageText);
	}
	
	@Test
	void test5() {
		driver1.get("http://localhost:3000/redes");
			    
		WebElement paginaRedes = driver1.findElement(By.id("page-redes"));
		String buscadoresPageRedes = paginaRedes.getText();
		assertEquals("Redes Sociales", buscadoresPageRedes);
		

	}
	
	@Test
	void test6() {
		driver1.get("http://localhost:3000/buscadores");
		
		WebElement enlaceGoogle = driver1.findElement(By.id("google"));
		enlaceGoogle.click();
		String enlaceGoogleText = enlaceGoogle.getText();
		assertEquals("Google", enlaceGoogleText);
	}
	
	@Test
	void test7() {
		driver1.get("http://localhost:3000/buscadores");
		
		WebElement enlaceBing = driver1.findElement(By.id("bing"));
		enlaceBing.click();
		String enlaceBingText = enlaceBing.getText();
		assertEquals("Bing", enlaceBingText);
	}
	
	@Test
	void test8() {
		driver1.get("http://localhost:3000/buscadores");
		
		WebElement enlaceBaidu = driver1.findElement(By.id("baidu"));
		enlaceBaidu.click();
		String enlaceBaiduText = enlaceBaidu.getText();
		assertEquals("Baidu", enlaceBaiduText);
	} 
	
	@Test
	void test9() {
		driver1.get("http://localhost:3000/buscadores");
		
		WebElement botonVolver = driver1.findElement(By.id("buscadores-volver"));
		botonVolver.click();
		String botonVolverText = botonVolver.getText();
		assertEquals("Volver", botonVolverText);
	}
	
	@Test
	void test10() {
		driver1.get("http://localhost:3000/redes");
		
		WebElement enlaceInstagram = driver1.findElement(By.id("instagram"));
		enlaceInstagram.click();
		String enlaceInstagramText = enlaceInstagram.getText();
		assertEquals("Instagram", enlaceInstagramText);
	}
	
	@Test
	void test11() {
		driver1.get("http://localhost:3000/redes");
		
		WebElement enlaceTikTok = driver1.findElement(By.id("tiktok"));
		enlaceTikTok.click();
		String enlaceTikTokText = enlaceTikTok.getText();
		assertEquals("TikTok", enlaceTikTokText);
	}
	
	@Test
	void test12() {
		driver1.get("http://localhost:3000/redes");
		
		WebElement enlaceFacebook = driver1.findElement(By.id("facebook"));
		enlaceFacebook.click();
		String enlaceFacebookText = enlaceFacebook.getText();
		assertEquals("Facebook", enlaceFacebookText);
	} 
	
	@Test
	void test13() {
		driver1.get("http://localhost:3000/redes");
		
		WebElement botonVolver = driver1.findElement(By.id("redes-volver"));
		botonVolver.click();
		String botonVolverText = botonVolver.getText();
		assertEquals("Volver", botonVolverText);
	}

}
