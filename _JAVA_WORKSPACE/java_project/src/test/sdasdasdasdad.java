package test;

public class sdasdasdasdad {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{20,30,15},{100,110,120}};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++)
				sum+=arr[i][j];
		}
		System.out.println(sum);

	}

}
