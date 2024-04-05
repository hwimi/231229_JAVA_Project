package day08;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		printMulti(2);
		
		
		
		
		
		sc.close();
		

	}
	
	//정수 (2~9중 하나)에 해당하는 구구단이 출력 메서드
	//매개변수:2 구구단 2단이 전부다 출력되는 구구단
	//리턴 타입:void 출력=> 리턴이 없음
	
public static void printMulti (int num) {
	for(int i=1; i<9; i++ ) {
		System.out.println(num+"*"+i+"="+(num*i));
			
		
	}
	
		
		
	
	

	
	}

}
