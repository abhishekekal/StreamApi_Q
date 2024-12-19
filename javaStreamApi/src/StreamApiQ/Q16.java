package StreamApiQ;

import java.util.Arrays;

import java.util.Map;
import java.util.function.Function;

import java.util.stream.Collectors;

public class Q16 {
public static void main(String[] args) {
	//Write a program to print the count of each character in a String?


	String s=" Abhishek is a good boy";
	//Map<String, Long>map=Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(str-> str,LinkedHashMap::new,Collectors.counting()));
	Map<String, Long>map=Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	
	
	
}
}
