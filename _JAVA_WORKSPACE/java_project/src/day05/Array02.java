package day05;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력할수있는 배열을 생성하려고 한다
		 * 5명의 점수를 입력받아서 배열에 저장
		 * 점수를 출력
		 * 
		 */
		int sum=0;
		double average=0;
		Scanner sc=new Scanner(System.in);
		int num1[]=new int[5];
		System.out.println("성적을 입력하세요");
		for(int i=0; i<num1.length; i++) {// 5칸을 의미 5라는 숫자를 의미
			num1[i]=sc.nextInt();
			System.out.println(num1[i]);
			sum=num1[i]+sum;
			
		}
		
		System.out.println("다섯명의 점수의 합은="+sum);
		average=sum/(double)num1.length; // 5라는 숫자를 의미함
		
	
		System.out.println("다섯명의 점수의 평균은="+average);
		
		
		
		
		sc.close();

	}

}
