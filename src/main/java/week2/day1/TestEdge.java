package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WDM selecting the latest version of the webdriver and web browser.
WebDriverManager.edgedriver().setup();
EdgeDriver driver=new EdgeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
	}

}
