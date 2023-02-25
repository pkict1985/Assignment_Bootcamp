package week5.day1.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ChromeDriver driver;
	public String excelFileName;
	@Parameters({"url","username","password"})
@BeforeMethod
public void preCondition(String url, String username, String password) {
	// TODO Auto-generated method stub
	//launch+login common code moved here
	System.out.println("@BeforeMethod preCondition started");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	System.out.println("@BeforeMethod preCondition end");
	}
//@Beforemethod, you can cut down the common login code here other than launch code
//launch can be in before test

@AfterTest
public void postCondition() {
	// TODO Auto-generated method stub
	System.out.println("@BeforeMethod postCondition started");
    //driver.close();
	System.out.println("@BeforeMethod postCondition end");
}
//before the beforemethod , dataprovider got executed
@DataProvider(name="fetch")
public String[][] fetchData() throws IOException {
	System.out.println("@DataProvider fetchData started");
	// TODO Auto-generated method stub
	String[][] data = ReadExcel.readExcel(excelFileName);
	System.out.println("@DataProvider fetchData end");
	return data;
}
}
