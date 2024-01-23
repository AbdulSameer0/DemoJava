package Day14;

public class Swaping2 {
	public static void main(String[] args) {
		int a = 12364671;
		int b = 3265611;
		System.out.println(a);
		System.out.println(b);
		System.out.println("...........");
		a = a + b; // 30
		b = a - b; // 10
		a = a - b; // 30 - 10 = 20
		System.out.println(a);
		System.out.println(b);
	}
}
