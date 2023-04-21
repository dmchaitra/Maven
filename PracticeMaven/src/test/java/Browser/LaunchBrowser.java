package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {
	@Test
	public void method (){
		String Browser=System.getProperty("browser");
		String URL=System.getProperty("url");
	
System.out.println("Browser");
System.out.println("URL");
WebDriver driver;
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get(URL);
}
}
