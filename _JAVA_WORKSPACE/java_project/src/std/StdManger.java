//3
//학생 리스트후 생성 후 
package std;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//학생을 list로 구성 메뉴 내용처리

public class StdManger implements stdProgram{
	
	
	List<Student> std=new ArrayList<Student>();
	Student st=new Student();
	int cnt=0;
	String name;

	@Override
	public void printStd() {
	
	
		for(int i=0; i<std.size(); i++) {
		
		std.get(i).StudentInfo();
	
		
	}
		
	}

		
		
		
		
	

	@Override
	public void addStd(Scanner scan) {
		System.out.println("학생입력");
		String name=scan.next();
		System.out.println("나이");
		String age=scan.next();
		System.out.println("전화번호입력");
		String number=scan.next();
		Student stu=new Student(name, age, number);
		std.add(stu);
		cnt++;
		
		
	}

	@Override
	public void modStd(Scanner scan) {
		for(int i=0; i<std.size(); i++) {
			System.out.println("찾을 이름을 입력해주세요");
			if(std.get(i).getName().equals(scan.next())) {
				System.out.println("수정할 것을 찾으세요");
				std.get(i).mod(scan.next(),scan.nextInt());
				
				
			}
		}
	}
	
	@Override
	public void delStd(Scanner scan) {
		System.out.println("찾을 이름을 입력해주세요");
		for(int i=0; i<std.size(); i++) {
		if(std.get(i).getName().equals(scan.next())) {
			System.out.println("삭제할과목을 입력하세요");
			std.get(i).delate_subject(scan.next());
		}
		}
		
		
		
		
			
		}
		
		
		
	

	@Override
	public void searchStd(Scanner scan) {
		for(int i=0; i<std.size(); i++) {
			System.out.println("찾을 이름을 입력해주세요");
			if(std.get(i).getName().equals(scan.next())) {
				std.get(i).StudentInfo();
			}
			
		}
	}
	

	@Override
	public void addSub(Scanner scan) {
		for(int i=0; i<std.size(); i++) {
			System.out.println("찾을 이름을 입력하세요");
			if(std.get(i).getName().equals(scan.next())) {
				System.out.println("과목과 점수를 입력하세요");
				std.get(i).add_subject(scan.next(),scan.nextInt() );
				
			}
			
	
		}
		
		
			
	}

	@Override
	public void modSub(Scanner scan) {
		for(int i=0; i<std.size(); i++) {
			System.out.println("찾을 이름을 입력해주세요");
			if(std.get(i).getName().equals(scan.next())) {
				System.out.println("수정할것을 입력하시오");
				std.get(i).mod(scan.next(), scan.nextInt());
			}
		}
		
	}

	@Override
	public void delSub(Scanner scan) {
		for(int i=0; i<std.size(); i++) {
			System.out.println("찾을 이름을 입력해주세요");
			if(std.get(i).getName().equals(scan.next())) {
				System.out.println("삭제할 과목을 입력하시오");
				std.get(i).delate_subject(scan.next());
		}
		
	}
	}
	

	}
