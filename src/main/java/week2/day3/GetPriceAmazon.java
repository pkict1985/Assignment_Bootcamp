package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPriceAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1)Login to amazon website(https://www.amazon.in/)
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //max 60s
        // 2)Type oneplus pro in the search box("OneplusPro",keys.Enter)
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OneplusPro",Keys.ENTER);
        //3)Press Enter
        //4)Click on the first resulting mobile
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height']/img)[1]")).click();
        //5)Print the price  in the console 
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println(price);
		//driver.close();
	}

}
