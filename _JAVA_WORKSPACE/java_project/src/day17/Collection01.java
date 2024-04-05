package day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/*컬렉션 프레임워크:표준화된 방식의 자료구조
		 * List set Map=>인터페이스 반드시 구현 클래스로 객체를 생성
		 * 데이터를 묶어서 관리할때 사용
		 * 주료 배열대신 사용
		 * 
		 * List(배열과 동일)
		 * -값을 하나씩 저장
		 * -순서를 보장(index)
		 * -중복 허용
		 * -배열 대신에 가장 많이 사용하는 구조
		 * 
		 * Set
		 * -값을 하나씩 저장
		 * -순서를 보장하지 않음(index가 없음)
		 * -중복허용x(값으 자료가 입력되면 버려짐)
		 * 
		 * Map
		 * -값을 두개씩 저장 key/value 쌍으로 저장
		 * -key  중복 불가능 /value 중복불가능.
		 * -key가 중복되면 /value 덮어쓰게 됨.
		 * -아이디/패스워드와 같이 하나의 자료를 묶어서 저장해야 할 때 사용
		 * 
		 * 배열은 기본 자료형 가능 클래스 자료형으로 구성이 가능함.
		 * int arr[] String arr[] Student arr[] 다가능
		 * collection에서는 기본 자료형은 불가능함. 클래스 자료형만 구성가능
		 * 기본 자료형에 맞는 클래스 자료형을 사용하면 됨.
		 * int=>Integer, String
		 * 나머지는 기본자료형에 첫글자만 대문자로 변환하면 클래스 자료형이 됨
		 * long=>Long, byte=>Byte boolean=>Boolean
		 * 만약 클래스를 지정하지 않으면 object가 자동 설정됨.
		 * List<클래스명> 객체명=new 구현클래스<클래스명>();
		 * List=>구현 클래스 ArrayList, LinkedList
		 * ArrayList:검색시 유리(배열과 비슷)
		 * 미리 길이를 지정하지않음 추가되면 늘어남 삭제되면 줄어듬
		 * 추가 삭제가 쉽다 검색이 쉬움.
		 * 
		 * LinkedList:추가 삭제가 많을 경우 유리
		 * -값을 중간에 끼워넣거나, 빼는게쉬움,
		 * 검색이 느리다.
		 */
		
		List<Integer> list=new ArrayList<Integer>(); //부모를 기준으로 생성
		ArrayList<Integer> list1=new ArrayList<Integer>(); //자식 기준으로 생성
		ArrayList list2=new ArrayList();//object 생성
		ArrayList<Integer> list3=new ArrayList<Integer>();
		
		//add():요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		//get(index):index 번지의 요소를 가져오기
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println("---------");
		for(int i=0; i<list.size(); i++) {
		
			System.out.println(list.get(i));
		}
		System.out.println("------------");
		//set(index,값):index 번지의 값을 변경하기
		list.set(0, 5);
		System.out.println(list);
		
		//size():총개수를 확인
		System.out.println(list.size());
		System.out.println("------------");
		//문자열을 담을수 있는 arrlist를 생성
		//문자열 5개 저장한 출력
		//총개수가 몇개지인지도 출력
		List<String> list4=new ArrayList<String>();
		list4.add("길동");
		list4.add("철수");
		list4.add("바보");
		list4.add("꽃");
		list4.add("야");
		for(int i=0; i<list4.size(); i++) {
			System.out.println(list4.get(i));
		}
		System.out.println("------------");
		//향상된 for문
		for(String s:list4) {
			System.out.println(s);
		}
		//list1에 1부터10까지 값을 저장한 출력
		for(int i=0; i<10; i++) {
			list1.add(i+1);
			
			
		}
		System.out.println(list1);
		//0번지 값을 7로 저장
		list1.set(0, 7);
		System.out.println(list1);
		
		//remove(index):index번지의 값을 삭제
		//remove(object):object의 요소를 삭제
		list1.remove(0);
		System.out.println(list1);
		Integer a=9;
		list1.remove(a);
		System.out.println(list1);
		//contains(object):list에 값이 있는지 검사 true/ false
		System.out.println(list1.contains(a));
		
		//clear():리스트를 비움(요소전부 삭제)
		list1.clear();
		System.out.println(list1);
		
		//isEmpty():리스타가 비어있는지 체크 비어잇으면 true/false
		System.out.println(list1.isEmpty());
		
		//ArrayList로 number를 생성 숫자를 저장하는 리스트
		//1부터 10까지 채운후 출력(향상된 for문 이용해서)
		ArrayList<Integer>number=new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			number.add(i+1);
		}
		for(Integer s:number) {
			System.out.print(s+",");
		}
		System.out.println("------------");
		/* Iterator:index가 없는 값을 출력하기 위해 사용
		 * list에서는 순서를 보장하기 때문에 때문에 get(i)를 사용하여 원하는 번지에 접근가능
		 * set/map은 순서를 보장하지 않기 때문에 일반 for문을 사용할 수 없음.
		 * 향생된 for,iterator를 사용
		 * 순서와 상관없이 값을 가져올수 있는 구문을 사용해야함
		 * map은 향상된 for,iterator 둘다 직접 사용 불가능
		 * 
		 */
		System.out.println(">>Iterator 출력>>");
		Iterator<Integer>it= number.iterator();
		while(it.hasNext()) { //hasnext()다음 요소가 있는지 없는지 체그 true/fasle
			Integer tmp=it.next();//next 다음 요소 가져오기
			System.out.print(tmp+" ");
		}
		System.out.println();
		//indexof(값):해당값이 list에 index반환/없다면 -1리턴
		System.out.println(number.indexOf(a));
		System.out.println(number.contains(a));
		
		//number 리스트를 비우고, 값을 무작위로 5개만 추가
		number.clear();
		number.add(78);
		number.add(58);
		number.add(28);
		number.add(90);
		number.add(45);
		
		//정렬
		//collection.sort()//오른차순만 가능
		Collections.sort(number);
		System.out.println(number);
		//sort(Comparator를 구현한 객체):객체
		//Compatator 인터페이스 구현한 구현체를 넣어야함.(익명클래스 사용)
		//compareto:매서드를 구현하여 객체를 정렬
		//-compareTo:사전상 앞에 있으면 -1 같으면0 뒤에잇으면 1
		number.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		System.out.println(number);

	}

}
