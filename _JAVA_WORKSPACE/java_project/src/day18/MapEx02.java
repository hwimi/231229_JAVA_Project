package day18;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		/*단어장
		 * 단어 5개를 입력받아 콘솔에 출력하는 기능
		 * --단어장--
		 * hello:안녕
		 * apple:사과
		 * orange:오렌지
		 *	map저장후 출력
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		HashMap<String, String> map=new HashMap<String, String>();
		System.out.println("단어장");
		int cnt=0;
		while(cnt<3) {
			map.put(sc.next(), sc.next());
			cnt++;
		}
		for(String s:map.keySet()) {
			System.out.print(s+":"+map.get(s));
			
		}
		
		sc.close();
	}

}
