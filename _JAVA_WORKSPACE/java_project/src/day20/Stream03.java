package day20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.type.ArrayType;

public class Stream03 {

	public static void main(String[] args) {
		//Student 클래스로 리스트 구성
		//add로 5명 추가
		//스트림에 이용하여 콘솔에 출력 ex)홍길동:98
		List<Student> std=new ArrayList<Student>();
		Student st=new Student();
		std.add(new Student("홍길동",80));
		std.add(new Student("이기철", 75));
		std.add(new Student("이기영", 60));
		std.add(new Student("이순신", 77));
		std.add(new Student("율이이", 40));
		std.stream().forEach(n->System.out.print(n));
		
		
	
		System.out.println("--------");
		std.stream()
		.forEach(n->{
			String name=n.getName();
			int score=n.getScore();
			System.out.print("이름:"+name+" "+"점수"+score);
		});
		//list 점수 합계와 /전체 인원수 출력
		System.out.println();
		long cnt=std.stream()
			.count();
		System.out.println("총인원수:"+cnt); //인원수 계산
		System.out.println();
		System.out.println("점수합계");
		int sum=std.stream()
				.mapToInt(n->n.getScore()).sum();
		System.out.println("점수합계"+sum);
		
		
//		int sum1=std.stream()
		
		
		
		

	
	}
}
