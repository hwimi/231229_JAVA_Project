package std;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;


//1
public class Student {
	//멤버변수로:이름,나이,전화번호,과목 map(과목,점수) 합계,평균
	//생성자, 메서드 ,게터/세터 출력메서드
	//메서드-출력메서드(학생정보,과목점수(성적표),합계,평균)
	//메서드-map(과목,점수) 데이터를 추가 메서드
	//메서드-map(과목,점수) 데이터를 삭제 메서드
	//멤버 변수는 private 사용하게 메서드는 public
	//클래스명은 대문자 시작 변수명 메서드명은 소문자로 시작
	//변수명, 메서드명에 단어가 많아지면 다음 시작단어 대문자 (카멜케이스 기법)
	//indent 들여쓰기 잘 맞추기
	public HashMap<String, Integer>map=new HashMap<String, Integer>();
	public String name;
	public String age;
	public String number; 
	public String subject; 
	public int score;
	public int sum;
	public int average;
	
	public Student() {}
	public Student(String name, String age, String number) {
		this.name=name;
		this.age=age;
		this.number=number;
		
	}

	public void StudentInfo(){
		sum_average();
	System.out.println("이름:"+name+" "+"나이:"+age+" "+"핸드폰번호:"+number+" "+"과목 점수:"+map+" "+"합계:"+sum+" "+"평균"+average);
	}
	
	
	public void add_subject(String subject, int score) {
		map.put(subject, score);
		
		
		
			
		}
		
	
	public void delate_subject(String a) {
		
		if(map.get(a)==null) {
			System.out.println("삭제할수가 없습니다");
			return;
		}
		
				
				
				
			
			map.remove(a);
		
		
	}
	public void sum_average() {
		sum=0;
		average=0;
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			sum+=map.get(key);
			
		}
		average=sum/map.size();
		
		
	}
	public void mod(String subject,int score) {
		map.remove(subject);
		map.put(subject, score);
	}
	

	public HashMap<String, Integer> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, average, map, name, number, score, subject, sum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //주소가 내 객체의 주소와 같다면 true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //클래스 정보가 다르다면 false
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name); //이름만 같다면 true
	}
	
		
		
		
	
		
	}
	
	
	


