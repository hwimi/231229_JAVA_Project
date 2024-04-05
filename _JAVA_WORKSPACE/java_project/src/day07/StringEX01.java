package day07;

public class StringEX01 {

	public static void main(String[] args) {
		/*
		 *파일에 저장되어있는 문자를 파일명과 확장로 분리하여 출력 
		 *파일명 :이것이 자바다
		 *확장자 :java
		 */
		String file="이것이 자바다.java";
		System.out.println("파일명:"+file.substring(0,file.indexOf(".")));
		System.out.println("확장자:"+file.substring(file.indexOf(".")+1));
		
		String filename=file.substring(0,file.indexOf("."));
		System.out.println(filename);
		
		//contanins : 해당 문자를 포함하는지 체크 boolean
		if(file.contains("java")) {
			System.out.println("자바파일입니다");
		}
		
	
		
		
		
		
		
		

	}

}
