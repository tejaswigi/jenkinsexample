package jenkinswithmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample
{
	@Test
	public void m1() 
	{

		 String BROWSER=System.getProperty("browser");

		 String URL=System.getProperty("url");
		 System.out.println(BROWSER);
		 System.out.println(URL);


}
}