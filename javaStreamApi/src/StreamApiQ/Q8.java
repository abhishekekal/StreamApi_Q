package StreamApiQ;

import java.util.HashSet;
import java.util.Set;

public class Q8 {
public static void main(String[] args) {
	
	
	// Given a String, find the first repeated character in it using Stream functions?
	
	String input="java is language ";
	Set<Character> seenChar=new HashSet<>();
	Character cs= input.chars().mapToObj(c-> (char) c)
			.filter(c-> !seenChar.add(c))
			.findFirst()
			.orElse(null);
	System.out.println(cs);
}
}
