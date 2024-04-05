package day02;

public class For01 {

	public static void main(String[] args) {
		/* 반복문:규칙적인 작업을 반복적으로 할때 사용 하는 문법
		 * for while do~while
		 * for,while 동장방식이 같음.
		 * =>조건에 맞지 않으면 
		 do while =>조건에 맞지 않아도 무조건 1번은 실행
		 
		 for(초기화; 조건식; 증감연산자;){
		 
		 실행문 작성;}
		 초기화 : 조건식이나, 실행문에서 사용할 변수를 초기화 : 생략가능
		 여러변수 초기화 가능 처음 1번만 실행.
		 -조건식: 반복문의 반복을 결정하는 식 반드시 true or false (true 나올시에만 반복):생략가능
		 -증강식: 조건식에서 사용할 변수를 증가/ 감소시켜 반복 횟수를 조절
		 */
		
		//1부터 10까지 출력하는 예제
		int i=0;
		for(i=1; i<=10; i++)
		{  
		System.out.print(i+" ");
		}
		System.out.println();
		
		for(i=10; i>=1; i--) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		//2부터 10까지 짝수만 출력
		for(i=2; i<=10; i+=2){
			
			System.out.print(i+" ");
			
		}
		
		//1부터 10까지의 합계
		System.out.println();
		int sum=0;
		for(i=1; i<=10; i++) {
			sum+=i;
			
		}
		System.out.println(sum);
			
			
	}

}
