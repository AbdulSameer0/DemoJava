package Day14;

public class ThreadWithLambda {
	public static  void main(String[] args) {
	Runnable t1 = () -> {
			// this is a thread body

			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread thread = new Thread(t1);
		thread.start();

		Runnable t2 = () -> {
			for (int i = 1; i <= 10; i++) {

				System.out.println(i * 2);
				try {
					thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread thread1 = new Thread(t2);
		thread1.start();

	}
}
