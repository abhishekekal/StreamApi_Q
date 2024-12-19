package StreamApiQ;

import java.util.Collections;
import java.util.List;

public class Q9 {
public static void main(String[] args) {
	
	// Given a list of integers, sort all the values present in it using Stream functions?
	
	List<Integer> list=List.of(10,20,30,50,80);
	list.stream().sorted().forEach(System.out::println);
	
	// Given a list of integers, sort all the values present in it in descending order using Stream functions?
	
	System.out.println(" rever");
	
	list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
}
}
