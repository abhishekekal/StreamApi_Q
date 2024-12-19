package StreamApiQ;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q15 {
public static void main(String[] args) {
//How to count each element/word from the String ArrayList in Java8?
	
	List<String> list=List.of("ab","ram","sham","gampu","sham");
//Map<String, Long>namec=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//System.out.println(namec);
	
	
	// or
	
	
	Map<String, Long>namec=new HashMap<>();
	for(String i:list) {
		namec.put(i,namec.getOrDefault(i, 0L)+1);
	}
	System.out.println(namec);
	
	
}
}
