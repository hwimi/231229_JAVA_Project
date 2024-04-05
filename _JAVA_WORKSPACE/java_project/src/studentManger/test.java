package studentManger;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student a=new Student();
//		Subject s=new Subject("123","java");
//		a.add_subject(s);
//		a.present_subject();
		
		StudentManger st=new StudentManger();
		st.insertStudent(sc);
		st.printStudent();
		st.registerSubject(sc);
		st.printStudent();
		
		sc.close();
	}
	

}
