package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import day05.Array01;

public class List02 {

	public static void main(String[] args) {
		/*두 배열을 입력받아서 하나로 합치는 Arraylist 생성
		 * 정렬하여 출력
		 * 
		 */
		String arr1[]=new String[]{"a","c","f","b"};
		String arr2[]=new String[]{"d","g","h","k"};
	
		
		List<String> ab= new ArrayList<String>();
		for(int i=0; i<arr1.length; i++) {
			ab.add(arr1[i]);
			
			
		}
		
		for (int j=0; j<arr2.length; j++) {
			ab.add(arr2[j]);
			
		}
//		Collections.sort(ab);
//		System.out.println(ab);
//		
//		ab.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o1.compareTo(o2);
//			}
//		});
//		System.out.println(ab);
//			
			
			
			
		
				
			}
		
		}
		
			
		
	
			
			
		
		
		
	


