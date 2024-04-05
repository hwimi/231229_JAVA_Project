package day04;

import java.util.Scanner;

public class 과제_교수님 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int random=0; //주사위값
		int sum=0; // 거리 누적값
		int count=0; //주사위 던진 횟수 누적
		int last=30; // 최종 목묘 이동수
		
		System.out.println("게임 시작합니다");
		while(sum<last) {
			//거리 누적값이 최종목적지보다 작다면 while로 돌아가라
			sc.nextLine();//enter 값을 이용하여 주사위를 던질수 있게 해줌
			random=(int)(Math.random()*6)+1; //1부터 6까지 랜덤수 저장
			//발생값 거리 합산
			sum+=random;
			count++;
			System.out.println("주사위:"+random);
			System.out.println(random+"칸 전진"+(last-sum)+"칸 남았습니다");
		
			}
		System.out.println("도착~!! 총 이동횟수:"+count);
		
		sc.close();
	}

}
