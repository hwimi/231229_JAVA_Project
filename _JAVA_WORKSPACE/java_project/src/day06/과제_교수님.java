package day06;

import java.util.Scanner;

public class 과제_교수님 {

	public static void main(String[] args) {
		/*
		 * 
		 연사자 이용/*
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		/* num%10=나머지 값을 저장=>마지막 자리(출력)
		 * num/10=몫 (int)다시 나누는 값으로 사용
		 *  
		 * 
		 */
		while(num>0) {
			int b=num%10; //마지막 자리 추출
			System.out.print(b+"+");
			sum+=b;
			num=num/10; //정수/정수=>정수 소수점 버림
		}
		System.out.println("합계:"+sum);
	}

}
