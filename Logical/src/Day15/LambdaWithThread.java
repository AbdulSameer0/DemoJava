package Day15;

import java.util.function.Function;

public class LambdaWithThread {
   public static void main(String[] args) {
	Runnable runnable = ()->{
	    //this is a thread body
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	
	Runnable runnable2 = () ->{
		for(int i = 1; i<=10; i++ ) {
			System.out.println(i*3);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	
	Thread thread = new Thread(runnable);
	thread.start();
	
	Thread thread2 = new Thread(runnable2);
	thread2.start();
	
}
}
