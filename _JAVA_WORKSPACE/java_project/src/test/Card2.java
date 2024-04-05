package test;

public class Card2 {
	private char shape;
	private  int num;
	
	public Card2(){
		this.shape='♥';
		this.num=2;
		
	}
	public void print() {
		System.out.println(shape);
		switch(num) {
		case 1:
			System.out.println("A");
			break;
		case 11:
			System.out.println("j");
			break;
		case 12:
			System.out.println("Q");
			break;
		case 13:
			System.out.println("k");
			break;
		default:
		System.out.println(num+" ");
		break;
			
		}
	}
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		switch(shape) {
		case '♥': case '◆': case '♣':  case '♠':
			this.shape=shape;
			break;
		default:
			this.shape='♥';
		}
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(num<1||num>13) {
			this.num=2;
		}else if(num==1){
			this.shape='A';
			}
		else {
			this.num=num;
		}
	}
	
	

}
