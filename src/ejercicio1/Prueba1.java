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
	void testTituloEnlaces() {
		driver1.get("http://localhost:3000/");

		WebElement indexCorrecto = driver1.findElement(By.id("page-enlaces"));
		String textoLogin = indexCorrecto.getText();
		assertEquals("Enlaces favoritos", textoLogin);

	}

	@Test
	void testTextoBuscadores() {
		driver1.get("http://localhost:3000/");

		WebElement paginaBuscadores = driver1.findElement(By.id("buscadores"));
		String buscadoresPageText = paginaBuscadores.getText();
		assertEquals("Buscadores", buscadoresPageText);
	}

	@Test
	void testTextoRedes() {
		driver1.get("http://localhost:3000/");

		WebElement paginaRedes = driver1.findElement(By.id("redes"));
		String buscadoresPageRedes = paginaRedes.getText();
		assertEquals("Redes Sociales", buscadoresPageRedes);

	}

	@Test
	void testNavegarBuscadoresTitulo() {
		driver1.get("http://localhost:3000/");

		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement paginaBuscadores = driver1.findElement(By.id("page-buscadores"));
		String buscadoresPageText = paginaBuscadores.getText();
		assertEquals("Buscadores", buscadoresPageText);

	}

	@Test
	void testNavegarBuscadoresGoogle() {

		driver1.get("http://localhost:3000/");

		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement enlaceGoogle = driver1.findElement(By.id("google"));
		enlaceGoogle.click();
		String enlaceGoogleText = enlaceGoogle.getText();
		assertEquals("Google", enlaceGoogleText);
	}

	@Test
	void testNavegarBuscadoresBing() {
		driver1.get("http://localhost:3000/");

		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement enlaceBing = driver1.findElement(By.id("bing"));
		enlaceBing.click();
		String enlaceBingText = enlaceBing.getText();
		assertEquals("Bing", enlaceBingText);
	}

	@Test
	void testNavegarBuscadoresBaidu() {
		driver1.get("http://localhost:3000/");

		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement enlaceBaidu = driver1.findElement(By.id("baidu"));
		enlaceBaidu.click();
		String enlaceBaiduText = enlaceBaidu.getText();
		assertEquals("Baidu", enlaceBaiduText);
	}

	@Test
	void testNavegarBuscadoresTextoVolver() {
		driver1.get("http://localhost:3000/");

		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement botonVolver = driver1.findElement(By.id("buscadores-volver"));
		String botonVolverText = botonVolver.getText();
		assertEquals("Volver", botonVolverText);
	}

	@Test
	void testNavegarBuscadoresNavegarVolver() {
		driver1.get("http://localhost:3000/");

		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();

		// Esperar a que el elemento con id "page-buscadores" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-buscadores")));

		WebElement botonVolver = driver1.findElement(By.id("buscadores-volver"));
		botonVolver.click();

		// Esperar a que el elemento con id "page-enlaces" esté presente en la página
		wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-enlaces")));

		WebElement indexCorrecto = driver1.findElement(By.id("page-enlaces"));
		String textoLogin = indexCorrecto.getText();
		assertEquals("Enlaces favoritos", textoLogin);
	}

	@Test
	void testNavegarRedesTitulo() {
		driver1.get("http://localhost:3000/");

		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		// Esperar a que el elemento con id "page-redes" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement paginaRedes = driver1.findElement(By.id("page-redes"));
		String buscadoresPageRedes = paginaRedes.getText();
		assertEquals("Redes Sociales", buscadoresPageRedes);

	}

	@Test
	void testNavegarRedesInstagram() {
		driver1.get("http://localhost:3000/");

		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		// Esperar a que el elemento con id "page-redes" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement enlaceInstagram = driver1.findElement(By.id("instagram"));
		// enlaceInstagram.click();
		String enlaceInstagramText = enlaceInstagram.getText();
		assertEquals("Instagram", enlaceInstagramText);
	}

	@Test
	void testNavegarRedesTiktok() {
		driver1.get("http://localhost:3000/");

		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		// Esperar a que el elemento con id "page-redes" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement enlaceTikTok = driver1.findElement(By.id("tiktok"));
		// enlaceTikTok.click();
		String enlaceTikTokText = enlaceTikTok.getText();
		assertEquals("TikTok", enlaceTikTokText);
	}

	@Test
	void testNavegarRedesFacebook() {
		driver1.get("http://localhost:3000/");

		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		// Esperar a que el elemento con id "page-redes" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement enlaceFacebook = driver1.findElement(By.id("facebook"));
		// enlaceFacebook.click();
		String enlaceFacebookText = enlaceFacebook.getText();
		assertEquals("Facebook", enlaceFacebookText);
	}

	@Test
	void testNavegarRedesTextoVolver() {
		driver1.get("http://localhost:3000/");

		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		// Esperar a que el elemento con id "page-redes" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement botonVolver = driver1.findElement(By.id("redes-volver"));
		String botonVolverText = botonVolver.getText();
		assertEquals("Volver", botonVolverText);
	}

	@Test
	void testNavegarRedesNavegarVolver() {
		driver1.get("http://localhost:3000/");

		WebElement redes = driver1.findElement(By.id("redes"));
		redes.click();

		// Esperar a que el elemento con id "page-redes" esté presente en la página
		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-redes")));

		WebElement botonVolver = driver1.findElement(By.id("redes-volver"));
		botonVolver.click();

		// Esperar a que el elemento con id "page-enlaces" esté presente en la página
		wait = new WebDriverWait(driver1, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-enlaces")));

		WebElement indexCorrecto = driver1.findElement(By.id("page-enlaces"));
		String textoLogin = indexCorrecto.getText();
		assertEquals("Enlaces favoritos", textoLogin);
	}

}
