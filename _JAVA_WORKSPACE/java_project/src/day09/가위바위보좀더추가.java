package day09;

import java.util.Scanner;

public class 가위바위보좀더추가 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		/*컴퓨ㅓ가 가위바위보를 랜덤으로 선택
		 * 내가 선택 하나 입력
		 * 승 패 무 결과 출력
		 * 변수.equals
		 * 
		 */
		System.out.println("가위바위보 시작>>");
		int comNum=(int)(Math.random()*3);//012
		System.out.println("컴퓨터 결정 완료!!");
		System.out.println("가위/바위/보 중 하나 선택");
		String myChoice=sc.next();
		String comChoice=(comNum==0? "가위": comNum==1? "바위": "보");
		System.out.println("comChoice>"+comChoice+"("+comNum+")");
		System.out.println("myChoice>"+myChoice);
		
		if(comChoice.equals(myChoice)) {
			System.out.println("무승부");
		}
		else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")?"승":"패");
			}else if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("보")?"승":"패");
				
			}else {
				System.out.println(myChoice.equals("가위")?"승":"패");
			}
			System.out.println("종료");
			
			
		}
		
		
		
		
	
		
		sc.close();

	}

}
