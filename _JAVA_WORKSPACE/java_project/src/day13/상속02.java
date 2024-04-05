package day13;


class Animal{
	private String name;// 이름
	private String category; //종
	
	public Animal() {
		
	}
	public Animal(String name, String category) {
		this.name=name;
		this.category=category;
		
	}
	public void printInfo() {
		System.out.println("이름:"+name);
		System.out.println("종류:"+category);
		
	}
	public void howl() {
		System.out.println("--"+name+"의 울음소리");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
//Dog Cat animal 클래스를 생성 상속
//printInfo
//

class dog extends Animal{
	public dog() {
		
		//자식의 생성자에서 상속받은 멤버변수를 setting
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		
		
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍");
		
	}
	
	
	
	
	
	
}



class cat extends Animal{

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
	}
	
	

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("야옹");
	}
	
	
}



class tiger extends Animal{
	public tiger(String name, String category) {
		super(name,category);
		
	}
	public void howl() {
		super.howl();
		System.out.println("어흥!");
		
	}
}
public class 상속02 {

	public static void main(String[] args) {
		dog d=new dog();
		d.setName("똥깨");
		d.setCategory("강아지");
		d.printInfo();
		d.howl();
		
		cat c=new cat();
		c.setName("뚱냥이");
		c.setCategory("고양이");
		c.printInfo();
		c.howl();
		
		System.out.println("------------");
		tiger t=new tiger("호랭이","고양이과");
		t.printInfo();
		t.howl();
	}

}
