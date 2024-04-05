package day12;

/*-학생정보를 관리하기 위한 클래스
 * -학생 기본정보 : 이름, 생년월일, 전화번호 나이
 * -학원정보:학원명="EZEN" final static, 지점
 * -수강정보:수강과목, 기간
 * 여러과목을 들을수 있음 (여러과목을 수강하기 위해서는 배열로 처리 5과목까지 가능)
 * ex) 홍길동 0001010 010-1111-111 25
 * EZEN(인천)
 * 자바6개월 파이썬1개월 빅데이터 3개월
 * 기능(메서드)
 * -학생기본정보를 출력하능 기능
 * -학원정보를 출력하는기능
 * -수강정보를 출력하는 기능
 * -학생의 수강 정보를 추가하는 기능
 */
public class 과제 {

	public static void main(String[] args) {
		student s=new student("lee","887665","010-1234-1234","25","인천","자바","3개월");
		s.inforamtion();
		s.gigum();
		
		student s1=new student("kim","887665","010-1234-1234","25","서울","파이썬","3개월");
		s1.inforamtion();
		s1.gigum();
		student s2=new student("hwy","887665","010-1234-1234","25","대구","수학","3개월");
		s2.inforamtion();
		s2.gigum();
		student s3=new student("gun","887665","010-1234-1234","25","인천","자바","3개월");
		s3.inforamtion();
		s3.gigum();
		student s4=new student("peace","887665","010-1234-1234","25","인천","국어","3개월");
		s4.inforamtion();
		s4.gigum();
		student s5=new student("free","887665","010-1234-1234","25","서울","매국","3개월");
		s5.inforamtion();
		s5.gigum();
		student s6=new student("soccer","887665","010-1234-1234","25","인천","자바","3개월");
		s6.inforamtion();
		s6.gigum();
		student s7=new student("baseball","887665","010-1234-1234","25","부산","자바","3개월");
		s7.inforamtion();
		s7.gigum();
		student s8=new student("low","887665","010-1234-1234","25","인천","자바","3개월");
		s8.inforamtion();
		s8.gigum();
		
		student s9[]=new student[8];
		s9[0]=s;
		s9[1]=s1;
		s9[2]=s2;
		s9[3]=s3;
		s9[4]=s4;
		s9[5]=s5;
		s9[6]=s7;
		s9[7]=s8;
		System.out.println("------------");
		String serachname="peace";
		//peace 학생의 학생정보 학원정보 수강정보를 출력
		//인천지점의 학생들을 모두 검색하여 학생정보만 출력
		//java과목을 수강하는 학생들만 검색하여 학생정보 학원정보를 출력
		for(int i=0; i<s9.length; i++) {
			if(s9[i].getName().equals(serachname)) {
				System.out.println(s9[i]);
			}
		}
		System.out.println("-------");
		int count=0;
		String serachgigum="인천";
		for(int i=0; i<s9[count].getCount(); i++) {
			if(s9[i].getSubject().equals(serachgigum)) {
				count++;
				System.out.println(s9[count].getGigum());
				System.out.println(s9[i]);
				
			}
		}
	
		
		
		
		

	}

}

class student{
private String name;
private String brith;
private String number;
private String age;
private final static String ACADEMY="EZEN";
private String gigum;
private String subject;
private String duration;
private String arr[]=new String[5];
int count=0;

public void inforamtion() {
	System.out.println("이름:"+(name)+" "+"나이:"+(age)+" "+"핸드폰:"+number+" "+"생일:"+brith+"과목:"+subject+" "+"기간:"+""+duration);
	
}
public void gigum() {
	System.out.println(ACADEMY+"("+gigum+")");
	
}
public void subject() {
	if(count==4) {
		System.out.println("더이상 추가 할수없습니다.");
	}
	else {
		arr[0]=this.subject+this.duration;
		count++;
		arr[count]=subject+duration;
	}
}
public void edu() {	
	System.out.println("name 수강하고 있는 과목:");
	for(int i=0; i<count+1; i++) {
		System.out.println(arr[i]);
	}
	

		
	
}
public student() {
	
}

public student(String name, String brith, String number, String age,String gigum,String subjcet, String duration) {
	this.name=name;
	this.brith=brith;
	this.number=number;
	this.age=age;
	this.gigum=gigum;
	this.subject=subjcet;
	this.duration=duration;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrith() {
	return brith;
}
public void setBrith(String brith) {
	this.brith = brith;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getGigum() {
	return gigum;
}
public void setGigum(String gigum) {
	this.gigum = gigum;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public String[] getArr() {
	return arr;
}
public void setArr(String[] arr) {
	this.arr = arr;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public static String getAcademy() {
	return ACADEMY;
}

	
	
	
	

	
}
