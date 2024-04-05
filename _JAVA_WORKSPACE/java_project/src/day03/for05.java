package day03;

public class for05 {

	public static void main(String[] args) {
		
		/*6의 약수 1 2 3 6, 12의약수 1 2 3 4 6 12
		 * 두수의 공야수 :1 2 3 6(두수의 공통된 약수)
		 * 그중에 최대 공약수는 6
		 */
		
		int num1=6;
		int num2=12;
		int max=0;
		
		for(int i=1; i<=num1 && i<num2; i++) {
			if(num1%i==0 && num2%i==0) {
				max = i; 
				}
			
			
		}
		System.out.println(max);
		/*break 반복분에서 조건이 맞다면 반복문을 빠져나오는 역할
		 * 
		 */
		for(int i=num1;; i--) {
			if(num1%i==0 && num2%i==0) {
				System.out.println(i);
				break;
				
			}
			
		}
		
		//중첩 for문 일 경우 break는 나를 감싸고 있는 가장 안쪽 for문을 벗어남
		int i=0;
		a:for(;;) {
			for(;;) {
				for(;;) {
					i++;
					if(i==10) {
						System.out.println(i);
						break a;
					}
				}
			}
		}
	
	}

}
