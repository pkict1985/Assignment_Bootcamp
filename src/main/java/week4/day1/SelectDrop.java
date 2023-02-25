package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.leafground.com/select.xhtml");
//		all,
		
		WebElement selElement=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		//selElement.click();
		
		Select obj=new Select(selElement);
		boolean isM=obj.isMultiple();;
		System.out.println(isM);
		int size=obj.getOptions().size();
		System.out.println(size);
		List<WebElement> options = obj.getOptions();
		for(int i=0;i<size;i++)
		{
			if(i==1 ||i==2||i==3||i==4)
			{
			 options.get(i).click();
			 //System.out.println(options.get(i).isSelected());
			 System.out.println(options.get(i).getText());
			}
		}
//		pup,
//		pup, cypres 
//		get text all all dr options
		
	}

}
