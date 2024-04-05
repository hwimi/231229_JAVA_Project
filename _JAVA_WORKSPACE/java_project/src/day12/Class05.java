package day12;

public class Class05 {
	/* 객체를 생성 시 값을 초기화 하는 방법
	 * -기본 생성자 명시적 초기값, 초기화 블럭, 생성자
	 * 1. 기본값:기본적으로 지정되는값 값 int=>0,String=>null
	 * 2. 명시적 초기값:멤버변수를 선언함과 동시에 값을 지정하는 방법
	 * 	private String name="홍길동";
	 * 3. 초기화 블럭:{}멤버변수를 초기화 하는 방법
	 * 4. 생성자: 객체를 생성할때 초기화를 생성하는값
	 * 
	 * 초기값의 우선순위
	 * 기본값=>명시적 초기값->초기화 블럭
	 * 
	 */

	public static void main(String[] args) {
		EzenStudent e=new EzenStudent();
		e.setName("이휘근");
		e.setNumber("010-5064-2820");
		e.setAddress("인천 서구 건지로 284번길 14-1");
		e.print();
		new EzenStudent(null, null, null, null);
		System.out.println();
		
		
		
		EzenStudent e1=new EzenStudent("gigum","홍길동", "111-111-111", "바보");
		e1.print();
		//to String()메서드가 없으면 객체의 주소가 출력
		//to String()메서드가 있으면 toString
		
		EzenStudent e2=new EzenStudent("gigum","박수", "123-456-789", "바보");
		e2.print();
		
		EzenStudent e3=new EzenStudent("gigum","헤이오", "111-111-111", "바보");
		e3.print();
		
		EzenStudent e4=new EzenStudent("gigum","이로하", "111-111-111", "바보");
		e4.print();
		
		EzenStudent studentarr[]=new EzenStudent[5] ;
		studentarr[0]=e;
		studentarr[1]=e1;
		studentarr[2]=e2;
		studentarr[3]=e3;
		studentarr[4]=e4;
		
		//홍길동 학생이 듣고 있는 과목을 출력
		String serachname="박수";
		System.out.println(serachname+":"+"학생의 전화 번호는>");
		for(int i=0; i<studentarr.length; i++) {
			if(studentarr[i].getName().equals(serachname)) {
				System.out.println(studentarr[i].getNumber());
				
			}
			
		}
		//순이가 java를 들을려고 했는데 빅데이터로 변경
		String modify="이로하";
		
		System.out.println(modify+":"+"현재 번호는");
		for(int i=0; i<studentarr.length; i++) {
			if(studentarr[i].getName().equals(modify)) {
				studentarr[i].setNumber("456-789-123");
				System.out.println(studentarr[i]+" ");
				studentarr[i].print();
				

			}
			
				
		
		}
		//학생이 없으면 명단에 없습니다
		int cnt=0;
		String number1="456";
		System.out.println(number1+" 번호를 가지고 있는 학생명단");
		for(int i=0; i<studentarr.length; i++) {
			if(studentarr[i].getNumber().equals(number1)) {
				System.out.println(studentarr[i]+" ");
				cnt++;
				
			}
			
			
				
		
				
				
				
			
			}
			
		if (cnt==0) {
			System.out.println("명단에 없습니다");
		}
		}
		
	
		
		
	}


class EzenStudent{
	//학생의 정보를 생성하는 클래스
	
	private String gigum="Incheon";//명시적 초기값
	private String name;
	private String number;
	private String address;
	

	
	public EzenStudent() {
		
	}
	
	
	public EzenStudent(String gium,String name, String number, String address) {
		// super(); //내 부모 클래스의 생성자 호출
		this.name=name;
		this.number=number;
		this.address=address;
		
	}
	
	
	

	public void print() {
		System.out.println("지점:"+gigum+" "+"이름:"+name+" "+"전화번호"+number+" "+"주소:"+address);
	}
	
	{
		//초기화 블록 영역
		gigum="인천";
		name="미상";
		
	}

//to string:print 메서드를 대체 가능
@Override
	public String toString() {
		return gigum+":"+"[name:" + name + ", number:" + number + ", address:" + address + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}