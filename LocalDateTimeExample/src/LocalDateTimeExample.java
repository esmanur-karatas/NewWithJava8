import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Yıl, Ay, Gün, Saat, Dakika, Salise: " + dateTime);
		
		LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 5, 14, 37);
		System.out.println("Bizim verdiğimiz değerlere göre tarih ve zaman bilgilerini ekrana bastırır: " + localDateTime);
		
		LocalDateTime localDateTime2 = localDateTime.plus(4, ChronoUnit.DAYS);
		System.out.println("Zaman Farkı: " + localDateTime2);
		
		LocalDate localDate = LocalDate.parse("2002-04-01");
		LocalDateTime first = LocalDateTime.of(localDate, LocalTime.parse("04:12"));
		LocalDateTime second = LocalDateTime.of(localDate, LocalTime.parse("09:12"));
		System.out.println("first second ' dan büyük mü? " + first.isAfter(second));
		System.out.println("first second ' dan küçük mü? " + first.isBefore(second));
	
		System.out.println("ZAMAN FARKI SANİYE: " + ChronoUnit.SECONDS.between(first, second));
		
		
	}

}
