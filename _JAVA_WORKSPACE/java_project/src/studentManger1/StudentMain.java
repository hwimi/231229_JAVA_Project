package studentManger1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		//메뉴처리
		/*-meun: 1.학생등록 | 2.학생 리스트 출력 | 3.학생검색(학생정보,수강정보)
				 4.수강신청|5.수강철회|6.종료
		 * 객체를 생성하는 것은 항상 미리 해놓고 메서드 호출
		 */
		Scanner sc=new Scanner(System.in);
		//Manger 호출
		StudentManger sm=new StudentManger();
		int menu=0;
		do {
			
			System.out.println("--meun--");
			System.out.println("1.학생등록|2.학생 리스트 출력|3.학생검사(학생정보,수강정보)");
			System.out.println("4.수강신청|5.수강철회|6.종료");
			System.out.println(">>메뉴 선택>>");
			menu=sc.nextInt();
			
			switch(menu) {
			case 1: sm.insertStudent(sc); break;
			case 2: sm.printStudent(); break;
			case 3: sm.serachsStudent(sc); break;
			case 4: sm.registerSubject(sc); break;
			case 5: sm.deleteSubject(sc); break;
			case 6: break;
			default:
				System.out.println("잘못된 메뉴입니다");
			}
			
		}while(menu!=6);
		System.out.println("종료");
		
		
		sc.close();
	}

}
