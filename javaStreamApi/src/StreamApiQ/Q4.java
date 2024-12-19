package StreamApiQ;

import java.util.List;

public class Q4 {
public static void main(String[] args) {
	
	
	//Given the list of integers, find the first element of the list using Stream functions?
			
	List<Integer> list=List.of(10,20,30,50);
	list.stream().findFirst().ifPresent(System.out::println);
	
	
}


}
