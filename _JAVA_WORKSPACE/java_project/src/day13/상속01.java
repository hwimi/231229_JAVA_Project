package day13;

public class 상속01 {

	public static void main(String[] args) {
		/*
		 * 상속:부모의 것을 자식에게 물려주는 것
		 * 멤버변수 멤버메서드만 상속가능
		 * 클래스의 확장 개념.
		 * 상속을 하는 이유:재사용 해서 중복코드를 줄이고 유지보수를 쉽게하기 위해
		 * class A(부모) class B(자식)
		 * 
		 * class B extends A{
		 * }
		 * 상속키워드는:extends
		 * 
		 * -상속을 받으면 부모의 멤버변수와 메서드를 사용할수있다.
		 * -접근 제한자 private이면 자식 클래스에서 접근 불가능.
		 * -접근제한자 protected :상속받는 자식에게 허용하는 제어자
		 * 
		 */
		A a=new A();
		a.setA(10);
		a.setB(20);
		a.setC(30);
		a.setNum(100);
		a.print();
		
		B b=new B();
		b.setA(100);
		b.setB(200);
		b.setC(300);
		b.num=(1000);
		b.print();
		System.out.println("-----------");
		b.setD(10);
		b.setE(20);
		b.setF(30);
		b.print();
		

	}

}

class A{//부모 클래스
	private int a,b,c; //나만 사용
	protected int num; // 상속 가능
	public void print() {
		System.out.println("a:"+a+" "+"4b:"+b+" "+"c:"+c);
		System.out.println("num"+num);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
class B extends A{//자식클래스
	private int d,e,f;
	

	//override(오버라이드):부모의 메서드를 재정의하여 사용하는것. 
	//super:부모의 값을 가져올때 사용하는 키워드
	@Override
	public void print() {
		
		super.print(); //부모의 print를 메서드를 호출하여 출력
		System.out.println("d:"+d+" "+"e:"+e+" "+"f:"+f);
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	
}

