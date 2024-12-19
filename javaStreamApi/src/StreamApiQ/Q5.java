package StreamApiQ;

import java.util.List;

public class Q5 {
public static void main(String[] args) {
	 //Given a list of integers, find the total number of elements present in the list using Stream functions?
	
	
	
	List<Integer> list=List.of(10,20,30,50);
	long l=list.stream().count();
	System.out.println(l);
}
}
