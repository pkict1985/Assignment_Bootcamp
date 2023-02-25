package week6.Day2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
	public static void main(String[] args) {
		//SEtup the physical report path
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		
		reporter.setAppendExisting(true);
		//Create object for ExtentReport
		ExtentReports extent=new ExtentReports();
		
		//attach the data with physical file
		extent.attachReporter(reporter);
		
		ExtentTest test=extent.createTest("LoginScript", "login with valid username and password");
		test.assignCategory("LeafTapModule1");
		test.assignAuthor("Praveena");
		
		ExtentTest test1=extent.createTest("LoginScript1","login with valid username and password");
		test1.assignCategory("LeafTapModule2");
		test1.assignAuthor("Rajii");
		
		test.pass("enter username");
		test.pass("enter password");
		test.pass("click login");
		
		test1.pass("enter username");
		test1.pass("eneter password");
		test1.fail("click login");
		
		extent.flush();
		
	}
}
