package testeSenaiokk;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testebuscasenaiokk {
	
	private WebDriver driver;
	
	//inicio
	@Before
	public void ConfigurarTEste() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Micro\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	
	}	
	
	
    //teste
	@Test
	
	
	public void testeNavegabilidade() 
	
	 {
		try {
			
		
		driver. get("http://localhost:4200/");
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("adriano@email.com");
		Thread.sleep(3000);
		driver.findElement(By.id("senha")).sendKeys("senhadoadriano");
		Thread.sleep(3000);
		driver.findElement(By.id("botao-enviar")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
				
	}
	
	
	//Finalização
		@After
		
		public void Fim() {
			driver.quit();
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

  }
