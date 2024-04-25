import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiStudent {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student(1, "Ahmet Domurcuk", 15));
		arrayList.add(new Student(1, "Esmanur Karataş", 14));
		arrayList.add(new Student(1, "Tuğrul Çalışkan", 16));
		arrayList.add(new Student(1, "Alican Nurcan", 17));
		arrayList.add(new Student(1, "Alihan Gümüşçü", 18));
		arrayList.add(new Student(1, "Aslı Şahiner", 19));
		
		Map<Integer, List<Student>> gruplama = arrayList
				.stream()
				.collect(Collectors.groupingBy(o->o.getAge()));
		
		Set<Integer> keySet = gruplama.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key + " " + gruplama.get(key));
			
			double yasOrtalamasi = arrayList.stream()
					.collect(Collectors.averagingInt(o -> o.getAge()));
			System.out.println("\nÖğrencilerin Yaşlarının Ortalaması: " + yasOrtalamasi);
			
			IntSummaryStatistics istatik = arrayList.stream()
					.collect(Collectors.summarizingInt(o->o.getAge()));
			System.out.println(istatik);
		}
		
	}

}
