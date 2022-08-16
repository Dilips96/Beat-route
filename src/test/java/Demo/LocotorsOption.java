package Demo;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocotorsOption 
{
	private static Object selenium;

	static{

		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver");
	
	}
	

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		
		driver.findElement(By.xpath("//input[@id='search_query_top' or @id = 'search_query_top']")).sendKeys("T-shirts");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		Thread.sleep(2000);
		
		
		
		
		

	}

}
