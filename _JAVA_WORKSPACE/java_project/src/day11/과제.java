package day11;

public class 과제 {

	public static void main(String[] args) {
		/*메서드를 이용하여 작업
		 * 두정수의 값이 주어졌을때 두 정수의 사이의 모든 정수의 합을 리턴하는 메서드
		 * ex)a=3,b=5=> 3+4+5
		 * ex)a=5,b=1=>1+2+3+4+5
		 * ex)a=3 b=3=>3
		 */
		과제 a=new 과제();
		System.out.println(a.hap(5, 3));
		System.out.println(a.hap(3, 5));
		System.out.println(a.hap(3, 3));
		
		

	}
	//1. 들어가는값(매개변수), 나오는값(리턴타입)
	//매개변수: int a, int b 리턴타입 hap
	public int hap(int num1, int num2){
		int hap=0;
		if(num1>num2) {
			for(int i=num2; i<=num1; i++)
				hap+=i;
		}
		else if(num1<num2) {
			for(int i=num1; i<=num2; i++) {
				hap+=i;
			}

			
		}
		else if(num1==num2) {
			hap=num1;
		}
		return hap;
		
		
	}	


	
}
