package week2.day2.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver deleteLead = new ChromeDriver();
		
		deleteLead.get("http://leaftaps.com/opentaps/control/main");
		
		deleteLead.findElement(By.id("username")).sendKeys("DemoCSR");
		  
		deleteLead.findElement(By.id("password")).sendKeys("crmsfa");
			
		deleteLead.findElement(By.className("decorativeSubmit")).click();
			
		deleteLead.findElement(By.linkText("CRM/SFA")).click();
		
		deleteLead.findElement(By.linkText("Leads")).click();
		
		deleteLead.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
		
		deleteLead.findElement(By.xpath("(//span[@class=\"x-tab-strip-text \"])[2]")).click();
		
		deleteLead.findElement(By.xpath("//input[@name=\"phoneCountryCode\"]")).clear();
		
		deleteLead.findElement(By.xpath("//input[@name=\"phoneCountryCode\"]")).sendKeys("91");
		
		deleteLead.findElement(By.xpath("//input[@name=\"phoneAreaCode\"]")).sendKeys("431");
		
		deleteLead.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("2435678");
		
		deleteLead.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		Thread.sleep(2000);
		deleteLead.findElement(By.xpath("(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]//a)[1]")).click();
		
		deleteLead.findElement(By.className("subMenuButtonDangerous")).click();
		
		deleteLead.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
		
		deleteLead.findElement(By.className("x-form-text x-form-field")).sendKeys("166370");
		
		deleteLead.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
		
		deleteLead.close();
		
		
			}

}
