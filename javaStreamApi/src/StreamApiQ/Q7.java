package StreamApiQ;

import java.util.Collections;

public class Q7 {
public static void main(String[] args) {
	//Given a String, find the first non-repeated character in it using Stream functions?
 
	String s="Java is language ";
	Character r=
s.chars().mapToObj(c ->(char)c).filter(ch->s.indexOf(ch)==s.lastIndexOf(ch)).findFirst()
.orElse(null);

System.out.println(r);

}
}
