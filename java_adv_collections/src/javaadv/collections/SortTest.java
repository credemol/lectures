package javaadv.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;

public class SortTest {

	@Test
	public void testStringSort() {
		List<String> users = new ArrayList<String>();
		
		users.add("Kim");
		users.add("Lee");
		users.add("Ko");
		users.add("Park");
		users.add("Choi");
		
		System.out.println("before sorting: " + users);
		
		Collections.sort(users);
		System.out.println("after sorting: " + users);
	}
	
	@Test
	public void testTreeSet() {
		Set<String> set = new HashSet<String>();
//		Set<String> set = new TreeSet<String>();
		
		set.add("kim");
		set.add("lee");
		set.add("ko");
		set.add("park");
		set.add("choi");
		
		for(String name: set) {
			System.out.println(name);
		}
	}
	
	@Test
	public void testTreeMap() {
		Map<String, String> map = new TreeMap<String, String>();
		
		map.put("kim", "value1");
		map.put("lee", "value2");
		map.put("ko", "value3");
		map.put("park", "value4");
		map.put("choi", "value5");
		
		for(String key: map.keySet()) {
			System.out.println(key);
		}
	}
	
	@Test
	public void testUserSort() {
		List<User> users = new ArrayList<User>();
		
		long currentTime = System.currentTimeMillis();
		users.add(new User(1, "kim@gmail.com", "Kim", new Date(currentTime - 10)));
		users.add(new User(2, "lee@gmail.com", "Lee", new Date(currentTime + 5)));
		users.add(new User(3, "ko@gmail.com", "Ko", new Date(currentTime)));
		users.add(new User(4, "park@gmail.com", "Park", new Date(currentTime + 10)));
		users.add(new User(5, "choi@gmail.com", "Choi", new Date(currentTime - 5)));
		
		System.out.println("before sorting: " + users);
		
		Comparator<User> userComparator = new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		};
		
		Collections.sort(users, userComparator);
		System.out.println("after sorting1: " + users);
		
		Collections.sort(users);
		System.out.println("after sorting2: " + users);
		
	}
}
