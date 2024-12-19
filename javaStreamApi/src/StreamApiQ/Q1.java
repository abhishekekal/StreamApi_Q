package StreamApiQ;

import java.util.List;

import java.util.stream.Collectors;

public class Q1 {
public static void main(String[] args) {
	//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
	
	
	List<Integer>list=List.of(12,1,2,6,9,20);
	List<Integer>nlist=list.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(nlist);
	
	

}
}
