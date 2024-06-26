package studentManger1;

import java.util.Scanner;

public class StudentManger implements Program {

	//학생의 배열을 멤버변수로 추가
	private Student studentList[]=new Student[5];
	private int stdcnt;
	@Override
	public void printStudent() {
		System.out.println("------전체 학생 정보");
		for(int i=0; i<stdcnt; i++) {
		studentList[i].stdPrint();
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("학생명>");
		String stdNum=scan.next();
		System.out.println("이름>");
		String name=scan.next();
		System.out.println("전화번호>");
		String phone =scan.next();
		
		Student s=new Student(stdNum,name,phone);
		if(stdcnt==studentList.length) {
			Student tmp[]=new Student[studentList.length+5];
			System.arraycopy(studentList, 0, tmp, 0, stdcnt); //arraycopy 배열복사
			studentList=tmp;
		}
		studentList[stdcnt]=s;
		stdcnt++;
		
		
	}

	@Override
	public void serachsStudent(Scanner scan) {
		//검색할 학생 이름을 입력받아 배열에서 탐색 후 있다면
		//학생정보+수강정보 출력
		System.out.println("검색할 학생명>");
		String searchname=scan.next();
		
		//배열탐색
		for(int i=0; i<stdcnt; i++) {
			if(searchname.equals(studentList[i].getStdName())) {
				studentList[i].stdPrint();
				studentList[i].subPrint();
				return;
			}
			
		}
		System.out.println("검색할 이름이 없습니다");
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 누가 무슨과목을 추가할지 설정
		// 수강신청할 학생이름을 입력받아 학생의 위치를 탐색후
		System.out.println("수강신청 학생명>");
		String name=scan.next();
		int index=-1;// 학생의 번지를 저장하기 위한 변수
		//학생 위치탐색후
		for(int i=0; i<stdcnt; i++) {
			if(name.equals(studentList[i].getStdName())) {
				index=i;
				break;
			}
			if(index==-1) {
				System.out.println("학생정보가 없습니다");
				return;
			}
		}
		//그 학생의 배열에 수강과목[]을 추가
		//수강과목의 객체를 생성하여
		System.out.println("수강신청 과목>");
		String sName=scan.next();
		Subject s=new Subject(sName);
		//Student 클래스의 insertsubject 호출 (해당 배열추가)
		studentList[index].insertSubject(s);
		
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("수강삭제할 학생명>");
		String name=scan.next();
		int index=-1;// 학생의 번지를 저장하기 위한 변수
		//학생 위치탐색후
		for(int i=0; i<stdcnt; i++) {
			if(name.equals(studentList[i].getStdName())) {
				index=i;
				break;
			}
			if(index==-1) {
				System.out.println("학생정보가 없습니다");
				return;
			}
		}
		//그 학생의 배열에 수강과목[]을 추가
		//수강과목의 객체를 생성하여
		System.out.println("수강삭제 과목>");
		String sName=scan.next();
		//해당 학생의 수강삭제 메서드 호출
		studentList[index].delateSubject(sName);
		
	}

}
