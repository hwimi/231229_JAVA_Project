package food;

import java.util.HashMap;

import day02.inputClass;

public class food {
	private HashMap<String, Integer> map=new HashMap<String, Integer>();
	private int price;
	private String name;
	private int sum;
	
	public void food() {}
	public void food(int price, String name,int sum) {
		this.name=name;
		this.price=price;
		this.sum=sum;
	}
	public void print() {
		System.out.println("음식은 이름은:"+name+" "+"음식의가격은:"+price);
	}
	public void sum_print() {
		System.out.println("총합은:"+sum);
	}
	public void food_sum(int price) {
		sum+=price;
	}
	public void food_serach(String name, int price) {
		map.put(name, price);
	}
	public void food_remove(String name) {
		map.remove(name);
	}
	public HashMap<String, Integer> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	

}
