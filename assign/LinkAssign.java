package week2.day2.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAssign {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver linkAssign = new ChromeDriver();
		linkAssign.get("https://www.leafground.com/link.xhtml");
		
		linkAssign.manage().window().maximize();
		
		linkAssign.findElement(By.linkText("Go to Dashboard")).click();
		Thread.sleep(600);
		linkAssign.get("https://www.leafground.com/link.xhtml");
		
		/*
		 * Don't know the Find the URL without clicking me.
		 * 
		 * WebElement url =
		 * linkAssign.findElement(By.linkText("Find the URL without clicking me."));
		 * 
		 * String current=
		 */
		 
			}

}
