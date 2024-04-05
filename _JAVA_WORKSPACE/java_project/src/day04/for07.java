package day04;

public class for07 {

	public static void main(String[] args) {
	/* 별찍기 *****
	 * 		*****
	 * 		*****
	 * 		*****
	 * 		*****
	 * 
	 * i가 1일때 j는 1~5 i가2일때 j2~5
	 */
		
		
		
		for(int i=1; i<=5; i++) { //줄에 해당하는것
			for(int j=1; j<=5; j++) {
				System.out.print("*");
				
				}
		System.out.println();
		}	
		System.out.println("----------------");
		
		 for (int i = 0; i < 5 ; i++) {
             for (int j = 0; j <= i ; j++) {
                 System.out.print("*");


     }
     System.out.println();
		
		}
		
		 System.out.println("--------------------");
		 /* *****
		  * ****
		  * ***
		  * **
		  * * 
		  *
		  */
		 
		 
		 for(int i=1; i<=5; i++) {
			 for(int j=5; j>=i; j--) {
				 System.out.print("*");
			 }
		 System.out.println();}
		 
		 System.out.println("---------------------");
		 /*   		* i=1 공4 j=1
		  *  	   ** i=2 공3 j=2 
		  * 	  *** i=3 공2 j=3
		  * 	 **** i=4 공1 j=4
		  *     ***** i=5 공x j=5
		  */
		
		 for(int i=1; i<=5; i++) {
			 //공백
			 for(int j=1; j<=5-i; j++) {
				 System.out.print(" ");
			 }
		for(int k=1; k<=i; k++) {
			System.out.print("*");//별
			
		}

		
		
			 
			 
		System.out.println(); 
		}
		 
		System.out.println("-----------------");
		
		/* 		 * 		1~1
		 *  	*** 	1~3
		 *     ***** 	1~5
		 *    ******* 	1~7
		 *   ********* 	1~9
		 */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=(i*2)-1; k++) {
				System.out.print("*");
			}
	System.out.println();	}
		
		/*  1 2 3
		 *  4 5 6
		 *  7 8 9 
		 *  3줄씩 3개 출력
		 */
		int cnt=0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				cnt++;
				System.out.print(cnt+" ");
				
			}
			System.out.println();
			
			
		}

	}
}