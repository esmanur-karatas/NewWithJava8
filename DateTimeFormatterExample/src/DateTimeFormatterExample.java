import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterExample {

	public static void main(String[] args) {
		LocalDate tarih = LocalDate.now();
		String kisa = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(tarih);
		String orta = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(tarih);
		String uzun = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(tarih);
		String full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(tarih);
		
		System.out.println("Kısa Tarih Formatı: " + kisa);
		System.out.println("\nOrta Tarih Formatı: " + orta);
		System.out.println("\nUzun Tarih Formatı: " + uzun);
		System.out.println("\nFull Tarih Formatı: " + full);
		
		String ozel = DateTimeFormatter.ofPattern("dd.MM.yyyy").format(tarih);
		System.out.print("\nİstenilen formatta tarih: " + ozel);
		
		LocalTime localTime = LocalTime.now();
		kisa = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(localTime);
		orta = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(localTime);
		
		System.out.println("\nKısa Saat Formatı: " + kisa);
		System.out.println("\nOrta Saat Formatı: " + orta);
		
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("HH-mm-ss");
		System.out.println("\n" + ofPattern.format(localTime));
		
	}

}
