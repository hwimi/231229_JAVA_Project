package day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		//1부터 50까지의 랜덤수를 10개 생성하여 배열에 저장 출력
		//오름 차순 정렬
		int arr[]=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			int a=(int)(Math.random()*50)+1;
			arr[i]=a;
			System.out.print(arr[i]+" ");
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++ ) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		for(int temp:arr) {
			System.out.print(temp+" ");
		}
	

	}

}
