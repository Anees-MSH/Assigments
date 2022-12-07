package week2.day2.assign;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

		public static void main(String[] args) {
		ChromeDriver fb = new ChromeDriver();
		fb.get("https://en-gb.facebook.com/");
		
		fb.manage().window().maximize();
			
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		
		fb.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		
		fb.findElement(By.xpath("//input[@placeholder=\"First name\"]")).sendKeys("America");
		
		fb.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Russia");
		
		fb.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("1234567890");
		
		fb.findElement(By.id("password_step_input")).sendKeys("pas123567");
		
					WebElement day = fb.findElement(By.id("day"));
		
					Select dd = new Select(day);
					dd.selectByIndex(0); //date 1
					
					WebElement month = fb.findElement(By.id("month"));
					
					Select mm = new Select(month);
					mm.selectByValue("2");		// month feb
					
					WebElement year = fb.findElement(By.id("year"));
					
					Select yy = new Select(year);
					yy.selectByVisibleText("1980");	//year 1980
					
		fb.findElement(By.xpath("//input[@value=\"1\"]"	)).click();
					
				}

}
