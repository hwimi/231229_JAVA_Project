package day03;

public class While02 {

	public static void main(String[] args) {
	int i=0;
	while(i<50) {
		i++;
		if(i%2==0) {
			System.out.printf("%3d",i);
		}
		if(i%10==0) {
			System.out.println();
		}
	}
	System.out.println("출력구문");
	/*
	 * Sysytem.out.println:줄바꿈이 잇는출력
	 * Sysytem.out.print:줄바꿈이 없는 출력 출력값이 없으면 error
	 * System.out.printf:지시자를 이용한 출력
	 * %d(정수형),%f(실수형),%c(문자형) %s(문자열)
	 * 소수점 설정가능 공백 추가기능
	 */
	System.out.println();
	System.out.printf("%.2f",1.6666);
	System.out.println();
	int num1=5;
	int num2=3;
	System.out.println(num1+"+"+num2+"="+(num1+num2));
	System.out.printf("%d+%d=%d",num1,num2,(num1+num2));
	double num3=1.2;
	double num4=5;
	//1.2/5
	System.out.println();
	System.out.printf("%.1f/%.1f=%.1f",num3,num4,(num3/num4));
	
			
		

	}

}
