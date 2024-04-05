package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		LocalDateTime today=LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		String t=today.toString();//to string() 스트링으로 객체를 변환
		System.out.println(t);
		//날짜/시간
		System.out.println(t.substring(0,t.indexOf("T")));
		System.out.println(t.indexOf("T"));
		System.out.println(t.substring(t.indexOf("T")+1));
		System.out.println("------------");
		String date =t.substring(0,t.indexOf("T"));
		System.out.println(date);
		String time=t.substring(t.indexOf("T")+1, t.indexOf("."));
		System.out.println(time);
		System.out.println("-----------------");
		DateTimeFormatter dft=DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dft.format(today));
		LocalDateTime sDate=LocalDateTime.of(1999, 6, 18, 8, 30);
		System.out.println(sDate.format(dft));
		
	}

}
