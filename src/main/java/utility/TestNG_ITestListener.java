package utility;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNG_ITestListener implements ITestListener {
	public static WebDriver driver;

	public void onTestSuccess(ITestResult result) {
		String tcname= result.getName();
		ITestListener.super.onTestSuccess(result);
		Reporter.log("TestCASE is Passed, Check Screenshots for better INFO");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewSeleniumMaven\\Screenshots\\PassScreenShots\\"+tcname+Math.random()+".png");
		try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void onTestFailure(ITestResult result) {
		String tcname= result.getName();
		ITestListener.super.onTestSuccess(result);
		Reporter.log("TestCASE is Passed, Check Screenshots for better INFO");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewSeleniumMaven\\Screenshots\\FailedScreenShots\\"+tcname+Math.random()+".png");
		try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}