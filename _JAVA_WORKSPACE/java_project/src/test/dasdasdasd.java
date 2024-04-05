package test;

import java.util.Scanner;

public class dasdasdasd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int inNum;
		System.out.println("정수를 입력하세요");
		inNum=sc.nextInt();
		if(inNum%2==0) {
			System.out.println(inNum+":짝수입니다");
			
		}else
			System.out.println(inNum+":홀수입니다");
		
		sc.close();

	}

}
