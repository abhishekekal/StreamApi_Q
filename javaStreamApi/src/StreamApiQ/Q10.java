package StreamApiQ;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class Q10 {
public static void main(String[] args) {
	System.out.println("current local Date "+java.time.LocalDate.now());
	System.out.println("current time "+java.time.LocalTime.now());
DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm a");
Stream.of(LocalTime.now()).map(t->t.format(f)).forEach(f1-> System.out.println("current time "+f1));

}
}
