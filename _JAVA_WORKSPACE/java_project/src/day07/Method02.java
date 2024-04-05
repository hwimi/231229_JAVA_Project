package day07;

public class Method02 {

	public static void main(String[] args) {
		/*+ - * / % 메서드 생성하고 
		 * main에서 호출 하여 생성
		 * 두정수의 합을 알려주는 메서드 sum
		 * 두정수의 차을 알려주는 메서드 sub
		 * 두정수의 곱을 알려주는 메서드 mul
		 * 두정수의 몫을 알려주는 메서드 div
		 * 두정수의 나머지을 알려주는 메서드 mod
		 *  
		 */
		int sum=sum(10, 20);
		System.out.println(sum);
		int sub=sub(10, 20);
		System.out.println(sub);
		int mul=mul(10, 20);
		System.out.println(mul);
		int div=div(10, 20);
		System.out.println(div);
		int mod=mod(10, 20);
		System.out.println(mod);
		

	}
	//메서드 선언위치
	public static int sum(int num1,int num2) {
		return num1+num2;
		
		
	}
	public static int sub(int num1,int num2) {
		if(num1<num2) {
			return num2-num1;
		}
		return num1-num2;
	}
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	public static int div(int num1, int num2) {
		if(num1<num2) {
			return num2/num1;
		}
		return num1/num2;
	}
	public static int mod(int num1, int num2) {
		if(num1<num2) {
			return num2%num1;
		}
		return num1%num2;
	}
}
