package SingleTonDesignPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Map<Integer, String> list = new HashMap<Integer, String>();	  
		list.put(1, "raja");
		list.put(2, "raja1");
		list.put(3, "raja3");
		  Set<Integer> f = list.keySet();
		  Iterator<Integer> k = f.iterator();
		  while(k.hasNext()) {
			  Integer kk = k.next();
			  String v = list.get(kk);
			  System.out.println(kk+" "+v);
		  }

}
}
