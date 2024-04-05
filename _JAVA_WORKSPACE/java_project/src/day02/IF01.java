package day02;

public class IF01 {

	public static void main(String[] args) {
		/*조건문 :if문 switch문
		 * if(조건문){실행문;}
		 * 살행문이 한줄일 경우 {} 생략 가능
		 * 실행문이 2줄 이상인 경우 반드시 {}가 필요
		 * 조건식은 반드시 true /false 형태로 나올수 있게 작성 해야한다
		 * 
		 */

		int num=0;
		//num가 0보다 크면 양수입니다 출력
		if(num>0)
		{
			System.out.println("양수입니다");
		}
		
		//num 가 0보다 크면 양수입니다. 아니면 음수입니다.
		else 
		{
		System.out.println("음수입니다");	
		}
		
		//num 가 0보다 크면 양수 아니면 음수 / 0이면 0입니다
		
		int num1=0;
		
		if(num1>0)
		{
			System.out.println("양수입니다");
		}
		else if(num1==0)
		{
			System.out.println("0입니다");
		}
		else
		{
			System.out.println("음수입니다");
		}
		System.out.println("--------------------------------");
		
		int num2=-1;
		//num 가 0보다 크면 양수 10보다 크면 10보다 큽니다. / 아니면 음수 / 0이면 0입니다 출력
		
		if(num2>0)
		{
			System.out.println("양수이면서");
			if(num2>10)
			{
			System.out.println("10보다 큰숫자입니다");	
			}
		}
		
		else if (num2==0)
		{
			System.out.println("0입니다");
		}
		else
		{
			System.out.println("음수입니다");
		}
		
		System.out.println("----------------------");
		//새로운 num 변수를 선언후 num가 짝수인지 홀수 인지 출력
		int num3=15;
		if(num3%2==0) 
		{
		System.out.println(num3+"짝수입니다");	
		}
		else
		{
			System.out.println(num3+"홀수입니다");
		}

	}

}
