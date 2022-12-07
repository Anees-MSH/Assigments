package week2.day1.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
			ChromeDriver createLead = new ChromeDriver();
			createLead.get("http://leaftaps.com/opentaps/control/login");
		
			
			  createLead.findElement(By.id("username")).sendKeys("DemoCSR");
			  
			  createLead.findElement(By.id("password")).sendKeys("crmsfa");
			  
			  createLead.findElement(By.className("decorativeSubmit")).click();
			  
			  createLead.findElement(By.linkText("CRM/SFA")).click();
			  
			  createLead.findElement(By.linkText("Leads")).click();
			  
			  createLead.findElement(By.linkText("Create Lead")).click();
			  
			  createLead.findElement(By.id("createLeadForm_companyName")).
			  sendKeys("Apex Company");
			  
			  createLead.findElement(By.id("createLeadForm_firstName")).sendKeys("Anees");
			  
			  createLead.findElement(By.id("createLeadForm_lastName")).sendKeys("MSH");
			  
			  createLead.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(
			  "Hello");
			  
			  createLead.findElement(By.name("departmentName")).
			  sendKeys("Automation Testing Department");
			  
			  createLead.findElement(By.xpath("//textarea[@name=\"description\"]")).
			  sendKeys("This Description is written by xpath locators");
			  
			  createLead.findElement(By.xpath(
			  "//input[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("apex@apex.com");
			  
			  createLead.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
			  
			  createLead.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
			  
			  createLead.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("431");
			  
			  createLead.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2435678");
			  
			  createLead.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
			 
			
			String title = createLead.getTitle();
			System.out.println(title);
			
		

	}

}
