package String;

class Aa {
	public void checking() {
		String first = new String("InterviewBit");
		String second = new String("InterviewBit");

		if (first == second) {
			System.out.println("this is a right ");
		} else {
			System.out.println("this is a not right ");
		}
	}
}

public class Test3 extends Aa {
	public static void main(String[] args) {
     Aa aa = new Aa();
     aa.checking();
	}
}
