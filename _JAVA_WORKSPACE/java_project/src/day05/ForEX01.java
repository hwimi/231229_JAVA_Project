package day05;

import java.util.Scanner;

public class ForEX01 {

	public static void main(String[] args) { //static 저장되는곳
		/*소수: 약수가 1과 자기 자신ㄴ만의 수를 가지는 수를 소수라고 한다
		 * 소수:3,5,7,11,13,17,19
		 * 소수의 약수(1, 나자신)
		 * 숫자 하나를 입력받아서 그것이 소수인지 아닌지 판별하는것
		 * num=13 소수입니다
		 * num= 12 소수가 아닙니다
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a=sc.nextInt();
		int count=0;
		int count1=0;
		
		
		
		
		for(int i=1; i<=a; i++) {
			// 약수의 갯수를세기 위해서 ㄴ돌림
			if(a%i==0) 
			{
				count++;
					
				}

		}
		
		if(count==2) {
			System.out.println("소수입니다.");
			
		}
		else {
			System.out.println("소수가 아닙니다.");
		}
		
		
		//2~100까지의 소수를 모두 출력하세요.
		
//		System.out.println();
//		
//		for(int i=2; i<=100; i++) {
//			count1=0;
//			for(int j=1; j<=i; j++ )
//			{
//				if(i%j==0) {
//				count1++;
//				}
//			
//			}
//			// System.out.println(count1);
//			if(count1==2) {
//				System.out.print(i+" ");
//			}
//		
//		}
		
		
		
		
		sc.close();
	}

}
