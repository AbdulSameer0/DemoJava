package Day11;

public class AramstromgNumner {
  public static void main(String[] args) {
	int no = 153;
	int temp = no;
	int sum = 0;
	int r = 0;
	while(no>0) {
		r=no%10;
		sum = sum + r*r*r;
		no=no/10;
	}if(temp==sum) {
		System.out.println("this is a aramstrong number");
	}else {
		System.out.println("this is a not armastrong number");
	}
	
}
}
