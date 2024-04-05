package day20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/*Stream(스트림)
		 * -실제 입력/출력이 표현된 데이터의 이상화된 흐름
		 * -스트림은 자료에 대한 스트림을 생성하여 연산
		 * -그 연산을 다 수행하면 스트림은 소모딤.
		 * -스트림 연산은 기존 자료에 변경을 유발하지않음
		 * -스트림은 기존 자료를 복사하여 복사본은 연산에 사용
		 * -중간연산과 최종연산으로 구분됨.
		 * -중간연산은 메서드를 이여서 사용할 수 있음.
		 * -distinct():중복제거,filter():조건에 맞는값만 다음 스트림으로 넘김,limit():스트림의 일부를 잘라냄,skip():스트림의 일부를 건너뜀,peek():작업수행, sorted():정렬
		 * -최종연산은 마지막에만 가능.
		 * forEach():,count(),sum(),allMatch():스트림요소가 전부 일치하는지,anyMatch()하나라도 일치하는지,toArray():배열로 변환,collect:스트림 수집...
		 * 
		 */
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
					
		}
		System.out.println(sum);
		System.out.println("--스트림을 이용한 합계--");
		int total=Arrays.stream(arr).sum();
		System.out.println(total);
		System.out.println("--count()--");
		long cnt=Arrays.stream(arr).count();
		System.out.println(cnt);
		System.out.println("--average()--");
		OptionalDouble average=Arrays.stream(arr).average();
		System.out.println(average);
		
		//arr 값중 5 이상의 값만 합계
		int s5=Arrays.stream(arr).filter(n-> n>=5).sum();
		System.out.println(s5);
		
		//정수배열을 생성한 후 70점 이상만 합계,평균
		int arr1[]= {60,40,50,60,70,80,90,95,87};
		int s1=Arrays.stream(arr1).filter(n-> n>=70).sum();
		System.out.println("70점 이상 합계:"+s1);
		OptionalDouble s2=Arrays.stream(arr1).average();
		System.out.println("평균:"+s2);
		OptionalInt s3=Arrays.stream(arr1).max();
		System.out.println("최고:"+s3);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(8);
		list.add(6);
		System.out.println("list를 Stream 으로 구성");
		list.stream().forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println("--distinct--():증복제거--");
		list.stream().distinct().forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println("sorted():정렬");
		list.stream()
		.distinct()
		.sorted()
		.forEach(n->System.out.print(n+" "));
		System.out.println();
		
		System.out.println("스트림 객체 생성");
		Stream<Integer> s10=Stream.of(10,20,40,50,90,30);
		System.out.println("--integer 스트림 합계--");
		//map:스트림 변환에 사용하는 중간연산
		//mapToint:map 값을 int로 변환
		int s9=s10.mapToInt(n-> n.intValue()).sum();
		System.out.println(s9);
//		s10.forEach(n->System.out.println(n+" ")); //스트림 객체는 1회용 이다. 한번 쓰면 소모

	}

}
