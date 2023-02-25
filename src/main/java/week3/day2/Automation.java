package week3.day2;

public class Automation extends MultipleLanguage implements ITestTool {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation obj=new Automation();
		obj.Java();
		obj.ruby();
		obj.selenium();
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby called  from automation");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium called from automation");
	}

}
