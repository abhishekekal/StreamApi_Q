package StreamApiQ;

import java.util.Arrays;

public class Q13 {
public static void main(String[] args) {
	// Write a Java 8 program to sort an array and then convert the sorted array into Stream?
	int arr[]= {12,2,3,4,5,1};
	Arrays.parallelSort(arr);
	Arrays.stream(arr).forEach(n->System.out.println(n));
}
}
