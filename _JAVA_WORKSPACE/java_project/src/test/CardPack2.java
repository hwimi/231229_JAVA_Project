package test;

public class CardPack2 {
	private static final char[] CardPack2 = null;
	private Card2 Pack[] = new Card2[52];
	private int cnt = 0;

	public CardPack2() {
		char shape = '♥';

		for (int i = 1; i <= 4; i++) {
			switch (i) {
			case 1:
				shape = '♥';
				break;
			case 2:
				shape = '◆';
				break;
			case 3:
				shape = '♣';
				break;
			case 4:
				shape = '♠';
				break;
			}
			for(int j=1; j<=13; j++) {
				Card2 c=new Card2();
				c.setShape(shape);
				c.setNum(j);
				Pack[cnt]=c;
				cnt++;
			}
			
		}
	}
	
	public void shuffle() {
		for(int i=0; i<=Pack.length; i++) {
			int random=(int)((Math.random()*52)+1);
			Card2 temp=Pack[i];
			Pack[i]=Pack[random];
			Pack[random]=temp;
			
		}
	}
	
public Card2 pick() {
	if(cnt==0) {
		return null;
	}
	cnt--;
	return getPack()[cnt];
	
}
public void  print() {
	
	System.out.println();
}
	public Card2[] getPack() {
		return Pack;
	}
	
	public void init() {
		cnt=52;
	}

	public void setPack(Card2[] pack) {
		Pack = pack;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	

}
