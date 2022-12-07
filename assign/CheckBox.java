package week2.day2.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver checkBox = new ChromeDriver();
		checkBox.get("https://www.leafground.com/checkbox.xhtml");
		
		checkBox.manage().window().maximize();
		
		checkBox.findElement(By.id("j_idt87:j_idt89")).click();
		
		checkBox.findElement(By.id("j_idt87:j_idt91")).click();
		Thread.sleep(900);
		checkBox.findElement(By.id("j_idt87:j_idt91")).click();
		Thread.sleep(600);
		checkBox.findElement(By.id("j_idt87:j_idt91")).click();
		
		checkBox.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]")).click();
		Thread.sleep(500);
		checkBox.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[3]")).click();
		//state=1
		checkBox.findElement(By.id("j_idt87:ajaxTriState")).click();
		//state=2
		Thread.sleep(700);
		checkBox.findElement(By.id("j_idt87:ajaxTriState")).click();
		//state=0
		Thread.sleep(600);
		checkBox.findElement(By.id("j_idt87:ajaxTriState")).click();
		
		checkBox.findElement(By.id("j_idt87:j_idt100")).click();
		Thread.sleep(600);
		checkBox.findElement(By.id("j_idt87:j_idt100")).click();
		
		WebElement btn = checkBox.findElement(By.id("j_idt87:j_idt102_input"));
				boolean isDisabled =btn.isEnabled();
					System.out.println(isDisabled);
					
		checkBox.findElement(By.id("j_idt87:multiple")).click();

		checkBox.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[8]")).click();
		Thread.sleep(400);
		
		checkBox.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[9]")).click();
		Thread.sleep(400);
		
		checkBox.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[10]")).click();
		Thread.sleep(400);
		
		checkBox.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[11]")).click();
		Thread.sleep(400);
		
		checkBox.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[12]")).click();
		
		checkBox.findElement(By.id("j_idt87:multiple")).click();
		

	}

}
