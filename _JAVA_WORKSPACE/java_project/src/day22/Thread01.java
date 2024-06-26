package day22;

class MyTread extends Thread{
//반드시 run() 라는 메서드를 구현해야함
	@Override
	public void run() {
		for(int i=0; i<=200; i++) {
			System.out.println(i+"번째 Thread!!"+getName());
		}
		
	}
	
}

public class Thread01 {

	public static void main(String[] args) {
		/*Thread(쓰레드)
		 * -실행중인 프로그램이 OS 로부터 메모리를 할당 받아 process 상태가 됨.
		 * -하나의 process는 하나 이상으l thread를 가지게 되고,
		 * -thread는 실제 작업을 수행하는 단위이다.
		 * -thread는 실제 CPU가 작업을 처리하는 단위.
		 * -multi-thread:여러개의 thread가 동시에 수행되는 프로그램
		 * -CPU는 시간을 잘게 쪼개서 thread를 번갈아 수행하면서
		 * -사용자들은 동시에 처리되는 듯한 효과를 가지게 됨
		 * -thread는 각각 자신만의 작업공간을 가짐(context)
		 * -각 thread마다 각각 자신만의 작업공간을 가짐(context)
		 * -각 thread는 공유하는 자원이 있을 수 있음. 자바에서는(static instance)
		 * -여러 thread가 공유하는 자원중 경쟁이 발생하는 부분을 critical section(임계영역)
		 * -critical section 에 대한 동기화(순차적 수행)을 구현하여 오류를 막음.
		 */
		//thread를 구현하는 2가지 방법
		/*1.thread를 클래스를 상속하여 만들기
		 *2.Runnable 인터페이스를 구현하여 만들기
		 *자바는 다중 상속을 허용하기 않기 때문에. 다른클래스를 상속중인 경우는 2번으로 구성
		 * 
		 */
		System.out.println(Thread.currentThread().getName());//현재 실행중인 쓰레드 이름
		MyTread th=new MyTread();
		th.start();
		
		MyTread th2=new MyTread();
		th2.start();
	}

}