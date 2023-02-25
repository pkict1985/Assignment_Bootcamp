package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//Launch the URL
		Actions builder=new Actions(driver);
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0oj7dltffmqes117xjpyw1f2h2369358.node0");
		String title=driver.getTitle();
		System.out.println(title);
		WebElement btn = driver.findElement(By.xpath("//span[text()='Open']"));
		builder.moveToElement(btn).perform();
		builder.click(btn).perform();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWH=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWH.get(1));
		
		String newWindowtitle=driver.getTitle();
		System.out.println(newWindowtitle);
		if(title.equals(newWindowtitle)) {
			System.out.println("Still in the same page");
		}
		else
		{
			System.out.println("Navigated to page");
		}
	}

}
