package StreamApiQ;

import java.util.List;
import java.util.stream.Stream;

public class Q11 {
public static void main(String[] args) {
	//Write a Java 8 program to concatenate two Streams?
	
	
List<String> list=List.of("abhi ", "sham "," ganesh");
List<String>l=List.of("ekal","malu");
Stream<String> clist=Stream.concat(list.stream(), l.stream());
clist.forEach(s->System.out.println(s+" "));
}
}
