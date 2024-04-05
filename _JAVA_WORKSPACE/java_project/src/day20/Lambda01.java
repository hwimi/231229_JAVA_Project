package day20;

import java.util.ArrayList;

import day02.inputClass;

public class Lambda01 {

	public static void main(String[] args) {
		/* lambda:람다식(식을 단순하게 표현하는 방법)
		 * 외부자료의 부수적인 영향(side effect) 를 주지 않도록 구현하는 방식
		 * Lambda+Stream=>람다와 스트림
		 * Stream:자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * -메서드 체이닝 기법을 사용
		 * lambda functions:람다 함수=>익명클래스를 사용하여 쓰는 함수
		 * 람다의 장점:코드의 간결성 병렬처리 가능,불피요한 코드를 최소화 할수 있다.
		 * 단점:가독성이 떨어짐. 반복문 사용시 성능 저하
		 * 림디 표현식
		 * (매개변수)->{구현};
		 * 매개변수가 1개면 () 생략가능.
		 * x->{return x+1;}
		 * x,y->x+y //오류
		 * x->return x+1; 오류
		 * return 없으면 {}생략가능
		 * x->x+1;
		 * (x,y)->x+y;
		 * (x,y)->(return x+y)
		 * 
		 */
		
		
		
		
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(20);
		list.add(40);
		list.add(80);
		list.add(70);
		list.add(60);
		
		for(Integer tmp:list) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("-------람다식 처리--------");
		list.forEach(n->{
			System.out.print(n+" ");
		});
		
	}

}
