package testNGSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderSample {
	WebDriver driver;
	@BeforeClass
	public void beforeClass(){
		driver=new FirefoxDriver();
		driver.get("http://sundaykart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='popUpDiv']/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='login']/h3")).click();
		
	}
  @Test(dataProvider="dataProvide")
  public void firstTestCase(String uName,String uPwd) throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.id("username")).sendKeys(uName);
	  driver.findElement(By.id("password")).sendKeys(uPwd);
	  driver.findElement(By.id("login_btn")).click();
	 
  }
  @DataProvider
  public Object[][] dataProvide(){
	  String data[][]=new String[2][2];
	  data[0][0]="saihari521@gmail.com";
	  data[0][1]="demo";
	  data[1][0]="chandisunill.g@gmail.com";
	  data[1][1]="sundaykart";
      return data;
	  
  }
  
  
}
