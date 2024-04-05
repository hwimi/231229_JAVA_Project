package day06;

public class Array04 {

	public static void main(String[] args) {
		int arr[]=new int[10]; //배열의 초기값은 0
		/*10개의 값을 가지는 배열을 생성한후
		 * 1~50랜덤수를 배열에 저장 한후 출력
		 * 합계,평균,최대,최소
		 */
		
		int sum=0;
		double avg=0;
		int max=0;
		int min=50;
		
		
		
		//배열을 완성 시키는 값
		for(int i=0; i<arr.length; i++) 
		{
			int a=(int)(Math.random()*50)+1;
			arr[i]=a;
			System.out.print(arr[i]+" ");
			
			if(max<arr[i]) 
			{
			max=arr[i];	
			}
			if(min>arr[i]) {
			min=arr[i];
			}
			sum+=arr[i];
			avg=sum/(double)(arr[i]);
		}
		System.out.println();
		System.out.println("합계"+sum);
		System.out.println("평균"+avg);
		System.out.println("최소"+min);
		System.out.println("최대"+max);
		
		
		
		
		
		

	}

}
