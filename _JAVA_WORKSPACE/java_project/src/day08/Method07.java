package day08;

public class Method07 {

	public static void main(String[] args) {
		/*로또 번호 생성
		 * 
		 */
		 int lotto[]=new int[7];
		 int user[]=new int[6];
		 System.out.println("로또번호");
		 printarray(abc(lotto));
		 System.out.println();
		 System.out.println("유저번호");
		 printarray(abc(user));

	}
	/*배열을 매개변수로 받아 1~45까지 랜덤수를 채워서 생성
	 * 중복된 번호수 안나오게?
	 */
	public static int[] abc(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
		arr[i]=(int)(Math.random()*45)+1;
		for(int j=0; j<i; j++) {
			if(arr[i]==arr[j]) {
				j--;
				break;
			}
				
		}
	
			
			
			
			
		}
		return arr;}
	
	/*배열을 매개변수로 받아 배열을 출력하는 메서드
	 * 
	 */
	public static void printarray(int arr[] ) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void randomArray(int arr[]) {
		//배열을 받아서 배열에 랜덤 값 중복없이 체우기
		int cnt=0; //while에서 i역할을 할변수
		while(cnt<arr.length) {
			int r=(int)(Math.random()*10)+1;
			if(!isContain(arr, r)) {
				arr[cnt]=r;
				cnt++;
			}
		}
		
	}
	
	
	
	/*중복 확인 메서드
	 * 매개변수:배열 ,값
	 * 있으면 true 없으면 false
	 * 
	 */
	public static boolean isContain(int arr[], int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==random) {
				return true;
			}
		}
		return false;
	}
	

}
