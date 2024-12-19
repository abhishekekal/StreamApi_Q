package StreamApiQ;

import java.util.List;

public class Q6 {
public static void main(String[] args) {
	// Given a list of integers, find the maximum value element present in it using Stream functions?
	
	
	List< Integer> list=List.of(10,20,30,50,60,90);
	int m=list.stream().max(Integer::compare).get();
	System.out.println(m);
}
}
