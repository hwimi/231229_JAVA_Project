package day02;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		/*카페에 제출
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력*
		 * 연산자는 + - * / % 가능
		 * 다른 종류의 연산자가 들어오면 잘못된 연산자로 출력
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하시오");
		int num1=scan.nextInt();
		System.out.println("두번째 정수를 입력하시오");
		int num2=scan.nextInt();
		System.out.println("입력한 연산자");
		char s=scan.next().charAt(0);
		switch(s) {
		case '+':
			System.out.println("두수의 합은="+(num1+num2));
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case'*':
			System.out.println(num1*num2);
			break;
		case'/':
			System.out.println(num1/num2);
		case'%':
			System.out.println(num1%num2);
			break;
		default:
			System.out.println("잘못된 연산자입니다");
		}
		
		
		
		
		
		
		
		scan.close();

	}

}
