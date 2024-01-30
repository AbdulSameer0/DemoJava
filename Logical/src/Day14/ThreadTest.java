package Day14;

public class ThreadTest {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * 2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Runnable runnable2 = () -> {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i * 3);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		Thread thread1 = new Thread(runnable2);
		thread1.start();
	}
}
