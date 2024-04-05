package day02;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 *switch문:값에 따라 케이스를 달라주는 형식
		 *switch(변수/식){
		 *case 값1 실행문; break;
		 *case 값2 실행문; break;
		 *case 값3 실행문; break;
		 *case 값4 실행문; break;
		 *default:실행문; break;
		 *
		 *break switch 문을 빠져나갈때 사용
		 */
		
		int num=9;
		switch(num%2) 
		{
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		default:
			System.out.println("잘못입력된 값입니다");
			break;
		
		}
		
		int num2=1;
		
		switch(num2) 
		{
		case 1:
			System.out.println("숫자 1 입니다");
			
		case 2:
			System.out.println("숫자 2 입니다");
			
		case 3:
			System.out.println("숫자 3 입니다");
			
		default:
		}
		

	}

}
