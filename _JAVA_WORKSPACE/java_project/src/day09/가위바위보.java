package day09;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int b=sc.nextInt();
		int a=(int)(Math.random()*2);
		if(a==b) {
			System.out.println(a);
			System.out.println("무승부입니다");
		}
		else if(a>b) {
			System.out.println(a);
			System.out.println("컴퓨터가 승리하였습니다");
		}
		else if(a<b) {
			System.out.println(a);
			System.out.println("유저가 승리하였습니다");
			
		}
		sc.close();
	}

}
