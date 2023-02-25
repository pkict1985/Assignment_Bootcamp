package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAction throws InterruptedException{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//Launch the URL
		driver.get("https://www.ajio.com");
		//			move to kids
		WebElement kidsLink = driver.findElement(By.linkText("KIDS"));
		Actions builder= new Actions(driver);
		builder.moveToElement(kidsLink).perform();
		//			move to categories
		WebElement ctgLink = driver.findElement(By.linkText("CATEGORIES"));
		builder.moveToElement(ctgLink).perform();
		//			softtoys Soft Toys
		WebElement stLink = driver.findElement(By.linkText("Soft Toys"));
		builder.moveToElement(stLink).click().perform();
		//			move any image
			Thread.sleep(3000);
		
	   WebElement img = driver.findElement(By.xpath("//img[contains(@class,'rilrtl-lazy-img')])[1]"));
	   builder.moveToElement(img).perform();
		//	see quickview on hover on any items there
		WebElement qvLink = driver.findElement(By.xpath("//div[text()='Quick View'])[1]"));
		//			get the text of quick view
		System.out.println(qvLink.getText());
	}

}