package week2.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List {

	//	 1)Go to Amazon url
	//2)Type phones
	//3)Print price of every phon
	//4)print the lowest Price
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER);
		java.util.List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int length=prices.size();
		int[] price=new int[length];
		java.util.List<Integer> priceList=new ArrayList<Integer>();
		String str;
		int pri;
		for (WebElement p : prices) {
			str=p.getText().replace(",", "");
			pri=Integer.parseInt(str);
			priceList.add(pri);
            System.out.println(pri);
		}
		Collections.sort(priceList);
		System.out.println("The lowest price is ");
		System.out.println(priceList.get(0));
	}

}
