package day04;

public class Contiune01 {

	public static void main(String[] args) {
		/*
		 * continue: 계속 pass,  skip 개념
		 * 1~10까지 출력
		 * 5는 빼고 출력*
		 */
		
		for(int i=1; i<=10; i++ ) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		/*1부터 10까지 짝수만 출력
		 * 홀수를 continue로 pass
		 */
		System.out.println("      ");
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
