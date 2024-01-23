package Day14;

public class Palindrome {
 public static void main(String[] args) {
	String str = "maham";
	int len = str.length();
	String revString = "";
	for(int i = len-1; i>=0; i--) {
		revString = revString + str.charAt(i);
	}if(str.equals(revString)) {
		System.out.println("this is a Palindrome");
	}else {
		System.out.println("this is a not Palindrome");
	}
}
}
