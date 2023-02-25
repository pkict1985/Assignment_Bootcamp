package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println(id + name);
	}
	public void getStudentInfo(String email, String phonenumber) {
		System.out.println(email+ " "+ phonenumber);
	}
	public static void main(String[] args) {
		Students objStudent=new Students();
		objStudent.getStudentInfo(5);
		objStudent.getStudentInfo(10, "Praveena");
		objStudent.getStudentInfo("pravee@gmail.com", "9090909090");
	}
}
