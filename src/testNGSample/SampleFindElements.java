package testNGSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleFindElements {
	WebDriver driver;
	@BeforeClass
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void mainMethod() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.id("gs_htif0")).sendKeys("Google Advanced Search");
		driver.findElement(By.id("gs_htif0")).submit();
		driver.findElement(By.linkText("Google Advanced Search")).click();
		List<WebElement> element=driver.findElements(By.id("_dKg"));
		int i=1;
		for (WebElement eachElement : element) {
			eachElement.sendKeys("Test"+i);
			i++;
		}
			
		}
	/*@AfterTest
	public void tearDown(){
		driver.close();
	}*/

}
