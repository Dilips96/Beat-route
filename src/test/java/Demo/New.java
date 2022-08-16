package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class New {


	private static Object selenium;

	static{

		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();


		driver.manage().window().maximize(); //// To Maximize the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.get("http://beatroute-admin-dev.s3-website.ap-south-1.amazonaws.com/");

		//driver.get("https://devstaging.lawyerwangu.com/"); // to get the Current URL

		driver.get("http://65.0.235.139:3000/");


		//driver.navigate().to("http://65.0.235.139:3000/"); // With out using get method --> Using Navigation

		String Title = driver.getTitle();  
		// To get the title of the website


		// print the title of the console
		System.out.println(Title);


		//driver.findElement(By.xpath("//a[text()='Log In']")).click();  // For Click Function

		driver.findElement(By.xpath("(//button[text()=\"Sign in\"])[1]")).click();


		driver.findElement(By.xpath("//input[@placeholder=\"Enter phone number\"]")).sendKeys("7978006295");



		driver.findElement(By.xpath("(//button[text()=\"Send OTP\"])")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder=\"Enter OTP\"]")).sendKeys("222313");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()=\"Verify OTP\"]")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class=\"custom-btn custom-white btn btn-default\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()=\"Choose file\"]")).click();



		Robot rb = new Robot();

		// copying File path to Clipboard
		StringSelection str = new StringSelection("/home/active35/Desktop/Music beats/128_ScuddDrum_01_96_SP.wav");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Track Title\"]")).sendKeys("July 11");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Tell us about your process and how you arrived at this track.\"]")).sendKeys("This is For the Automation Script");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter BPM\"]")).sendKeys("140");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class=\"custom-btn custom-primary btn btn-primary\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div[class=\"css-151xaom-placeholder custom-select__placeholder\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text() =\"select genres\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text() =\"AA\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class=\"css-1hwfws3 custom-select__value-container custom-select__value-container--is-multi\"]")).click();
		Thread.sleep(3000);
		
		  WebElement textField =  driver.findElement(By.xpath("//div[text () = \"select tags\"]"));  // 
		  
	       Actions a = new Actions(driver) ;
	       a.sendKeys(textField, "##aot").click().perform();
	       
	  
	  
	       
	   // driver.findElement(By.xpath("//div[text () = \"select tags\"]")).sendKeys("##aot");
	    Thread.sleep(2000);
		
		
		driver.quit();
		

	}
	}

