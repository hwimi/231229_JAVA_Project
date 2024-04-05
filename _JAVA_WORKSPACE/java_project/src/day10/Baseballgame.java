package day10;

import java.util.Scanner;

import day08.Method07;

public class Baseballgame {
	int apple=0; //멤버변수

	public static void main(String[] args) {
		/*야구 게임 메서드화
		 * 사용자 번호는 직접이력
		 * 번호는 랜덤 생성(1~9, 중복x)
		 * 중복 안되게 하는 매서드 iscontain 호출하여 사용
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		int comnum[]=new int[3];
		int mynum[]=new int[3];
		int s=0,b=0;
		createArray(comnum);
		Method07.printarray(comnum);
		
		while(s!=3) {
			System.out.println("mynum 3개입력");
			int cnt=0;
			while(cnt<3) {
				mynum[cnt]=sc.nextInt();
				cnt++;
			}
			s=strike(comnum, mynum);
			b=ball(comnum, mynum);
			if(s!=0) {
				System.out.println(s+"S");
			}
			if(b!=0) {
				System.out.println(b+"B");
			}
			if(s==0 && b==0) {
				System.out.println("out");
				
			}
			System.out.println("종료");
		}
		
		
	
		
	
	
		
		
		
		
		
		
		sc.close();

	}
	
	/*랜덤으로 뱌열을 중복되지 않게 생성
	 * Methood07의 iscontain 사용
	 *  
	 */
	public static void createArray(int arr[]) {
		int cnt=0; 
		while(cnt<arr.length) {
			int r=(int)(Math.random()*9)+1;
			if(!Method07.isContain(arr, r)) {
				arr[cnt]=r;
				cnt++;
			}
		}
		
	}
	
	//랜덤 범위에 상관없이 랜덤수를 채우는 메서드 생성
	//범위를 매개변수로 받아오면 됨.
	//(int)(math.random()*개수)+시작값
	//start,count 매개변수 받아 범위를 생성
	public static void createArrayRandom(int arr[],int start, int count) {
		int cnt=0; 
		while(cnt<arr.length) {
			int r=(int)(Math.random()*count)+start;
			if(!Method07.isContain(arr, r)) {
				arr[cnt]=r;
				cnt++;
			}
		}
		
	}
	
	
	
	
	
	/*	strike 개수를 카운트하는 메서드
	 *  comnum,mynum를 주고 번호와 위치가 일치하면 conut ㅎ하는 메서드
	 *  리턴 타입 :int count를리턴
	 */
	public static int strike(int com[], int my[]) {
		int str=0;
		for(int i=0; i<com.length; i++) {
				if(com[i]==com[i]) { //인덱스 가운데
					str++;
					
				}
					
			}return str;
		}
	
	/*볼 개수를 카운트 하는 메서드
	 * comnum mymum
	 * 
	 */
	
	public static int ball(int com[], int my[]) {
		int ball=0;
		for(int i=0; i<com.length; i++) {
			if(Method07.isContain(my, com[i])) {
				ball++; //ball+strike 같이 체크
			}
		}
		return ball-strike(com, my);
	}
	
}
