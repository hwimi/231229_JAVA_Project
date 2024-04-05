package Sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManger {
	private ArrayList<Sale<String, Integer>> menu=new ArrayList<>();
	private ArrayList<Order<String, Integer>> order=new ArrayList<>();
	
	public void add(Scanner sc) {
		System.out.println("제품을 입력하세요");
		String product=sc.next();
		System.out.println("가격을 입력하세요");
		int price=sc.nextInt();
		Sale<String, Integer> s=new Sale<String,Integer>(product, price);
		menu.add(s);
		
		
	}
	public void print() {
		for(Sale<String, Integer> tmp:menu) {
			System.out.println(tmp);
			
		}
		
	
	}
	public void delate(Scanner sc) {
		System.out.println("삭제할 제품명을 입력해주세요");
		String dl=sc.next();
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(dl)) {
				menu.remove(i);
			}
		}
	}
	public void mod(Scanner sc) {
		System.out.println("이름을 찾으세요");
		String mo=sc.next();
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(mo)) {
				System.out.println("1번이면 이름 2번이면 가격");
				int a=sc.nextInt();
				switch(a) {
				case 1:
					System.out.println("수정할이름을 입력해주세요");
					menu.get(i).setMenu(sc.next());
					break;
				case 2:
					System.out.println("수정할 가격을 입력해주세요");
					menu.get(i).setPrice(sc.nextInt());
					break;
	
				
				
				}
				
			}
			
	System.out.println("완료");
			
				
			
			}
		}
	public void orderpPick(Scanner sc) {
		Order<String, Integer> or=new Order<String, Integer>();
		System.out.println("제품 이름을 입력해주세요");
		String product=sc.next();
		System.out.println("수량을 입력해주세요");
		int cnt=sc.nextInt();
		or.setCnt(cnt);
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(product)) {
				
				int index=orderSearch(product);
				
				if(index!=-1) {//해당 메뉴가 있다면
					
				int a=order.get(i).getPrice()+menu.get(i).getPrice()*or.getCnt();
				System.out.println(a);
				int b=order.get(i).getCnt();
				order.get(i).setNumber(a);
				order.get(i).setCnt(b+cnt);
				return;
				}
				or.setName(product);
				or.setPrice(menu.get(i).getPrice());
				or.setNumber(menu.get(i).getPrice()*cnt);
				order.add(or);
				
					
				
				
				
							
			}
			
		}
		
	}
	public int orderSearch(String product) {
		//name 주문메뉴
		int index =-1;
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getName().equals(product)) {
				index=i;
				System.out.println(index);
				return index; 
				
			}
			
		}return index; //해당 메뉴가 없다면 -1리턴
		
	}
	public void oderprint() {
		for(int i=0; i<order.size(); i++) {
			System.out.println("이름"+order.get(i).getName());
			System.out.println("수량"+order.get(i).getCnt());
			System.out.println("가격"+order.get(i).getNumber());
		}
	}
	
	}


