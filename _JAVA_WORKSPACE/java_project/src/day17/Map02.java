package day17;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/*과목과 점수를 입력받아 scanner map 저장후 종료
		 * 합계평균 출력
		 * 종료키워드가 나올때까지 반복1(1=계속 0=종료)
		 * 국어89
		 * 수학78
		 * 0종료
		 * mpa으로 저장후 출력
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int average=0;
		int meun=1;//종료 키워
		HashMap<String,Integer> score=new HashMap<>();
		do {
			
			
			System.out.println("과목과 성적을 입력하세요");
			score.put(sc.next(), sc.nextInt());
			
			
		
			System.out.println("meun");
			System.out.println("종료할려면0 누르시오 계속할려면 1");
			meun=sc.nextInt();
			
			
			}while(meun!=0);
		System.out.println("종료");
		for(String key:score.keySet()) {
			sum+=score.get(key);
		}
		
		System.out.println(sum);
		average=sum/score.size();
		System.out.println(average);
		
		sc.close();

	}

}
