package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSnapDealHA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WDM chooses correct current version of the ChromeDriver
		WebDriverManager.chromedriver().setup();

		//Need to disable the notification
		ChromeOptions coObj=new ChromeOptions();
		coObj.addArguments("disable-notifications");
		//pass arg to chromedriver
		ChromeDriver driver=new ChromeDriver(coObj);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Actions builder=new Actions(driver);
		//1. Launch https://www.snapdeal.com/
		driver.get("https://www.snapdeal.com/");

		//2. Go to Mens Fashion
		WebElement mensFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		builder.moveToElement(mensFashion).perform();
		//3. Go to Sports Shoes
		WebElement sportsShoes = driver.findElement(By.xpath("(//span[@class='linkTest'])[1]"));
		builder.moveToElement(sportsShoes).click(sportsShoes).perform();
		//4. Get the count of the sports shoes
		//		WebElement listElement = driver.findElement(By.xpath("//div[contains(@class,'js-product-list')]"));
		//		builder.moveToElement(listElement);
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-tuple-image ']"));
		System.out.println(productList.size());
		//5. Click Training shoes
		WebElement trainingShoeLink = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		builder.moveToElement(trainingShoeLink).click().perform();
		//6. Sort by Low to High   
		WebElement sortElement = driver.findElement(By.xpath("//div[contains(@class,'sort-drop')]"));
		builder.moveToElement(sortElement).click().perform();
		WebElement sortLH = driver.findElement(By.xpath("//li[@class='search-li'][1]"));
		builder.moveToElement(sortLH).click().perform();
		System.out.println(sortLH.isSelected());
		//7. Check if the items displayed are sorted correctly
		//		Rs. 499
		//		Rs. 625
		//		String regex = "[0-9]+";
		//		String regex = "\\d+";
		//		System.out.println("1".matches(regex));
		//		System.out.println("12345".matches(regex));
		//		System.out.println("123456789".matches(regex));
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));

		System.out.println(priceList.get(0).getText());
		System.out.println(priceList.get(priceList.size()-1).getText());
		//8.Select the price range (900-1200)
		//9.Filter with color yellow 
		//10 verify the all applied filters 
		//11. Mouse Hover on first resulting Training shoes
		//12. click QuickView button
		//13. Print the cost and the discount percentage
		//14. Take the snapshot of the shoes.
	}

}
