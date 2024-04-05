package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/*국어 영어 수학 점수를 입력받아
		 * 합계 평균 평가를 출력
		 * 평가는 
		 * 평균이 90이상이면 A
		 * 평균이 80이상이면 B
		 * 평균이 70이상이면 C
		 * 나머지는 D
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요");
		double kor=scan.nextDouble();
		System.out.println("영어 점수를 입력해주세요:");
		double eng=scan.nextDouble();
		System.out.println("수학 점수를 입력해주세요:");
		double math=scan.nextDouble();
		
		double sum=kor+eng+math;
		double average=sum/3;
		
		if(average>=90)
		{
			System.out.println("A등급입니다");
		}
		else if(average>=80) 
		{
			System.out.println("B등급입니다");
		}
		else if(average>70) 
		{
			System.out.println("C등급입니다");
		}
		else
		{
		System.out.println("D등급 입니다");	
		}
		scan.close();
		

	}

}
