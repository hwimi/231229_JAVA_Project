package day08;

public class 과제_교수님 {

	 

	public static void main(String[] args) {
		int lotto[]=new int[7]; //당첨번호
		int user[]=new int[6]; // 사용자 로또 번호
		randomArray(lotto);
		randomArray(user);
		lottoRank(lotto, user);
		System.out.println("--당첨번호--");
		printArray(lotto);
		System.out.println("--사용자번호--");
		printArray(user);
		
		
		
		

	}
	/*배열을 매개변수로 받아 1~45까지 랜덤수를 채워서 생성.(중복불가능)
	 * 매개변수:배열 =>int arr[]
	 * random==arr[i] fasles 면 추가
	 */
	public static void randomArray(int arr[]) {
		//배열을 받아서 배열에 랜덤 값 중복없이 체우기
		int cnt=0; //while에서 i역할을 할변수
		while(cnt<arr.length) {
			int r=(int)(Math.random()*10)+1;
			if(!inContain(arr, r)) {
				arr[cnt]=r;
				cnt++;
			}
		}
		
	}
	
	
	/*배열을 매개변수로 받아 배열을 출력하는 메서드
	 * 
	 * 
	 */
	
	public static void printArray(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	/*중복확인 메서드
	 * 매개변수:배열 값
	 * 있으면 true 없으면 false
	 * 리턴타입:boolean
	 * 메서드명 isContain
	 */
	public static boolean inContain(int arr[], int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==random) {
				return true;
			}
		}
		return false;
	}
	
	//등수 확인 메서드
	/*매개변수 lotto[]/user[]
	 * 리턴타입:int
	 * 매서드명:lottoRank
	 * --당첨기준
	 * user번호 기준
	 * 6개 일치:1등
	 * 5개 일치+보너스 번호 2등
	 * 5개 일치 3등
	 * 4개 일치 4등
	 * 3개 일치 5등
	 * 나머지는 꽝
	 */
	public static int lottoRank(int lotto[], int user[]) {
		int cnt=0;
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<user.length; j++) {
				if(lotto[i]==user[j]) {	
					cnt++;
				}

			}
			
			
			}
		switch(cnt) {
		case 1:
			System.out.println("6개일치 1등");
			break;
		case 2:
			System.out.println("5개 일치 보너스 번호 일치 2등");
			break;
		case 3:
			System.out.println("5개 일치 3등");
			break;
		case 4:
			System.out.println("4개일치 4등");
			break;
		case 5:
			System.out.println("3개일치 5등");
			break;
		default:
			System.out.println("꽝입니다");
		
		}
		
		
	return cnt;}

	}
	


