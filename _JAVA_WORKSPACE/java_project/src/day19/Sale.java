package day19;

public class Sale<K,V> {

	//멤버변수 menu, price
	private K menu;
	private V price;
	
	public Sale() {}
	public Sale(K meun, V price) {
	this.menu=meun;
	this.price=price;
	
	
		
	}
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "이름:"+ menu + " "+ " 가격:" + price + "]";
	}
	

}
