package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocator {

	//id name linktext classname
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		//Launch the Chrome browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Load url and maximize
		driver.manage().window().maximize();
		//Find the username nad type
		//username:Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Find the password and type
		//password:crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the Login
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads link
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead link 
		driver.findElement(By.linkText("Create Lead")).click();
		//Type the CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LF Tech");
		//Type the firstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prana");
		//Type the lastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		//Click on the Create Lead button
		driver.findElement(By.name("submitButton")).click();
		//Verify the title
		System.out.println(driver.getTitle());

	}

}
