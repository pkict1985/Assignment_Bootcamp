package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.sun.tools.javac.main.Arguments;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//	1) Go to https://www.nykaa.com/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		Actions builder = new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		// 1) Go to https://www.nykaa.com/
		driver.navigate().to("https://www.nykaa.com/");
	
		// 2) Mouseover on Brands and Search L'Oreal Paris
		WebElement searchElement = driver.findElement(By.xpath("//a[text()='brands']"));
		builder.moveToElement(searchElement).perform();
		
		//		3) Click L'Oreal Paris //a[text()='L'Oreal Paris']
		WebElement ParisElement = driver.findElement(By.xpath("//a[text()=\"L'Oreal Paris\"]"));
		builder.moveToElement(ParisElement).click(ParisElement).perform();
		
		// 4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		String chkTitleMsg=driver.getTitle().contains("L'Oreal Paris")? "Title contains has L'Oreal Paris": "Title doesnt have L'Oreal Paris";
		System.out.println("Its verified that "+ chkTitleMsg);
		
		//Set<String> windowHandles = driver.getWindowHandles();
		//List<String> whStrings=new ArrayList<String>(windowHandles);
		//driver.switchTo().window(whStrings.get(1));
		
		//	5) Click sort By and select customer top rated
		
		//js.executeScript("window.scrollBy(0,350)", "");
		
		WebElement sortElement = driver.findElement(By.xpath("//span[@class='sort-name']"));
		builder.moveToElement(sortElement).perform();
		sortElement.click();
		
		WebElement checkCTRElement = driver.findElement(By.xpath("//label[@for='radio_customer top rated_undefined']//div[2]"));
		builder.moveToElement(checkCTRElement).click(checkCTRElement).perform();
		
		//	6) Click Category and click Hair->Click haircare->Shampoo
		WebElement catgyElement = driver.findElement(By.xpath("//div[@id='first-filter']"));
		builder.moveToElement(catgyElement).perform();
		Thread.sleep(3000);
		catgyElement.click();
		
		WebElement hairElement = driver.findElement(By.xpath("//span[text()='Hair']"));
		builder.moveToElement(hairElement).perform();
		Thread.sleep(3000);
		hairElement.click();
		
        WebElement hairCElement = driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]"));
	    builder.moveToElement(hairCElement).perform();
	    Thread.sleep(3000);
	    hairCElement.click();
		
	    WebElement shampooElement = driver.findElement(By.xpath("//span[text()='Shampoo']"));
	    builder.moveToElement(shampooElement).perform();
	    Thread.sleep(3000);
	    shampooElement.click();
	    
			//	7) Click->Concern->Color Protection
	    WebElement concernElement = driver.findElement(By.xpath("//span[text()='Concern']"));
        builder.moveToElement(concernElement).perform();
        Thread.sleep(3000);
        concernElement.click();
	    
	    WebElement cpElement = driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[last()]"));
	    builder.moveToElement(cpElement).perform();
	    Thread.sleep(3000);
	    cpElement.click();
        
	    //	8) check whether the Filter is applied with Shampoo
	    WebElement shampooElementAfterFilter = driver.findElement(By.xpath("//span[text()='Filters Applied']//following::span[text()='Shampoo']"));
	    boolean displayedFilterShampp = shampooElementAfterFilter.isDisplayed();
	    String msg=displayedFilterShampp? "Verified that filter applied with Shampoo": "filter not applied with Shampoo";
	    System.out.println(msg);
	    
			//  9) Click on L'Oreal Paris Colour Protect Shampoo
	    WebElement csShampoo = driver.findElement(By.xpath("//div[text()=\"L'Oreal Paris Colour Protect Shampoo\"]"));
	    builder.moveToElement(csShampoo).perform();
	    Thread.sleep(3000);
	    csShampoo.click();
	    
			//	10) GO to the new window and select size as 175ml
			//	11) Print the MRP of the product
			//	12) Click on ADD to BAG
			//	13) Go to Shopping Bag 
			//	14) Print the Grand Total amount
			//	15) Click Proceed
			//	16) Click on Continue as Guest
			//	17) Check if this grand total is the same in step 14
			//	18) Close all windows
	}

}
