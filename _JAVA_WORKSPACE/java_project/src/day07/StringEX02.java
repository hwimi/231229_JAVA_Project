package day07;

import java.util.Scanner;

public class StringEX02 {

	public static void main(String[] args) {
		/*5개의 파일명이 주어졌을때,
		 * 검색어를 입력하면 해당 단어를 포함하는 파일을  출력
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("검색어를 입력하세요");
		String filename[]= {"이것이자바다.java","java의정석.java","string.jpg"};
		//ex:java=>이것이자바다.java , java의정석.java출력
		//string=>String.jpg String 메서드.txt
		//txt=>string 메서드.txt array.txt
		//스트링=>검색 결과가 없습니다
		String a=sc.next();
		
		
		int cunt=0;
		
		 for(String s:filename) {
			 
			 
			 if(s.contains(a))
					 {
					 
				 System.out.println(s);
				 cunt++;
			
				}
			
			 }
			 
			 if(cunt==0) {
				 System.out.println("검색결과가 없습니다");
				
				 
		 }
			 
			
		 

		 
		
		
		
		sc.close();
		
		
	

	}

}
