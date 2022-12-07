package week2.day2.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf {

	public static void main(String[] args) {
		
		ChromeDriver testLeaf = new ChromeDriver();
		testLeaf.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		
		//Type your name
		  testLeaf.findElement(By.xpath("//input[@placeholder=\"Babu Manickam\"]")).sendKeys("Anees");
		  
		  //Append Country to this City.
		  testLeaf.findElement(By.xpath("//input[@value=\"Chennai\"]")).sendKeys("-India");
		  
		  //Verify if text box is disabled 
		  WebElement ed = testLeaf.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div")); 
		  boolean editable = ed.isEnabled(); //y answer is true .its disabled answer shd be false 
		  System.out.println(editable);
		 
		//Clear the typed text.
					testLeaf.findElement(By.id("j_idt88:j_idt95")).clear();
		//Retrieve the typed text.
		  WebElement attr = testLeaf.findElement(By.xpath("//input[@value=\"My learning is superb so far.\"]")); 
		  String result = attr.getAttribute("value"); 
		  System.out.println(result);
		 
				// Type email and Tab. Confirm control moved to next element
				testLeaf.findElement(By.xpath("//input[@placeholder=\"Your email and tab\"]")).sendKeys("mshanees@gmail.com");
				
			testLeaf.findElement(By.xpath("//input[@placeholder=\"Your email and tab\"]")).sendKeys(Keys.TAB);
				
				//Type about yourself
			testLeaf.findElement(By.xpath("//textarea[@placeholder=\"About yourself\"]")).sendKeys("The textarea is typed using Selenium Java");	
				//Just Press Enter and confirm error message*
			testLeaf.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);//Error Message:Age is mandatory
				//Click and Confirm Label Position Changes
				testLeaf.findElement(By.id("j_idt106:float-input")).click(); //Confirmed Label Position Changes
				
				//Type your name and choose the third option
		//		testLeaf.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("Anees");
				
				/*
				 * WebElement option
				 * =testLeaf.findElement(By.id("j_idt106:auto-complete_hinput")); Select opt =
				 * new Select(option); opt.selectByIndex(2);
				 */
				
		//		testLeaf.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("02/23/1982");
				
		//		testLeaf.findElement(By.id("j_idt106:j_idt116_input")).sendKeys(Keys.ENTER);
		//		testLeaf.findElement(By.name("23")).sendKeys(Keys.ENTER);
				
				testLeaf.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("55");
				
				testLeaf.findElement(By.xpath("//*[@id=\"j_idt106:j_idt118\"]/a[1]/span/span")).click();
				
				testLeaf.findElement(By.xpath("//*[@id=\"j_idt106:j_idt118\"]/a[2]/span")).click();
								
				testLeaf.findElement(By.id("j_idt106:slider")).sendKeys("75");
				
				testLeaf.findElement(By.id("j_idt106:j_idt122")).click();
					
				
	}

}
