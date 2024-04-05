package day10;

public class Class01 {
	
	//클래스의 구성요소:멤버변수,메서드
	//멤버변수가 먼저, 메서드가 뒤에 선언
	
	/*
	 * 클래스 -설계도
	 * 객체- 제품 프로그램
	 * 메서드- 기능 
	 * 클래스의 구성요소:멤버 변수, 메서드
	 * 멤버변수(속성,정보)
	 * 정보(기능)
	 * 프른터 클래스
	 * -속성(멤버변수):크기,색깔,제조사,제품명,종류
	 * -기능(메서드):인쇄,복사,스캔,팩스
	 * 
	 * 멤버변수는 클래스 안 가장 위쪽에서 직성/메서드는 멤버변수 뒤에 선언
	 * 멤버변수는 클래스 안에서 사용가능.(모든 메서드에서 공통적으로 사용가능)
	 * 
	 * -객체 선언
	 * 클래스명 객체명; //선언만 값은 null
	 * 객체명 =new 클래스명(): 선언한 객체의 초기값 설정 Scanner//클래스명 sc =new Scanner(system.in)
	 * -객체 선언(초기화 생성)
	 * 클래스명 객체명=new 클래스명();
	 * 
	 * -메서드 사용법(클래스가 다른 메서드를 호출할 경우)
	 * 객체 선언 후 객체명.메서드명();
	 * -같은 클래스안에서 매서드를 호출할 경우 =>매서드명();
	 * -다른 클래스안에서 매서드를 호출할 경우=>객체명.매서드명();
	 * 
	 * 접근제한자(제어자)
	 * public:모두 사용가능
	 * protected:나+패키지+자식클래스
	 * (default):나+패키지
	 * private:나
	 * private<default<protected<public
	 * 
	 * -클래스에서 pubilc 붙일 수 있는 건 파일명=클래스명 같을경우에만 가능
	 * -하나의 java 파일안에 하나의 클래스만 있을 수 있는건 아님.
	 * -멤버변수와 멤버 메서드 public 문제 없이 사용가능.
	 * 일방적으로 멤버변수는 private.메서드는 public으로 선언한다.
	 * -private :다른 클래스에서 사용(접근)할 수 없음
	 * -private 으로 선언된 멤버변수는 getter/setter 메서드를 만들어서
	 * 해당 변수에 접근할수 있도록 한다.
	 * 
	 */
	public static void main(String[] args) {
		Point p = new Point();
		p.print();
		//멤버변수가 private 되어서 직접 접근이 불가능.
//		p.x=1;
//		p.y=2;
		p.setx(1);
		p.sety(2);
		p.print();
		p.save(10, 20);
		p.print();
		System.out.println(p.getx());
		System.out.println(p.gety());
		//현재 시점의 x+y 값을 합을 x 값으로 설정=> x 값을 출력
		p.setx(p.getx()+p.gety());
		
		System.out.println(p.getx());
		
		p.sety(50);
		p.print();
		
		
		
	}
	
}

//다른 클래스를 생성시 클래스 밖에서 생성
//(1.0)(x,y)의 좌표값을 출력하는 메소드

class Point{
	 //멤버변수 위치
	 //멤버변수 초기값을 설정하지않아도 자동으로 설정이 된다.
	private int x;
	private int y;
	
	public void print() {
		System.out.println("("+x+","+y+")");
		
	}
	//포인트 값을 저장하는 메서드
	public void save(int x,int y) {
		//this:멤버변수를 저장하는 키워드
		this.x = x;
		this.y = y;
		
	}
	
	//getter(데이터를 가져오는 메서드)
	public int getx() {
		return this.x;
		
	}
	public int gety() {
		return this.y;
	}
	//setter(데이터를 변경하는 메서드)
	public void setx(int x) {
		this.x=x;
	}
	public void sety(int y) {
		this.y=y;
	}
	
}





