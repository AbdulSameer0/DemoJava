package Day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionCode {
   public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("abdul");
	list.add("sameer");
	list.add("raja");
	list.add("arbaj");
	list.add("shahbaj");
	list.add("sadab");
	list.add("aftab");
	list.add("gulam gous");
	
	 Iterator<String> li = list.iterator();
	 while(li.hasNext()) {
		 String s = li.next();
		 System.out.println(s);
	 }
}
}
