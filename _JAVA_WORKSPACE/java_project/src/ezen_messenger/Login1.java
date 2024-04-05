package ezen_messenger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Login1 {
	
	public void login(Scanner sc) throws IOException {
	HashMap<String, String>map=new HashMap<>();
	BufferedReader br=new BufferedReader(new FileReader("memberList.txt"));
	
	
	

	
	
	while(true) {
		String line=br.readLine();
		if(line==null)
		break;
		String ID=line.substring(0,line.indexOf(" "));
		String PASSWORD=line.substring(line.indexOf(" ")+1);
		map.put(ID, PASSWORD);
	}
	System.out.println("아이디 를 입력해주세요");
	String id=sc.next();
	System.out.println("비밀번호를 입력해주세요");
	String pa=sc.next();
	for(String key:map.keySet()) {
			if(key.equals(id)&&map.get(key).equals(pa)){
				System.out.println("로그인에 성공하였습니다.");
		}else{
				System.out.println("로그인에 실패하였습니다.");
				return;
		}
			br.close();}
	}
	

		
		
	
	
	
		
	
	
	}