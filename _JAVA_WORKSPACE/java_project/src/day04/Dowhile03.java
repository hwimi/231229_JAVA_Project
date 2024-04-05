package day04;

import java.util.Scanner;

public class Dowhile03 {

	public static void main(String[] args) {
		/*menu 숫자 2개를 입력받고,
		 * menu 1.+ | 2.- | 3.* |  4./ | 5.% 
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하시오");
		int a=sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		int b=sc.nextInt();
		
		
	
		
		int menu=0;
		do 
		{
		System.out.println("menu");
		System.out.println("1.+ 2.- 3.*  4./ 5.%  6.종료");
		menu =sc.nextInt();
		
		
		
		switch(menu) {
		case  1:
		System.out.println(a+"+"+b+"="+(a+b));
		break;
		
		case 2:
		System.out.println("a-b="+(a-b));
		break;
		
		case 3:
		System.out.println("a*b="+(a*b));
		break;
		
		case 4:
		if(b==0) {
			System.out.println("잘못된 연산입니다");
			System.out.println("다시 입력하세요");
			b=sc.nextInt();
			System.out.println("a/b="+(a/b));
			
				
		}
		else{
			System.out.println("a/b="+(a/b));
		}
		
		break;
		
		case 5:
		if(b==0) {
			System.out.println("잘못된연산입니다");
			System.out.println("다시 입력하세요");
			b=sc.nextInt();
			System.out.println("a%b="+(a%b));
		}
		else
		{
			System.out.println("a%b="+(a%b));
		}
	
		break;
		
		case 6:
			break;

		
		default:
		System.out.println("잘못된메뉴");
		break;
		}
		
		}while(6!=menu);
		
			System.out.println("종료합니다");
		
			
	
	
		
		
		
		
		
		sc.close();

	}

}
