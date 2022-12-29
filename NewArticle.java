package week5Day2Assign2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class NewArticle {

	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	// Page Launch
	driver.get("https://dev107915.service-now.com/navpage.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//Login credential			  
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("z0nXj/FU8Hj*");
	driver.findElement(By.id("sysverb_login")).click();  
	
	Shadow shadow = new Shadow(driver);			

	shadow.setImplicitWait(30);
	//Click All and filter	
	shadow.findElementByXPath("//div[text()='All']").click();
	
	WebElement  filterNav = shadow.findElementByXPath("//input[@id='filter']");
	filterNav.sendKeys("Knowledge");
	filterNav.sendKeys(Keys.ENTER);
	shadow.findElementByXPath("//span[text()='Knowledge']").click();
	            
	WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	            
    driver.switchTo().frame(frame);
   	//Click Create an Article Button
	driver.findElement(By.xpath("//span[text()='Create an Article']")).click();
	driver.switchTo().defaultContent();
   
    driver.switchTo().frame(frame);
    // Click the knowledge Base Button
    driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_knowledge_base']")).click();
    driver.switchTo().defaultContent();
    
    Set<String> windowHandles = driver.getWindowHandles();
    List <String> handles =new ArrayList<String>(windowHandles);
    driver.switchTo().window(handles.get(1));
	// Click IT from the knowledge base category            
	driver.findElement(By.xpath("//tbody[@class='list2_body']/tr/td/a[text()='IT']")).click();
	System.out.println(handles.size());
	driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_category']")).click();
	System.out.println(handles.size());
	driver.findElement(By.xpath("//span[text()='IT']']")).click(); 
	driver.findElement(By.xpath("//span[text()='Java']']")).click();
	driver.findElement(By.xpath("//button[text()='OK']")).click();
	
	WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frame1);
	// To Select Year and Month    
	            String year ="2023";
	           	String month ="April";
	           	String date = "15";
	           	
	driver.findElement(By.xpath("//a[@id='kb_knowledge.valid_to.ui_policy_sensitive']")).click();
	while (true)   
	    {
	    	String	yearMonth = driver.findElement(By.id("GwtDateTimePicker_month")).getText();
	    	String monthYear[] = yearMonth.split(" ");
	    	String mon = monthYear[0];
	    	String yr = monthYear[1];
	    	
	if(mon.equalsIgnoreCase(month) && yr.equals(year))
	    		break;
	else 
	    		driver.findElement(By.xpath("//td[@data-original-title='Next month']")).click();
	    	
	    	
	    }
	 List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='calBorder']/tbody/tr/td")) ;   	
	 // To Select Date          	
	 for (WebElement dateEle : allDates) 
	           	{
					       String dt = dateEle.getText();
					       
					       if(dt.equals(date))
					       {
					    	   dateEle.click();
					    	   break;
					       }
				}
	
   	driver.findElement(By.id("kb_knowledge.short_description")).sendKeys("Learning Java with Selenium");
	           	
   	driver.findElement(By.id("tinymce")).sendKeys("Abstract while using extends it allow us to call"
	           			+"the implemented method not the unimplemented method.");
	           	
	           	
   	driver.findElement(By.id("sysverb_insert_bottom")).click();
	           	
	}
}
