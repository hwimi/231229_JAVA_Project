package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/*하루 일괄ㄹ 저장하는 list 생성
		 * 출력for문/향상된 for문/iterator 출력
		 * import 단축키 컨트롤 쉬프트 5
		 */
		List<String> day=new ArrayList<String>();
		day.add("기상");
		day.add("운동");
		day.add("낮잠");
		day.add("학원");
		day.add("잠자기");
		for(int i=0; i<day.size(); i++) {
			System.out.print(day.get(i)+" ");
		}
		System.out.println();
		System.out.println("----------");
		for(String s:day) {
			System.out.print(s+" ");
		}
		System.out.println();
		Iterator<String>it=day.iterator();
		while(it.hasNext()) {
			String tmp=it.next();
			System.out.print(tmp+" ");
		}
		//정렬
		System.out.println();
		Collections.sort(day);
		System.out.println(day);
		
		day.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//숫자는(크다 작다를 이용) --/+의 값이 출력
				//문자는 compareTo메서드를 활용하여 정렬
				
//				return o1.compareTo(o2); 오름차순
				return o2.compareTo(o1);//내림차순
				
			}
		});
		System.out.println(day);
		
	}

}
