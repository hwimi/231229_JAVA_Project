package day08;

public class Method06 {

	public static void main(String[] args) {
		int arr[]=new int[] {11,2,3,5,7,8,4,5,1,10,15,13,12};
		PrintArray(arr);
		System.out.println();
		storArray(arr);
		System.out.println("--정렬후--");
		PrintArray(arr);
		System.out.println();
		System.out.println("--배열 리턴후 출력--");
		int arr1[]=storArray1(arr);
		PrintArray(arr1);
		System.out.println();
		System.out.println("--random array 출력");
		PrintArray(storArray1(randomArray()));
		
		

	}
	/*주어진 정수배열을 콘솔에 출력하는 메서드
	 * 매개변수:배열
	 * 리턴타입:출력=>void
	 * 매서드명:printArray
	 * 5개씩 한줄에 나열
	 */
	
	public static void PrintArray(int arr[]) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			count++;
			if(count%5==0 && count!=0) {
				System.out.println();
			}
			
			
			
		}
	}
	
	/*
	 * 배열이 주어지면 배열을 오름차순 정렬하는 기능
	 * 매개변수:배열
	 * 리턴타입 없음=>void
	 * 매서드명 :storArray
	 */
	public static void storArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
	}
	
	/*정렬 후 배열을 리턴
	 * 
	 */
	public static int[] storArray1(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
	return arr;}
	
	/*random array
	 * 배열을 생성하여[10개]랜덤값(1~50까지의)의 채우고 해당 배열을 리턴
	 * 매개변수:x
	 * 리턴타입 배열
	 */
	public static int[] randomArray() {
		int arr[]=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*50)+1;
		}
		
		
	return arr;}
	
	

}
