package test;

public class Ex {

	public static void main(String[] args) {
		CardPack2 cp2=new CardPack2();
		
	
//		for(Card2 tmp:cp2.getPack()) {
//		tmp.print();
//		}
//		
int cnt=0;
for(int i=0; i<4; i++) {
	for(int j=0; j<13; j++) {
		cp2.getPack()[cnt].print();
		cnt++;
	}
	System.out.println();
	
}
	
		

	}

}
