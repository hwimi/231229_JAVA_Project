package day03;

public class for02 {

	public static void main(String[] args) {
//1에서 10까지 출력 하는 문		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		/*1부터 10까지 짝수만 출력
		 * if문 사용
		 */
		for(int i=2; i<=10; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();
		int sum=0;
		for(int i=1; i<=10; i++)
		{
			
			sum+=i;
		}
		System.out.println(sum);
		System.out.println();
		int add_sum=0;
		int odd_sum=0;
		
		for(int i=1; i<=10; i++)
			if(i%2==0) 
			{
			add_sum+=i;
			}
			else if(i%2==1) {
				odd_sum+=i;
			}
		System.out.println("짝수의합="+add_sum);
		System.out.println("홀수의합="+odd_sum);
		
	}                                                 

}
