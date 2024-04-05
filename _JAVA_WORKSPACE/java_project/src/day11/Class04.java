package day11;

public class Class04 {

	public static void main(String[] args) {
		
		/*tv 클래스를 만들꺼임
		 *멤버변수:brand, power, ch, vol
		 *메서드:
		 *power
		 * power 가 켜지면 티비가 켰습니다  , 꺼지면 tv가 꺼졌습니다.
		 * chup():1식 증가 하도록 ch 20까지 있음 20이 넘어가면 다시 0번으로 순환구조
		 * chdown():1씩 감소 up 처럼 순환구조
		 * chdown():1씩 감소
		 * volup()/voldown :1씩 증가/1씩 감소
		 * vol 10까지 증가 10이 넘으면, 0이면 음소거라고 출력
		 */
		Tv c=new Tv("lg");
		c.power();
		c.chUp();
		c.chUp();
		c.chUp();
		c.chUp();
		
	
		
		
		
		
		

	}

}
	class Tv{
		private String brand; //null
		private boolean power; //false
		private int ch; //0
		private int vol; //0
		
		public Tv() {
			
		}
		public Tv(String brand) {
			this.brand=brand;
			this.vol=3;
			
		}
		
		public void print() {
			System.out.println("brand:"+brand+" ch:"+ch+" vol:"+vol);
			
		}
		public void power() {
			power=!power;
			if(power) {
				System.out.println("전원이 켜집니다.");
				print();
			
			}
			else {
				System.out.println("전원이 꺼집니다..");
			}
		
			
		
		}
		public void chUp() {
			if(power) {
				ch++;
				System.out.println("ch"+ch);
				if(ch>=20) {
					ch=0;
				}
			}
			else {
				System.out.println("tv를 켜주세요");
			}
			
		}
		
		
		public void chDown() {
			if(ch<=20) {
				ch-=1;
				System.out.println("몇번 채널입니다"+ch);
			}
			if(ch>20) {
				
			}
			
		}
		
		public void volUp() {
			
				
			if(vol<10) {
				vol+=1;
				System.out.println("현재 소리는"+vol);
				
			}
			else if(vol==10) {
				System.out.println("소리가 최대치입니다.");
				
			}
			
		}
		
		public void volDown() {
			if(vol<10) {
				
				vol-=1;
				System.out.println("현재 소리는"+vol);
			}
			else if(vol==0) {
				System.out.println("음소거 입니다.");
			}
			
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public boolean isPower() {
			return power;
		}
		public void setPower(boolean power) {
			this.power = power;
		}
		public int getCh() {
			return ch;
		}
		public void setCh(int ch) {
			this.ch = ch;
		}
		public int getVol() {
			return vol;
		}
		public void setVol(int vol) {
			this.vol = vol;
		}
		
			
			
		
	}
