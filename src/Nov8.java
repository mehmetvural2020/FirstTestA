import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nov8 {
	public static void main(String[] args) throws InterruptedException {

//	System.setProperty("webdriver.chrome.driver", "/Users/Apple/eclipse-workspace/webdriver/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://codingbook.org/");
	
//	WebElement element = driver.findElement(By.xpath("//div[@class='gb_ke gb_i gb_Ig gb_yg']/div[@class='gb_h gb_i'][1]/a"));
//	element.click();
	
	WebElement element1 = driver.findElement(By.xpath("//*[contains(@title, 'enroll')]"));
	element1.click();
	
	Thread.sleep(4000);
	
	driver.close();
	System.out.print("Test Successfully complated..");
	}
}
