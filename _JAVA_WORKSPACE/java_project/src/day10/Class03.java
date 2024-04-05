package day10;

public class Class03 {

	public static void main(String[] args) {
		
		Car1 c=new Car1(); //Car1클래스를 통해 c 객체를 생성 new 키워드를 통해 생성 car1() 이라는 생성자에 의해 초기화 된다
		c.setName("스파크");
		c.setColor("빨간색");
		c.setYear("2024");
		c.print();
		c.power();
		c.print();
		
		Car1 c2=new Car1("소나타","2021");
		c2.print();
		
		Car1 c3=new Car1("아반떼","2020","빨강",4);
		c3.print();
		
		
		
		
		
		

	}

}


//같은 패키지에서 같은 이름의 클래스를 사용하면 error 가 난다.
class Car1{
	
	//멤버면수: name,year,color,power,speed
	//내 차량의 메서드를 출력하는 메서드 (name year colo door 출력을 하는 메서드)
	//power()
	//시동이 켜졌습니다/ 시동이꺼졌습니다.
	//speed up/speed down
	//getter/setter
	//speeddown
	//속도가 0이면 더이상 내려가지않음.(멈췄습니다.)
	//현재속도가 얼마인지 출력을 해준다.
	//speedup down 기본 조건은 power가 켜져있어야한다.
	//시동이 꺼져있는 상태라면 시동이 꺼져있습니다 라는 시동을 켜주세요 라는 출력을 한다.
	//현재 속도를 출력을
	//power 있는데 파워를 끌수없다
	
	private String name;
	private String color;
	private String year;
	private boolean power;
	private int speed;
	private int door;
	
	//생성자 위치
	public Car1() {
		//기본 생성자
	}
	//생성자는 여러개 만들 수 있음.(생성자 오버로딩)
	//오버로딩 조건: 매개변수의 개수가 달라야한다. 타입이 달라야함 
	public Car1(String name, String year, String color, int door) {
		this(name,year); //생성자 호출
		this.color=color;
		this.door=door;
		
	}
	public Car1(String name, String year) {
		this.name=name;
		this.year=year;
	}
	
	{
		//내가 원하는 멤버변수의 값을 초기화 하수 있음
		color="red";
		door=4;
	}
	
		
	
	
	public void power() {
		power=!power;
		if(power) {
			System.out.println("시동 켜짐");
		}
		else {
			System.out.println("시동이 꺼졌습니다");
		}
	}
	public void speedUp() {
		if(!power) {
			System.out.println("시동켜짐");
		}
		else if(power) {
			speed+=10;
		}
		if(speed>=300) {
			speed=300;
			System.out.println("최고 속도입니다 속도를 줄여주세요");
		}else {
			speed+=10;
		}
		System.out.println("현재속도는:"+speed+"km");
			
		}
	public void speedDown() {
		if(speed<=0) {
			speed=0;
		}
		else {
			speed-=10;
			
		}
		System.out.println("현재속도는:"+speed+"km");
	}
	
	
	
	public void print() {
		System.out.println("my car:"+name+"/"+color+door+"("+year+")");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}

	
	
	
}
