package day20;

import java.util.HashMap;
import java.util.function.Consumer;

public class Lambda02 {

	public static void main(String[] args) {
		HashMap<String, Integer> map= new HashMap<>();
		map.put("영수", 89);
		map.put("영이", 78);
		map.put("순이", 45);
		map.put("철수", 58);
		map.put("영철", 96);
		
		map.forEach((x,y)->{
			System.out.print("이름:"+x+" "+"성적"+y+"점"+" ");
		});
		System.out.println();
		System.out.println("-----------");
		
		
		
	
//		Consumer<Integer> method=(n)->{
//			System.out.println(n+" ");
//		};
//		System.out.println("--Consumer 를 활용한 출력");
		
		Number sum=(a,b)->{return a+b;
		
		//함수구현
		};
		
		int hap=sum.add(50,60);
		System.out.println(hap);
		System.out.println(sum.add(100, 200));
		
		Number max=(a,b)->(a>=b)? a:b;
		System.out.println(max.add(50, 90));

	}

}
//함수형 인터페이스 생성
//메서드가 1개 여야만 함.
@FunctionalInterface
interface  Number{
	int add(int a,int b);
	// int max(int a, int b);//메서드가 2개면 오류가 난다
	}
