import java.util.Optional;

public class OptionalClass2 {

	public static void main(String[] args) {
		Motor motor = new Motor(1600);
		Araba araba = new Araba("X Marka", "Y Model", Optional.ofNullable(motor));
		System.out.println(araba);
		
	}

}
