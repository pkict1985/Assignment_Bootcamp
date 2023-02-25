package week2.day3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ajio {

	private static String text;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Login to  ajio.com
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//		2)Type  in the search box("Women",keys.Enter)
		driver.findElement(By.name("searchVal")).sendKeys("Women",Keys.ENTER);
		//		3)Click on the Sarees check box under Cateogory
		WebElement findElement = driver.findElement(By.xpath("//label[contains(text(),'Sarees')]"));
		findElement.click();
		//		4)Click on sort by dropdown and click Whats new
		WebElement findElement2 = driver.findElement(By.xpath("//div[@class='filter-dropdown']/select"));
		findElement2.click();
		Select s=new Select(findElement2);
		s.selectByValue("newn");
		//5)Print the text of the number of items displayed    
		text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text.replaceAll("[^0-9]", ""));
		
	    driver.switchTo().defaultContent();
	    Set<String> windowHandles = driver.getWindowHandles();
	    	
	}
}
