package day18;

import java.util.HashMap;

public class Mapex01 {

	public static void main(String[] args) {
		//맵을 이용하여 상품과 가격을 추가하여 합계를 구하시오
		//상품을 map 추가하는 작업은 메서드를 활용
		//1.map을 main 에서 생성해놓고 매개변수로 받아 map의 데이터를 채우는 메서드
		//2.map을 메서드 내부에서 생성하여 main으로 리턴하는 메서드
		HashMap<String, Integer> map=new HashMap<>();
		int sum=0;
		Mapex01 m=new Mapex01();
		m.makemap(map);
//		for(String s:map.keySet()) {
//			System.out.println(s+":"+map.get(s));
//			sum+=map.get(s);
//			
//			
//		}
//		System.out.println(sum);
		m.makemap3_print(map);
		
		
		
		
			

	}
	//map을 매개변수로 받는케이스
	public void makemap(HashMap<String, Integer>map) {
		map.put("가위", 2500);
		map.put("크레파스", 4000);
		map.put("물감", 5000);
		
			
		}
		
	
		
		
	
	//map을 내부에서 생성하여 리턴하는 케이스
	public static HashMap<String, Integer> makeMap2() {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("가위", 3000);
		map.put("크레파스", 5000);
		map.put("물감", 6000);
		return map;
		
	}
	//map을 받아서 출력하는 매서드
	public void  makemap3_print(HashMap<String, Integer>map){
		HashMap<String, Integer> map1=new HashMap<>();
		int sum=0;
		map.put("가위", 4000);
		map.put("가위", 4000);
		map.put("가위", 4000);
		for(String ab:map.keySet()) {
			sum+=map.get(ab);
		}
		System.out.println(sum);
		
	}

}
