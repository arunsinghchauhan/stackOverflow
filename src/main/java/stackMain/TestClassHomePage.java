package stackMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassHomePage {
	public WebDriver driver;
	String title;
	//TestClassHomePage home= new TestClassHomePage();
	
	@BeforeTest
	public void openBrowserInstance()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunsinghchauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void homepage()
	{
	driver.get("https://stackoverflow.com/");
	String title=driver.getTitle();
	System.out.println("Title Assertion Passed");
	Assert.assertEquals(title, "Stack Overflow - Where Developers Learn, Share, & Build Careers");
	
	}
	
	@Test
	
	public void LoginStackOverflow() throws InterruptedException
	
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		
		driver.findElement(By.xpath("//input[@class='s-input']")).sendKeys("arun.chauhan008@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Qait@123");
		
		driver.findElement(By.xpath("//button[@name='submit-button']")).click();
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		//Assert.assertEquals(URL, );
	}
}
