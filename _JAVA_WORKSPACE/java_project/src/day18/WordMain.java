package day18;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		WorldManger wl =new WorldManger();
		Scanner sc=new Scanner(System.in);
		/*단어장 프로그램
		 * 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료
		 * WorldManger 클래스를 생성하여 메서드 구현
		 * map을 이용하여 단어 등록
		 * 기본단어 등록(5가지 등록)
		 * main에서는 메뉴가 반복 실행되록 설정
		 */
		int meun=0;
		do {
			System.out.println("--meun--");
			System.out.println("1.단어 등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.단어 파일출력|7.종료");
			System.out.println(">>meun>>");
			meun=sc.nextInt();
			switch(meun) {
			case 1:
				System.out.println("단어등록");
				wl.word_add(sc.next(), sc.next());
				break;
			case 2:
				System.out.println("단어검색");
				wl.word_search(sc.next());
				break;
			case 3:
				System.out.println("단어수정");
				wl.word_change(sc);
				break;
			case 4:
				System.out.println("단어출력");
				wl.print();
				break;
			case 5:
				System.out.println("단어삭제");
				wl.word_delate(sc.next());
				break;
			case 6:
				System.out.println("단어파일출력");
				wl.File_print();
				break;
			case 7:
			default:
				System.out.println("잘못된 메뉴입니다");
				
			}
		}while(meun!=7);{
			System.out.println("종료합니다");
		}
		
		
		
		
		
		sc.close();
		
			
		
	}

}
