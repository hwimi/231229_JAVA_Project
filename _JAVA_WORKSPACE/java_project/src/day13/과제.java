package day13;
/*product 클래스 생성: 상품을 등록하는 클래스
 * 상품명, 가격
 * 상품을 추가하는 메서드
 * 추가하는 상품을 출력하는 메서드 (toString 생성가능)
 */

import java.util.Scanner;

class product{
	private String name;
	private String price;
	
	
	public product() {
		
	}
	
	public product(String name, String price) {
		this.name=name;
		this.price=price;
		
	}
	public void printInfo() {
		System.out.println("제품의 이름은:"+name+"입니다"+" "+"제품의 가격은:"+price+"입니다");
		
	}
	public String addproduct(String name ,String price) {
		return name+price;
		
		
		
		}
	
		

	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	


	
}

public class 과제 {

	public static void main(String[] args) {
		
		//상품을 10개로 등록 가능한 배열
		//스캐너를 이용하여 상품을 등록받기.
		//등록한 상품 출력
		Scanner sc=new Scanner(System.in);
		
		product p=new product();
		String a[]=new String[10];
		int cnt=0;
		for(int i=0; i<a.length; i++) {
			cnt++;
			System.out.println("상품을 입력하세요");
			a[i]=p.addproduct(sc.next(), sc.next());
			
		}
		for(String c:a) {
			System.out.println(c.toString());
			}
		if(cnt>=10) {
			System.out.println("더이상 물건을 추가할수없습니다");
		}
		
		
		
		
			
		
		
		
		
		
		
		
		sc.close();

	}

}
