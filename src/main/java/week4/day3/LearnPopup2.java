package week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPopup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//		//1. Launch https://www.snapdeal.com/
		//		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01d27i52u3p0oafo3zs46w5dte367032.node0");
		//		//		 2)Click on sweet Alert
		//		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		//		//j_idt88:j_idt108
		//		driver.findElement(By.id("j_idt88:j_idt108")).click();

		//		 1)Load url(https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt) 
		//		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		//		//		2)Click TryIt button
		//		driver.switchTo().frame("iframeResult");
		//		////button[text()='Try it']
		//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//		Alert prompt=driver.switchTo().alert();
		//		prompt.sendKeys("Pravee");
		//		//		3)Click ok on the alert
		//		prompt.accept();
		//		//	4)Print the resulting content
		//		//driver.switchTo().defaultContent();(text is already in the frame. so, need not come out of the frame)
		//		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());

		driver.get("https://jqueryui.com/draggable/");
		Actions builder=new Actions(driver);
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframeElement);
		WebElement draggableElement = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		builder.moveToElement(draggableElement).perform();
		Point pt=draggableElement.getLocation();
		System.out.println(pt);
		builder.dragAndDropBy(draggableElement, 100, 100).perform();
		System.out.println(pt);
	}

}
