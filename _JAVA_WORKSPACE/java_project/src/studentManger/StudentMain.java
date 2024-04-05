package studentManger;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentManger st=new StudentManger();
		int meun=0;
		do {
			System.out.println("--meun--");
			System.out.println("1.학생등록|2.학생 리스트 출력|3.학생검사(학생정보,수강정보)|4.수강신청|5.수강철회|6.종료");
			System.out.println(">>meun>>");
			meun=sc.nextInt();
			

			switch(meun) {
			case 1:
				System.out.println("학생등록");
				st.insertStudent(sc);
				
				break;
			case 2:
				System.out.println("학생 리스트 출력");
				st.printStudent();
				break;
			case 3:
				System.out.println("학생검색(학생정보,수강정보)");
				st.serachsStudent(sc);
				break;
			case 4:
				System.out.println("수강신청");
				st.registerSubject(sc);
				break;
			case 5:
				System.out.println("수강철회");
				break;
			case 6:
				break;
			default :
				System.out.println("잘못된메뉴");
				
			
			}
		}while(meun!=6); {
			System.out.println("종료합니다");
			
		}
		

	}

	}


