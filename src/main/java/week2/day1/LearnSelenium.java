package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Classroom1:
//===========
//   1)Setup the path(Edge, Chrome)
//   2)Launch the browser
//   3)Load the url(http://leaftaps.com/opentaps/control/main)
//   4)Maximize the window
public class LearnSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SEtup the binary path(where chromedriver.exe stored..c user admin) using the wdm
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//open the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		driver.manage().window().maximize();
	}

}
