package day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File05 {

	public static void main(String[] args) throws IOException {
		/*
		 * test.txt 파이을 읽어들여 mpa 저장하여 명단 합계 평균을 출력
		 * txt 값에서 들이는 값은 모두 string  변환이 필요
		 * Integer.parseInt(); 변환 String->int로 변환
		 */

		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		int sum = 0;
	
		while (true) {
			String line = br.readLine();// 한 라인 읽어오기
			if (line == null) {// 더이상 읽은 라인이 없으면 null 
				break;
			}
			
			//substring(포함,미포함)
			String name=line.substring(0,line.indexOf(" "));
			int score=Integer.parseInt(line.substring(line.indexOf(" ")+1));
			sum+=score;
			map.put(name, score);
		}
		System.out.println(map);
		System.out.println("합계:"+sum+"/"+"평균:"+(double)sum/map.size());
		//br 끊기
		if(br!=null) {
			//객체가 생성되었다면 끊기
		}
		br.close();
	}

}
