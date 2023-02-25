package week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementRadioButtonHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WDM gets the current version of Chrome driver
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.leafground.com/radio.xhtml");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				
				driver.findElement(By.xpath("(//label[text()='Chrome']/preceding-sibling::div)[1]")).click();
				WebElement selectElement = driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div"));
				selectElement.click();
				selectElement.click();
				
				
				List<WebElement> list = driver.findElements(By.xpath("//table[@id='j_idt87:console2']//div//div[last()]")); //div[contains(@class,'ui-state-active')]
				for(WebElement e: list) {
					System.out.println("Item "+ e.getText()+ e.isSelected());
				}
				//boolean isSel=defaultSel.isSelected();
				//if(isSel) System.out.println(defaultSel.getText() + "is the default"); else System.out.println(defaultSel.getText() + "is not the default");
				
	}

}
