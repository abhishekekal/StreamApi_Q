package StreamApiQ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q3 {
public static void main(String[] args) {
	
	// How to find duplicate elements in a given integers list in java using Stream functions?
	
	
	List<Integer> list=List.of(10,20,30,20,50,10);	
	//Set<Integer>set=new HashSet<>();
	//list.stream().filter(n->!set.add(n)).forEach(System.out::println);
	//list.stream().distinct().forEach(i-> System.out.println(i));
	
	//using hashmap
	
	
	Map<Integer, Integer> fmap=new HashMap<>();
	for(Integer num:list) {
		fmap.put(num,fmap.getOrDefault(num,0)+1);
	}
	fmap.entrySet().stream().filter(i->i.getValue()>1).forEach(i-> System.out.println(i.getKey()));
	
}
}
