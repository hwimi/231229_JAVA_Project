package day20;

public class Travel {
	private String name;
	private int age;
	private int cost;
	
	public Travel() {}
	public Travel(String name, int age,int cost) {
		this.name=name;
		this.age=age;
		this.cost=cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return " 이름=" + name + ", 나이=" + age + ", 비용=" + cost + "]";
	}
	
}
