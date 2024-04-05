package day03;

import java.util.Scanner;

public class for04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("출력할 단을 입력해주세요");
		int a=scan.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}

		
		
		scan.close();
	}

}

