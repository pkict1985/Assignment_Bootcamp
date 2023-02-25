package week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwoAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//Launch the URL
		driver.get("https://www.leafground.com/alert.xhtml");
		Actions builder=new Actions(driver);


		//Task: Alert Simple Dialog
		//1. Move to Show Button .
		WebElement btn = driver.findElement(By.xpath("(//span[text()='Show'])[1]"));
		builder.moveToElement(btn).perform();
		//Click on it
		builder.click(btn).perform();
		//3. Press ok
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//4. Capture the text displayed once accepted
		System.out.println(driver.findElement(By.xpath("//span[@id='simple_result']")).getText());

		//Task: Alert Confirm Dialog
		WebElement btn1 = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
		builder.moveToElement(btn1).perform();
		//Click on it
		builder.click(btn1).perform();
		driver.switchTo().alert().dismiss();
		//Capture the text displayed once accepted
		System.out.println(driver.findElement(By.xpath("//span[@id='result']")).getText());

		//Task: Sweet Simple Dialog
		WebElement btn2 = driver.findElement(By.xpath("(//span[text()='Show'])[3]"));
		builder.moveToElement(btn2).perform();
		//Click on it
		builder.click(btn2).perform();
		//Alert alert2=driver.switchTo().alert();
		//alert2.dismiss();
		WebElement dismissElement = driver.findElement(By.xpath("//span[text()='Dismiss']"));
		builder.click(dismissElement).perform();
	}

}
