package Day14;

public class String3 {
  public static void main(String[] args) {
	String str = "my*^$#!name#% is a sameer@#!";
	System.out.println(str);
	str=str.replaceAll("[^0-9A-Za-z]","");
	System.out.println(str);
	
}
}
