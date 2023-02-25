package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get("https://erail.in");
		WebElement fromElement = driver.findElement(By.id("txtStationFrom"));
		fromElement.click();
		fromElement.sendKeys("MS", Keys.ENTER);
		WebElement toElement = driver.findElement(By.id("txtStationTo"));
		toElement.click();
		toElement.sendKeys("CAPE",Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//get list of train names  //tr//td[2]
		//WebElement  table=driver.findElement(By.xpath("//div[@id='divTrainsList']//table[contains(@class, 'TrainList')]"));
		List<WebElement>  rows=driver.findElements(By.xpath("//div[@id='divTrainsList']//table[contains(@class, 'TrainList')]//tr//td[2]"));
		System.out.println("Tranin names are as follows,");
		for (WebElement tr : rows) {
			System.out.println(tr.getText());
		}
	}
}
