package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Launch the URL
		driver.get("https://www.leafground.com/waits.xhtml");
		Actions builder=new Actions(driver);
		WebElement clickBtnElement = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		builder.moveToElement(clickBtnElement).perform();
		builder.click(clickBtnElement).perform();
		WebElement iamhereElement = driver.findElement(By.xpath("//span[text()='I am here']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.visibilityOf(iamhereElement));
	}
}