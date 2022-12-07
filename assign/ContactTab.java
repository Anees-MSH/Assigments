package week2.day1.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactTab {

	public static void main(String[] args) {
		
		ChromeDriver contact = new ChromeDriver();
		contact.get("http://leaftaps.com/opentaps/control/login");
		
			contact.manage().window().maximize();
		
			contact.findElement(By.id("username")).sendKeys("DemoCSR");
					  
			contact.findElement(By.id("password")).sendKeys("crmsfa");
				
			contact.findElement(By.className("decorativeSubmit")).click();
				
			contact.findElement(By.linkText("CRM/SFA")).click();
			
			contact.findElement(By.xpath("//a[(text()=\"Contacts\")]")).click();
		
			contact.findElement(By.xpath("//a[(text()=\"Create Contact\")]")).click();
		
			contact.findElement(By.id("firstNameField")).sendKeys("Anees");
			  
			contact.findElement(By.id("lastNameField")).sendKeys("MSH");
			
			contact.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
			
			String fName = contact.findElement(By.id("viewContact_firstName_sp")).getText();
				System.out.println(fName);
				
			String title= contact.getTitle();
				System.out.println(title);
			
			
			
				
	}

}
