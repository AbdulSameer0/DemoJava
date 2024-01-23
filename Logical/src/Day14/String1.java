package Day14;

public class String1 {
public static void main(String[] args) {
	  String str = "raja";
	  String str1 = "raja";
	  String str4 = "sameer";
	  String Str2 = new String("raja");
	  String str3 = new String("sameer");
	  
	  System.out.println(str==str1);              //  true
	  System.out.println(str.equals(Str2));      //   true
	  System.out.println(str==Str2);            //    false
	  System.out.println(Str2==str3);          //     false
	  System.out.println(str4.equals(str3));  //      true
	  
}
		  
}
