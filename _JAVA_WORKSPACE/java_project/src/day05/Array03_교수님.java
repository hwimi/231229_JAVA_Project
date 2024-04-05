package day05;

public class Array03_교수님 {

	public static void main(String[] args) {
		int arr[]=new int[] {10,56,78,89,48,62,93,50};
	
	
		
		int sum=0;
		double avg=0;
		//성적 데이터(0~100)
		int max=arr[0];//가장큰값을 넣기 위한 변수
		int min=100;//가장 작은 값을 넣긴 위한 변수
		for(int i=0; i<arr.length; i++) {	
			if(max<arr[i]) {
				max=arr[i];
				
			}
			if(min>arr[i]) {
				min=arr[i];
			}
			
			sum=sum+arr[i];
}
		System.out.println("합계"+sum);
		avg=sum/(double)arr.length;
		System.out.println("평균"+avg);
		System.out.println("최대값"+max+" "+"최소값"+min);
		


		

	}

}
