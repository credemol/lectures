package javaadv.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.collections4.set.ListOrderedSet;
import org.junit.Test;

public class CollectionsTest {

	
	@Test
	public void testMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Kim", "value1");
		map.put("Lee", "value2");
		System.out.println(map);
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
			entry.setValue("fixedValue");
		}
		System.out.println(map);
	}
	
	@Test
	public void testMapIterator() {
		IterableMap map = new HashedMap();
		map.put("Kim", "value1");
		map.put("Lee", "value2");
		
		System.out.println(map);
		MapIterator it = map.mapIterator();
		while (it.hasNext()) {
		  Object key = it.next();
		  Object value = it.getValue();
		  
		  it.setValue("fixedValue");
		}
		
		System.out.println(map);
	}
	

	
	@Test
	public void testOrderedMap() {
		OrderedMap<String, String> map = new LinkedMap<String, String>();
		
		map.put("FIVE", "5");
		map.put("SIX", "6");
		map.put("SEVEN", "7");
		
		String key = null;
		key = map.firstKey();  // returns "FIVE"
		System.out.println("key: " + key);
		key = map.nextKey("FIVE");  // returns "SIX"
		System.out.println("key: " + key);
		key = map.nextKey("SIX");  // returns "SEVEN"
		System.out.println("key: " + key);
		key = map.nextKey("SEVEN");
		System.out.println("key: " + key);
	}
	
	@Test 
	public void testOrderedMap2() {
		OrderedMap<String, String> map = new LinkedMap<String, String>();
		
		map.put("FIVE", "5");
		map.put("SIX", "6");
		map.put("SEVEN", "7");
		
		String key = map.firstKey();
		
		do {
			System.out.println("==> key: " + key);
		} while((key = map.nextKey(key)) != null);
	}
	
	@Test
	public void testOrderedSet() {
		Set<String> set = new ListOrderedSet<String>();
		
		set.add("kim");
		set.add("lee");
		set.add("ko");
		set.add("park");
		set.add("choi");
		//set.add("kim");
		
		for(String name: set) {
			System.out.println(name);
		}
	}
	
	@Test
	public void testBidiMap() {
		BidiMap<String, Integer> bidi = new TreeBidiMap<String, Integer>();
		bidi.put("SIX", 6);
		bidi.put("SEVEN", 7);
		bidi.put("EIGHT", 8);
		
		System.out.println(bidi);
		
		bidi.get("SIX");  // returns "6"
		bidi.getKey(6);  // returns "SIX"
		bidi.removeValue(6);  // removes the mapping
		
		System.out.println(bidi);
		
		bidi.put("SIX", 6);
		BidiMap<Integer, String> inverse = bidi.inverseBidiMap();  // returns a map with keys and values swapped
		System.out.println(inverse);
	}
	
	@Test
	public void testBag() {
		Bag<String> bag = new HashBag<String>();
		bag.add("ONE", 6);  // add 6 copies of "ONE"
		bag.remove("ONE", 2);  // removes 2 copies of "ONE"
		bag.getCount("ONE");  // returns 4, the number of copies in the bag (6 - 2)
		
		bag.add("TWO");
		bag.add("THREE");
		bag.add("FOUR");
		
		System.out.println(bag);
	}
	
	@Test
	public void testTreeBag() {
//		Bag<String> bag = new HashBag<String>();
		Bag<String> bag = new TreeBag<String>();
		bag.add("ONE", 6);  // add 6 copies of "ONE"
		bag.remove("ONE", 2);  // removes 2 copies of "ONE"
		bag.getCount("ONE");  // returns 4, the number of copies in the bag (6 - 2)
		
		bag.add("TWO");
		bag.add("THREE");
		bag.add("FOUR");
		
	
		
		System.out.println(bag);
	}
}
