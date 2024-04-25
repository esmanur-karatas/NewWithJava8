import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("İstanbul");
		arrayList.add("Ankara");
		arrayList.add("İzmir");
		arrayList.add("Adana");
		arrayList.add("Bursa");
		arrayList.add("Bolu");
		
		arrayList.stream()
		.filter((s)->s.startsWith("İ"))
		.map((s)->s.toUpperCase())
		.sorted((s1,s2)->s1.compareTo(s2))
		.forEach(System.out::println);
		
		

	}

}
