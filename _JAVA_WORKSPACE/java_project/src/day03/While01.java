package day03;

public class While01 {

	public static void main(String[] args) {
		/*while문
		 * while문은 횟수가 일정치 않을 경우 사용
		 * while(조건식){ //조건식이 true 일때 반복
		 * 실행문;
		 * }
		 * while문은 실행문안에 조건식이  바뀔수있는 증감식이 있어야 가능.
		 */
		
		//for문으로 1~10까지 출력
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		int i=0;
		System.out.println();
		//while로 1부터 10까지 출력

		while(i<10) {
			i++;
			System.out.print (i+ " ");
		}
		//while문으로 1~10까지 짝수만 출력
		System.out.println();
		int j=0;
		while(j<=10) 
			
		{
		j++;
		if(j%2==0) {
			System.out.print(j+" ");
			
		}

		}
		
	}


}
