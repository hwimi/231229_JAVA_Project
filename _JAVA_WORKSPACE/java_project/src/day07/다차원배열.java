package day07;

public class 다차원배열 {

	public static void main(String[] args) {
		/*2차원 배열
		 * 10 20 30 
		 * 60 40 80 
		 * 60 40 80
		 * 60 30 20
		 * 40 20 20
		 * 
		 * 자료형 배열명[][]=new 자료형[5][3]//5행개수,3열개수
		 */
		int arr[][]=new int[5][3];
		int cnt=1;
		for(int i=0; i<arr.length; i++) {//0~4 5개의 행반복
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=cnt++;
				System.out.print(arr[i][j]+" ");
					
			}
			System.out.println();
			
		}

	}

}
