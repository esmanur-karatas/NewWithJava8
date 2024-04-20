import java.time.LocalDate;
import java.util.Scanner;

public class DateTimeAgeCalculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum Tarihi: ");
        String line = scanner.nextLine();
        LocalDate dogumTarihi = LocalDate.parse(line);
        System.out.println("Doğum Tarihiniz: " + dogumTarihi);
        System.out.println("Yaşınız: " + (LocalDate.now().getYear() - dogumTarihi.getYear()));
    }
	

}
