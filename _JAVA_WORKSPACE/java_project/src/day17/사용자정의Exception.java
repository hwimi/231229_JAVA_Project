package day17;

public class 사용자정의Exception {

	public static void main(String[] args) {
		/*passwordException
		 * -비밀번호는 null일수 없다.
		 * -비밀번호의 길이는 5가지이상
		 * -비밀번호는 문자로만 이러우지면 안됨(문자+숫자+특수문자)
		 */

	}
	class PasswordTest{
		private String Password;

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			Password = password;
		}
		
	}
	

}
