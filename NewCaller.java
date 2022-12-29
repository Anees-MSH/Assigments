package week5Day2Assign2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class NewCaller {

	public static void main(String[] args) {

	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://dev107915.service-now.com/navpage.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				  
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("z0nXj/FU8Hj*");
	driver.findElement(By.id("sysverb_login")).click();
				  
	Shadow shadow = new Shadow(driver);
	
	shadow.setImplicitWait(30);
	shadow.findElementByXPath("//div[text()='All']").click();
	WebElement filterNav = shadow.findElementByXPath("//input[@id='filter']");
	filterNav.sendKeys("Callers");
	filterNav.sendKeys(Keys.ENTER);
	
	shadow.findElementByXPath("//span[text()='Callers']").click();
				 
	WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	
	driver.switchTo().frame(frame);   		 
	driver.findElement(By.xpath("//button[text()='New']")).click();
				 
	driver.findElement(By.id("sys_user.first_name")).sendKeys("Anees");
	driver.findElement(By.id("sys_user.last_name")).sendKeys("MSH");
	driver.findElement(By.id("sys_user.email")).sendKeys("anees@tester.com");
	driver.findElement(By.id("sys_user.phone")).sendKeys("914312435675");
	driver.findElement(By.id("sys_user.mobile_phone")).sendKeys("1234567890");
	driver.findElement(By.id("sys_user.title")).sendKeys("Test Lead");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
				 
	WebElement findElement = driver.findElement(By.xpath("//select[@role='listbox']"));
	Select searchEngine = new Select(findElement);	
	searchEngine.selectByIndex(2);
				
	WebElement findElement2 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
    findElement2.sendKeys("Anees");
	findElement2.sendKeys(Keys.ENTER);
				 
	}

}
