import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {
	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", "/Users/Apple/eclipse-workspace/webdriver/chromedriver");
//	    System.setProperty("webdriver.gecko.driver","/Users/Apple/eclipse-workspace/webdriver/geckodriver");
//		System.setProperty("webdriver.gecko.driver","/Users/Apple/eclipse-workspace/webdriver/geckodriver");

//	    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	    
//	    mvn test -Dwebdriver.gecko.driver=/path/to/geckodriver

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
//		WebDriver driver1 = new FirefoxDriver();
//		driver1.get("https://www.youtube.com");
		
//		WebDriver driver2 = new SafariDriver();
//		driver2.get("https://google.com");
		
//		This is sending String " " to webdriver or xpath...
		WebElement element = driver.findElement(By.xpath("//input[@name=\"q\"]"));
//		WebElement element = driver.findElement(By.xpath("//input[@name=\"q\" and @title=\"Search\"]"));
		element.sendKeys("Coding Book"); 
		element.submit();
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element.click();
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//		driver.navigate().refresh();
		
//		driver.quit();
//		driver.close();
		
//		WebElement searchButton = driver.findElement(By.xpath("//input[@name=\"btnK\" and @type=\"submit\"]"));
//		searchButton.click();
		
				

		
		
//		XPath samples : 
		
//		//input[@class="gLFyf gsfi"]
//		//input[@class="RNmpXc"]
//		/html/body/organization[@id="org1"]
	}

}
