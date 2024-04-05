package studentManger1;

public class Student {
//	-student class: 한 학생의 정보를 저장하는 클래스
//	-학번 이름 나이 전화번호 주소 수강과목s
//	-멤버변수,생성자,getter/setter,tostring
//	-멤버변수에 학생이 듣고자하는 과목을 저장
//	-멤버변수에 학생이 듣고자하는 과목을 저장 subject[]
//	-메서드:
//	-학생정보 출력 메서드(toString)
//	-수강과목 추가 메서드
//	-수강과목 삭제 
//	-수강과목 출력메서드
//int=>정수형 숫자 =>연산이 필요한 자료
	private String stdNum;
	private String stdName;
	private String stdPhone;
	private Subject SubjectList[]=new Subject[5];
	private int cnt; //subject 배열의 인덱스 역할
	
	public void Subject() {}

	public Student(String stdNum, String stdName, String stdPhone) {
		
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdPhone = stdPhone;
		
	}
	public void stdPrint() {
		System.out.println("학생명"+stdName+"("+stdName+")/"+stdPhone);
	}
	
	//수강과목 출력메서드
	public void subPrint() {
		//subject 클래스의 tostring 호출해서 출력
		if(cnt==0) {
			System.out.println("수강중인 과목이 없습니다");
			return;
		}
		for(int i=0; i<cnt; i++) {
			System.out.println(SubjectList[i]); //tostring 호출
		}
		//toString은 객체의 내용이 문자로 리턴 sysout(객체)=>tostring 호출
	}
	//수강과목을 추가하는 메서드
	public void delateSubject(String subName) {
		//수강과목 배열에서 subName을 검색하여 삭제
		int index=-1;
		if(subName==null) {
			return;
		}
		for(int i=0; i<cnt; i++) {
			if(SubjectList[i].getSubName().equals(subName)) { 
				index=i;
				break;
			}
		}
		
		if(index==-1) {
			System.out.println("찾는과목이 없습니다");
			return;
		}
		//삭제:찾은 위치부터 뒷번지 앞번지로 옮기는 작업/끝번지는 null
		for(int i=index; i<cnt-1; i++) {
			SubjectList[i]=SubjectList[i+1];
		}
		//끝번지는 null
		SubjectList[cnt-1]=null;
		//한과목 삭제 과목 개수가 줄어듬
		cnt--;
		
	}
	
	
	//매개변수 수강과목 객체 subject subjectlist 배열에 해당 객체 담기
	
	
	public void insertSubject(Subject sub) {
		if(cnt==SubjectList.length) {
			Subject tmp[]=new Subject[SubjectList.length+5];
			System.arraycopy(SubjectList, 0, tmp, 0, cnt);
			SubjectList=tmp;
		}
		
		SubjectList[cnt]=sub;
		cnt++;
	}
	

	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}
	
	
}
