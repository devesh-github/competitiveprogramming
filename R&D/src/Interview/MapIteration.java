package Interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteration {

	/**
	 * @param args
	 */
	//ctrl+shift + o - Auto Import
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "Devesh1");
		map.put(2, "Devesh2");
		map.put(3, "Devesh3");
		
		System.out.println(map);
		
		Set st = map.keySet();
		Iterator it = st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}
