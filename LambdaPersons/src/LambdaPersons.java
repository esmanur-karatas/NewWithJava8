import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class LambdaPersons {
	
	public static void genderFilter(List<Persons> persons, Persons.Gender gender) {
		for (int i = 0; i < persons.size(); i++) {
			Persons person = persons.get(i);
			if(person.getGender().equals(gender)) {
				System.out.println(person);
			}
		}
	}

	
public static void yasaGoreSırala(List<Persons> persons, int yas ) {
	for ( int i = 0 ; i < persons.size(); i ++) {
		Persons person = persons.get(i);
		if(person.getYas() >= yas) {
			System.out.println(person);
		}
	}
}

public static void yasAraliginaGoreFiltreleme(List<Persons> persons, int min, int max) {
	for ( int i = 0 ; i < persons.size() ; i ++) {
		Persons person = persons.get(i);
		if(person.getYas() >= min && person.getYas() <= max) {
			System.out.println(person);
		}
	}
}

public static void kisiFiltrele(List<Persons>persons, KisiFiltrele kisiFiltrele) {
	for(int i = 0; i < persons.size(); i++) {
		Persons person = persons.get(i);
		if(kisiFiltrele.filtrele(person)) {
			System.out.println(person);
		}
	}
}
	public static void main(String[] args) {
		Persons person1 = new Persons("Ali CAN", LocalDate.parse("2002-07-04"), "alican@gmail.com", Persons.Gender.ERKEK);
		Persons person2= new Persons ("Alihan CAN", LocalDate.parse("2002-01-04"), "alihancan@gmail.com", Persons.Gender.ERKEK);
		Persons person3= new Persons ("Aslı CAN", LocalDate.now(), "aslican@gmail.com", Persons.Gender.KADIN);
		Persons person4 = new Persons("Ali CAN", LocalDate.now(), "alidcan@gmail.com", Persons.Gender.ERKEK);
		
	//	System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		
		
		ArrayList<Persons> persons = new ArrayList<> ();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		
		System.out.println("SADECE KADINLAR: ");
		genderFilter( persons, Persons.Gender.KADIN);
		
		System.out.println("\nYAŞA GÖRE LİSTELEME: ");
		yasaGoreSırala(persons, 10);
		
		System.out.println("\nYAŞ ARALIĞINA GÖRE LİSTELEME: ");
		yasAraliginaGoreFiltreleme(persons, 0, 3);
		
		
		System.out.println("\n");
		kisiFiltrele(persons, new KisiFiltrele() {
			public boolean filtrele(Persons persons) {
				return persons.getYas()>20 && persons.getGender().equals(Persons.Gender.ERKEK);
			}
		});
		
		System.out.println("\nLAMBDA YA GÖRE LİSTELEME: ");
		kisiFiltrele(persons,(k)->k.getYas()<=5 && k.getGender().equals(Persons.Gender.KADIN));
	}

}
