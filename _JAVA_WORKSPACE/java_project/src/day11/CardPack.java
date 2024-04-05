package day11;

/*CardPack 클래스
 * -♥1~♥k/ ◆1~◆K/♣1~♣K/♠1~♠K
 * -총 카드수 52장
 * - 52장의 카드를 한묶음에 (배열)
 * 
 * - 카드 출력기능 -Card class print()사용
 * - 카드 초기화 기능 (CardPack) 생성자
 * - 카드 한장을 빼내는 기능=>출력 print() 사용
 * - 카드를 섞는 기능.
 */

public class CardPack {
	//int arr[]=new int[52]; //int 배열안에 들어가는 자료의 형태
	//카드 52장 들어갈수 있는 배열을 생성
	
	private Card Pack[]= new Card[52];
	private int cnt=0; //카드 배열의 index위치를 체크하기 위한 변수
	
	
	public CardPack() {
		//CardPack
		// -숫자:1~10,J(11),Q(12),K(13)
		//-모양:♥,◆,♣,♠
		char shape='♥';
		
		
		for(int i=1; i<=4; i++)  {//4가지 모양을넣기 위한 for문
			switch(i) {
			case 1: shape='♥';
			break;
			case 2: shape='◆';
			break;
			case 3: shape='♣';
			break;
			case 4: shape='♠';
			break;
			}
			for(int j=1; j<=13; j++)  { //13까지의 숫자를 넣기위한 for문
				Card c=new Card();// 새카드 한장 생성
				c.setShape(shape);
				c.setNum(j);
				Pack[cnt]=c;
				cnt++;
				
			}
		}
	}
	
	//카드를 섞는 기능
	//메서드 이름:shuffle()
	//리턴 타입 void,매개변수:X
	public  void shuffle() {
		for (int i=0; i<Pack.length; i++) {
			int random=(int)(Math.random()*52);
			Card temp=Pack[i];
			Pack[i]=Pack[random];
			Pack[random]=temp;
			
			
			
			
			
			
		}
		
	}
	
	//카드 한장을 빼내는 기능
	//pick:카드가 리턴되야 함
	public  Card pick() {
		if(cnt==0) {
			return null;
		}
		
		cnt--;
		
		
		
		
		
		return getPack()[cnt];
	}
	//초기화 기능
	public void init() {
		cnt=52;
	}


	public Card[] getPack() {
		return Pack;
	}


	public int getCnt() {
		return cnt;
	}
	

}
