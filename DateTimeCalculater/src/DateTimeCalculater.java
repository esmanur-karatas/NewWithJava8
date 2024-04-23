import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeCalculater {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tarih: ");
		LocalDate tarih = LocalDate.parse(scanner.nextLine());
		System.out.print("Saat: ");
		LocalTime zaman = LocalTime.parse(scanner.nextLine());
		LocalDateTime tarihSaat = LocalDateTime.of(tarih, zaman);
		System.out.println("\nTarih ve Saat: " + tarihSaat);
		
		int islem = Integer.parseInt(scanner.nextLine());
		
		if(islem == 0 || islem == 1) {
			ChronoUnit[] chronoUnit = ChronoUnit.values();
			System.out.print("Birim: ");
			for( int i = 0 ; i < chronoUnit.length; i++) {
				System.out.print("\nArasındaki Fark: " + chronoUnit[i] + " (" + (i) + ")");
			}
			ChronoUnit birim = chronoUnit[Integer.parseInt(scanner.nextLine())];
			System.out.print("Değer: ");
			int deger = Integer.parseInt(scanner.nextLine());
			if(islem == 0) {
				System.out.println(tarihSaat.plus(deger, birim));
			} else {
				System.out.println(tarihSaat.minus(deger, birim));
			}
			
		}else {
			System.out.println("Lütfen 0 ya da 1 seçiniz! ");
		}
	}

}
