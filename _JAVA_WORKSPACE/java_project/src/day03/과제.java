package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*up/down 게임
		 * 1~50사이의 랜덤수를 생성하여 맞추는 게임?
		 * 컴퓨터가 랜덤 수 생성:23
		 * 입력>10
		 * 랜덤수가 더 크면 up~ 다시 입력하세요
		 * up~!!입력>30 down~!! 다시 입력
		 입력을 맞추면 정답입니다 출력 종료
		 */
		Scanner sc=new Scanner(System.in);
		int b=0;
		int num1=(int)(Math.random()*50);
		System.out.println("정수를 입력하시오");
		int a=sc.nextInt();
		while(a!=num1) {
			b++;
			System.out.println(b);
			if(b>=5) {
				System.out.println("횟수제한 5 회를 초과하였습니다.");
				break;
				
			}
		
			
			if(a>num1) 
			{
			System.out.println("down");
			System.out.println("입력");
			a=sc.nextInt();
			
			
			}
			else if(a<num1) {
				System.out.println("up");
				System.out.println("입력");
				a=sc.nextInt();
				
				
				
				}
			
		
			else if (a==num1)
			{
				System.out.println("정답입니다");
				break;
				
			}
			
			
				
		
			
		}
		
	
		
		
		sc.close();
		
		

	
	}

}
