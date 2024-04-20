import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunctionalInterfaceStudent {
	
	public static void main (String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1, "Ahmet DOMURCUK", 30));
		students.add(new Student(2, "Alihan CANDAN", 40));
		students.add(new Student(3, "Aslıhan KUŞLU", 55));
		students.add(new Student(4, "Feyza ŞENTÜRK", 50));
		students.add(new Student(5, "Esmanur KARATAŞ", 90));
		
		students.forEach((o)->System.out.println(o));
		
		  System.out.println("\nNOT ORTALAMASINA GÖRE ÖĞRENCİ SIRALAMASI: ");
		
		//Anonymous Classes
		Collections.sort(students, new Comparator<Student>() {
          
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getGradeAverage() - o2.getGradeAverage();
 			}
			
		});
		
		//lambda kullanarak numaraya göre öğrenci sıralaması
		Collections.sort(students, (a,b)-> a.getNumber() - b.getNumber());
		System.out.println("\nNUMARAYA GÖRE ÖĞRENCİ SIRALAMASI: ");
		students.forEach((o)->System.out.println(o));
		
	}

}
