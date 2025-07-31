package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaCollections1 {
	public static void main(String[] args) {
		ArrayList<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("python");
		courses.add("data structures");
		courses.add("java");
		
		for(String c : courses) {
			System.out.println(c);
		}
		
		Set<Integer> Courses = new HashSet<>();
		Courses.add(101);
		Courses.add(102);
		Courses.add(101);
		Courses.add(104);
		for(Integer j : Courses) {
			System.out.println(j);
		}
		Map<String, Integer> courseduration = new HashMap<>();
		courseduration.put("java", 101);
		courseduration.put("python", 102);
		courseduration.put("data structures", 101);
		courseduration.put("java", 104);
		courseduration.put("java", 105);
		for(String s : courseduration.keySet()) {
			System.out.println(s + "=" + courseduration.get(s));
		}
	}
}
