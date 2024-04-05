package day13;

import java.util.Scanner;

class product1{
	private String name;
	private int price;
	
	public product1() {
		
	}
	public product1(String name, int price) {
		this.name=name;
		this.price=price;
		
	}
	public void insertproduct(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product1 [name=" + name + ", price=" + price + "]";
	}
	
	
	

}

public class 과제01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		product1 p[]=new product1[10]; //product 클래스를 담을수있는 배열 10칸을 준비
	
		//product1 p=new product1("피자",15000);
		//상품을 등록하시겠습니까(y/n)?=y등록 n 그만
		//n을 누르면 등록한 상품출력
		
		while(true) {
			System.out.println("상품을 등록하시겠습니까? y(예)/n(아니요)");
			char a=sc.next().charAt(0);
			if(a=='y') {
				product1 p1=new product1();
				System.out.println("상품의 이름과 가격을 입력하세요");
				p1.insertproduct(sc.next(),sc.nextInt());
				p[cnt]=p1;
				cnt++;
				
				
			}
			if(a=='n') {
				for(int i=0; i<cnt; i++) {
					System.out.println(p[i]+" ");
					
				}
				break;
				
				
			}
		
			
			
			
			
		}
		
		
		
		
	
		
		
		
	
		
	
		
		
		
		sc.close();
	}

}
