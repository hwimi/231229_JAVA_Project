package studentManger;

public class Subject {

		private String code; //과목코드
		private String subject_name; //과목명
		private String credit; //학점
		private String time; //시수
		private String professor_naem; //교수이름
		private String term; //학기
		private String time_table;//시간표
		private String room;//강의장
		
		public Subject() {}//기본생성자
		public Subject(String code, String subject_name ) {
			this.code=code;
			this.subject_name=subject_name;
			
		}
		public Subject(String code, String subject_name,String credit,String time,String professor_naem,String term,String time_table,String room) {
			this.code=code;
			this.subject_name=subject_name;
			this.credit=credit;
			this.time=time;
			this.professor_naem=professor_naem;
			this.term=term;
			this.time_table=time_table;
			this.room=room;
			
			
		}//생성자
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getSubject_name() {
			return subject_name;
		}
		public void setSubject_name(String subject_name) {
			this.subject_name = subject_name;
		}
		public String getCredit() {
			return credit;
		}
		public void setCredit(String credit) {
			this.credit = credit;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getProfessor_naem() {
			return professor_naem;
		}
		public void setProfessor_naem(String professor_naem) {
			this.professor_naem = professor_naem;
		}
		public String getTerm() {
			return term;
		}
		public void setTerm(String term) {
			this.term = term;
		}
		public String getTime_table() {
			return time_table;
		}
		public void setTime_table(String time_table) {
			this.time_table = time_table;
		}
		public String getRoom() {
			return room;
		}
		public void setRoom(String room) {
			this.room = room;
		}
		@Override
		public String toString() {
			return "Subject [code=" + code + ", subject_name=" + subject_name + ", credit=" + credit + ", time=" + time
					+ ", professor_naem=" + professor_naem + ", term=" + term + ", time_table=" + time_table + ", room="
					+ room + "]";
		}

	}


