package day16;

import java.sql.Time;
import java.util.Calendar;

public class Data01 {

	public static void main(String[] args) {
		/*날짜.시간 클래스
		 * Data 클래스=>Deprecated(비권장)/ calendar 클래스
		 * calendar//추상클래스 //추상클래스는 객체를 생성할수 없음.
		 * 추상클래스를 구현한 객체를 이용하여 사용할수 있다
		 * new로 클래스의 객체를 생성 불가능
		 * getinstance():메서드를 이용하여 객체를 얻어옴.
		 * static 메서드. 클래스명. 메서드명()
		 * 
		 */
		 
       //Date d=new Date();
		Calendar c=Calendar.getInstance();//오늘의 날짜를 준다
		int year=c.get(Calendar.YEAR);
		System.out.println(year);
		//월 0~11까지 +1 표현
		int month=c.get(Calendar.MONTH)+1;
		System.out.println(month);
		int day=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		System.out.println(year+"-"+month+"-"+day);
		
		//hour.minute.second,am.pm
		int hour=c.get(Calendar.HOUR);
		int minute=c.get(Calendar.MINUTE);
		int second=c.get(Calendar.SECOND);
		int am=c.get(Calendar.AM_PM);
		
		
		
		//2024-1-26(금)
		//오후 4시13
		String abc="null";
		switch(week) {
		case 1:
			abc="(일)";
			break;
		case 2:
			abc="(월)";
			break;
		case 3:
			abc="(화)";
			break;
		case 4:
			abc="(수)";
			break;
		case 5:
			abc="(목)";
			break;
		case 6:
			abc="(금)";
			break;
		case 7:
			abc="(토)";
			break;
			
			default:
			break;
			
		
		}
	
			
	
		
		System.out.println(year+"-"+month+"-"+day+abc+"-"+((am==0)?"오전":"오후")+"-"+hour+"시:"+minute+"분:"+second+"초");
		
	}

}
