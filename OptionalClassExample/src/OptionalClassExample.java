import java.util.Optional;

public class OptionalClassExample {
	
	public static String test() {
		System.out.println("Test Çalıştı...");
		return "test";
	}

	public static void main(String[] args) {
		Optional<String> bosNesne = Optional.empty();
		System.out.println(bosNesne.isPresent());
		
		String deger = "MERHABA";
		Optional<String> optional = Optional.of(deger);
		System.out.println(optional.isPresent());
		
		String s = null;
		
		//nul değer aldığında hata vermemesi için 
		Optional<String> optional2 = Optional.ofNullable(s);
		System.out.println(optional2.isPresent());
		
		String s2 = "SELAM";
		
		if (s2 != null) {
			System.out.println(s2.length());
		}
		
		Optional<String> optional3 = Optional.ofNullable(s2);
		optional3.ifPresent((x)->System.out.println(x.length()));
		
		String bosİsim = null;
		String isim = Optional.ofNullable(bosİsim).orElse("Ahmet");
		System.out.println(isim);
		
		String sehir = "Ankara";
		String sehir2 = Optional.ofNullable(sehir).orElseGet(()->"İstanbul");
		System.out.println(sehir2);
		
		String bos = null;
		String string = Optional.ofNullable(bos).orElse(test());
		String string2 = Optional.ofNullable(bos).orElseGet(()->test());
		
		System.out.println(string);
		System.out.println(string2);
		
	}

}
