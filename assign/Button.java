package week2.day2.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {

	public static void main(String[] args) {
		
		ChromeDriver button = new ChromeDriver();
				button.get("https://www.leafground.com/button.xhtml");
				button.manage().window().maximize();
		
				button.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[1]")).click();

		String title = button.getTitle();
				System.out.println(title);
				
				button.get("https://www.leafground.com/button.xhtml");

		WebElement btn = button.findElement(By.id("j_idt88:j_idt92"));
				 boolean isDisabled = btn.isEnabled();
				 System.out.println(isDisabled);                        
				 
	WebElement btn1 = button.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[3]"));
				 Point location = btn1.getLocation();
				 System.out.println(location);                          
				 
   	WebElement btn2 = button.findElement(By.id("j_idt88:j_idt96"));
				 String color = btn2.getCssValue("background");
				 System.out.println(color);        //rgb(96, 125, 139)        
				
		WebElement btn3 = button.findElement(By.id("j_idt88:j_idt98"));
				Dimension hw = btn3.getSize();
				System.out.println(hw);                                        
				
		WebElement btn4 = button.findElement(By.id("j_idt88:j_idt100"));
				Actions mousehover = new Actions(button);
				mousehover.moveToElement(btn4);
				
		WebElement btn5 = button.findElement(By.id("j_idt88:j_idt100"));
				 String colour= btn5.getCssValue("background-color");
				 System.out.println(colour);		                                
				
				
				button.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
				
				button.findElement(By.id("j_idt88:j_idt102:j_idt104")).click();  //url not working
				
				// Don't know how to do program for the How many rounded buttons are there?

		 
	}

}
