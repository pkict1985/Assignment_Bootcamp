/**
 * 
 */
package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author jayar
 *
 */
public class ActionHA{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WDM chooses correct current version of the ChromeDriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		//load url
		driver.get("https://www.leafground.com/drag.xhtml");
		//Dragging the element leftclick hold release
		WebElement dragDropElement = driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		Actions builder=new Actions(driver);
		Point loc=dragDropElement.getLocation();
		System.out.println("Element moved from "+loc.getX()+","+loc.getY());
		builder.dragAndDropBy(dragDropElement, loc.getX()+100,loc.getY()+100).perform();
		System.out.println("Element moved to "+dragDropElement.getLocation());
		
		//Drag source element to target element
		WebElement sourceElement = driver.findElement(By.id("form:drag_content"));
		WebElement targetElement = driver.findElement(By.id("form:drop"));
		builder.dragAndDrop(sourceElement, targetElement).perform();
		System.out.println("Its dragged and dropped");
		
		//Draggable columns in table
		WebElement tableElement = driver.findElement(By.xpath("(//table[@role='grid'])[1]"));
	    builder.moveToElement(tableElement).perform();
		WebElement catogoryElement = driver.findElement(By.id("form:j_idt94:j_idt97"));
		WebElement nameElement = driver.findElement(By.id("form:j_idt94:j_idt95"));
		builder.dragAndDrop(catogoryElement, nameElement).perform();
		Thread.sleep(5000);
		WebElement popupMessageElement = driver.findElement(By.xpath("//span[@text()='Columns reordered']"));
		System.out.println(popupMessageElement.isDisplayed());
		if(popupMessageElement.getText()=="Columns reordered") System.out.println("columns in the 'DraggableColumns' table are reordered successfully!");
		
		//Draggable rows from to 
		String popupMsgRow="Row moved";
		WebElement tableElement1 = driver.findElement(By.xpath("(//table[@role='grid'])[2]"));
		builder.moveToElement(tableElement1).perform();
		WebElement fromRow = driver.findElement(By.xpath("(//tbody[@id='form:j_idt111_data']/tr[@role='row'])[1]"));
		WebElement toRow = driver.findElement(By.xpath("(//tbody[@id='form:j_idt111_data']/tr[@role='row'])[2]"));
		builder.dragAndDrop(fromRow, toRow).perform();
		Thread.sleep(5000);
		WebElement popupMsgRowElement = driver.findElement(By.xpath("//span[@text()='Row moved']"));
		System.out.println(popupMsgRowElement.isDisplayed());
		if(popupMsgRowElement.getText()==popupMsgRow) System.out.println("rows in the 'DraggableRows' table are reordered successfully!");
		
		//driver.close();
		
	}

}
