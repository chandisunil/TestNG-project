package testNGSample;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo {
	public class Listener implements ITestListener,ISuiteListener,IInvokedMethodListener{
         WebDriver driver;
		@Override
		public void onTestStart(ITestResult result) {
			// this method is for execute before the main test starts
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			// this method is for only when the test is passed
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			// this method is for the test is fails
			 if (!result.isSuccess()) {
				 File imageFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String failureImageFileName = result.getMethod().getMethodName()+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime())
				                + ".png";
				        File failureImageFile = new File(System.getProperty("user.dir")+"\\screenshots\\"+failureImageFileName);
				 try {
					FileUtils.copyFile(imageFile, failureImageFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				    }
			
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			// This method is for the test skips
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStart(ITestContext context) {
			// This method is for the before the test starts
			
		}

		@Override
		public void onFinish(ITestContext context) {
			// This method is for the after the test case is finished 
			
		}

		@Override
		public void onStart(ISuite suite) {
			// This method executed before the suite starts
			
		}

		@Override
		public void onFinish(ISuite suite) {
			// This method executes the after the suite is finished
			
		}

		@Override
		public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
			// This method executes the before every method of @before @after @test invocation
			
		}

		@Override
		public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
			// This method executes the before every method of @before @after @test invocation
			
		}

}
}