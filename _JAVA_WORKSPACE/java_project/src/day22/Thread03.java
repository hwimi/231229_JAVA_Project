package day22;

class Mythread3 implements Runnable {
	int sum = 0;

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}

class Mythread4 implements Runnable {
	int sum = 0;

	@Override
	public void run() {
		for (int i = 51; i <= 100; i++) {

			sum += i;
		}
		System.out.println(sum);

	}

}

public class Thread03 {

	public static void main(String[] args) {
		/*
		 * 1~50, 51~100까지의 합을 구하는 두개의 thread를 생성 그결과를 확인
		 * 
		 * 두개의 thread가 실행되고 난 후 thread1 1~50까지의 합계출력 thread2 51~100까지의 합계출력
		 * thread1+thread2
		 */

		System.out.println("main start");
		Mythread3 mth = new Mythread3();
		Thread th = new Thread(mth);
		th.start();

		try {
			th.join();
			Thread.sleep(500);//0.5초 차이로 나오게 해라 1초=1000
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Mythread4 mth1 = new Mythread4();
		Thread th1 = new Thread(mth1);
		th1.start();
		try {
			th1.join();
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		int a=mth.sum+mth1.sum;
		System.out.println(a);

	}

}