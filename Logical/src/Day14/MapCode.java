package Day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCode {
 public static void main(String[] args) {
	  Map<Integer, String> map = new HashMap<Integer, String>();
	  map.put(1, "abdul");
	  map.put(2, "sameer");
	  map.put(3, "raja");
	  map.put(4, "arbaj");
	  map.put(5, "aftab");
	  map.put(6, "gulam gaus");
     Set<Integer> k = map.keySet();
     Iterator<Integer> f = k.iterator();
     while(f.hasNext()) {
    	Integer key = f.next();
    	String values = map.get(key);
    	System.out.println(key+"  "+values);
     }

}
}
