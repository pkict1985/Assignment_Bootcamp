package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXPath1 {
	//	 urL:http://leaftaps.com/opentaps/control/main
	//		   username:Demosalesmanager
	//		   password:crmsfa
	//		  1)Launch the Chrome browser
	//		  2)Load url and maximize
	//		  3)Find the username nad type
	//		  4)Find the password and type
	//		  5)Click on the Login
	//		  6)Click on CRM/SFA link
	//		  7)Click on Leads link
	//		  8)Click on Create Lead link  
	//		  9)Type the CompanyName
	//		  10)Type the firstName
	//		  11)Type the lastName
	//		  12)Click on the Create Lead button
	//		  13)Verify the title 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setup the path for ChromeDriver in WDM
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Load Browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//id username
		driver.findElement(By.xpath("//input[@class='inputLogin'][1]")).sendKeys("Demosalesmanager");
		//id password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//class decorativeSubmit
		driver.findElement(By.xpath("//input[contains(@class, 'decorativeSubmit')]")).click();
		//a linktext CRM/SFA  //a[text()='CRM/SFA'] //a[contains(text(),'CRM')]
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		//Click on Leads button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Click on Create Lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("New Info");
		driver.findElement(By.xpath("(//input[contains(@id,'createLeadForm')])[3]")).sendKeys("Shirley");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Logesh");


		driver.getTitle();
	}

}
