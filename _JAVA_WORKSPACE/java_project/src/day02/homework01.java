package day02;

import java.util.Scanner;

public class homework01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*카페에 제출
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력*
		 * 연산자는 + - * / % 가능
		 * 다른 종류의 연산자가 들어오면 잘못된 연산자로 출력
		 * 연산자 =char(기본 자료형)== 비교 가능/String(객체)==비교 불가능
		 */
		
		System.out.println("정수를 입력해주세요");
		int num1=scan.nextInt();
		System.out.println("다음숫자를 입력해주세요");
		int num2=scan.nextInt();
		System.out.println("연산자를 입력해주세요");
		char op=scan.next().charAt(0); // 한글자 받기
		
	
		// /, %일 경우 num2 가 0이 되면 안내문구 뛰우기
		
		if( (op=='/' || op=='%')&&num2==0)  //&& and 곱하기 //|| or 계산 더하기
		{
		System.out.println("잘못된 계산입니다");
		}
		else {
			int a=num1-num2;
			int b=num1*num2;
			double c=num1/(double)num2;
			int d=num1%num2;
			
			switch(op) 
			{
			case'+':
				System.out.println(" "+num1+op+num2+"="+(num1+num2)); //char 숫자 사이의 껴있으면 숫자 코드로 변경이 되버린다.
				break;
			case'-':
				System.out.println(" "+num1+op+num2+"="+(a));
				break;
			case'*':System.out.println(" "+num1+op+num2+"="+(b));
				break;
			case'/':
				
					System.out.println(" "+num1+op+num2+"="+(c));
				
				break;
			case'%':System.out.println(" "+num1+op+num2+"="+(d));
				break;
			default:
				System.out.println("잘못된 연산자입니다");
			}
			
		}
		
			
		
		
		
			
			
		
		
		
	
		
		
	
		
		
		
		scan.close();

	}

}
