package test;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int random;
		int sum=0;
		System.out.println("난수의 숫자를 입력하세요");
		int input=sc.nextInt();
		System.out.println("난수의 개수는:"+input);
		for(int i=0; i<input; i++) {
			random=(int)(Math.random()*99);
			System.out.print(random+" ");
			sum+=random;
		}
		System.out.println();
		System.out.println("합은:"+sum);
		
		
		sc.close();

	}

}
