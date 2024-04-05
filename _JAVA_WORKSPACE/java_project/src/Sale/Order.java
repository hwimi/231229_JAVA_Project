package Sale;

//주문객체
//주문을 하려면 (메뉴명 가격),수량 합계*(가격*수량)
//메뉴명 가격:상속받은 객체의 값 =>super
//수량,합계 order 만 가지고 있는 내 객체

public class Order <K,V>extends Sale<String, Integer> {
	private String name;
	private int cnt;
	private int number;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String menu, Integer price) {
		super(menu, price);
		this.number=price*cnt;
		this.name=menu;
		
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	

	

	
	
	

}
