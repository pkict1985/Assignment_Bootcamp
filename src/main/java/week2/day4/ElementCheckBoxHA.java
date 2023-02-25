package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementCheckBoxHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WDM gets the current version of Chrome driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']")).click();
		//need to Close the popup button
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']")).click();
		
		//below not working - close the popup
//		driver.findElement(By.xpath("div[@class='ui-growl-icon-close ui-icon ui-icon-closethick']")).click();
//		driver.findElement(By.xpath("a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		
		driver.findElement(By.xpath("(//table[@class='ui-selectmanycheckbox ui-widget']//div)[1]")).click();
		driver.findElement(By.xpath("//label[text()='Python']/preceding-sibling::div")).click();
		//need to get state and close popup
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		WebElement chkDis=driver.findElement(By.id("j_idt87:j_idt102"));
		boolean isEnabled=chkDis.isEnabled();
		if(isEnabled) System.out.println("Its Enabled"); else System.out.println("Its is Disabled");
		//driver.close();
	}

}
