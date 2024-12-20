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

/*
question:
Distinguish between HashMap, HashTable, LinkedHashMap and SortedMap?

answer:
__________________________________________________________________________________________________________________________________________
| Characteristics  | HASHMAP  | HASHTABLE                              | LINKEDHASHMAP          | SORTEDMAP (TreeMap)                    |                
------------------------------------------------------------------------------------------------------------------------------------------
| Thread Safety    | No       | Yes	                                   | No		                | No 	                                 |
| Order            | No order | No order                               | Insertion/Access order | Sorted order                           | 
| Keys             | Unique   | Unique                                 | Unique                 | Unique                                 |
| Duplicate Values | Allowed  | Allowed                                | Allowed                | Allowed                                |
| Null Keys        | Allowed  | Not Allowed                            | Allowed                | Not Allowed                            |
| Performance      | Fast     | Slightly slower due to Synchronization | Fast                   | Slower due to Sorting                  |
__________________________________________________________________________________________________________________________________________
*/