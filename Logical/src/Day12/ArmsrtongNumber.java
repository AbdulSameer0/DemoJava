package Day12;

public class ArmsrtongNumber {
	public static void main(String[] args) {
		int no = 153;
		int temp = no;
		int sum = 0;
		int r ;
		while (no > 0) {
              r = no % 10;
              sum = sum+r*r*r;
              no = no/10;
		}if(temp == sum) {
			System.out.println("this is armstrong number");
		}else {
			System.out.println("this is not armstrong number");
		}
	}
}
