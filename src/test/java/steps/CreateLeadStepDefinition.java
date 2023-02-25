package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;

public class CreateLeadStepDefinition extends Base {
	@Given("Click CRM/SF link")
	public void clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click Leads tab")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Create Lead link")
	public void createLeadsLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter the companyname")
	public void enterCompanyname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		
	}
	@And("Enter the firstname")
	public void enterFirstname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	}
	@And("Enter the lastname")
	public void enterLastname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}
	@Then("Click CreateLeadsButton")
	public void clickCreateLeadsButton() {
		
	}
	
}
