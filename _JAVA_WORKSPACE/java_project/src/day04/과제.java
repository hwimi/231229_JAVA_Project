package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=(int)(Math.random()*6)+1;
		int count=0;
		int distance=30;
		int sum=0;
		
		while(sum<=distance) 
		{
		System.out.println("주사위를 던지세요 (a)");
		a=(int)(Math.random()*6)+1;
		String b=sc.nextLine();
		sum=sum+a;
		System.out.println("주사위"+a);
		System.out.println("주사위"+"칸 전진"+(distance-sum));
		System.out.println();
		count++;
		}
		System.out.println("도착 총 주사위 던진 횟수"+count);
		
		sc.close();

	}

}
