package day15;
/*객체 지향 프로그램에서는 4가지의 특징
 * -프로그램을 독립된 단위의 개게들을 모아서 처리하는 모임.
 * -각각의 객체는 메시지를 주고 받으면서 데이터를 처리하는
 * 추상화 캡슐화(정보은닉) 상속 다형성
 * -추상화(abstract)-핵심적인 코드만 보여주기
 * -구현된 부분과 구현되지 않은은 부분으로 분리한다/
 * -불필요한 부분은 숨긴다.
 * -캡슐화(Encapsulation)-데이터 보호(정보은닉)
 * -멤버변수(필드)는 숨기고 메서드로 접근
 * -멤버변수와 메서드를 하나로 묶어서 처리
 * -은닉화:객체의 내부의 정보는 숨겨 외부로 드러나지 않게 하는것
 * 		외부에서 데이터에 직접 접근하는 것을 방지
 * -상속(Inheritance)-코드 재사용(확장)
 * -클래스를 상속받아 수정하여 사용하면 중복 코드를 줄일 수 있음.
 * 유지보수가 편함
 * -다형성(polymorphism)- 객체 형변환 용이
 * -하나의 코드가 여러 자료(객체)형으로 구현되어 실행되는 것
 * -코드는 같은데 들어오는 객체에 따라 다른 실행결과를 얻을수 있음
 * -다향성을 잘 활용하여 유연하고 확장성있는 유지보수가 편리한 프로그램을 만들수 있음
 */



class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사람은 두발로 걷습니다.");
		
	}
	public void readBook() {
		System.out.println("사람은 책을 읽을수 있습니다.");
	}
	
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이는 네발로 어슬렁 거립니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	
	}
}

class Eagle extends Animal{
	
public void move() {
	System.out.println("독수리가 하늘을 날아다닙니다.");
	
	
}
public void flying() {
	System.out.println("독수리가 멋지게 비행합니다");
}

}


class Dog{
	public void move() {
		System.out.println("강아지가 아장아장걷습니다");
	}
	
}


public class 다형성01 {
		

	public static void main(String[] args) {
		
		Human h=new Human();
		h.move();
		h.readBook();
		Tiger t=new Tiger();
		t.move();
		t.hunting();
		Eagle e=new Eagle();
		e.move();
		e.flying();
		Dog d=new Dog();
		d.move();
		
		
		
		Animal hAnimal=new Human(); //조상의 클래스로 자식의 객체 생성가능 조상의 클래스에서 상속받은것만 실행가능
		hAnimal.move();
		Animal tAnimal=new Tiger();
		tAnimal.move();
		Animal eAnimal=new Eagle();
		eAnimal.move();
		System.out.println();
		
		다형성01 ex1=new 다형성01();
//		ex1.moveAnimal1(h);
//		ex1.moveAnimal2(t);
//		ex1.moveAnimal3(e);
//		ex1.moveAnimal(hAnimal);
//		ex1.moveAnimal(tAnimal);
//		ex1.moveAnimal(eAnimal);
		ex1.moveAnimal(e);
		ex1.moveAnimal(t);
		ex1.moveAnimal(h);
		System.out.println();
		System.out.println("Animal 배열 생성");
		Animal anlist[]=new Animal[5];
		int cnt=0;
		anlist[cnt]=hAnimal;
		cnt++;
		anlist[cnt]=tAnimal;
		cnt++;
		anlist[cnt]=eAnimal;
		cnt++;
		
		for(int i=0; i<cnt; i++) {
			anlist[i].move();
		}
		
		System.out.println();
		System.out.println("----다운케스팅 예시-----");
		//휴면을 담을수있는 자료형의 객체에=애니멀을 상속받은 휴먼 클래스 객체를 담은 케이스
		Human human=(Human)hAnimal;
		human.readBook();
		//ClassCastException 다운 캐스팅의 잘못된 예시
//		Human human1=(Human)tAnimal;
//		human1.readBook();
		
		//instanceof:객체가 해당 클래스의 형에 맞는지 체크하는 연산자
		System.out.println("--instanceof--");
		System.out.println(tAnimal instanceof Human);
		System.out.println(tAnimal instanceof Tiger);
		System.out.println(tAnimal instanceof Eagle);
		
		Animal downCastingTest=eAnimal;
		if(downCastingTest instanceof Human) {
			Human testHuman=(Human)downCastingTest;
			testHuman.readBook();
		}
		else if(downCastingTest instanceof Tiger) {
			Tiger testTiger=(Tiger)downCastingTest;
			testTiger.hunting();
		}
		else if(downCastingTest instanceof Eagle) {
			Eagle testeEagle=(Eagle)downCastingTest;
			testeEagle.flying();
		}
		else {
			System.out.println("error");
		}
		
		
		
		
	}
	//각 객체의 move를 실행해주는 메서드 생성
//	public void moveAnimal1(Human human) {
//		human.move();
//		
//	}
//	public void moveAnimal2(Tiger tiger) {
//		tiger.move();
//		
//	}
//	public void moveAnimal3(Eagle eagle) {
//		eagle.move();
//		
//	}
	
	//다향성의 예시(업케스팅:자동 형변환 기능)
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
