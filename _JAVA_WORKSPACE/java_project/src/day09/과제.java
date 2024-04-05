package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 (각 자리의 수는 1~9까지의 수)=>배열로 랜덤 저장(중복 불가능)
		 * 유저는 3자리의 숫자를 맞추는 게임=>직접입력 중복되지않게
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 맞으면 ball
		 * 아무것도 안맞으면 out
		 * 컴퓨터 생성 번호 123
		 * 사용자 번호:178=1s
		 * 사용자 번호:132=1s2b
		 * 사용자 번호:789=out
		 * 사용자 번호:123=정답
		 * 
		 * 
		 */
		Scanner s=new Scanner(System.in);
		int Arr[] = new int[3]; 
		int inputArr[] = new int[3]; 
		int strike = 0; 
		int ball = 0; 
	
		
		for(int i = 0; i < Arr.length; i++) {
			Arr[i] = (int)(Math.random() * 9 + 1); 
		    	for(int j = 0; j < i; j++) {
		        
		        	if(Arr[j] == Arr[i]) {
		            	
		                	i--; 
		                    	break;
		                }
		        }
		}
		for(int x : Arr) {
			
			System.out.print(x + " ");
		}
		while(true) {
    		
        	for(int i  = 0; i < inputArr.length; i++) {
            		System.out.println("1~9사이의 정수를 입력하세요 : "); 
                    	inputArr[i] = s.nextInt(); 
                        for(int j = 0; j < i; j++) {
                        	if(inputArr[j] == inputArr[i]) {
                            	
                                	System.out.println("중복된 값을 입력했습니다.");
                                    	i--;
                                        break;
                                }
			}
		}
                
                for(int i = 0; i < Arr.length; i++) {
                	for(int j = 0; j < inputArr.length; j++) {
                    	
                        	if(Arr[i] == inputArr[j] && i == j) {
                            	
                                	strike++;
                                 }else if(Arr[i] == inputArr[j] && i != j) {
                                 
                                 	ball++;
				}
			}
		}

		System.out.println(strike + "스트라이크" + ball + "볼");
        	if(strike == 3) {
            		System.out.println("정답!");
                    	break;
		}
        	strike = 0;
        	ball = 0;
		}
	
		
		
	
		
		

		s.close();

	}
}