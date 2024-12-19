package StreamApiQ;

import java.util.List;


public class Q2 {
public static void main(String[] args) {
	// Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	
	List<Integer> list=List.of(10,20,30,11,12);
	
	list.stream().map(s-> s+" ")
	.filter(s-> s.startsWith("1")).forEach(System.out::println);
	
	
	
	
}
}
