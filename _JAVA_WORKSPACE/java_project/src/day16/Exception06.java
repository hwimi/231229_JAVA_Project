package day16;

public class Exception06 {

	public static void main(String[] args) {
		
		//매서드에서 생성된 배열 출력
//		int start=-1;
//		int arr[]=null;
		try {
			arr(-1, 0, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}try {
		arr1(null, 0, 0);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
//메서드 생성
	/*기능:size를 매개변수로 입력받아 size만큼의 길이를 가지는 배열을 생성하여
	 * 랜덤값을 채워 배열을 리턴
	 * 랜덤값의 범위는 매개변수로 입력을 start(시작값),count(개수)
	 * -size가 0보다 작다면 예외발생
	 * count 0보다 작다면 예외 발생
	 */
	
	public static int [] arr(int  size, int count, int start){
		if(size<0 || count<0) {
			throw new RuntimeException("사이즈가0보다 작을수 없습니다 count가 0가 0보다 작을수없습니다.");
		}
		
		int arr[]=new int[size];
		for(int i=0; i<arr.length; i++) {
			int random=(int)(Math.random()*count)+start;
			arr[i]=random;
		}
		
		
		
		return arr;
	}
	/*매서드 생성
	 * 기능:매개변수로 배열을 입력받아서 랜덤값을 채우는 메서드
	 * 랜덤값의 범위는 매개변수로 입력 strat count개수
	 * 
	 * -배열이 null이면 예외발생
	 * -배열의 길이가 0보다 작으면 예외 발생
	 * 
	 */
	public static void arr1(int arr1[],int start,int count) {
		
			
		if(arr1==null) {
			throw new RuntimeException("배열이 null일수는 없습니다");
			
		}
		if(arr1.length<0) {
			throw new RuntimeException("배열의 길이가 0보다 작을수는없습니다");
		}
		for(int i=0; i<arr1.length; i++) {
			int random=(int)(Math.random()*count)+start;
			arr1[i]=random;
			}
		
		
	}
	
	
	
	}
