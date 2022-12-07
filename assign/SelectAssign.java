package week2.day2.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAssign {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver selectAssign = new ChromeDriver();
		selectAssign.get("https://www.leafground.com/select.xhtml");
		
		selectAssign.manage().window().maximize();
		
			WebElement favortTool = selectAssign.findElement(By.xpath("//select[@style=\"overflow-wrap: break-word; height: 150%;\"]"));
		
						Select tool =new Select (favortTool);
							tool.selectByIndex(1);
							
							selectAssign.findElement(By.id("j_idt87:country_label")).click();
					
							selectAssign.findElement(By.id("j_idt87:country_3")).click();
							
							Thread.sleep(1000);
							
							selectAssign.findElement(By.id("j_idt87:city_label")).click();
							
							selectAssign.findElement(By.id("j_idt87:city_2")).click();
							
							selectAssign.findElement(By.xpath("//button[contains(@class,'corner-right ui-button-icon-only')]")).click();
							
							Thread.sleep(2000);
							
							selectAssign.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
							
							selectAssign.findElement(By.id("j_idt87:lang_label")).click();							
							
							selectAssign.findElement(By.id("j_idt87:lang_2")).click();
							Thread.sleep(1000);
							selectAssign.findElement(By.id("j_idt87:value_label")).click();
						
							selectAssign.findElement(By.id("j_idt87:value_1")).click();
							
							
	}

}
