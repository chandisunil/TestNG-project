package testNGSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testNGDemo {
	WebDriver driver;
	@BeforeClass
	public void beforeClass(){
		
		    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://sundaykart.com/");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("It is executed before test case");
		
		
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("it is executed before test method");
	}
	@Test
	public void firstTestCase() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='popUpDiv']/span[1]")).click();
		Thread.sleep(5000);
	}
	
	@Test
	public void secondTestCase()
	{
		Assert.assertEquals("Ashok0", "Sunil");
	}
	/*@Test
	public void secondTestCase() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@id='login']/h3")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("saihari521@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sai");
		driver.findElement(By.id("login_btn")).click();
		
		
	}*/
	@AfterMethod
	public void afterMethod(){
		System.out.println("It is Executed After Method");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("It is executed after test");
	}
	@AfterClass
	public void afterClass(){
		driver.close();
	}
  
}
