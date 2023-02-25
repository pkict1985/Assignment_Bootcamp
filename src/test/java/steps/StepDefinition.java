package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Base;

//implement test steps
public class StepDefinition extends Base {
	@Given("Open the Chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		//urL:http://leaftaps.com/opentaps/control/main
		//username:Demosalesmanager
		//password:crmsfa
	}
	@And("Load the application url")
	public void loadApplication() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Enter the username as {string}")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("username:Democsr2", Keys.ENTER);
	}
	@And("Enter the password as {string}")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa",Keys.ENTER);
	}
	@When("Click the Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		System.out.println("VerifyHome");
	}
}
