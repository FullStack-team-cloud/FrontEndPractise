import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1,"pavan");
		m.put(2,"aswin");
		m.put(3,"sharath");
		m.put(4,"pavan");
		m.put(4,"pavan");		//no duplication or compilation error
		for (Integer id : m.keySet()) {
			System.out.println("Key: "+id+" and value: "+m.get(id));
		}
		System.out.println("Map Size: "+m.size());
		m.put(2,"kumar");
		System.out.println("Key 2 value after updating: "+m.get(2));
		System.out.println("Removed value with key 4: "+m.remove(4));
		System.out.println("Final Map: "+m);
	}

}