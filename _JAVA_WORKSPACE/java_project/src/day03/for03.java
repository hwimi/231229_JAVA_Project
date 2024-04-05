package day03;

import java.util.Scanner;

public class for03 {

	public static void main(String[] args) {
		/*약수 : 나누어 떨어지는 수의 집합
		 * 6의 약수: 1,2,3,6? 6/1 6/2 6/3 6/4 6/5 6/6
		 * 
		 */
		int num=12;
		//num를 1~num까지 나눈 나머지가 0인 수를 출력
		for(int i=1; i<=num; i++) 
		{
			if(num%i==0) {
				System.out.print(i+" ");
				
			}
		}
//num1 를 입력받아서 약수를 출력받으세요
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a=scan.nextInt();
		for(int i=1; i<=a; i++)
			if(a%i==0) {
				System.out.print(i+" ");
			}
		
		scan.close();
	}

}
