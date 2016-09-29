package testNGSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FindElements {
	WebDriver driver;
	@BeforeClass
	public void stepOne(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

  @Test
  public void firstTestCase() throws InterruptedException {
	  driver.findElement(By.id("gs_htif0")).sendKeys("Google Advanced Search");
	  driver.findElement(By.id("gs_htif0")).submit();
	  driver.findElement(By.linkText("Google Advanced Search")).click();
	  Thread.sleep(3000);
	  List<WebElement> element=driver.findElements(By.id("_dKg"));
	  int i=1;
	  for (WebElement eachElement : element) {
		  eachElement.sendKeys("Text" +i);
		  i++;
		
	}
  }
}
