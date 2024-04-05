package day07;

import java.util.Scanner;

public class 과제수정 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int meun=0;
		
		do {
			System.out.println("--menu--");
			System.out.println("1.+ | 2.- |3.* | 4./ | 5.% |6.종료하기");
			System.out.println(">>menu>>");
			meun=sc.nextInt();
			
			switch(meun) {
			case 1:
				System.out.println("숫자를 입력하세요");
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				System.out.println(sum(num1,num2));
				break;
			case 2:
				System.out.println("숫자를 입력하세요");
				int num3=sc.nextInt();
				int num4=sc.nextInt();
				
				System.out.println(sub(num3,num4));
			case 3:
				System.out.println("숫자를 입력하세요");
				int num5=sc.nextInt();
				int num6=sc.nextInt();
				System.out.println(mul(num5,num6));
				break;
			case 4:
				System.out.println("숫자를 입력하세요");
				int num7=sc.nextInt();
				int num8=sc.nextInt();
				System.out.println(div(num7,num8));
				break;
			case 5:
				System.out.println("숫자를 입력하세요");
				int num9=sc.nextInt();
				int num10=sc.nextInt();
				System.out.println(mod(num9,num10));
				break;
				
			case 6:
				System.out.println("종료합니다");
				break;
				
			default:
				System.out.println("잘못된 메뉴입니다");
			}
			}while(meun!=6); 
				
				
			
		
		sc.close();

	}
	public static int sum(int num1,int num2) {
		return num1+num2;
	}

	public static int sub(int num1,int num2) {
		if(num1<num2) {
			return num2-num1;
		}
		return num1-num2;
	}
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	public static int div(int num1, int num2) {
		if(num1<num2) {
			return num2/num1;
		}
		return num1/num2;
	}
	public static int mod(int num1, int num2) {
		if(num1<num2) {
			return num2%num1;
		}
		return num1%num2;
	}
}
