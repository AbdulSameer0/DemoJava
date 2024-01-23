package Day12;

public class PrimeNumber1 {
 public static void main(String[] args) {
	int no = 7;
	int temp = 0;
	for(int  i = 0; i<=no;  i ++) {
		if(no%2==0) {
			temp = temp+i;
		}}if(temp==0) {
			System.out.println("this is a prime number");
		}else {
			System.out.println("this is not prime number");
		}
	
}
}
