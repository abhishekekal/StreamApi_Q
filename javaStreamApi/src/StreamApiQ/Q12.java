package StreamApiQ;

import java.util.List;

public class Q12 {
public static void main(String[] args) {
	//Java 8 program to perform cube on list elements and filter numbers greater than 50.
	
	List<Integer> list=List.of(1,2,3,5,6,2,4);
	list.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);
	
}
}
