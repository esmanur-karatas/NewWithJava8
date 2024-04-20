import java.util.ArrayList;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Matematik matematik = new Matematik() {
		
		@Override
		public void islem (double a, double b) {
			System.out.println(a + b);
		}
	};
	
	//Lambda ile yapılması
	Matematik matematik1 = (x,y) -> System.out.println("LAMBDA İLE  x + y = "+ (x + y));
	matematik.islem(10,20);
	matematik1.islem(30, 50);
	
	ArrayList<String> sehirler= new ArrayList<> ();
	sehirler.add("Bursa");
	sehirler.add("Bolu");
	sehirler.add("Elazığ");
	sehirler.add("Malatya");
	
	System.out.println("\nŞEHİRLER: ");
	//Consumer
	sehirler.forEach((s)->System.out.println(s));
	
	System.out.println("\nB İLE BAŞLAYAN ŞEHİRLER: ");
	
	Predicate<String> predicate = new Predicate<String>() {
		
		@Override
		public boolean test(String t) {
			return t.startsWith("B");
		}
	};
	
	for(int i= 0; i<sehirler.size(); i++) {
		String sehir = sehirler.get(i);
		if(predicate.test(sehir)) {
			System.out.println(sehir);
		}
	}

  }
}