package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	private static WebElement webElement;
	private static WebElement webElement2;
	private static WebElement webElement3;

	//	Classroom1:
	//		===========
	//		   1)click on Marketing campaign and click on demo (selectByIndex)
	//		   2)click on Industry and click on retail(selectByValue)
	//		   3)click on State/Province and click on Arizona(selectByVisibleText).   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setup the path for ChromeDriver in WDM
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Load Browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//id username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//id password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//class decorativeSubmit
		driver.findElement(By.className("decorativeSubmit")).click();
		//a linktext CRM/SFA 
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads button
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead
		driver.findElement(By.tagName("a").linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New Info");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shirley");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Logesh");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gee@gmail.com");
		//ddl
		webElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select markDemo=new Select(webElement);
		markDemo.selectByIndex(5);
		webElement2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry=new Select(webElement2);
		industry.selectByValue("IND_RETAIL");
		webElement3 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateProvince=new Select(webElement3);
		stateProvince.selectByVisibleText("Arizona");
		
		//driver.quit();
	}

}
