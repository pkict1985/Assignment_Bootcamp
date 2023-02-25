package week3.day2;

public abstract class MultipleLanguage implements ILanguage {
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("java from Abstract class");
	}
	private void python() {
		// TODO Auto-generated method stub
		System.out.println("Python");
	}
	//abstarct method can have public or protected
	public abstract void ruby();
}
