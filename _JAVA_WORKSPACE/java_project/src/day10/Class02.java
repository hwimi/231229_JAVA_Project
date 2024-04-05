package day10;

public class Class02 {

	public static void main(String[] args) {
		Car c=new Car();
		c.setName("스파크");
		c.setColor("빨간색");
		c.setYear("2024");
		c.print();
		c.power();
		System.out.println("my Car:"+(c.isPower()? "on":"off"));
		c.power();
		System.out.println("my Car:"+(c.isPower()? "on":"off"));
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println("my car speed:"+c.getSpeed());
		c.speedDown();
		c.speedDown();
		c.speedDown();
		System.out.println("my car speed:"+c.getSpeed());
		
		Car c2=new Car();
		c2.setName("그렌저");
		c2.setColor("검정");
		c2.setYear("2003");
		c2.print();
		c.power();
		System.out.println("my Car2:"+(c.isPower()? "on":"off"));
		c.power();
		System.out.println("my Car2:"+(c.isPower()? "on":"off"));
		
		System.out.println("my car speed:"+c2.getSpeed());
		
	
		

	}

}

class Car{ //클래스명은 대문자로 시작함
	//멤머변수는 =private 설정
	//매서드는 public 설정=>getter/setter 메서드
	
	private String name;
	private String color;
	private String year;
	private boolean power;
	private int speed;
	
	//power()
	public void power() {
		power=!power;
		
	}
	//꺼져있을경우=>켜짐
	//켜져있을경우=>꺼짐
	
	//speeUp()
	public void speedUp() {
		if(speed>=300) {
			speed=300;
		}
		else {
			speed+=10;
		}
		
		
		
	}
	
	//speedDown()
	public void speedDown() {
		if(speed<=0) {
			speed=0;
		}
		else {
			speed-=10;
			
		}
	}
	
	//print()
	public void print() {
		System.out.println("myCar:"+name+"/"+color+"("+year+")");
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
	
}
