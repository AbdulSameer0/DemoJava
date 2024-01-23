package demo;

public class MainException {
	public static void main(String[] args) {
		try {
			int age = 188;
			if (age <= 18) {
				throw new AgeOfBoundException();
			}else {
				System.out.println("you are eligible please give the vote");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
