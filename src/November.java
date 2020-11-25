import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class November {

	public static void main( String[] args ) throws InterruptedException
    {
    	System.out.println( "Hello World!123" );
        
      System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000); 
		
		WebElement element1 = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		Thread.sleep(1000); 
		element1.sendKeys("CodingBook");
		Thread.sleep(1000); 
		element1.submit();
		
		driver.findElement(By.xpath("//cite[text()='codingbook.org']")).click();
		Thread.sleep(1000); 

		driver.findElement(By.linkText("Test Automation")).click();
		Thread.sleep(1000); 

		driver.findElement(By.xpath("//a[@data-tab=\"#tab-curriculum\"]")).click();
		Thread.sleep(1000); 
		
		//cb-ta repository
    }

}
