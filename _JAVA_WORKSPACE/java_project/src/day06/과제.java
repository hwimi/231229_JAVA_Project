package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*숫자를 입력받아서 거꾸로 출력. 각자리의 합계출력
		 * 11456=> 출력 65411=>6+5+4+1+1=결과값 출력
		 * 19874=> 출력 47891=>4+7+8+9+1=결과값 출력
		 */
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int arr1[]=new int[5];
		int sum=0;
		int sum1=1;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("숫자를 입력하세요");
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
			sum=sum+arr[i];
			
		}
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]+" ");
			
			
		}
		System.out.println();
		System.out.println("----");
		
		System.out.print("합계는"+sum);
		
		System.out.println();
		System.out.println("두번째");
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();
			System.out.println(arr1[i]);
			sum1=sum1+arr[1];
			
		}
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr1[i]+" ");
		}
		
		System.out.println("-------------");
		System.out.println("합계"+sum1);
		
		
	
		sc.close();

	}

}
