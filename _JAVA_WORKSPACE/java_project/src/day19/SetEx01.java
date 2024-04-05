package day19;


import java.util.HashSet;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		// set 중복저장X
		// set 로또번호 6개 생성후 출력
		// 랜덤번호 1~45
	
		HashSet<Integer> lotto=new HashSet<Integer>();
//		for(;;) {
//			int random=(int)(Math.random()*45)+1;
//			if(lotto.size()==6) {
//				break;
//			}
//			lotto.add(random);
//			
//		}
//		
			
		System.out.println(lotto);
		System.out.println();
		System.out.println("-----------");
		while(lotto.size()<6){
			int random1=(int)(Math.random()*45)+1;
			lotto.add(random1);
		}
		System.out.println(lotto);
	//set 중에서 정렬이 되는 set TreeSet
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		while(treeSet.size()<6) {
			int random1=(int)(Math.random()*45)+1;
			treeSet.add(random1);
		}
		System.out.println(treeSet);
		//first() 가장 앞에 있는값 last 가장 뒤에있는값
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		//headSet 지정한 값보다 작은값
		//taliSet 지정한 값보단 큰값
		System.out.println(treeSet.headSet(20));
		System.out.println(treeSet.tailSet(20));
		//subSet:검색 범위 지정 뒤쪽 값은 미포함
		System.out.println(treeSet.subSet(15, 30));
		
		
	}
	}

	
	
