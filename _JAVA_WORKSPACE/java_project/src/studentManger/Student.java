package studentManger;

public class Student {
	
		Subject sub[]=new Subject[5]; //서브젝트 클래스를 배열로 만든것
		 //서브젝트 클래스를 객체로 만듯것
		private String stnum;//학번
		private String name; //이름
		private String age; //나이
		private String phonum;// 전화번호
		private String address;//주소
		private int cnt=0;
		
		
		
		public Student() {}
		public Student(String stnum,String name,String age,String phonum,String address) {
		this.stnum=stnum;//학번	
		this.name=name;//이름
		this.age=age;//나이
		this.phonum=phonum;//전화번호
		this.address=address;//주소
		
		
		
			
	}
		public void Studentinformation() {
			System.out.println("이름:"+name+" "+"학번:"+stnum+" "+"전화번호:"+phonum+" "+"나이"+age+" "+"주소"+address);
			
		}
		public void subjectinformation(){
			for(int i=0; i<cnt; i++) {
				System.out.println(sub[i]);
			}
			
		}
		public void add_subject(Subject s) {
			
			if(cnt>4) {
				System.out.println("수강신청을 할수없습니다.");
				
			}
			else {
				sub[cnt]=s;
				cnt++;
			}
		
		}
		
		public void del_subject() {
			System.out.println("어떤 과목을 삭제하시겠습니까?");
			
		}
		public void present_subject() {
			System.out.println("현재 수강하고 있는 과목은:");
		}
		
		
		public String getStnum() {
			return stnum;
		}
		public void setStnum(String stnum) {
			this.stnum = stnum;
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
		public String getPhonum() {
			return phonum;
		}
		public void setPhonum(String phonum) {
			this.phonum = phonum;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	

}

