package week2.day4;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDropDownListHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WDM gets the current version of Chrome driver
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.leafground.com/checkbox.xhtml");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

}
