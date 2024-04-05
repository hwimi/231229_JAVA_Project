package day06;

public class ArrayCopy {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4}; //new를 통해서 객체를 생성
		int arr1[]=arr;
		int arr2[]=new int[5];
		int arr3[]=new int[10];
	
		//두 객체의 주소를 확인
		/*System.out.println(arr);
		System.out.println(arr1);
		System.out.println(arr2);
		*/

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		//arr 값을 arr2로 복사
		
		for(int i=0; i<arr.length; i++) {
			arr2[i+1]=arr[i];
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		/*arr를 arr3번으로 복사
		 *arr3은 10개의 데이트를 담을수있는 배열로 생성
		 */
		
		/*System.out.println();
		for(int i=0; i<arr.length; i++) {
			arr3[i]=arr[i];
		}*/
		
		//System.arraycopy(이전배열,시작번지,복사할새배열, 시작번지,개수)
		System.out.println();
		System.arraycopy(arr, 0, arr3, 2, arr.length);		
		for(int i:arr3) {
			
			System.out.print(i+" ");
	}
}
		
}
