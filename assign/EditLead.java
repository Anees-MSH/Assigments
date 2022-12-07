package week2.day2.assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver editLead = new ChromeDriver();
		
		editLead.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
					editLead.get("http://leaftaps.com/opentaps/control/main");
					
					editLead.findElement(By.id("username")).sendKeys("DemoCSR");
					  
					editLead.findElement(By.id("password")).sendKeys("crmsfa");
						
					editLead.findElement(By.className("decorativeSubmit")).click();
						
					editLead.findElement(By.linkText("CRM/SFA")).click();
					
					editLead.findElement(By.linkText("Leads")).click();
					
					editLead.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
					
					editLead.findElement(By.xpath("(//input[@name=\"firstName\"])[3]")).sendKeys("Anees");
					
					editLead.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
					Thread.sleep(3000);
		            editLead.findElement(By.xpath("(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]//a)[1]")).click();
		            
		String title = editLead.getTitle();
					System.out.println(title);  
					
					editLead.findElement(By.linkText("Edit")).click();
					
					editLead.findElement(By.id("updateLeadForm_companyName")).clear();
					
					editLead.findElement(By.id("updateLeadForm_companyName")).sendKeys("Apex Testing Co");
					
					editLead.findElement(By.xpath("(//input[@class=\"smallSubmit\"])[1]")).click();
					
					// Confirm the changed name appears
					
					editLead.close();
		            
		            	
			}

}
