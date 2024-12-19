package StreamApiQ;


import java.util.List;
import java.util.stream.Collectors;

public class Q14 {
public static void main(String[] args) {
	// How to use map to convert object into Uppercase in Java 8?
	List<String> name=List.of("ab","bc","yv");
	List<String> list=name.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(list);
}
}
