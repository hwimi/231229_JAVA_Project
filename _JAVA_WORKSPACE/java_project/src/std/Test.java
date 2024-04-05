package std;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student st=new Student();
		st.setAge("15");
		st.setName("바보");
		st.setNumber("000");
		st.add_subject("국어", 80);
//		st.add_subject("수학", 70);
//		st.delate_subject("국어");
		st.sum_average();
		st.StudentInfo();
		
		
		sc.close();
		
	

	}

}
