package week5Day2Assign2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;
public class OrderingMobile {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
		
	driver.get("https://dev107915.service-now.com/navpage.do");
	driver.manage().window().maximize();
			
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("z0nXj/FU8Hj*");
	driver.findElement(By.id("sysverb_login")).click();
			
	Shadow shadow = new Shadow(driver);
		  
	shadow.setImplicitWait(30);
	shadow.findElementByXPath("//div[text()='All']").click();
	shadow.setImplicitWait(10);
	shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		  
	Thread.sleep(500);
		 
	WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		  
    driver.switchTo().frame(frame);
		  
	driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		  
	driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
		  
    driver.switchTo().defaultContent();
			  
    driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//label[text()='No']")).click();
			  
	WebElement findElement = driver.findElement(By.xpath("//select[contains(@class,'form-control cat_item_option')]"));
	Select dataAllow = new Select(findElement); 
	dataAllow.selectByIndex(2);
			  
	driver.findElement(By.xpath("//label[text()='Midnight']")).click();
		  
	driver.findElement(By.xpath("//button[contains(text(),'Order Now')]")).click();
    driver.switchTo().defaultContent();
		  
    driver.switchTo().frame(frame);
	WebElement findElement2 = driver.findElement(By.id("requesturl"));
 
    System.out.println(findElement2.getText()); 
		 	
	}

}
