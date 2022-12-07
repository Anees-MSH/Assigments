package week2.day1.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		
		ChromeDriver duplicateLead = new ChromeDriver();
		duplicateLead.get("http://leaftaps.com/opentaps/control/login");
		
		
				duplicateLead.findElement(By.id("username")).sendKeys("DemoCSR");
				  
				duplicateLead.findElement(By.id("password")).sendKeys("crmsfa");
			
				duplicateLead.findElement(By.className("decorativeSubmit")).click();
			
				duplicateLead.findElement(By.linkText("CRM/SFA")).click();
				  
				duplicateLead.findElement(By.linkText("Leads")).click();
			
				duplicateLead.findElement(By.linkText("Create Lead")).click();
				  
				duplicateLead.findElement(By.id("createLeadForm_companyName")).
				  sendKeys("Apex Company");
				  
				duplicateLead.findElement(By.id("createLeadForm_firstName")).sendKeys("Anees");
				  
				duplicateLead.findElement(By.id("createLeadForm_lastName")).sendKeys("MSH");
				  
				duplicateLead.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(
				  "Hello");
			
				
			    duplicateLead.findElement(By.name("departmentName")).
				  sendKeys("Automation Testing Department");
				  
				  duplicateLead.findElement(By.xpath("//textarea[@name=\"description\"]")).
				  sendKeys("This Description is written by xpath locators");
				  
				  duplicateLead.findElement(By.xpath(
				  "//input[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("apex@apex.com");
							  
				duplicateLead.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
				
				  String title = duplicateLead.getTitle(); 
				  System.out.println(title);
							
			   duplicateLead.findElement(By.xpath("//a[contains(text(),\"Duplicate Lead\")]")).click();
			
			   duplicateLead.findElement(By.id("createLeadForm_companyName")).
				  clear();
			   
			   duplicateLead.findElement(By.id("createLeadForm_companyName")).
				  sendKeys("Apex Company 2");
			
			   duplicateLead.findElement(By.id("createLeadForm_firstName")).clear();
		
			   duplicateLead.findElement(By.id("createLeadForm_firstName")).sendKeys("Anees 2");
			
			   duplicateLead.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
			
			   String title2 = duplicateLead.getTitle(); 
			   		   System.out.println(title2);
		
		
	}

}
