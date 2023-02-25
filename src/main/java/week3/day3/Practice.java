package week3.day3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Classroom:
//==========
//   String companyName = "google"->"gole"
//   Remove duplicate character
public class Practice {
	int id;
	String name;
	Practice(){
		System.out.println("DEfault Constructor called");
	}
	Practice(int _id, String _name){
		id=_id;
		name=_name;
	}
	Practice(int id){
		id=id;
	}
public static void main(String[] args) {
	Practice obj=new Practice();
	Practice objParam=new Practice(1, "Praveena");
	Practice objParamoverload=new Practice(7);
	
	System.out.println(objParamoverload.id);
	
	System.out.println(objParam.id);
	System.out.println(objParam.name);
	
	//System.out.println(nameSet);
}
}
