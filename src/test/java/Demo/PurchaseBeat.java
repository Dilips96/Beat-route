package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PurchaseBeat 
{
	static
	{

		System.setProperty("webdriver.chrome.driver", "/home/active35/Downloads/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/home/active35/Downloads/geckodriver");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://65.0.235.139:3000/search");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[text()=\"Sign in\"])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter phone number\"]")).sendKeys("7855040693");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text() = \"Send OTP\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter OTP\"]")).sendKeys("45465");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class=\"custom-btn custom-primary btn btn-primary\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@src=\"data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI4MSIgaGVpZ2h0PSIzMiIgdmlld0JveD0iMCAwIDgxIDMyIj4KICAgIDxnIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+CiAgICAgICAgPGc+CiAgICAgICAgICAgIDxnPgogICAgICAgICAgICAgICAgPHBhdGggZD0iTTAgMEgxMDAuOTA5VjUwSDB6IiB0cmFuc2Zvcm09InRyYW5zbGF0ZSgtMTc0IC00OSkgdHJhbnNsYXRlKDE2NSA0MCkiLz4KICAgICAgICAgICAgICAgIDxnIGZpbGwtcnVsZT0ibm9uemVybyI+CiAgICAgICAgICAgICAgICAgICAgPGcgZmlsbD0iI0NFMzgwMCI+CiAgICAgICAgICAgICAgICAgICAgICAgIDxwYXRoIGQ9Ik00LjQyOCAwQzEuOTgzIDAgMCAyLjAxNSAwIDQuNDk5YzAgMi40ODQgMS45ODMgNC40OTggNC40MjggNC40OTggMi40NDYgMCA0LjQyOC0yLjAxNCA0LjQyOC00LjQ5OCAwLTIuNDg0LTEuOTgyLTQuNDk3LTQuNDI4LTQuNDk3IiB0cmFuc2Zvcm09InRyYW5zbGF0ZSgtMTc0IC00OSkgdHJhbnNsYXRlKDE2NSA0MCkgdHJhbnNsYXRlKDkuMDkgOS4wOSkgbWF0cml4KDAgMSAxIDAgNy4wMTcgMTUuNTMpIi8+CiAgICAgICAgICAgICAgICAgICAgPC9nPgogICAgICAgICAgICAgICAgICAgIDxnIGZpbGw9IiNGRkYiPgogICAgICAgICAgICAgICAgICAgICAgICA8cGF0aCBkPSJNLjk4NCAwQy40NDEgMCAwIC40NDggMCAxcy40NC45OTkuOTg0Ljk5OS45ODQtLjQ0Ny45ODQtMUMxLjk2OC40NDkgMS41MjggMCAuOTg0IDAiIHRyYW5zZm9ybT0idHJhbnNsYXRlKC0xNzQgLTQ5KSB0cmFuc2xhdGUoMTY1IDQwKSB0cmFuc2xhdGUoOS4wOSA5LjA5KSBtYXRyaXgoMCAxIDEgMCAxMC41MTUgMTguOTc0KSIvPgogICAgICAgICAgICAgICAgICAgIDwvZz4KICAgICAgICAgICAgICAgICAgICA8ZyBmaWxsPSIjRkZGIj4KICAgICAgICAgICAgICAgICAgICAgICAgPHBhdGggZD0iTTExLjUwNSAxNS40NTVjMi40NDUgMCA0LjQyOCAyLjAxNCA0LjQyOCA0LjQ5OCAwIDIuNDg0LTEuOTgzIDQuNDk3LTQuNDI4IDQuNDk3LTIuNDQ2IDAtNC40MjgtMi4wMTMtNC40MjgtNC40OTdzMS45ODItNC40OTggNC40MjgtNC40OThtMC03LjE3M2MtMS41NzQgMC0zLjA3My4zMjItNC40MzguOTA0Vi4wMTZINS4yNjJ2MTkuOTM3YzAgMy41MDEgMi43OTUgNi4zNCA2LjI0MyA2LjM0IDMuNDQ3IDAgNi4yNDItMi44MzkgNi4yNDItNi4zNCAwLTMuNTAyLTIuNzk1LTYuMzQtNi4yNDItNi4zNC0xLjczNyAwLTMuMzA3LjcyLTQuNDM4IDEuODgzdi0xLjEyYzEuMjEyLS45OTggMi43NTYtMS41OTYgNC40MzgtMS41OTYgMy45IDAgNy4wNjIgMy4yMTIgNy4wNjIgNy4xNzNzLTMuMTYyIDcuMTczLTcuMDYyIDcuMTczYy0zLjkgMC03LjA2Mi0zLjIxMi03LjA2Mi03LjE3M1YuMDE1SDIuNjM3djE5LjkzOGMwIDQuOTczIDMuOTcgOS4wMDUgOC44NjcgOS4wMDVzOC44NjYtNC4wMzIgOC44NjYtOS4wMDVjMC00Ljk3My0zLjk3LTkuMDA1LTguODY2LTkuMDA1LTEuNjE4IDAtMy4xMzMuNDQyLTQuNDM4IDEuMjF2LS45NDljMS4zMy0uNjk4IDIuODM4LTEuMDk0IDQuNDM4LTEuMDk0IDUuMzUgMCA5LjY4NiA0LjQwNSA5LjY4NiA5LjgzOCAwIDUuNDMzLTQuMzM3IDkuODM4LTkuNjg2IDkuODM4LTUuMzUgMC05LjY4Ny00LjQwNS05LjY4Ny05LjgzOFYuMDE1SC4wMTR2MTkuOTM4YzAgNi40NDUgNS4xNDUgMTEuNjcgMTEuNDkgMTEuNjcgNi4zNDcgMCAxMS40OTEtNS4yMjUgMTEuNDkxLTExLjY3cy01LjE0NC0xMS42Ny0xMS40OS0xMS42NyIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoLTE3NCAtNDkpIHRyYW5zbGF0ZSgxNjUgNDApIHRyYW5zbGF0ZSg5LjA5IDkuMDkpIHRyYW5zbGF0ZSguMDEzIC4wMDIpIi8+CiAgICAgICAgICAgICAgICAgICAgPC9nPgogICAgICAgICAgICAgICAgPC9nPgogICAgICAgICAgICAgICAgPGc+CiAgICAgICAgICAgICAgICAgICAgPHBhdGggZmlsbD0iI0ZGRiIgZmlsbC1ydWxlPSJub256ZXJvIiBkPSJNNC4xOTQgNy45OWgxLjIxMWMuNTM2IDAgLjgwNC0uMjMzLjgwNC0uNzAyIDAtLjQzNS0uMjY4LS42NTMtLjgwNC0uNjUzSDQuMTk0djEuMzU2em0wLTMuODA0aDEuMjExYy41MzYgMCAuODA0LS4yMzQuODA0LS43MDIgMC0uNDM1LS4yNjgtLjY1My0uODA0LS42NTNINC4xOTR2MS4zNTV6TS4wOTYgMTAuNjY4Vi4xNTNoNi4zOThjMS4xMDUgMCAxLjk2Mi4yNTYgMi41Ny43NjcuNjA5LjUxMi45MTMgMS4yNDcuOTEzIDIuMjA1IDAgLjUyMy0uMDkyLjk2OS0uMjc2IDEuMzM5LS4xODUuMzctLjQyNy42NjQtLjcyOC44ODEuNDIzLjE5Ni43NTguNDUgMS4wMDQuNzZzLjM2OS43Ny4zNjkgMS4zOGMwIC45OS0uMzMzIDEuNzY4LS45OTcgMi4zMzUtLjY2NC41NjYtMS41OTQuODQ4LTIuNzg4Ljg0OEguMDk2em0xMS4xNyAwVi4xNTNoOC42MjV2Mi44NDFIMTUuMzJ2Ljk0N2gzLjYxM3YyLjk0SDE1LjMydi45NDZoNC41NzJ2Mi44NDFoLTguNjI1em0xNC43MjItNC42NTNoMS42NDFsLS44Mi0yLjAwOC0uODIgMi4wMDh6bS01LjQyNiA0LjY1NEwyNC43MTUuMTUzaDQuMjA0bDQuMTUzIDEwLjUxNmgtNC4yMmwtLjc3LTEuOTZoLTIuNTNsLS43NyAxLjk2aC00LjIyem0xNC4wODMgMFYyLjk5M0gzMS45Vi4xNTNoOS41NDZ2Mi44NDFoLTIuNzQ3djcuNjc0aC00LjA1M3pNNC4xOSAxNi4zOTZoLjk5OGMuNjY2IDAgLjk5OC0uMjcyLjk5OC0uODE2IDAtLjMwNC0uMDc2LS41MjMtLjIyOC0uNjUzLS4xNTItLjEzLS4zODYtLjE5Ni0uNzAyLS4xOTZINC4xODl2MS42NjV6TS4wOTYgMjIuMTYxVjExLjY0Nkg2LjIyYy45MzYgMCAxLjcwOC4xNzEgMi4zMTcuNTE0LjYxLjM0MyAxLjA2My44MTEgMS4zNjIgMS40MDQuMjk4LjU5NC40NDggMS4yNjYuNDQ4IDIuMDE3IDAgLjcwOC0uMTkgMS4zMjgtLjU2NyAxLjg2MS0uMzc4LjUzNC0uODMxLjk3NC0xLjM2MSAxLjMyMy4xMjQuMDc3LjIyLjE2LjI4Ny4yNTMuMDY4LjA5Mi4xMjQuMTg4LjE3LjI4NWwxLjI4NSAyLjg1OEg1Ljg5OGwtMS4wNjYtMi4zMzRjLS4wNTYtLjEzMS0uMTE4LS4yMjEtLjE4Ni0uMjctLjA2OC0uMDUtLjE2My0uMDc0LS4yODgtLjA3NEg0LjE5djIuNjc4SC4wOTZ6bTE2LjUwNy0zLjE4NGMuNTkxIDAgMS4wMTMtLjE1NSAxLjI2NC0uNDY1LjI1MS0uMzEuMzc3LS44NDYuMzc3LTEuNjA5IDAtLjc2MS0uMTI2LTEuMjk4LS4zNzctMS42MDgtLjI1MS0uMzEtLjY3My0uNDY1LTEuMjY0LS40NjUtLjU5MiAwLTEuMDE0LjE1NS0xLjI2NS40NjUtLjI1LjMxLS4zNzcuODQ3LS4zNzcgMS42MDggMCAuNzYzLjEyNiAxLjI5OS4zNzcgMS42MDkuMjUxLjMxLjY3My40NjUgMS4yNjUuNDY1em0wIDMuMzQ4Yy0xLjIxNyAwLTIuMjU2LS4xNzctMy4xMTUtLjUzMS0uODYtLjM1NC0xLjUxOS0uOTI4LTEuOTc2LTEuNzIzLS40NTgtLjc5NC0uNjg3LTEuODUtLjY4Ny0zLjE2OCAwLTEuMzI4LjIyOS0yLjM4Ni42ODctMy4xNzUuNDU3LS43OSAxLjExNi0xLjM2IDEuOTc2LTEuNzE1Ljg2LS4zNTMgMS44OTgtLjUzIDMuMTE1LS41MyAxLjIxNyAwIDIuMjU1LjE3NyAzLjExNS41My44Ni4zNTQgMS41MTguOTI2IDEuOTc2IDEuNzE1LjQ1Ny43OS42ODYgMS44NDcuNjg2IDMuMTc1IDAgMS4zMTgtLjIyOSAyLjM3NC0uNjg2IDMuMTY4LS40NTguNzk1LTEuMTE3IDEuMzctMS45NzYgMS43MjMtLjg2LjM1NC0xLjg5OC41My0zLjExNS41M3ptMTEuOTMgMGMtMS4wMTcgMC0xLjkzMi0uMTY0LTIuNzQ3LS40OS0uODE1LS4zMjctMS40Ni0uODExLTEuOTM1LTEuNDUzLS40NzQtLjY0My0uNzExLTEuNDMyLS43MTEtMi4zNjh2LTYuMzY4aDQuMDUzdjUuODYyYzAgLjk4LjQ0NiAxLjQ3IDEuMzQgMS40Ny44OTMgMCAxLjM0LS40OSAxLjM0LTEuNDd2LTUuODYyaDQuMDUydjYuMzY4YzAgLjkzNi0uMjM3IDEuNzI1LS43MTIgMi4zNjgtLjQ3NC42NDItMS4xMiAxLjEyNi0xLjkzNCAxLjQ1My0uODE1LjMyNi0xLjczLjQ5LTIuNzQ3LjQ5em04Ljg2Ny0uMTY0di03LjY3NGgtMi43NDd2LTIuODQxaDkuNTQ2djIuODRoLTIuNzQ3djcuNjc1SDM3LjR6bTcuNTA1IDBWMTEuNjQ2aDguNjI1djIuODRoLTQuNTcydi45NDhoMy42MTN2Mi45NGgtMy42MTN2Ljk0Nmg0LjU3MnYyLjg0MWgtOC42MjV6IiB0cmFuc2Zvcm09InRyYW5zbGF0ZSgtMTc0IC00OSkgdHJhbnNsYXRlKDE2NSA0MCkgdHJhbnNsYXRlKDM2LjM2NCAxOC4xODIpIHRyYW5zbGF0ZSguMDQgLjAxKSIvPgogICAgICAgICAgICAgICAgPC9nPgogICAgICAgICAgICA8L2c+CiAgICAgICAgPC9nPgogICAgPC9nPgo8L3N2Zz4K\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[text() =\"Test Beat 24\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("//div[text()=\"select genres\"]")).click();
		Thread.sleep(3000);
		
		
	
		
		
		
		
		
	}

}