package day12;

public class Class04 {
	/*static
	 * staitc 붙은 메서드/멤버변수 클래스 멤버변수/메서드 라고 한다.
	 * staitc 안붙은 메서드/멤버변수는 객체(인스턴스)의 엠버변수/ 메서드라고 한다.
	 * -객체의 생성없이 클래스가 만들어지면 생성
	 * -객체없이 클래스 만으로 사용이 가능.
	 * -클래스명.메서드 / 클래스명.멤버변수
	 * -객체를 생성해서 호출도 가능하지만 그렇게 잘 사용하지않는다.(노란 밑줄이 그임 노란밑줄:의미없음)
	 * -클래스의 멤버변수. 메서드는 하나의 멤버변수가 모든 객체에 공유(사용) 할때 사용
	 * 
	 * -객체의 멤버변수/메서드/ 객체를 통해서 사용되어진다, 생성(객체를 만들지 않으면 생성이 안됨)
	 * -객체명.메서드/객체명.멤버변수
	 * -각 개체마다 독립적인 객체가=> 각 개체마다 독립적인 멤버변수 , 메서드를 생성
	 * 
	 * -클래스 / 객체는 생성 시점이 달라서 메서드를 사용할수 있는 환경 자체가 다르다.
	 * -객체의 멤버는 클래스가 생성되고 난 후 객체를 생성할수 있음.
	 * -클래스 멤버는 클래스의 멤버(변수/메서드)/ 객체의 멤버(변수/메서드)에서 모두 사용될수 있습니다.
	 * -객체의 멤버는 객체에서만 사용 될수 있다.
	 */

	public static void main(String[] args) {
//		클래스 멤버에 접근하는 방식
//		Tv t=new Tv();
//		t.PrintPower();
//		t.PrintdBrand();
		
		Tv t=new Tv(); //객체 생성 시점에 객체멤버들이 생성
		t.PrintPower();//객체 메서드 사용 객체명 객체명.메서드명():
		//t.PrintdBrand();//객체를 통해서 클래스 멤버에 접근할수 있지만, 사용하지 않음.
		
	//현시점에서 브랜드는 이미 생성되어있음
		
		Tv.PrintdBrand();//클래스명.메서드명 ();호출
		Tv.PrintdBrand();

	}

}
class Tv{
	private boolean power;
	public final static String BRAND="LG";
	
	//Power 를 출력하는 메서드
	
	public void PrintPower() {
		if(power) {
			System.out.println("tv가 켜졌습니다");
		}else  {
			System.out.println("tv가 꺼졌습니다");
		}
		//객체 메서드에서 클래스 변수를 사용 할 수있음
		//클래스의 멤버는 어디서든 사용 가능.
		System.out.println("brand:"+BRAND); //가능
		
	}
	public static void PrintdBrand() {
		System.out.println("BRAND:"+BRAND);
		//클래스 메서드에서 객체 변수를 사용
		// System.out.println("power 상태"+power); //불가능
	}
}