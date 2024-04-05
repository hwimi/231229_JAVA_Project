package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Scanner;

public class WorldManger {

	Scanner sc = new Scanner(System.in);
	HashMap<String, String> map = new HashMap<String, String>();

	public void print() {
		int cnt = 1;
		for (String s : map.keySet()) {
			System.out.println(cnt + ":" + s + " " + map.get(s));
			cnt++;

		}

	}

	public WorldManger() {

		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("camera", "카메라");
		map.put("devil", "악마");
		map.put("elven", "11");

	}

	public void word_add(String word3, String word4) {

		map.put(word3, word4);

	}

	public void word_search(String search) {
		if (map.get(search) == null) {
			System.out.println("단어가 없습니다");
		} else if (map.get(search) != null) {
			System.out.println(map.get(search));

		}

	}

//	public void word_change(String Change1,	String change2) {
//		if(map.get(Change1)==null) {
//			System.out.println("단어가 없어서 바꿀수없습니다");
//		}
//		if(map.get(Change1)!=null) {
//			map.put(Change1, change2);
//			
//			
//			
//		}
//		
//		
//	}
	public void word_delate(String delate) {
		if (map.get(delate) == null) {
			System.out.println("단어가 없어서 삭제할수없습니다");
		}
		if (map.get(delate) != null) {
			map.remove(delate);
		}

	}

	public void word_change(Scanner sc2) {
		String Change1 = sc2.next();
		if (map.get(Change1) == null) {
			System.out.println("단어가 없어서 바꿀수없습니다");
			return;
		}

		String change2 = sc2.next();
		map.put(Change1, change2);
	}

	public void File_print() throws IOException {
		FileWriter fw = new FileWriter("word.txt");
//	for(String key:map.keySet()){	
//		String data=key+map.get(key);
//		fw.write(data);

		BufferedWriter bw = new BufferedWriter(fw);
		StringBuffer sb = new StringBuffer();

		String data = null;
		sb.append("단어장");
		sb.append("\r\n");
		int cnt = 0;

		for (String key : map.keySet()) {
			sb.append(key + ":" + map.get(key));
			cnt++;
		}
		data=sb.toString();//StringBuffer 객체여서 string 객체로 변환
		System.out.println(data);
		bw.write(data);
		if(bw!=null) {
			bw.close();
		}
		if(fw!=null) {
			fw.close();
		}

		// }

		fw.close();

	}

	// StringBuffer 객체
	// .append:기존 String에 데이터 추가 가능.

}
