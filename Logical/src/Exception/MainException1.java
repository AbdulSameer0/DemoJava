package Exception;

public class MainException1 {
       public static void main(String[] args) throws ArithmeticException {
		try {
			int age = 01;
			if(age<=18) {
			throw new  AgeOfBoundException1();
			}else {
				System.out.println("r u eligible");
			}
			int no = 10;
			System.out.println(no/0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
