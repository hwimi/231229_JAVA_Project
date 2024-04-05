package Sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		/*
		 * menu 구성 1.메뉴추가 2.메뉴삭제 3.메뉴수정(가격) 4.메뉴보기 5.주문 6.주문내역출력(영수증) 7.종료
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		SaleManger sm = new SaleManger();

		int menu = 0;
		do {
			System.out.println("menu");
			System.out.println("1.메뉴츄가|2.메뉴삭제|3.메뉴수정(가격)");
			System.out.println("4.메뉴보기|5.주문|6.주문내역출력(영수증)|7.종료");
			System.out.println(">>>>");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				sm.add(sc);
				break;
				
			case 2:
				sm.delate(sc);
				break;
			case 3:
				sm.mod(sc);
				
				break;
			case 4:
				sm.print();
				break;
				
				
			case 5:
				sm.orderpPick(sc);
				break;
			case 6:
				sm.oderprint();
				break;
				
				
			case 7:
				break;
			default:
				System.out.println("잘못된 메뉴입니다");

			}

		} while (menu != 7);
		System.out.println("종료");

		sc.close();

	}

}
