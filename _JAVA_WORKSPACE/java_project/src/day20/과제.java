package day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*스트림으로 출력
		 * 여행사 상품이 있습니다.
		 * 여행비용은 15세 이상은 100만원 15세 미만은 50만원으로 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을경우
		 * 1.첫번째 비용계산=>출력
		 * 2.고객명단 검색=>출력 
		 * 3.고객 클래스를 생성하고 Arraylist로 고객관리
		 * 이름:이순신 나이:40 비용:100
		 * 이름:신사임당 나이:35 비용:100
		 * 이름:홍길동 나이:10 비용:50
		 * 20대이상 고객명단 =>이름순으로 정렬
		 * 이름:
		 * 
		 *
		 */
		
		
		List<Travel> tr=new ArrayList<Travel>();
		tr.add(new Travel("이순신", 40, 100));
		tr.add(new Travel("신사임당", 35, 100));
		tr.add(new Travel("홍길동", 10, 50));
		
		tr.stream().forEach(n->System.out.println(n+" "));
		int sum=tr.stream().mapToInt(n->n.getCost()).sum();
		System.out.println("총 가격:"+sum);
	
		tr.stream().filter(n->n.getAge()>20).sorted(new Comparator<Travel>() {

			@Override
			public int compare(Travel o1, Travel o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		}).forEach(n->System.out.println(n));
		
		//원하는 요소 고객명만 출력
//		tr.stream()
//		.map(m->m.getName())
//		.forEach(n->System.out.println(n));
	}
//익명 클래스를 사용할 경우 compartor 매개변수 2개
	//클래스 내부에서 구현할 경우 comparable 구현 대상 매개변수 1개
}
