package testNGSample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("The thread id is" +Thread.currentThread().getId());
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("The Thread id in this before method is" +Thread.currentThread().getId());
	}
  @Test
  public void firstTestCase(){
	  System.out.println("The thread id of firstTest case is" +Thread.currentThread().getId());
	  
  }
  @Test
  public void secondTestCase(){
	  System.out.println("The Thread id os second Test case is" +Thread.currentThread().getId());
  }
  @AfterMethod
  public void afterMethod(){
	  System.out.println("The Thread id of after method is" +Thread.currentThread().getId());
  }
  @AfterClass
  public void afterClass(){
	  System.out.println("The Thread id of After Class is" +Thread.currentThread().getId());
  }
  
}
