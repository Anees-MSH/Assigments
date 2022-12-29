package week5Day2Assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class NewProposal {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver =new ChromeDriver();
	// Page Launch		
	driver.get("https://dev107915.service-now.com/navpage.do");
	driver.manage().window().maximize();
	//Login credential
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("z0nXj/FU8Hj*");
	driver.findElement(By.id("sysverb_login")).click();
		
	Shadow shadow = new Shadow(driver);
	//Click All and filter		
	shadow.setImplicitWait(35);
	shadow.findElementByXPath("//div[text()='All']").click();
	WebElement change = shadow.findElementByXPath("//input[@id='filter']");
	change.sendKeys("My Proposal");
	change.sendKeys(Keys.ENTER);
	shadow.findElementByXPath("//mark[text()='My Proposal']").click();
		
	WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	//New Button in proposal page		
	driver.switchTo().frame(frame);	
	driver.findElement(By.xpath("//button[text()='New']")).click();  
	driver.switchTo().defaultContent();
	
	//Mandatory Field page
	WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frame1);	
		
	// Proposal Type
	WebElement ele = driver.findElement(By.xpath("//select[@id='std_change_proposal.proposal_type']"));
	Select proType = new Select(ele);
	proType.selectByIndex(0);
				
	// click Category
	driver.findElement(By.xpath("//button[@id='lookup.std_change_proposal.category']")).click();
	driver.switchTo().defaultContent();	//frame1 out
		
	Set<String> totalHandles = driver.getWindowHandles();
	System.out.println(totalHandles.size());
	
	List<String> handles =new ArrayList<String>(totalHandles);
	driver.switchTo().window(handles.get(1));
	
	//Click Category Page to select Hardware Asset
	driver.findElement(By.xpath("//table[@id='sc_category_table']/tbody/tr[2]/td[3]/a")).click();
	driver.switchTo().window(handles.get(0));
	
	driver.switchTo().frame(frame);
	//Click assigned To Button
	driver.findElement(By.id("lookup.std_change_proposal.assigned_to")).click();
	//driver.switchTo().defaultContent();
	
	Set<String> totalHandles1 = driver.getWindowHandles();
	System.out.println(totalHandles1.size());
	
	List<String> handles1 =new ArrayList<String>(totalHandles1);
	driver.switchTo().window(handles1.get(1));
	
	//Assigned To Table
	driver.findElement(By.xpath("//table[@id='sys_user_table']/tbody/tr[3]/td[3]//a[text()='Aqib Mushtaq']")).click();
	driver.switchTo().window(handles1.get(0));
	
	driver.switchTo().frame(frame);
	// Assigned Group button click
	driver.findElement(By.xpath("//button[@id='lookup.std_change_proposal.assignment_group']")).click();
	
	Set<String> totalHandles2 = driver.getWindowHandles();
	System.out.println(totalHandles2.size());
	
	List<String> handles2 =new ArrayList<String>(totalHandles2);
	driver.switchTo().window(handles2.get(1));
	
	driver.findElement(By.xpath("//div[@id='group_tree']//table/tbody/tr/td//a[text()='Analytics Settings Managers']")).click();
	driver.switchTo().window(handles2.get(0));
	
	driver.switchTo().frame(frame);
	//Template Name
	driver.findElement(By.xpath("//input[@id='std_change_proposal.template_name']")).sendKeys("New Proposal");
    //Short Description
	driver.findElement(By.id("std_change_proposal.short_description")).sendKeys("Week 5 Day2 Assignment2" );
    //Click Submit 
	driver.findElement(By.xpath("(//button[contains(@class,'orm_action_button header')][1])")).click();
	
	driver.close();
	}
}
