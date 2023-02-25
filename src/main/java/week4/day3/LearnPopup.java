package week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//1. Launch https://www.snapdeal.com/
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		//		 2)Click on Prompt Alert
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert=driver.switchTo().alert();
		//	    3)Enter a text in the text box 
		alert.sendKeys("Pravee here!");
		//	    4)Accept the alert
		alert.accept();
		//	    5)Get the text and print the statement
		String text = driver.findElement(By.xpath("//p[@id='result1']")).getText();
		System.out.println(text);
	}

}
