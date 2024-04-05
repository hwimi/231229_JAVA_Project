package day16;



public class Exception02 {

	public static void main(String[] args) {
		/*ArithmeticException:0으로 나누었을 때 발생하는 Exception
		 *하단에서 만든 메서드 실행
		 *예외처리
		 */
		try {//예외가 발생할수 있는구문작성
			math(4, 0, '+');
			math(4, 0, '-');
			math(4, 0, '*');
			math(4, 0, '/');
			math(4, 0, '%');
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage()); //메시지 String을 출력하는 형태
			System.out.println("0으로 나누었습니다");
//			e.printStackTrace();
		}
	
		
		
	}
//예외 발생시키기 throw를 발생 시킬수있음
//throw:예외 떠넘기기
//기능 두수을 입력받고, 연산자를 입력받아 사친연사의 결과를 리턴하는 메서드
//예외를 발생시키게 되면 메서드 선언부 끝 부분에 throw를 적고 발생할 수 있는
//예외를 반드시 적어줘야함
//매개변수로:int num1, int num2 char op
	
	
	
	public static double math(int num1,int num2,char op) throws RuntimeException {
		double res=0;
		//연산자가 / 이거나 % 인경우 num2가 0이면 예외발생시키기
		if((op=='/'||op=='%')&&num2==0) {
			throw new RuntimeException("num2는 0이 될수없습니다");
		}
		switch(op) {
		case '+':
			System.out.println(num1+num2);
			break;
		case'-':
			System.out.println(num1-num2);
			break;
		case'/':
			System.out.println(num1/num2);
			
			break;
		case'*':
			System.out.println(num1*num2);
			break;
		case'%':
			System.out.println(num1%num2);
		default:
			throw new RuntimeException(op+"는 산술연산자가 아닙니다");
		}
		
		
		
		return res;
	
		
		
		
		
	}
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	public static int sub(int num1, int num2) {
		if(num1<num2) {
			return num2-num1;
		}
		return num1-num2;
	}
	public static int mul(int num1,int num2) {
		return num1*num2;
		}
	public static int div(int num1, int num2) {
		if(num1<num2) {
			return num2/num1;
	}
		return num1/num2;
	}
	public static int mod(int num1, int num2) {
		if(num1<num2) {
			return num2/num1;
		}
		return num1/num2;
	}
}