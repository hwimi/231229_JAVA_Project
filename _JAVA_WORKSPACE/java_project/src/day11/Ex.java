package day11;

public class Ex {

	public static void main(String[] args) {
		CardPack cp=new CardPack();
		cp.shuffle();
		
//		cp.pick().print();
//		cp.pick().print();
//		System.out.println("");
		
		int cnt=0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				cp.getPack()[cnt].print();
				//cp.getPack:CardPack 클래스 안에있는 pack[]
				//cp.getPack()[cnt] :pack[0] =>card(멤버변수 메서드)
				cnt++;
				}
			System.out.println();
				
			}
		System.out.println("----");
		System.out.println("딜러가 카드를 나누고 있습니다.");
		Card player1=cp.pick();
		Card player2=cp.pick();
		
		System.out.println("player1 card open");
		player1.print();
		System.out.println("");
		System.out.println("player2 card open");
		player2.print();
	}
		

	}


