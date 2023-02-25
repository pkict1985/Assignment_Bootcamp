package week5.day1.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	@BeforeTest
	public void setUp() {
		System.out.println("@BeforeTest setUp() started");
		excelFileName="CreateLead";
		System.out.println("@BeforeTest setUp() end");
	}

	@Test(dataProvider="fetch", enabled=false)
	public void createLead(String companyname, String firstname, String lastname, String phonenumber) {
		System.out.println("@Test createLead() started");
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phonenumber);
		driver.findElement(By.name("submitButton")).click();
		System.out.println("@Test createLead() end");
	}
}
