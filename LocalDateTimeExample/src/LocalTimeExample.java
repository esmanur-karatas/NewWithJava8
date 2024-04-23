import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Şimdiki Zamanı Ekrana Bastırır: " + time);
		
		LocalTime localTime = LocalTime.parse("22:30");
		System.out.println("\nGirdiğimiz zamanı ekrana bastırır: " + localTime);
		
		LocalTime localTime2 = LocalTime.of (14, 30);
		System.out.println("\nİlk değer saat ikinci değer dakika: " + localTime2);
		
		LocalTime localTime3 = LocalTime.parse("21:30").plus(1, ChronoUnit.HOURS);
		System.out.println("\nGirilen saatin üstüne 1 saat ekledi: " + localTime3);
		
		System.out.println("\nLocalTime3 nesnesinin saatini çağırdık: " + localTime3.getHour());
		System.out.println("\nLocalTime3 nesnesinin dakikasını çağırdık: " + localTime3.getMinute());
		
		LocalTime first = LocalTime.parse("14:00");
		LocalTime second = LocalTime.parse("16.00");
		System.out.println("first second ' dan büyük mü? " + first.isAfter(second));
		System.out.println("first second ' dan küçük mü? " + first.isBefore(second));
		
		

	}

}
