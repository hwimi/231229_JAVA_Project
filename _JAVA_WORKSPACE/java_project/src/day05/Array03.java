package day05;

public class Array03 {

	public static void main(String[] args) {
		int sum=0;
		double average=0;
		
		
		int arr[]=new int[] {10,56,78,89,48,62,93,50};
		int min=arr[0];
		int max=arr[0];
		/*arr 배열에 합계와 평균을 출력
		 *최대값 최소값 출력
		 * 
		 */
		
		for(int i=1; i<arr.length; i++) {//
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
			System.out.println(arr[i]);
			sum=sum+arr[i];
			average=sum/(double)arr.length;
			
		
			
		}
		System.out.println("합은="+sum);
		System.out.println("평균은="+average);
		System.out.println(max);
		System.out.println(min);
		
		
		
		
	}

}
