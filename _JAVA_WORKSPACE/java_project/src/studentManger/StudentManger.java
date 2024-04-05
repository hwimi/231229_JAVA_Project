package studentManger;

import java.util.Scanner;


public class StudentManger implements program {
	Scanner sc=new Scanner(System.in);
	Student s[]=new Student[5]; //student 배열을 만든것
	//서브젝트를 포함한 student 객체
	int cnt=0;
	String name;

	@Override
	public void printStudent() {
		for(int i=0; i<cnt; i++) {
			s[i].Studentinformation();
			
		}
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		if(cnt>4) {
			System.out.println("더이상 추가 할수 없습니다");
			
		}
		else if(cnt<=4) {
		
			System.out.println("코드 이름 나이  폰번호 주소를 입력해주세요");
			Student st=new Student(sc.next(),sc.next(),sc.next(),sc.next(),sc.next()) ; 
			s[cnt]=st;
			cnt++;
			}
		
			
		
	}

	@Override
	public void serachsStudent(Scanner scan) {
		System.out.println("이름입력해주세요");
		name=sc.next();
		for(int i=0; i<cnt; i++) {
			if(name.equals(s[i].getName())) {
				printStudent();
				s[i].subjectinformation();
				
			}
		}
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		serachsStudent(sc);
		for(int i=0; i<cnt; i++) {
			if(name.equals(s[i].getName())) {
				System.out.println("과목코드와 과목명을 입력해주세요. ");
				Subject s1=new Subject(sc.next(),sc.next());
				s[i].add_subject(s1);
				
				
				
				
			}
			
		}
		
		
		
		
		
			
			
		}
	@Override
	public void deleteSubject(Scanner scan) {
		serachsStudent(sc);
		for(int i=0; i<cnt; i++) {
			if(name.equals(s[i].getName())) {
				
				
				
			}
		}
		
	}

	

}
