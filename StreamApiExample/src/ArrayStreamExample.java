import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamExample {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
		Arrays.stream(numbers)
		.filter((x)->x>3)
		.map((x)->x*2)
		.sorted()
		.forEach(System.out::println);
		
		Stream.of("a", "g","c","e","b")
		.findFirst()
		.ifPresent(System.out::println);
		
	}

}
