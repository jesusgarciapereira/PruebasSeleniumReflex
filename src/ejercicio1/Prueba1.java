package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Prueba1 {

	static WebDriver driver1 = new ChromeDriver();;

	@BeforeAll
	static void setURL() {
		driver1.get("http://localhost:3000/");
	}

	@Test
	void testTituloEnlaces() {
		setURL();

		WebElement indexCorrecto = driver1.findElement(By.id("page-enlaces"));
		String textoLogin = indexCorrecto.getText();
		assertEquals("Enlaces favoritos", textoLogin);

	}

	@Test
	void testTextoBuscadores() {
		setURL();
		
		WebElement paginaBuscadores = driver1.findElement(By.id("buscadores"));
		String buscadoresPageText = paginaBuscadores.getText();
		assertEquals("Buscadores", buscadoresPageText);
	}

	@Test
	void testTextoRedes() {
		setURL();
		
		WebElement paginaRedes = driver1.findElement(By.id("redes"));
		String buscadoresPageRedes = paginaRedes.getText();
		assertEquals("Redes Sociales", buscadoresPageRedes);

	}

	@Test
	void testNavegarBuscadoresTitulo() {
		setURL();
		
		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement paginaBuscadores = driver1.findElement(By.id("page-buscadores"));
		String buscadoresPageText = paginaBuscadores.getText();
		assertEquals("Buscadores", buscadoresPageText);

	}

	@Test
	void testNavegarBuscadoresGoogle() {

		setURL();
		
		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement enlaceGoogle = driver1.findElement(By.id("google"));
	    
		String enlaceGoogleText = enlaceGoogle.getText();
		assertEquals("Google", enlaceGoogleText);
	}
	
	@Test
	void testEstoyGoogle() {

		setURL();
		
		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement enlaceGoogle = driver1.findElement(By.id("google"));
		enlaceGoogle.click();
		

		// Guardamos el ID de la pestaña original
	    String originalWindow = driver1.getWindowHandle();

	    // Esperamos hasta que haya más de una pestaña abierta
	    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
	 // Cambiamos el foco a la nueva pestaña
	    for (String windowHandle : driver1.getWindowHandles()) {
	        if (!windowHandle.equals(originalWindow)) {
	            driver1.switchTo().window(windowHandle);
	            break;
	        }
	    }
	    
		String nuevaPestannia = driver1.getCurrentUrl();
		assertTrue(nuevaPestannia.contains("google"));
		
		 // Cerrar la nueva pestaña
	    driver1.close();

	    // Volver a la pestaña original
	    driver1.switchTo().window(originalWindow);
	    
	}

	@Test
	void testNavegarBuscadoresBing() {
		setURL();
		
		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement enlaceBing = driver1.findElement(By.id("bing"));
		
		String enlaceBingText = enlaceBing.getText();
		assertEquals("Bing", enlaceBingText);
	}
	
	@Test
	void testEstoyBing() {
		setURL();
		
		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement enlaceBing = driver1.findElement(By.id("bing"));
		enlaceBing.click();
		// Guardamos el ID de la pestaña original
	    String originalWindow = driver1.getWindowHandle();

	    // Esperamos hasta que haya más de una pestaña abierta
	    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
	 // Cambiamos el foco a la nueva pestaña
	    for (String windowHandle : driver1.getWindowHandles()) {
	        if (!windowHandle.equals(originalWindow)) {
	            driver1.switchTo().window(windowHandle);
	            break;
	        }
	    }
	    
		String nuevaPestannia = driver1.getCurrentUrl();
		assertTrue(nuevaPestannia.contains("bing"));
		
		 // Cerrar la nueva pestaña
	    driver1.close();

	    // Volver a la pestaña original
	    driver1.switchTo().window(originalWindow);

	}

	@Test
	void testNavegarBuscadoresBaidu() {
		setURL();
		
		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement enlaceBaidu = driver1.findElement(By.id("baidu"));
		
		String enlaceBaiduText = enlaceBaidu.getText();
		assertEquals("Baidu", enlaceBaiduText);
	}
	
	@Test
	void testEstoyBaidu() {
		setURL();
		
		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement enlaceBaidu = driver1.findElement(By.id("baidu"));
		enlaceBaidu.click();
		// Guardamos el ID de la pestaña original
	    String originalWindow = driver1.getWindowHandle();

	    // Esperamos hasta que haya más de una pestaña abierta
	    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	 // Cambiamos el foco a la nueva pestaña
	    for (String windowHandle : driver1.getWindowHandles()) {
	        if (!windowHandle.equals(originalWindow)) {
	            driver1.switchTo().window(windowHandle);
	            break;
	        }
	    }
	    
		String nuevaPestannia = driver1.getCurrentUrl();
		assertTrue(nuevaPestannia.contains("baidu"));
		
		 // Cerrar la nueva pestaña
	    driver1.close();
	    
	    // Volver a la pestaña original
	    driver1.switchTo().window(originalWindow);

	}

	@Test
	void testNavegarBuscadoresTextoVolver() {
		setURL();
		
		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement botonVolver = driver1.findElement(By.id("buscadores-volver"));
		String botonVolverText = botonVolver.getText();
		assertEquals("Volver", botonVolverText);
	}

	@Test
	void testNavegarBuscadoresNavegarVolver() {
		setURL();
		
		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement botonVolver = driver1.findElement(By.id("buscadores-volver"));
		botonVolver.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-enlaces" esté presente en la página
//		wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-enlaces")));

		WebElement indexCorrecto = driver1.findElement(By.id("page-enlaces"));
		String textoLogin = indexCorrecto.getText();
		assertEquals("Enlaces favoritos", textoLogin);
	}

	@Test
	void testNavegarRedesTitulo() {
		setURL();
		
		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-redes" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement paginaRedes = driver1.findElement(By.id("page-redes"));
		String buscadoresPageRedes = paginaRedes.getText();
		assertEquals("Redes Sociales", buscadoresPageRedes);

	}

	@Test
	void testNavegarRedesInstagram() {
		setURL();
		
		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-redes" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement enlaceInstagram = driver1.findElement(By.id("instagram"));
		
		String enlaceInstagramText = enlaceInstagram.getText();
		assertEquals("Instagram", enlaceInstagramText);
	}

	@Test
	void testEstoyInstagram() {
		setURL();
		
		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-redes" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement enlaceInstagram = driver1.findElement(By.id("instagram"));
		enlaceInstagram.click();
		// Guardamos el ID de la pestaña original
	    String originalWindow = driver1.getWindowHandle();

	    // Esperamos hasta que haya más de una pestaña abierta
	    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
	 // Cambiamos el foco a la nueva pestaña
	    for (String windowHandle : driver1.getWindowHandles()) {
	        if (!windowHandle.equals(originalWindow)) {
	            driver1.switchTo().window(windowHandle);
	            break;
	        }
	    }
	    
		String nuevaPestannia = driver1.getCurrentUrl();
		assertTrue(nuevaPestannia.contains("instagram"));
		
		 // Cerrar la nueva pestaña
	    driver1.close();

	    // Volver a la pestaña original
	    driver1.switchTo().window(originalWindow);

	}
	
	@Test
	void testNavegarRedesTiktok() {
		setURL();
		
		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-redes" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement enlaceTikTok = driver1.findElement(By.id("tiktok"));
		
		String enlaceTikTokText = enlaceTikTok.getText();
		assertEquals("TikTok", enlaceTikTokText);
	}
	
	@Test
	void testEstoyTiktok() {
		setURL();
		
		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-redes" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement enlaceTikTok = driver1.findElement(By.id("tiktok"));
		enlaceTikTok.click();
		// Guardamos el ID de la pestaña original
	    String originalWindow = driver1.getWindowHandle();

	    // Esperamos hasta que haya más de una pestaña abierta
	    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
	 // Cambiamos el foco a la nueva pestaña
	    for (String windowHandle : driver1.getWindowHandles()) {
	        if (!windowHandle.equals(originalWindow)) {
	            driver1.switchTo().window(windowHandle);
	            break;
	        }
	    }
	    
		String nuevaPestannia = driver1.getCurrentUrl();
		assertTrue(nuevaPestannia.contains("tiktok"));
		
		 // Cerrar la nueva pestaña
	    driver1.close();

	    // Volver a la pestaña original
	    driver1.switchTo().window(originalWindow);

	}

	@Test
	void testNavegarRedesFacebook() {
		setURL();

		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-redes" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement enlaceFacebook = driver1.findElement(By.id("facebook"));
		
		String enlaceFacebookText = enlaceFacebook.getText();
		assertEquals("Facebook", enlaceFacebookText);
	}
	
	@Test
	void testEstoyFacebook() {
		setURL();

		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-redes" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement enlaceFacebook = driver1.findElement(By.id("facebook"));
		enlaceFacebook.click();
		// Guardamos el ID de la pestaña original
	    String originalWindow = driver1.getWindowHandle();

	    // Esperamos hasta que haya más de una pestaña abierta
	    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
	 // Cambiamos el foco a la nueva pestaña
	    for (String windowHandle : driver1.getWindowHandles()) {
	        if (!windowHandle.equals(originalWindow)) {
	            driver1.switchTo().window(windowHandle);
	            break;
	        }
	    }
	    
		String nuevaPestannia = driver1.getCurrentUrl();
		assertTrue(nuevaPestannia.contains("facebook"));
		
		 // Cerrar la nueva pestaña
	    driver1.close();

	    // Volver a la pestaña original
	    driver1.switchTo().window(originalWindow);

	}

	@Test
	void testNavegarRedesTextoVolver() {
		setURL();

		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-redes" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement botonVolver = driver1.findElement(By.id("redes-volver"));
		String botonVolverText = botonVolver.getText();
		assertEquals("Volver", botonVolverText);
	}

	@Test
	void testNavegarRedesNavegarVolver() {
		setURL();

		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-redes" esté presente en la página
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement botonVolver = driver1.findElement(By.id("redes-volver"));
		botonVolver.click();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Esperar a que el elemento con id "page-enlaces" esté presente en la página
//		wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-enlaces")));

		WebElement indexCorrecto = driver1.findElement(By.id("page-enlaces"));
		String textoLogin = indexCorrecto.getText();
		assertEquals("Enlaces favoritos", textoLogin);
	}

}
