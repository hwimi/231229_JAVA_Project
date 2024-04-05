package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManger  {
	// 재네릭 클래스 처리

	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> order = new ArrayList<>();

	public void add(Scanner sc) {
		System.out.println("제품명:");
		String product = sc.next();
		System.out.println("가격입력");
		int price = sc.nextInt();
		Sale<String, Integer> s = new Sale<String, Integer>(product, price);
		menu.add(s);

	}
	// 제네릭 클래스 처리

	public void menuPrint(Scanner sc) {
		 
			for (Sale<String, Integer> tmp : menu) {
				System.out.println(tmp);

		}

	}

	public void orderPick(Scanner sc) {
		// 입력받은 값은 제품명, 수량
		// 제품명 가격*수량(지불금액)을 order 에추가
		// 햄버가 5게=>햄버가 25000
		System.out.println("제품명을 입력하세요");
		String product = sc.next();
		System.out.println("수량 을 입력하시오");
		int cnt = sc.nextInt();
		for (int i = 0; i < menu.size(); i++) {
			if (menu.get(i).getMenu().equals(product)) {
				int a = menu.get(i).getPrice() * cnt;
				Sale<String, Integer> s1 = new Sale<String, Integer>(product, a);
				order.add(s1);
			} 

			}

		}
		

	
	
	public int orderSearch(String product) {
		//name 주문메뉴
		int index =-1;
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getMenu().equals(product)) {
				index=i;
				System.out.println(index);
				return index;
				
			}
			
		}return index;
		
	}

	public void orderPrint(Scanner sc) {
		// 주문내역 출력
		// 총지불금액 출력
		int sum = 0;
		for (Sale<String, Integer> tmp : order) {
			System.out.println(tmp);
			sum += tmp.getPrice();
		}
		System.out.println("총지불금액:" + sum);

	}
}
