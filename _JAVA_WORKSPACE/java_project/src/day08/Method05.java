package day08;

public class Method05 {

	public static void main(String[] args) {
		
		System.out.print(isprime(7));
		//2부터 100까지 소수를출력하고 ,소수의 합계를 출력
		int sum=0;
		for(int i=2; i<=100; i++) {
			if(isprime(i)) {
				System.out.println(i+" ");
				sum+=i;
				
				
				
			}
		}
		System.out.println();
		System.out.println("소수의합계"+sum);
		

	}
	
	/*정수가 하나가 주어지면 이정수가 소수인지 아닌지 판별 (true/false)
	 * 리턴타입:boolean
	 * 매개변수:int num1
	 * 메서드명:isprime
	 */
	public static boolean isprime(int num) {
		int cnt=0;
		for(int i=1; i<=num; i++) {
			
			if(num%i==0) {
				cnt++;
			}
			
		}
		if(cnt==2) {
			
			return true;
			}
	
	return false; }
	
	


	
}
