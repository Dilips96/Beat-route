package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Purchase {
	
	static{

		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver");
		
	}



	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text() = \"Profile\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-reactid=\"865\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class=\"form-control mobileNumberInput\"]")).sendKeys("7978006295");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class=\"submitBottomOption\"]")).click();
		Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("/html/body/div/nav/div/div[1]/div[1]/img")).click();
	//	Thread.sleep(2000);

	}

}
